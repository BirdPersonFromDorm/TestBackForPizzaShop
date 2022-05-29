package com.server.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pizza_id")
    private Integer pizzaId;
    private String imageUrl;
    private String name;
    private int price;
    private int category;
    private int rating;

    @ManyToMany(cascade=CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinTable(name = "pizza_type",
            joinColumns = { @JoinColumn(name = "pizza_id")},
            inverseJoinColumns = { @JoinColumn(name = "type_id")})
    @JsonIgnoreProperties("pizzas")
    private List<Type> types;

    @ManyToMany(cascade=CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinTable(name = "pizza_size",
            joinColumns = { @JoinColumn(name = "pizza_id")},
            inverseJoinColumns = { @JoinColumn(name = "size_id")})
    @JsonIgnoreProperties("pizzas")
    private List<Size> sizes;

}
