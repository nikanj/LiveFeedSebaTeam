package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints;

@Entity
public class Question {

	@Id
	public Long ID;
	
	@Constraints.Required
	public Long ID_prof;
	
	@Constraints.Required
	public String Question;
	
	@Constraints.Required
	public String CourseName;
}
