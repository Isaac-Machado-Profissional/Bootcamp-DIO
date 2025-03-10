package dio.beans_vs_components.app;

// Apenas para não poluir a nossa classe principal BeansVsComponents, cada Bean tratando de recursos externos.
// Para enfim eliminarmos o new

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //todo Em algumas versões Spring, seria necessário colocar uma notação especial dizendo q isso seria um @Configuration no arquivo Beans. Pois todos eles estão sendo constituídos em o meu Container da minha APP.

public class Beans {
    @Bean
    public Gson gson(){
        return new Gson();
    }
}
