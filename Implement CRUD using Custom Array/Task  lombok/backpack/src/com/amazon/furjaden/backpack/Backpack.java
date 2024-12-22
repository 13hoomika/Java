package com.amazon.furjaden.backpack;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Backpack {
    private int id;
    private String brand;
    private String careInstructions;
    private String countryOfOrigin;
}
