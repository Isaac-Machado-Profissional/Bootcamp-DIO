package dio.aula_spring_data_jpa.repository;

import dio.aula_spring_data_jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


// Extendendo uma interface do framework trabalhando na classe user e sei que seu ID é Integer
// Tendo diversos métodos dando CTRL Click em JpaRepository
public interface UserRepository extends JpaRepository<User, Integer> {
}
