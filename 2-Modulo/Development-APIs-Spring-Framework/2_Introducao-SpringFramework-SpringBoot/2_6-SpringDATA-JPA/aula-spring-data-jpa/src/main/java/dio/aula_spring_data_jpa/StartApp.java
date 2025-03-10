package dio.aula_spring_data_jpa;

import dio.aula_spring_data_jpa.model.User;
import dio.aula_spring_data_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component // Gerenciado pelo SpringFramework
public class StartApp implements CommandLineRunner { //Obrigada a usar o métdo Run

    @Autowired // Injeção de dependências
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        List<User> users = repository.filtrarPorNome("Isaac"); // Valor da Busca aqui
        for (User u : users) {
            System.out.println(u);
        }

    // Altere abaixo, e verá acontecer a adição no PostgreSQL ou em seu Banco previamente Configurado em aplication.properties

       User user = new User();
       user.setName("Isaac");
       user.setUsername("Uzumaki");
       user.setPassword("SãoPaulo");
       // Precisará ter um banco PostGree Configurado
       repository.save(user);


       // Verificar se foi salvo, quero listar esses usuários dentro do for buscando através do repository todos os usuários

       for (User u : repository.findAll()) {
           System.out.println(u);
            }
        }
    }





