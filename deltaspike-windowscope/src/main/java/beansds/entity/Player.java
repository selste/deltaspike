package beansds.entity;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Player
 *
 */
@Entity
@NamedQueries({@NamedQuery(name = Player.QUERY_FIND_ALL, query = "select p from Player p")})
public class Player implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public static final String QUERY_FIND_ALL = "Player.findAll";
	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;

	public Player() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
}
