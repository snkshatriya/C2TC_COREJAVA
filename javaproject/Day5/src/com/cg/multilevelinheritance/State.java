package com.cg.multilevelinheritance;

public class State extends Country {
	private String stateName;
	private String location;
	private String language;
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", location=" + location + ", language=" + language
				+ ", getCountryName()=" + getCountryName() + ", getCapital()=" + getCapital() + "]";
	}
	
	

}
