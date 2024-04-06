package com.co.buritica.hotels.mapper;

import com.co.buritica.hotels.models.dtos.UserTypesDTO;
import com.co.buritica.hotels.models.entities.UserTypesEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
@Mapper(componentModel = "spring")
public interface IUserTypesMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name")
    })

    UserTypesDTO userTypesToDTO(UserTypesEntity userTypes);

    List<UserTypesDTO> toDTOList(List<UserTypesEntity> userTypesEntities);
}
