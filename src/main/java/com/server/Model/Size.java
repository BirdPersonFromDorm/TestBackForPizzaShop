package com.server.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Size {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sizeId;
    private int size;

    @ManyToMany(cascade=CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinTable(name = "pizza_size",
            joinColumns = { @JoinColumn(name = "size_id")},
            inverseJoinColumns = { @JoinColumn(name = "pizza_id")})
    private List<Pizza> pizzas;
}
