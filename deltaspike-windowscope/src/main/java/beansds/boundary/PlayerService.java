package beansds.boundary;

import java.io.Serializable;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@LocalBean
public class PlayerService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "deltaspike-windowscope")
	EntityManager entityManager;

	public PlayerService() {}
}
