package com.Mp3.Pirates.of.the.CodeBean.mp3.starter;

import com.Mp3.Pirates.of.the.CodeBean.mp3.Jack.JackSparrow;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class starterConvigration {
    @Bean
    ApplicationRunner strter(JackSparrow jackSparrow){
        return  args -> {
            String givecoin = jackSparrow.givecoin();
            System.out.println(givecoin);
        };

    }

}
