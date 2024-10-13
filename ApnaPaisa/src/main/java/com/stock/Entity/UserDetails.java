package com.stock.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity(name ="USER_DETAILS")
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="address_ID")
	private Address address;
	private String mobileNo;
	private String panCard;
	private String adharCard;
	private Double totalBalance;
	private Double profitBalance;
	private Double perProfit;
	private Double totalInvest;
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public String getAdharCard() {
		return adharCard;
	}
	public void setAdharCard(String adharCard) {
		this.adharCard = adharCard;
	}
	public Double getTotalBalance() {
		return totalBalance;
	}
	public void setTotalBalance(Double totalBalance) {
		this.totalBalance = totalBalance;
	}
	public Double getProfitBalance() {
		return profitBalance;
	}
	public void setProfitBalance(Double profitBalance) {
		this.profitBalance = profitBalance;
	}
	public Double getPerProfit() {
		return perProfit;
	}
	public void setPerProfit(Double perProfit) {
		this.perProfit = perProfit;
	}
	public Double getTotalInvest() {
		return totalInvest;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setTotalInvest(Double totalInvest) {
		this.totalInvest = totalInvest;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	

}
