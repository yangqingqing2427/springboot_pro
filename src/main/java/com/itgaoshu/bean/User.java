package com.itgaoshu.bean;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 二级缓存中操作的实体类需要被序列化:实现Serializable接口
 * @author Administrator
 * 1,实现序列化接口
 * 2，实体类中的属性类型需要为包装类类型
 * 3，在实体类上添加@Table注解，然后使用name属性指定该实体类映射的表名
 * 4，在唯一属性上添加@Id的注解关联表中的主键
 * 5,当实体类和字段名不一致的时候，需要在每个属性上添加@Column注解，name属性指定字段名
 */
@Table(name = "tuser")
public class User implements Serializable{
	//@Column(name="u_id") //
	@Id
	@GeneratedValue(generator = "JDBC")
	private Integer id; //用户编号   将简单类型转为包装类型
	private String loginname; //用户名
	private String password; //密码
	private String realname; //真是姓名
	private String sex; //性别
	private String birthday; //出生日期
	private Integer deptno; //部门编号
	private String email; //邮箱
	private Integer enabled; //是否可用
	private Integer createman; //创建人
	//private String dname;//部门名称  //只能单表查询，

	private String userpic;//图片文件名称
	/*所有的用户直接映射到UserMapper.xml里面了，但是还关联查询出来了部门信息，
	把部门信息映射到下面写的dept映射对象里面
		两表联查，一对一的关系
	*/


	//定义部门的对象属性
	/*private Dept dept;

	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}*/

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public Integer getCreateman() {
		return createman;
	}

	public void setCreateman(Integer createman) {
		this.createman = createman;
	}

	public String getUserpic() {
		return userpic;
	}

	public void setUserpic(String userpic) {
		this.userpic = userpic;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", loginname='" + loginname + '\'' +
				", password='" + password + '\'' +
				", realname='" + realname + '\'' +
				", sex='" + sex + '\'' +
				", birthday='" + birthday + '\'' +
				", deptno=" + deptno +
				", email='" + email + '\'' +
				", enabled=" + enabled +
				", createman=" + createman +
				", userpic='" + userpic + '\'' +
				'}';
	}
}



