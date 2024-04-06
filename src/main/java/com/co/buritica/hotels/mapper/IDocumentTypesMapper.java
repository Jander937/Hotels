package com.co.buritica.hotels.mapper;

import com.co.buritica.hotels.models.dtos.DocumentTypesDTO;
import com.co.buritica.hotels.models.entities.DocumentTypesEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IDocumentTypesMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "initials", target = "initials")
    })

    DocumentTypesDTO DocumentTypesToDTO(DocumentTypesEntity documentTypes);

    List<DocumentTypesDTO> toDTOList(List<DocumentTypesEntity> documentTypesEntities);
}
