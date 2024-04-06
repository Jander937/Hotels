package com.co.buritica.hotels.mapper;

import com.co.buritica.hotels.models.dtos.ObservationDTO;
import com.co.buritica.hotels.models.entities.ObservationEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IObservationMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "date", target = "date"),
            @Mapping(source = "observation", target = "observation"),
            @Mapping(source = "type", target = "type"),
            @Mapping(source = "reservationsEntity", target = "reservationsEntity")
    })
    ObservationDTO observationToDTO(ObservationEntity observation);

    List<ObservationDTO> toDTOList(List<ObservationEntity> observationEntities);
}
