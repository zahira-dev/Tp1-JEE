package metier;

import jee2.IDao;

public class MetierImp implements IMetier {
	
	/* Couplage faible */
	private IDao dao;
	/*Pour injecter dans la variable dao un objet d'une classe qui implémente l'interface IDao*/
	public void setDao(IDao dao) {
		this.dao = dao;
	}

	@Override
	public double calcul() {
		double temp=dao.getData();
		double res=temp*Math.PI;
		return res;
	}

}
