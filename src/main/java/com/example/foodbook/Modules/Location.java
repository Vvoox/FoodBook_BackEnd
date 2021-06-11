package com.example.foodbook.Modules;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Location {

    @Id @GeneratedValue
    private long id;
    private BigDecimal latitude;
    private BigDecimal longitude;


}
