package ru.netology.sqr;

public class SQRService {
    public int sqrtNumber(int min, int max) {
        int counter = 0;
        int number;
        for (int i = 10; i < 100; i++) {
            number = i * i;
            if ((number >= min) && (number <= max)) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
