package models;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.ebean.Model;
import play.db.ebean.Transactional;
import play.db.jpa.JPA;

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
	
	public static Map<String,String> options() {
        @SuppressWarnings("unchecked")
				List<Stats> Stat = JPA.em().createQuery("from Stats order by ID_stats").getResultList();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Stats c: Stat) {
            options.put(c.ID_stats.toString(), c.Pause.toString());
        }
        return options;
    }
	
}
