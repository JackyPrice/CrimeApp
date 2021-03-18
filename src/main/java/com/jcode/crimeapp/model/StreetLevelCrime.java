package com.jcode.crimeapp.model;

import lombok.Data;

import java.util.Date;

// https://data.police.uk/docs/method/crime-street/

@Data
public class StreetLevelCrime {
    private String category;
    private String locationType;
    private Location location;
    private String context;
    private String outcomeStatus;
    private String persistentId;
    private int id;
    private String locationSubType;
    private Date month;
}
