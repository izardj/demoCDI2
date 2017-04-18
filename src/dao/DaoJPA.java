package dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class DaoJPA implements IDao {

	@Override
	public String appelDao() {
		return "Bonjour, je suis bien dans la DAO JPA";
	}

	@PostConstruct
	public void loagApresConstruction() {
		System.out.println("Après création Dao JPA");
	}

	@PreDestroy
	public void logAvantDestruction() {
		System.out.println("Avant destruction Dao JPA");
	}

}
