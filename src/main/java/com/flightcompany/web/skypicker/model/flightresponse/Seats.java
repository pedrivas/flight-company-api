package com.flightcompany.web.skypicker.model.flightresponse;

import lombok.Data;

@Data
public class Seats {
    public int passengers;
    public int adults;
    public int children;
    public int infants;
}
