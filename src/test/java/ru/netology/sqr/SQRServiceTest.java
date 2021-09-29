package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void shouldSqrtNumber() {
        SQRService service = new SQRService();

        int min = 200;
        int max = 300;
        int expected = 3;
        int actual = service.sqrtNumber(min, max);
        assertEquals(expected, actual);

    }
}