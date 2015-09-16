package com.ouyang.enums;

public enum EnumExamPaperType {

	POLICY("1", "paperPolicy.js", "examPaperPolicyStyle"),
	PAPER("2", "paperType.js", "examPaperCommonType");
	
	private String value;
	private String javascript;
	private String service;
	EnumExamPaperType(String value, String javascript, String service){
		this.value = value;
		this.javascript = javascript;
		this.service = service;
	}
	public String javascript(){
		return this.javascript;
	}
	public String service(){
		return this.service;
	}
	public String value(){
		return this.value;
	}
}
