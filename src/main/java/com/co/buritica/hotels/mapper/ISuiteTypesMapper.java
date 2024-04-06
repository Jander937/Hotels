package com.co.buritica.hotels.mapper;

import com.co.buritica.hotels.models.dtos.SuiteTypesDTO;
import com.co.buritica.hotels.models.entities.SuiteTypesEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ISuiteTypesMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "description", target = "description")
    })

    SuiteTypesDTO suiteTypesToDTO(SuiteTypesEntity suiteTypes);

    List<SuiteTypesDTO> toDTOList(List<SuiteTypesEntity> suiteTypesEntities);
}
