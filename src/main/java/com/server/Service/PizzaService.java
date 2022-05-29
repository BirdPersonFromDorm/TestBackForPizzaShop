package com.server.Service;

import com.server.DTO.PizzaDTO;
import com.server.Mapper.PizzaMapper;
import com.server.Model.Pizza;
import com.server.Repository.PizzaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    @Autowired
    private PizzaMapper pizzaMapper;

    public List<PizzaDTO> getAllPizzas(Integer category){
        List<Pizza> all = pizzaRepository.findAll();

        if (category == null){
            return  all
                    .stream()
                    .map(x -> pizzaMapper.mapToDTO(x))
                    .collect(Collectors.toList());
        } else{
            return  all
                    .stream()
                    .map(x -> pizzaMapper.mapToDTO(x))
                    .filter(x -> x.getCategory() == category)
                    .collect(Collectors.toList());
        }

    }

}
