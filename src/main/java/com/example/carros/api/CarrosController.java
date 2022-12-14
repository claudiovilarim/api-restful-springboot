package com.example.carros.api;

import com.example.carros.domain.Carro;
import com.example.carros.domain.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/carros")
public class CarrosController {
    @Autowired
    private CarroService carroService2;

    @GetMapping
    public Iterable<Carro> get(){
        return carroService2.getCarros();
    }

    @GetMapping("/{id}")
    public Optional<Carro> get(@PathVariable("id") Long id){
        return carroService2.getCarroById(id);
    }
}
