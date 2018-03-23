package com.Mp3.Pirates.of.the.CodeBean.mp3.Jack;

import org.springframework.stereotype.Component;

@Component
public class Compass {

    private CursedCoin cursedCoin;

    public Compass(CursedCoin cursedCoin) {
        this.cursedCoin = cursedCoin;
    }

    public String getcoin(){

        String coin = cursedCoin.coin();

        return  coin;
    }

}
