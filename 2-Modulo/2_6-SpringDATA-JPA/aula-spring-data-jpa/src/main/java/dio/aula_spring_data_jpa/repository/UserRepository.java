package dio.aula_spring_data_jpa.repository;

import dio.aula_spring_data_jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


// Extendendo uma interface do framework trabalhando na classe user e sei que seu ID é Integer
// Tendo diversos métodos dando CTRL Click em JpaRepository
public interface UserRepository extends JpaRepository<User, Integer> {

    // Query Method
    List<User> findByNameContaining(String Name);

    // Query Method
    User findByUsername(String Username);

    // Query Override
    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
    List<User> filtrarPorNome(@Param("name") String name);

}
