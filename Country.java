package com.example._35_savanchuk.Database;

import java.util.UUID;

public class Country {
    private UUID ID;
    private String CountryName;

    public void Init(String country){
        this.ID =  UUID.randomUUID();
        this.CountryName = country;
    }

}
