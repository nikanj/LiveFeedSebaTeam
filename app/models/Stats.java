package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity
public class Stats extends Model  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	public Long ID_stats;
	
	@Constraints.Required
	public Long  Speed_slow;
	
	@Constraints.Required
	public Long Speed_ok;
	
	@Constraints.Required
	public Long  Speed_fast;
	
	@Constraints.Required
	public Long  Pause;
	
	@Constraints.Required
	public Long  Volume_high;
	
	@Constraints.Required
	public Long  Volume_ok;
	
	@Constraints.Required
	public Long  Volume_low;
	
	public static Finder<Long,Stats> find = new Finder<Long, Stats>(Long.class, Stats.class);
}
