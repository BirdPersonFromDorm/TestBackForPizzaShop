package com.server.Mapper;

import com.server.DTO.PizzaDTO;
import com.server.Model.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PizzaMapper {

    public PizzaDTO mapToDTO(Pizza pizza){
        int[] types = pizza.getTypes().stream().map(x -> x.getType()).mapToInt(x ->x).toArray();
        int[] sizes = pizza.getSizes().stream().map(x -> x.getSize()).mapToInt(x ->x).toArray();


        PizzaDTO pizzaDTO = new PizzaDTO();
        pizzaDTO.setPizzaId(pizza.getPizzaId());
        pizzaDTO.setImageUrl(pizza.getImageUrl());
        pizzaDTO.setName(pizza.getName());
        pizzaDTO.setPrice(pizza.getPrice());
        pizzaDTO.setCategory(pizza.getCategory());
        pizzaDTO.setRating(pizza.getRating());
        pizzaDTO.setTypes(types);
        pizzaDTO.setSizes(sizes);
        return pizzaDTO;
    }

}
