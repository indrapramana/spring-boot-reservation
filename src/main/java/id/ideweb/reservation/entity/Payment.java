package id.ideweb.reservation.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "payments")
public class Payment {
	
	@Id
	@GeneratedValue
	@Column(name = "payment_id")
	private Long id;
	
	@ManyToOne
	@Column(name = "payment_method_id")
	private PaymentMethod paymentMethod;
	
	@Column(name = "value")
	private Long value;
	
	@Column(name = "date_of_payment")
	private Date dateOfPayment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Long getValue() {
		return value;
	}

	public void setValue(Long value) {
		this.value = value;
	}

	public Date getDateOfPayment() {
		return dateOfPayment;
	}

	public void setDateOfPayment(Date dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
	}

	@Override
	public String toString() {
		return "Payment [paymentMethod=" + paymentMethod + ", value=" + value + "]";
	}
	
}
