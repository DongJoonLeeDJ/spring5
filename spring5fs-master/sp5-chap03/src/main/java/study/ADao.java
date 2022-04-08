package study;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ADao {

	private static int id = 0;
	
	private Map<Integer, A> map = 
			new HashMap<Integer, A>();
	
	public void insert(A a) {
		map.put(++id, a);
	}
	
	public Collection<A> select() {
		return map.values();
	}
}
