package com.example.carros.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarroService {

    @Autowired
    CarroRepository rep;

    public Iterable<Carro> getCarros(){
        return rep.findAll();
    }

    public List<Carro> getCarrosFake(){
        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro(1L, "Gol"));
        carros.add(new Carro(2L, "Cadete"));
        carros.add(new Carro(3L, "Uno"));

        return carros;
    }

    public Optional<Carro> getCarroById(Long id) {
        return rep.findById(id);
    }
}
