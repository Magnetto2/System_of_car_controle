package com.portfolio.system_of_car_control.parameters.service;

import com.portfolio.system_of_car_control.parameters.models.Country;
import com.portfolio.system_of_car_control.parameters.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAll(){
        return countryRepository.findAll();
    }

    public void save(Country country){countryRepository.save(country);}

    public void delete(Integer id){
        countryRepository.deleteById(id);

    }


    public Country findById(Integer id) {
       return countryRepository.findById(id).orElse(null);
    }
}
