package layer.agents;

/**
 * 
 * @author Johnny
 *
 */
public interface Agent {

	public Object getData();
	public String getName();
	public void forwardData();
	public boolean isDataAbnormal();
	public void collectData(Object data);

}
