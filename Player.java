package com.example._35_savanchuk.Database;

import java.util.UUID;

public class Player {
    private UUID PlayerID;
    private String LastName;
    private String FirstName;
    private boolean Sex;
    private double Height;
    private double Weight;
    private String ShirtNumber;
    private String Email;
    private UUID CountryCode;

    public void Init(String lName, String fName, boolean sex
    , double height, double weight, String shirt, String  email, UUID countryID){
        this.PlayerID =  UUID.randomUUID();
        this.LastName = lName;
        this.FirstName = fName;
        this.Sex = sex;
        this.Height = height;
        this.Weight = weight;
        this.ShirtNumber = shirt;
        this.Email = email;
        this.CountryCode = countryID;

    }


}
