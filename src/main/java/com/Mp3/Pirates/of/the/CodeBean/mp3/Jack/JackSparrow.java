package com.Mp3.Pirates.of.the.CodeBean.mp3.Jack;

import org.springframework.stereotype.Component;

@Component
public class JackSparrow {

    private Compass compass;

    public JackSparrow(Compass compass) {
        this.compass = compass;
    }

    public String givecoin() {

        String givecoin = compass.getcoin();

        if (new String(givecoin).equals("Coin")) {
            return  "I Got it";

        }
        return "no coin";

    }
}
