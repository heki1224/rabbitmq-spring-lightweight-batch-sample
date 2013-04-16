package com.heki1224.spring.lightweight.batch.sample.bean;

import java.io.Serializable;
import java.util.Date;

public class SampleQueueBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;

	private Integer age;

	private Date birthday;

	private Boolean available;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("name=" + name);
		builder.append(",");
		builder.append("age=" + age);
		builder.append(",");
		builder.append("birthday=" + birthday.getTime());
		builder.append(",");
		builder.append("available=" + available);
		return builder.toString();
	}
}
