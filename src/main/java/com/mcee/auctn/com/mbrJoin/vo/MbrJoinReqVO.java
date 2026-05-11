package com.mcee.auctn.com.mbrJoin.vo;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class MbrJoinReqVO {
	
	@NotBlank(message = "아이디를 입력하세요.")
	@Size(max = 20, message = "아이디는 20자 이하로 입력하세요.")
	private String id;
	
	@NotBlank(message = "비밀번호를 입력하세요.")
	@Size(min = 8, max = 24, message = "비밀번호는 8자 이상 24자 이하로 입력하세요.")
	private String pswd;
	
	@NotBlank(message = "성명을 입력하세요.")
	@Size(max = 5, message = "성명은 5자 이하로 입력하세요.")
	private String flnm;
	
	@Size(min = 11, max = 11, message = "휴대전화번호는 11자로 입력하세요.")
	private String mblTelno;
	
	@Size(max = 66, message = "주소는 66자 이하로 입력하세요.")
	private String rsdcAddr;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd") // Spring에게 JSP에서 넘어온 날짜 문자열이 어떤 형식인지 알려주는 설정.
	private LocalDate brdt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public String getFlnm() {
		return flnm;
	}

	public void setFlnm(String flnm) {
		this.flnm = flnm;
	}

	public String getMblTelno() {
		return mblTelno;
	}

	public void setMblTelno(String mblTelno) {
		this.mblTelno = mblTelno;
	}

	public String getRsdcAddr() {
		return rsdcAddr;
	}

	public void setRsdcAddr(String rsdcAddr) {
		this.rsdcAddr = rsdcAddr;
	}

	public LocalDate getBrdt() {
		return brdt;
	}

	public void setBrdt(LocalDate brdt) {
		this.brdt = brdt;
	}
}
