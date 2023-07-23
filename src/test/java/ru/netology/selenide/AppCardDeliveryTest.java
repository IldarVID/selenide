package ru.netology.selenide;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppCardDeliveryTest {
    private String generateDate (int addDays, String pattern) {
        return LocalDate.now().plusDays(addDays).format (DateTimeFormatter.ofPattern(pattern));
    }

    @Test
    public void shouldBeComplitedAllSuccsess() {

}