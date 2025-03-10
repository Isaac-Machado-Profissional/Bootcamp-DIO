package dio.beans_vs_components.app;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Converter o Json para um objeto de nosso dominio, com o framework Gson da Google

// Component = Components são escaneados na aplicação, quando eu tenho acesso ao código fonte
// Como fazer um Component em uma biblioteca onde não temos acesso ao código fonte do Gson da Google que não tem Component?
// Só criar uma estrutura onde ele será um Bean, no arquivo BeansVsComponent
@Component
public class ConversorJson { //
    @Autowired
    private Gson gson; // Eliminei o new aqui
    public ViaCepResponse converter(String json ){
        ViaCepResponse response = gson.fromJson(json,ViaCepResponse.class);
        return response;
    }
}