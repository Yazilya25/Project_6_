package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void findSumSalesAllMonth() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();

        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMediumSaleMonth() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();

        long actual = service.averageSale(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMonthMaxSales() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();

        long actual = service.maxSales(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMonthMinSales() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();

        long actual = service.minSales(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findQtyMonthLessAverage() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();

        long actual = service.qtyMonthLessAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findQtyMonthAboveAverage() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();

        long actual = service.qtyMonthAboveAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}