package id.ideweb.reservation.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reservations")
public class Reservation {

	@Id
	@GeneratedValue
	@Column(name = "reservation_id")
	private Long id;
	
	@ManyToOne
	@Column(name = "client_id")
	private Client client;
	
	@ManyToOne
	@Column(name = "payment_id")
	private Payment payment;
	
	private Date dateFrom;
	
	private Date dateTo;
	
	private Date dateReservation;
	
	private Long amount;
	
}
