package com.server.Controller;

import com.server.DTO.PizzaDTO;
import com.server.Model.Pizza;
import com.server.Service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;


    @GetMapping("/pizzas")
    public List<PizzaDTO> getAllPizzas(@RequestParam(value = "category", required = false) Integer category){

        return pizzaService.getAllPizzas(category);
    }

}
