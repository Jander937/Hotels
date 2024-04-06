package com.co.buritica.hotels.mapper;

import com.co.buritica.hotels.models.dtos.SuiteDTO;
import com.co.buritica.hotels.models.entities.HotelEntity;
import com.co.buritica.hotels.models.entities.SuiteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ISuitesMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "status", target = "status"),
            @Mapping(source = "phone", target = "phone"),
            @Mapping(source = "hotelsEntity.id", target = "hotelId"), // Accede al ID del hotel
            @Mapping(source = "suiteTypesEntity.id", target = "suiteTypesId"),
            @Mapping(source = "heating", target = "heating"),
            @Mapping(source = "privateBathroom", target = "privateBathroom"),
            @Mapping(source = "number", target = "number"),
    })
    SuiteDTO suiteToDTO(SuiteEntity suite);

    List<SuiteDTO> toDTOList(List<SuiteEntity> suiteEntities);

    // Método de mapeo personalizado para convertir HotelEntity a Integer
    default Integer map(HotelEntity hotelsEntity) {
        return hotelsEntity != null ? hotelsEntity.getId() : null;
    }
}
