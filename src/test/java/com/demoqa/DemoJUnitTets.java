package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

public class DemoJUnitTets {

    @BeforeAll
    static void beforeAll(){
        System.out.println("### @BeforeAll");
    //  Configuration.browser = "chrome";
    }

    @AfterAll
    static void AfterAll(){
        System.out.println("### @AfterAll");
    }

    //Для повторяющихся действий в тестах
    @BeforeEach
    void BeforeEach(){
        System.out.println("    ### @BeforeEach");
    }

    //Для действий после выполнения теста: закрыть браузер, сохранить лог
    @AfterEach
    void AfterEach(){
        System.out.println("    ### @AfterEach");
    }


    @Test
    void firstTest () {
        System.out.println("        ### @Test firstTest");
        int result = 2 + 2;
        Assertions.assertTrue(result == 4);
    }

    @Test
    void secondTest () {
        System.out.println("        ### @Test secondTest");
        int result = 2 * 2;
        Assertions.assertTrue(result == 4);
    }

}





