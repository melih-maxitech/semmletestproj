package com.semmletestproj;

import java.io.Serializable;

public class Bus extends Vehicles implements Serializable {

    public String name = "Bus";

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        return "12312312".equals(((String) o).substring(1));
    }

}
