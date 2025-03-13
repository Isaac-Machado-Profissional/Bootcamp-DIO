package br.com.dio.mapper;
// Mappstruct, uso de refractions pra fazer o mapeamento

import br.com.dio.dto.UserDTO;
import br.com.dio.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


// Anotacao do mappstruct
@Mapper
public interface UserMapper {

    @Mapping(target = "code", source = "id")
    @Mapping(target = "userName", source = "name")
    UserModel toModel(final UserDTO dto); // Valor do UserDTO tendo ID deve ser setado no code do UserModel


    // Troco definindo pra UserDTO
    @Mapping(target = "id", source = "code")
    @Mapping(target = "name", source = "userName")
    UserDTO toDTO(final UserModel model); // Valor do UserDTO tendo ID deve ser setado no code do UserModel

}
