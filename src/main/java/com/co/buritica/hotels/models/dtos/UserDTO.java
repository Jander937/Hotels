package com.co.buritica.hotels.models.dtos;

import com.co.buritica.hotels.models.entities.CitiesEntity;
import com.co.buritica.hotels.models.entities.DocumentTypesEntity;
import com.co.buritica.hotels.models.entities.UserTypesEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDTO {

    private Integer id;

    private Long document;

    private String names;

    private String surname;

    private String secondSurname;

    private String address;

    private String phone;

    private String email;

    private String password;

    private String status;

    private String role;

    private CitiesEntity citiesEntity;

    private DocumentTypesEntity documentTypesEntity;

    private UserTypesEntity userTypesEntity;

}
