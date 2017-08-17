package com.zte;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by z on 2017/8/18.
 */
public class GameTest {
    Game game ;

    @Before
    public void setUp() throws Exception {
        game = new Game("5678");

    }

    @Test
    public void should_return_0A0B() throws Exception {

        assertEquals("0A0B",game.guess("1234"));
    }
}
