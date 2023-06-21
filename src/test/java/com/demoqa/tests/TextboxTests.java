package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextboxTests {

    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void successTest(){
        open("https://demoqa.com/text-box");

        $("#userName").setValue("Chebotar Elena");
        $("#userEmail").setValue("chebotar@gmail.com");
        $("#currentAddress").setValue("Moscow");
        $("#permanentAddress").setValue("Novoross");
        $("#submit").click();

        $("#output #name").shouldHave(text("Chebotar Elena"));
        $("#output #email").shouldHave(text("chebotar@gmail.com"));
        $("#output #currentAddress").shouldHave(text("Moscow"));
        $("#output #permanentAddress").shouldHave(text("Novoross"));


    }
}
