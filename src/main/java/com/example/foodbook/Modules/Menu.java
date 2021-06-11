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
public class Menu {

    @Id @GeneratedValue
    private long menuId;
    private String name;
    private String photo;
    private String description;
    private long calories;
    private long price;


}
