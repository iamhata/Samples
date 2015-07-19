package patterns.Adapter;

import java.util.List;

public class MultipleTablesDAOObjectAdapter implements IMultipleTablesDAO {
	private ISingleTableDAO daoAdaptee = new DefaultSingleTableDAO();
	
	@Override
	public int deleteCustomers(List<Object> list) {
		int count = 0;
		for(Object obj:list){
			if(1 == daoAdaptee.saveCustomer(obj))
				count++;
		}
		return count;
	}

	@Override
	public int deleteProducts(List<Object> list) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delOrders(List<Object> list) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveCustomers(List<Object> list) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveProducts(List<Object> list) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveOrders(List<Object> list) {
		// TODO Auto-generated method stub
		return 0;
	}

}
