package id.ideweb.reservation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rooms_type")
public class RoomType {

	@Id
	@GeneratedValue
	@Column(name = "room_type_id")
	private Long id;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "multiplier")
	private Long multiplier;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(Long multiplier) {
		this.multiplier = multiplier;
	}

	@Override
	public String toString() {
		return "RoomType [description=" + description + ", multiplier=" + multiplier + "]";
	}
	
}
