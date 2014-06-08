package models;


import javax.persistence.Entity;
import javax.persistence.Id;
import play.data.validation.Constraints;

@Entity
public class Course {
	
	@Id
	public long ID_prof;
	
	@Constraints.Required
	public long Course_Id;
	  
	@Constraints.Required
	public String CourseName;
	
	
}
