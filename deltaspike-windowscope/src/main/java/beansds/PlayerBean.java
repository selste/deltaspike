package beansds;

import java.io.Serializable;

import javax.inject.Named;

import org.apache.deltaspike.core.api.scope.WindowScoped;

@Named
@WindowScoped
public class PlayerBean implements Serializable {

	private static final long serialVersionUID = 1L;

    private String name = "-";

    public PlayerBean() {
    	// nothing to do
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }            
}
