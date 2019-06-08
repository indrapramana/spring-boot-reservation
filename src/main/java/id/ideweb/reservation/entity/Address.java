package id.ideweb.reservation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue
	@Column(name = "address_id")
	private long addressId;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "house_number")
	private String houseNumber;
	
	@Column(name = "flat_number")
	private String flatNumber;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "post_code")
	private String postCode;

	
	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", houseNumber=" + houseNumber + ", flatNumber=" + flatNumber + ", city="
				+ city + ", postCode=" + postCode + "]";
	}
	
}
