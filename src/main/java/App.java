import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Configure EntityManagerFactory
        ConnectionConfig.configure();

// Create EntityManagerFactory and EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CountryPersistenceUnit");
        EntityManager em = emf.createEntityManager();

// Creating a repository and service
        CountryRepository countryRepository = new CountryRepository(em);
        CountryService countryService = new CountryService(em);




    }
}