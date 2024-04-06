package com.co.buritica.hotels.mapper;

import com.co.buritica.hotels.models.dtos.CitiesDTO;
import com.co.buritica.hotels.models.entities.CitiesEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ICitiesMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name")
    })
    CitiesDTO citiesToDTO(CitiesEntity cities);

    List<CitiesDTO> toDTOList(List<CitiesEntity> citiesEntities);
}
