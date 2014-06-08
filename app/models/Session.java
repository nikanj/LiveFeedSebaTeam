package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints;

@Entity
public class Session {

	@Id
	public Long Course_Id;
	
	@Constraints.Required
	public Long  ID_stats;
	
	@Constraints.Required
	public Long Session_number;
	
}
