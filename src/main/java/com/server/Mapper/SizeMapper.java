package com.server.Mapper;

import com.server.DTO.PizzaDTO;
import com.server.DTO.SizeDTO;
import com.server.Model.Pizza;
import com.server.Model.Size;
import org.springframework.stereotype.Component;

@Component
public class SizeMapper {

    public SizeDTO mapToDTO(Size size){
        SizeDTO sizeDTO = new SizeDTO();
        sizeDTO.setSize(size.getSize());
        return sizeDTO;
    }
}
