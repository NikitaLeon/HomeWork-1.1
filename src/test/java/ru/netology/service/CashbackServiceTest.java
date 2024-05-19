package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackServiceTest {

    @org.testng.annotations.Test
    public void ShouldAdd1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void ShouldAdd0() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void ShouldAdd100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void ShouldAdd500() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1500;
        int actual = cashbackHackService.remain(amount);
        int expected = 500;
        assertEquals(actual, expected);
    }
}
