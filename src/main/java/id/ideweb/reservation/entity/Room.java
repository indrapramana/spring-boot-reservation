package id.ideweb.reservation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rooms")
public class Room {

	@Id
	@GeneratedValue
	@Column(name = "room_id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "room_status_id")
	private RoomStatus roomStatus;
	
	@Column(name = "number_of_people")
	private Long numberOfPeople;
	
	@Column(name = "description")
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public RoomStatus getRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(RoomStatus roomStatus) {
		this.roomStatus = roomStatus;
	}

	public Long getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(Long numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Room [description=" + description + "]";
	}
	
}
