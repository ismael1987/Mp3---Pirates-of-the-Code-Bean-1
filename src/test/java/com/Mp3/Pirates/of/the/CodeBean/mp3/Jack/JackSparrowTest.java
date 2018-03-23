package com.Mp3.Pirates.of.the.CodeBean.mp3.Jack;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class JackSparrowTest {

    JackSparrow jackSparrow;
    @Test
    void givecoin() {

        String givecoin = jackSparrow.givecoin();
        assertThat(givecoin,is("I Got it"));


    }

}