
public enum WhatName {
	michael("nice", "24"),
	pam("cute","10"),
	rick("strong","14"),
	jim("tall","33"),
	ricardo("fast","99"),
	santa("sleepy","1");
	
	private final String description;
	private final String year;
	
	WhatName(String descriptionHere, String yearHere){
		description = descriptionHere;
		year = yearHere;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getYear() {
		return year;
	}

}
