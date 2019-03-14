package com.pack;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="Emp603")
@PrimaryKeyJoinColumn(name="id")
public class Contract_Employee extends Employee {
private int pay_hour;
private String contract_duration;
public int getPay_hour() {
	return pay_hour;
}
public void setPay_hour(int pay_hour) {
	this.pay_hour = pay_hour;
}
public String getContract_duration() {
	return contract_duration;
}
public void setContract_duration(String contract_duration) {
	this.contract_duration = contract_duration;
}

}
