package id.ideweb.reservation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rooms_status")
public class RoomStatus {

	@Id
	@GeneratedValue
	@Column(name = "room_status_id")
	private Long id;
	
	@Column(name = "room_status")
	private String roomStatus;
	
	@Column(name = "status_description")
	private String description;

	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "RoomStatus [roomStatus=" + roomStatus + ", description=" + description + "]";
	}
	
	
	
}
