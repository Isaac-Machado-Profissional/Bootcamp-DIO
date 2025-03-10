package dio.aula_spring_data_jpa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_user")
public class User {               //POJO = Plain Old Java Object 'Objeto simples
    @Id // BD faça uma estrutura de identificação tendo o ID correspondente a cada Seção entidade
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Automatica pela estratégia Identity
    @Column(name = "user_id") // Coluna terá nome não de id e sim de user_id
    private Integer id;
    @Column(length = 50, nullable = false) // Campo name de 50 tamanho e não serão vazios
    private String name;
    @Column(length = 20, nullable = false) // Campo user de 20 tamanho e não serão vazios
    private String username;
    @Column(length = 100, nullable = false) // Campo password de 100 tamanho e não serão vazios
    private String password;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
