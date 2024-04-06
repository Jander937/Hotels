package com.co.buritica.hotels.services;

import com.co.buritica.hotels.models.dtos.CitiesDTO;

public interface CityService {
    CitiesDTO findsById(Integer id) throws Exception;
}
