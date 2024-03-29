package com.example.webfluxmongodbdemo.handler;

import com.example.webfluxmongodbdemo.dao.CityRepository;
import com.example.webfluxmongodbdemo.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @Author: zhangQi
 * @Date: 2020-08-09 17:33
 */
@Component
public class CityHandler {

    private final CityRepository cityRepository;

    @Autowired
    public CityHandler(CityRepository cityRepository){
        this.cityRepository = cityRepository;
    }

    public Mono<City> save(City city){
        return cityRepository.save(city);
    }

    public Mono<City> findCityById(Long id){
        return cityRepository.findById(id);
    }

    public Flux<City> findAllCity(){
        return cityRepository.findAll();
    }

    public Mono<City> modifyCity(City city){
        return cityRepository.save(city);
    }

    public Mono<Long> deleteCity(Long id){
        return cityRepository.deleteById(id).flatMap(
                mono->Mono.create(cityMonoSink->cityMonoSink.success(id))
        );
    }
}
