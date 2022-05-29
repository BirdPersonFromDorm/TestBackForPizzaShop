package com.server.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.server.Model.Pizza;
import com.server.Model.Size;
import com.server.Model.Type;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Builder
@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PizzaDTO {

    private Integer pizzaId;
    private String imageUrl;
    private String name;
    private int price;
    private int category;
    private int rating;
    private int[] types;
    private int[] sizes;



}
