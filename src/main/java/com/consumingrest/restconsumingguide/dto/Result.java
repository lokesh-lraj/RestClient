package com.consumingrest.restconsumingguide.dto;

public class Result {

	private String list_name;
	private String display_name;
	private String list_name_encoded;
	private String oldest_published_date;
	private String newest_published_date;
	private String updated;
	
	
	public String getList_name() {
		return list_name;
	}


	public void setList_name(String list_name) {
		this.list_name = list_name;
	}


	public String getDisplay_name() {
		return display_name;
	}


	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}


	public String getList_name_encoded() {
		return list_name_encoded;
	}


	public void setList_name_encoded(String list_name_encoded) {
		this.list_name_encoded = list_name_encoded;
	}


	public String getOldest_published_date() {
		return oldest_published_date;
	}


	public void setOldest_published_date(String oldest_published_date) {
		this.oldest_published_date = oldest_published_date;
	}


	public String getNewest_published_date() {
		return newest_published_date;
	}


	public void setNewest_published_date(String newest_published_date) {
		this.newest_published_date = newest_published_date;
	}


	public String getUpdated() {
		return updated;
	}


	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public Result() {
		
	}
	public Result(String list_name, String display_name, String list_name_encoded, String oldest_published_date,
			String newest_published_date, String updated) {
		super();
		this.list_name = list_name;
		this.display_name = display_name;
		this.list_name_encoded = list_name_encoded;
		this.oldest_published_date = oldest_published_date;
		this.newest_published_date = newest_published_date;
		this.updated = updated;
	}
	
	
}
