package patterns.Adapter;

import java.util.List;

public interface IMultipleTablesDAO {
	public int deleteCustomers(List<Object> list);
	public int deleteProducts(List<Object> list);
	public int delOrders(List<Object> list);
	public int saveCustomers(List<Object> list);
	public int saveProducts(List<Object> list);
	public int saveOrders(List<Object> list);
}
