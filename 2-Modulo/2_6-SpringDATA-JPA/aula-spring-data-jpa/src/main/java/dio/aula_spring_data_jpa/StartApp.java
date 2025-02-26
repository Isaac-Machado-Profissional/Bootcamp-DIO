package dio.aula_spring_data_jpa;

import dio.aula_spring_data_jpa.model.User;
import dio.aula_spring_data_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component // Gerenciado pelo SpringFramework
public class StartApp implements CommandLineRunner { //Obrigada a usar o métdo Run

    @Autowired // Injeção de dependências
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception { // Altere abaixo, e verá acontecer a alteração no PostgreSQL
        User user = new User();
        user.setName("Altere aqui");
        user.setUsername("E verá alterar");
        user.setPassword("No seu banco SQL");
                        // Precisará ter um banco PostGree Configurado
        repository.save(user);


        // Verificar se foi salvo, quero listar esses usuários dentro do for buscando através do repository todos os usuários

        for(User u: repository.findAll()) {
            System.out.println(u);
        }

    }
}
