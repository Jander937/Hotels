package com.co.buritica.hotels.services.impl;

import com.co.buritica.hotels.mapper.ICitiesMapper;
import com.co.buritica.hotels.models.dtos.CitiesDTO;
import com.co.buritica.hotels.models.entities.CitiesEntity;
import com.co.buritica.hotels.repositories.CitiesRepository;
import com.co.buritica.hotels.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CitiesRepository citiesRepository;

    @Autowired
    ICitiesMapper iCitiesMapper;

    @Override
    public CitiesDTO findsById(Integer id) throws Exception {
        Optional<CitiesEntity> citiesEntityOptional = this.citiesRepository.findById(Long.valueOf(id));
        if (citiesEntityOptional.isPresent()) {
            return this.iCitiesMapper.citiesToDTO(citiesEntityOptional.get());
        } else {
            throw new Exception("Tipo de documento no encontrado con el ID proporcionado: " + id);
        }
    }
}
