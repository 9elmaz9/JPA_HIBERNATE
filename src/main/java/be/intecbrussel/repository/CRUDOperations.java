package be.intecbrussel.repository;

import be.intecbrussel.model.Student;

import javax.persistence.EntityManager;


public class CRUDOperations {
    private final EntityManager entityManager;

    public StudentRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void insertEntity() {
//voeg code hier toe.
        Student student = new Student("Rame", "Fadatare", "rames@javaguides.com");
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void findEntity() {
//voeg code hier toe.
        System.out.println("student id :: " + student.getId());
        System.out.println("student firstname :: " + student.getFirstName());
        System.out.println("student lastname :: " + student.getLastName());
        System.out.println("student email :: " + student.getEmail());
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void updateEntity() {
        EntityManager entityManager =
                JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Student student = entityManager.find(Student.class, 1);
        System.out.println("student id :: " + student.getId());
        System.out.println("student firstname :: " + student.getFirstName());
        System.out.println("student lastname :: " + student.getLastName());
        System.out.println("student email :: " + student.getEmail());
// The entity object is physically updated in the database when the transaction
// is committed
        student.setFirstName("Ram");
        student.setLastName("jadhav");
//voeg code hier toe.}
        public void removeEntity() {
//voeg code hier toe.
            Student student = entityManager.find(Student.class, 1);
            System.out.println("student id :: " + student.getId());
            System.out.println("student firstname :: " + student.getFirstName());
            System.out.println("student lastname :: " + student.getLastName());
            System.out.println("student email :: " + student.getEmail());
//voeg code hier toe.
        }
    }

}