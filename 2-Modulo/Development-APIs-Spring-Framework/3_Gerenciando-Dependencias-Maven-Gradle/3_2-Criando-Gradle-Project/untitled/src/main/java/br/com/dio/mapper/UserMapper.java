package br.com.dio.mapper;

import br.com.dio.dto.UserDTO;
import br.com.dio.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserMapper {

    @Mapping(target = "code", source = "id")
    @Mapping(target = "username", source = "name")
    UserModel toModel(final UserDTO dto);

    // Mapeamento inverso, cuidado pois o IntelliJ nao tem nenhum plugin disso, mas nada que impeça seu funcionamento
    @Mapping(target = "id", source = "code")
    @Mapping(target = "name", source = "username")
    UserDTO toDTO(final UserModel model);

}
