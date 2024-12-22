package com.amazon.portronics.extensionboard;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Portronics {
    private int id;
    private String brand;
    private int totalPowerOutlets;
    private String voltage;
}
