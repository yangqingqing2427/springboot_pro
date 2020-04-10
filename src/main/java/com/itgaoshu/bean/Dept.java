package com.itgaoshu.bean;

public class Dept {
	private int depno;//部门编号
	
	private String dname;//部门名称
	
	public int getDepno() {
		return depno;
	}
	public void setDepno(int depno) {
		this.depno = depno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Dept [depno=" + depno + ", dname=" + dname + "]";
	}
	

}
