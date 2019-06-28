package id.ideweb.reservation.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class RoomXReservationPK implements Serializable {

	@ManyToOne
	@JoinColumn(name = "room_id")
	private Room room;
	
	@ManyToOne
	@JoinColumn(name = "reservation_id")
	private Reservation reservation;

	public RoomXReservationPK() {
	}

	public RoomXReservationPK(Room room, Reservation reservation) {
		this.room = room;
		this.reservation = reservation;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (obj == null) {
			return false;
		}
		
		RoomXReservationPK that = (RoomXReservationPK) obj;
		
		if (room != null ? !room.equals(that.room) : that.room != null) {
			return false;
		}
		return reservation != null ? reservation.equals(that.reservation) : that.reservation == null;
	}
	
	@Override
	public int hashCode() {
		int result = room != null ? room.hashCode() : 0;
		result = 31 * result + (reservation != null ? reservation.hashCode() : 0);
		return result;
	}

		
	
	
}
