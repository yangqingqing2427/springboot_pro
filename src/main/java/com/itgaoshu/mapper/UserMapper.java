package com.itgaoshu.mapper;

import com.itgaoshu.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Mapper //创建mapper接口代理类对象
public interface UserMapper {

    //查询用户信息
    //select u.*,d.dname from tuser u,dept d where u.depno=d.depno
    @Select("select t.*,d.dname from tuser t,dept d where t.deptno=d.deptno")
    public List<User> selectUserList();

    //添加用户信息
  //  @Insert("insert into user set")
    public User insertUser(User user);


}
