package com.consumingrest.restconsumingguide.dto;

import java.util.List;

public class BestSellersListResponse {
	private String status;
	private String copyright;
	private String num_results;
	private List<Result> results;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCopyright() {
		return copyright;
	}
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}
	public String getNum_results() {
		return num_results;
	}
	public void setNum_results(String num_results) {
		this.num_results = num_results;
	}
	public List<Result> getResults() {
		return results;
	}
	public void setResults(List<Result> results) {
		this.results = results;
	}
	public BestSellersListResponse(String status, String copyright, String num_results, List<Result> results) {
		super();
		this.status = status;
		this.copyright = copyright;
		this.num_results = num_results;
		this.results = results;
	}
	
	public BestSellersListResponse() {
		
	}
}
