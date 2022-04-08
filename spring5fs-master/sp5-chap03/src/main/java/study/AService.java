package study;

import java.util.Collection;

public class AService {

	private ADao adao;
	
	public AService(ADao adao) {
		this.adao = adao;
	}

	public void reg(A a) {
		adao.insert(a);
	}
	
	public void select() {
		Collection<A> collection = adao.select();
		collection.forEach((element)->{
			System.out.println(element);
		});
	}
}
