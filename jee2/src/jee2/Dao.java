package jee2;

public class Dao implements IDao {

	@Override
	public double getData() {
		System.out.println("version de base de donn�s");
		double temp=23;
		return temp;
	}

}
