package com.co.buritica.hotels.mapper;

import com.co.buritica.hotels.models.dtos.UserDTO;
import com.co.buritica.hotels.models.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IUserMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "phone", target = "phone"),
            @Mapping(source = "role", target = "role"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "status", target = "status"),
            @Mapping(source = "citiesEntity", target = "citiesEntity"),
            @Mapping(source = "address", target = "address"),
            @Mapping(source = "password", target = "password"),
            @Mapping(source = "document", target = "document"),
            @Mapping(source = "documentTypesEntity", target = "documentTypesEntity"),
            @Mapping(source = "names", target = "names"),
            @Mapping(source = "secondSurname", target = "secondSurname"),
            @Mapping(source = "surname", target = "surname"),
            @Mapping(source = "userTypesEntity", target = "userTypesEntity"),
    })

    UserDTO userToDTO(UserEntity user);

    List<UserDTO> toDTOList(List<UserEntity> userEntities);
}
