package com.itgaoshu.mapper;

import com.itgaoshu.bean.User;
import tk.mybatis.mapper.common.Mapper;


//自定义Mapper接口继承自tk.mybatis.mapper.common.Mapper<T>,泛型为Mapper接口操作表对应的实体类
public interface UserMapper2 extends Mapper<User> {


}
