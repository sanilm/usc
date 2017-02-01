package com.igate.xyz.bean;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class MovementReqDetails {
	
	private String mrNo;
	@NotEmpty(message="employee id cannot be blank")
	@Size(min=4,max=20,message=" Traineename should be Minimum 4 and Maximum 8 characters")
	private String empId;
	
	
	private String travelMode;
	@NotEmpty(message="travel date cannot be blank")
	@Size(min=8,max=10,message=" Traineename should be in the form 12-12-12 or 12-12-2012")
	private String travelDate;
	@NotEmpty(message="travel time cannot be blank")
	@Size(min=5,max=10,message=" Traineename should be in the form 12:50/12:05")
	private String travelTime;
	private String sourceCity;
	private String destinationCity;
	@NotEmpty(message="travel time cannot be blank")
	@Size(min=5,max=10,message=" Traineename should be in the form 12:50/12:05")
	private String purpose;
	private String mrStatus;
	public String getMrNo() {
		return mrNo;
	}
	public void setMrNo(String mrNo) {
		this.mrNo = mrNo;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getTravelMode() {
		return travelMode;
	}
	public void setTravelMode(String travelMode) {
		this.travelMode = travelMode;
	}
	public String getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}
	public String getTravelTime() {
		return travelTime;
	}
	public void setTravelTime(String travelTime) {
		this.travelTime = travelTime;
	}
	public String getSourceCity() {
		return sourceCity;
	}
	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}
	public String getDestinationCity() {
		return destinationCity;
	}
	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getMrStatus() {
		return mrStatus;
	}
	public void setMrStatus(String mrStatus) {
		this.mrStatus = mrStatus;
	}
	
	
}
