package com.itgaoshu.service.impl;

import com.itgaoshu.bean.User;
import com.itgaoshu.mapper.UserMapper2;
import com.itgaoshu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional //事务控制
public class UserServiceImpl implements UserService {
    //在service层调用Mapper层方法
    //依赖注入UserMapper对象
    @Autowired
    private UserMapper2 userMapper;

    /**
     * @Cacheable("selectUserList")注解中的selectUserList表示：
     * 在缓存中开辟了一个名称空间为selectUserList的缓存区域，用来存储
     * 查询出来的用户列表
     * @return
     */
     @Cacheable("selectUserList")  //(redis) 查询出来的列表存储的key
    public List<User> selectUserList(){
         System.out.println("看看第二次访问时还会不会执行此方法");
        List<User> users = userMapper.selectAll();

        return users;
    }

}
