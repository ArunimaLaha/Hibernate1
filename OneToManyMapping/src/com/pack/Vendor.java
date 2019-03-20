package com.pack;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Vendor")
public class Vendor {
@Id
@Column(name="vid")
private int vendorid;
private String vname;
public int getVendorid() {
	return vendorid;
}
public void setVendorid(int vendorid) {
	this.vendorid = vendorid;
}
public String getVname() {
	return vname;
}
public void setVname(String vname) {
	this.vname = vname;
}
@OneToMany(fetch=FetchType.LAZY, targetEntity=Customer.class, cascade=CascadeType.ALL)
@JoinColumn(name="Venid", referencedColumnName="vid")
private Set Customer;
public Set getCustomer() {
	return Customer;
}
public void setCustomer(Set customer) {
	Customer = customer;
}

}
