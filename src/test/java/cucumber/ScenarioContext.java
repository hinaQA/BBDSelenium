package cucumber;

import java.util.HashMap;
import java.util.Map;

import Enum.Context;


public class ScenarioContext {

	private Map<String, Object> scenarioContext;
    /**
     * 
     */
	public ScenarioContext() {
		scenarioContext = new HashMap<>();
	}
    /**
     * 
     * @param key
     * @param value
     */
	public void setContext(Context key, Object value) {
		scenarioContext.put(key.toString(), value);
	}
   /**
    * 
    * @param key
    * @return
    */
	public Object getContext(Context key) {
		return scenarioContext.get(key.toString());
	}
    /**
     * 
     * @param key
     * @return
     */
	public Boolean isContains(Context key) {
		return scenarioContext.containsKey(key.toString());
	}



 
}
