package com.s1mpleqaq.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test007 {
    @Test
    public void aa(){
        System.out.println("2222");
    }


    @Test
    public void bb(){
        System.out.println("55555");
    }

    @Before
    public void cc(){
        System.out.println("cccc");
    }
    @After
    public void dd(){
        System.out.println("dddd");
    }

}
