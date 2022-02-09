package com.portfolio.system_of_car_control.parameters.repository;

import com.portfolio.system_of_car_control.parameters.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country,Integer> {


}
