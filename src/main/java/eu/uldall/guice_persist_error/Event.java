package eu.uldall.guice_persist_error;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="events")
public class Event {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
	private Long id;
	
	@Column
	private String name;
	
	public Event(String name) {
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}
}
