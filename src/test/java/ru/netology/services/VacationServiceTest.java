package ru.netology.services;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class VacationServiceTest {
    @Test
    public void calculate_shouldReturnCorrectResult() {
        VacationService vacationService = new VacationService();

        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 3;

        int actual = vacationService.calculate(income, expenses, threshold);

        assertEquals(expected, actual);
    }
}