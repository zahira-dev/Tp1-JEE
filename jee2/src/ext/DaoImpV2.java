package ext;

import jee2.IDao;

public class DaoImpV2 implements IDao{

	@Override
	public double getData() {
		System.out.println("Vesion web services");
		double data=12;
	
		return data;
	}

}
