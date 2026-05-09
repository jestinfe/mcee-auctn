package com.mcee.auctn.com.mbrJoin.vo;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;

public class MbrReqVO {
	
	@NotBlank(message)
	private String id;
	private String pswd;
	private String flnm;
	private String mblTelno;
	private String rsdcAddr;
	private LocalDate brdt;
}
