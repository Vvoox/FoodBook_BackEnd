package com.example.foodbook.Modules;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int categories;
    private String priceRating;
    private String photo;
    private String duration;

    @OneToMany
    private List<Location> location;

    @OneToMany
    private List<Menu> menu;








}
