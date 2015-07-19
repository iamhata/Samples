package patterns.Adapter;

import java.util.List;

public interface ISingleTableDAO {
	public int deleteCustomer(Object obj);
	public int deleteProduct(Object obj);
	public int delOrder(Object obj);
	public int saveCustomer(Object obj);
	public int saveProduct(Object obj);
	public int saveOrder(Object obj);

}
