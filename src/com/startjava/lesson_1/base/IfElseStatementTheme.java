package com.startjava.lesson_1.base;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java ");
        String gender = "";
        if (!gender.equals("male")) {
            System.out.println("Maybe this person is a woman");
        } else {
            System.out.println("Maybe this person is a man");
        }

        int age = 18;
        if (age > 18) {
            System.out.println("A person is adult");
        } else {
            System.out.println("His or her heeds a little time to grow up");
        }

        int height = 2;
        if (height < 1.8) {
            System.out.println("A person will never become a basketball player");
        } else {
            System.out.println("His or her has  size clothing problems.");
        }

        char nameFirstLetter = "Vinny".charAt(0);
        if (nameFirstLetter == 'M') {
            System.out.println("His or her will go to math lesson");
        } else if (nameFirstLetter == 'I') {
            System.out.println("His or her will go to literature lesson" + "\n");
        } else {
            System.out.println("kick away him or her out they are not our students");
        }

        System.out.println("\n2. Поиск большего числа");
        int number1 = 21;
        int number2 = 20;
        if (number1 > number2) {
            System.out.println("the number " + number1 + " more then  " + number2);
        } else if (number2 > number1) {
            System.out.println("the number " + number2 + " more then  " + number1);
        } else {
            System.out.println("These numbers are equal");
        }

        System.out.println("\n3. Проверка числа");
        int number = -3;
        String stateAddEven = " ";
        String statePosNeg = " ";
        if (number == 0) {
            System.out.println(" This number is zero");
        } else {
            if (number % 2 == 0) {
                stateAddEven = "even";
            } else {
                stateAddEven = "add";
            }
            if (number > 0) {
                statePosNeg = "positive";
            } else {
                statePosNeg = "negative";
            }
            System.out.println("The number: " + number + " is " + statePosNeg + " and " + stateAddEven);
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int number3 = 223;
        int number4 = 123;
        int ones1 = number1 % 10;
        int ones2 = number4 % 10;
        int tens1 = number3 / 10 % 10;
        int tens2 = number4 / 10 % 10;
        int hundreds1 = number3 / 100;
        int hundreds2 = number4 / 100;

        if (ones1 != ones2 && tens1 != tens2 && hundreds1 != hundreds2) {
            System.out.println(number3 + " and " + number4 + " don't have equal numbers");
        } else {
            System.out.print(number3 + " and " + number4 + " have equal ");
            if (ones1 == ones2) {
                System.out.println(ones1 + " ones");
            }
            if (tens1 == tens2) {
                System.out.println(tens1 + " tens");
            }
            if (hundreds1 == hundreds2) {
                System.out.println(hundreds2 + " hundreds");
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        System.out.print("The symbol " + symbol);
        if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println(" is capital letter");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println(" is small letter");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println(" is integer");
        } else {
            System.out.println(" is not letter or integer");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        double deposit = 301000;
        double rate = 0.05;

        if (deposit >= 100000 && deposit <= 300000) {
            rate = 0.07;
        } else if (deposit > 300000) {
            rate = 0.1;
        }
        double interest = deposit * rate;
        double totalSum = deposit + interest;
        System.out.println("deposit :" + deposit + "\n" +
                "interest :" + interest + "\n" +
                "total sum :" + totalSum);

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int historyGrade = 2;

        if (historyPercent > 60 && historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyGrade = 4;
        } else if (historyPercent > 91) {
            historyGrade = 5;
        }

        int csPercent = 92;
        int csGrade = 2;

        if (csPercent > 60 && csPercent <= 73) {
            csGrade = 3;
        } else if (csPercent > 73 && csPercent <= 91) {
            csGrade = 4;
        } else if (csPercent > 91) {
            csGrade = 5;
        }

        System.out.println("History grade :" + historyGrade + "\n" +
                " Programming grade :" + csGrade + "\n" +
                "The average garde :" + ((historyGrade + csGrade) / 2) + "\n" +
                "The average % :" + ((historyPercent + csPercent) / 2));

        System.out.println("\n8. Расчет годовой прибыли");

        int monthProfit = 13000;
        int rent = 5000;
        int costPrice = 9000;
        int yearProfit = 12 * (monthProfit - rent - costPrice);
        if (yearProfit > 0) {
            System.out.println("Year Profit +" + yearProfit);
        } else {
            System.out.println("Year Profit " + yearProfit);
        }
    }
}