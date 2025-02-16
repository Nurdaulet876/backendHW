package org.example;

import org.springframework.stereotype.Component;

@Component
public class Footballer {
    public String getFootballerInfo(){
        return "Name: Antony, position: left winger";
    }
}
