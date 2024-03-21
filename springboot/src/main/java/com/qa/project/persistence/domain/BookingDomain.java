package com.qa.project.persistence.domain;

import java.sql.Timestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "booking")
public class BookingDomain {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "booking_id")
	private Long id;	

	@ManyToOne()
	@JoinColumn(name = "buyer_id")
	private BuyerDomain buyer;
	
	@ManyToOne()
	@JoinColumn(name = "property_id")
	private PropertyDomain property;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "time")
	private Timestamp time;	

	public BookingDomain() {
		super();
	}	
	
	public BookingDomain(Long id, BuyerDomain buyer, PropertyDomain property, Timestamp time) {
		super();
		this.id = id;
		this.buyer = buyer;
		this.property = property;
		this.time = time;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public BuyerDomain getBuyer() {
		return buyer;
	}

	public void setBuyer(BuyerDomain buyer) {
		this.buyer = buyer;
	}

	public PropertyDomain getProperty() {
		return property;
	}

	public void setProperty(PropertyDomain property) {
		this.property = property;
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}
	
}