package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/resultMonth.csv")

    public void test(int expected, int income, int expense, int treshold) {
        VacationService service = new VacationService();
        int actual = service.calculate(income, expense, treshold);
        Assertions.assertEquals(expected, actual);
    }
}