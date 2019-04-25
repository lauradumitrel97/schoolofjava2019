package repository;

import entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

//    @PersistenceContext
//    EntityManager entityManager;
//
//    public List<Person> getPeople() {
//        String query = "SELECT p FROM Person p";
//         return entityManager.createQuery(query).getResultList();
//    }


}
