package models;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import play.data.validation.Constraints;
import play.db.jpa.*;

@Entity
public class Prof {
	@Id
	public Long ID_prof;
	@Constraints.Required
	public String ProfName;
	@Constraints.Required
	public String Password;
	
	
	
	public static Map<String,String> options() {
        @SuppressWarnings("unchecked")
				List<Prof> Professor = JPA.em().createQuery("from Prof order by ProfName").getResultList();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Prof c: Professor) {
            options.put(c.ID_prof.toString(), c.ProfName);
        }
        return options;
    }
	
}