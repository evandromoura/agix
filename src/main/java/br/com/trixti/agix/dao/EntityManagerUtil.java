package br.com.trixti.agix.dao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerUtil {

	private static EntityManager manager;
	
    public static EntityManager getEntityManager() {
    	if(manager == null) {
	        EntityManagerFactory factory = Persistence.createEntityManagerFactory("agix");
	        manager = factory.createEntityManager();
    	}
    	return manager;
    }

    public static void main(String[] args) {
        EntityManager manager = EntityManagerUtil.getEntityManager();
        System.out.print("EntityManage class ===> " + manager.getClass().getCanonicalName());
    }
}