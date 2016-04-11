package beansds;

import java.io.Serializable;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.myfaces.extensions.cdi.core.api.scope.conversation.WindowContext;
import org.apache.myfaces.extensions.cdi.core.api.scope.conversation.WindowScoped;

@Named
@WindowScoped
public class PlayerBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name = "-";
	
	@Inject
	WindowContext windowContext;

	public PlayerBean() {
		// nothing to do
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getContext() {
		return windowContext.getId();
	}

}
