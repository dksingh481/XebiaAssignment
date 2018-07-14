package com.xebia.yakshop.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "labyak")
public class LabYak {
	@XmlAttribute(name = "name")
	private String name;
	@XmlAttribute(name = "age")
	private Double age;
	@XmlAttribute(name = "sex")
	private String sex;
	public LabYak() {}
	public LabYak(String name, Double age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public String getName() {
		return name;
	}
	public Double getAge() {
		return age;
	}
	public String getSex() {
		return sex;
	}
}
