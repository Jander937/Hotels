package com.co.buritica.hotels.mapper;

import com.co.buritica.hotels.models.dtos.HotelDTO;
import com.co.buritica.hotels.models.entities.CitiesEntity;
import com.co.buritica.hotels.models.entities.HotelEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IHotelsMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "address", target = "address"),
            @Mapping(source = "citiesEntity.id", target = "cityId"), // Accede al ID de la ciudad
            @Mapping(source = "phones", target = "phones"),
            @Mapping(source = "neighborhood", target = "neighborhood"),
    })
    HotelDTO hotelToDTO(HotelEntity hotel);

    List<HotelDTO> toDTOList(List<HotelEntity> hotelEntities);

    // Método de mapeo personalizado para convertir CitiesEntity a Integer
    default Integer map(CitiesEntity citiesEntity) {
        return citiesEntity != null ? citiesEntity.getId() : null;
    }
}
