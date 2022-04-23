package com.flightcompany.model.flightresponse;

import lombok.Data;

@Data
public class BagLimit {
    public int hand_height;
    public int hand_length;
    public int hand_weight;
    public int hand_width;
    public int hold_dimensions_sum;
    public int hold_height;
    public int hold_length;
    public int hold_weight;
    public int hold_width;
    public int personal_item_height;
    public int personal_item_length;
    public int personal_item_weight;
    public int personal_item_width;
}