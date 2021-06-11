package com.example.foodbook.Modules;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FoodCategory {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String icon;


}
