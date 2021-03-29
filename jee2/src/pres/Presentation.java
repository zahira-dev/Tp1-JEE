package pres;

import jee2.Dao;
import metier.MetierImp;

public class Presentation {

	public static void main(String[] args) {
		/*
		 * 
		 * Injections des dépendances par
		 * Instanciation statique=>new ( la difference entre les deux instanciations(dynamique &statique) => férmé a la modification et ouverte a l'extention
		 * 
		 * 
		 * 
		 * */
		MetierImp metier=new MetierImp();
		Dao dao=new Dao();
       metier.setDao(dao);
       System.out.println(metier.calcul());
       
	}

}
