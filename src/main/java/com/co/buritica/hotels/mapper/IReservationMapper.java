package com.co.buritica.hotels.mapper;

import com.co.buritica.hotels.models.dtos.ReservationDTO;
import com.co.buritica.hotels.models.entities.ReservationEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IReservationMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "status", target = "status"),
            @Mapping(source = "checkInDate", target = "checkInDate"),
            @Mapping(source = "checkOutDate", target = "checkOutDate"),
            @Mapping(source = "suitesEntity", target = "suite"),
            @Mapping(source = "usersEntity", target = "user"),
    })

    ReservationDTO representationToDTO(ReservationEntity reservation);

    List<ReservationDTO> toDTOList(List<ReservationEntity> reservationEntities);
}
