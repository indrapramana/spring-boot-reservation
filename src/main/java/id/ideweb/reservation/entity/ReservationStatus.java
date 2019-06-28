package id.ideweb.reservation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reservations_status")
public class ReservationStatus {

	@Id
	@GeneratedValue
	@Column(name = "reservation_status_id")
	private Long id;
	
	@Column(name = "reservation_status")
	private String reservationStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReservationStatus() {
		return reservationStatus;
	}

	public void setReservationStatus(String reservationStatus) {
		this.reservationStatus = reservationStatus;
	}

	@Override
	public String toString() {
		return "ReservationStatus [reservationStatus=" + reservationStatus + "]";
	}

}
