package com.jcode.crimeapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
public class Location {
    private BigDecimal latitude;
    private Street street;
    private BigDecimal longitude;
}
