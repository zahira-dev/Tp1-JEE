package pres;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

import jee2.IDao;
import metier.IMetier;

public class Presentation2   {


	public static void main(String[] args) throws Exception {
	Scanner scanner=new Scanner(new File("Config.txt"));
	String daoClassName=scanner.nextLine();
	Class cDao=Class.forName(daoClassName);
	IDao dao=(IDao) cDao.getDeclaredConstructor().newInstance();
	System.out.println(dao.getData());
	String metierClassName=scanner.nextLine();
	Class cMetier=Class.forName(metierClassName);
	IMetier metier=(IMetier) cMetier.getDeclaredConstructor().newInstance();
	Method m=cMetier.getMethod("setDao",IDao.class);
    m.invoke(metier, dao);
    System.out.println(metier.calcul());
	}

}
