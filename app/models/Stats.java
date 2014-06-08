package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints;
import java.util.List;

import javax.persistence.GeneratedValue;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;

import com.fasterxml.jackson.databind.JsonNode;

import play.data.validation.Constraints.Email;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import play.libs.Akka;
import play.libs.F.Callback;
import play.libs.F.Callback0;
import play.mvc.WebSocket;
import play.db.ebean.*;

@Entity
public class Stats extends Model {
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
