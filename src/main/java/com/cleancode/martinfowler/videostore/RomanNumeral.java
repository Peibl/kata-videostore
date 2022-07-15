package com.cleancode.martinfowler.videostore;

public class RomanNumeral {

    public String convertNumber(int number) {
        StringBuilder res = new StringBuilder();

        digitConvertion(number / 100, res, "C", "D", "M");
        digitConvertion(number / 10, res, "X", "L", "C");
        digitConvertion(number % 10, res, "I", "V", "X");

        return res.toString();
    }

    private void digitConvertion(int number, StringBuilder res, String one, String five, String ten) {
        if (number <= 3) {
            for (int i = 0; i < number; i++) {
                res.append(one);
            }
        }

        if (number == 4) {
            res.append(one);
            res.append(five);
        }

        if (number >= 5 && number <= 8) {
            res.append(five);
            for (int i = 5; i < number; i++) {
                res.append(one);
            }
        }

        if (number == 9) {
            res.append(one);
            res.append(ten);
        }
    }
}
