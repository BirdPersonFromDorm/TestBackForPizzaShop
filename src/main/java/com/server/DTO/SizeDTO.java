package com.server.DTO;

import lombok.*;
import org.springframework.stereotype.Component;

@Builder
@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SizeDTO {
    private int size;
}
