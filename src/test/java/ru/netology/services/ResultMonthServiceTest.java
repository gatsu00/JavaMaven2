package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ResultMonthServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/resultMonth.csv")

    public void test(int expected, int income, int expense, int threshold) {
        ResultMonthService service = new ResultMonthService();
        int actual = service.calculate(income, expense, threshold);
        Assertions.assertEquals(expected, actual);
    }
}