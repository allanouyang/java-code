package com.ouyang.enums;

import java.util.HashMap;
import java.util.Map;

public enum EnumMessage {

	 PROMPT_MESSAGE("10001", "XXXXXXXXX"), 
	 ERROR_MESSAGE("20001", "XXXXXXXXX"),
	 SUCCESS_MESSAGE("30001", "XXXXXXXXX");
	 
	 private String code;
	 private String msg;
	 EnumMessage(String code, String msg) {
		this.code = code;
		this.msg = msg;
	 }
	 
	 public Map<String, Object> wrapper(Object data) {
		 Map<String, Object> map = new HashMap<String, Object>();
		 map.put("code", this.code);
		 map.put("msg", this.msg);
		 map.put("data", data);
		 return map;
	 }
	 
}
