package com.example.demo.entiy;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Captc {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	
	@Transient
	private String captcha;
	@Transient
	private String hiddenCaptcha;
	@Transient
	private String realCaptcha;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCaptcha() {
		return captcha;
	}
	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}
	public String getHiddenCaptcha() {
		return hiddenCaptcha;
	}
	public void setHiddenCaptcha(String hiddenCaptcha) {
		this.hiddenCaptcha = hiddenCaptcha;
	}
	public String getRealCaptcha() {
		return realCaptcha;
	}
	public void setRealCaptcha(String realCaptcha) {
		this.realCaptcha = realCaptcha;
	}
	public Captc(int id, String name, String email, String captcha, String hiddenCaptcha, String realCaptcha) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.captcha = captcha;
		this.hiddenCaptcha = hiddenCaptcha;
		this.realCaptcha = realCaptcha;
	}
	@Override
	public String toString() {
		return "Captc [id=" + id + ", name=" + name + ", email=" + email + ", captcha=" + captcha + ", hiddenCaptcha="
				+ hiddenCaptcha + ", realCaptcha=" + realCaptcha + "]";
	}
	public Captc() {
		super();
		// TODO Auto-generated constructor stub
	}

}
