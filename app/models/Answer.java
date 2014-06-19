package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints;

@Entity
public class Answer {

	@Id
	public Long ID_question;
	@Constraints.Required
	public String Answer;
}
