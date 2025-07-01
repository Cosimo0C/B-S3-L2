package cosimocrupi;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
private static final EntityManagerFactory emf= Persistence.createEntityManagerFactory("B-S2-L2");
private static final EntityManager em= emf.createEntityManager();
    public static void main(String[] args) {

    }
}
