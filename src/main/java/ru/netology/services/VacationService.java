package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= expenses) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses - (expenses * 3); // учитываем траты на отдых
            } else if (money >= threshold) { // можем ли отдыхать, если это не обычные траты
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses - (expenses * 3); // учитываем траты на отдых
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}

