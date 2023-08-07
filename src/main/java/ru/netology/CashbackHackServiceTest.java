package ru.netology;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService cashbackHackService = new CashbackHackService();

    @org.junit.Test
    public void shouldCalculateRemainWithZeroAmount() {
        int amount = 0;

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldCalculateRemainWithAmountUnderBoundary() {
        int amount = 999;

        int actual = cashbackHackService.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldCalculateRemainWithAmountOverBoundary() {
        int amount = 1001;

        int actual = cashbackHackService.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldCalculateRemainWithAmountEqualsBoundary() {
        int amount = 10000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}