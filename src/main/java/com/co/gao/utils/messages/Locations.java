package com.co.gao.utils.messages;

public enum Locations {
	USER_DIR("user.dir"),
	CONFIG_PROPERTIES("//files//config.properties"),
	JSON_USERS("//files//json//users.json");
	
	
	
	
	private String msn;
	 
	private Locations(String msn) {
        this.msn = msn;
    }
 
    public String getMsn() {
        return msn;
    }
}
