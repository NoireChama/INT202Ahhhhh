package login.kakkak.loginkakak.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import login.kakkak.loginkakak.entities.Environment;

public class EntityManagerBuilder {
    private final  static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory(Environment.UNIT_NAME);
    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
}
