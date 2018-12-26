package com.yunagile.gateway.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
@ApiModel
public class User {
	@ApiModelProperty(value="id",hidden=true) 
	private String id;
	@ApiModelProperty(value="用户名",required=true)  
	private String name;
	@ApiModelProperty(value="生日")  
	private Date birthday;
	@ApiModelProperty(value="年龄") 
	private Integer age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthday=" + birthday
				+ ", age=" + age + "]";
	}
	
}
