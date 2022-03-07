package ru.skypro;

public class Main {

    public static void main(String[] args) {
        System.out.println("ЗАДАЧА №1");
        System.out.println();

        byte a = 1;
        short b = 2;
        int c = 333;
        long d = 999999999L;
        float e = 99.254f;
        double f = 99.445645455454;
        char g = 'g';
        boolean bool = a > 1;
        System.out.println(a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f + ", " + g + ", " + bool);
        System.out.println();

        // Задача №2 (боксеры)
        System.out.println("ЗАДАЧА №2");
        System.out.println();

        float boxerWeight1 = 78.2f; // можно и double
        float boxerWeight2 = 82.7f; // можно и double
        float weightDifference;
        var totalWeight = boxerWeight1 + boxerWeight2;
        if (boxerWeight1 > boxerWeight2) {
            weightDifference = boxerWeight1 - boxerWeight2;
        } else {
            weightDifference = boxerWeight2 - boxerWeight1;
        }
        System.out.println("Общий вес боксеров равен =" + totalWeight + " кг");
        System.out.println("Разница в весе боксеров равна =" + weightDifference  + " кг");
        System.out.println();

        //Задача №3 (Диета боксеров)
        System.out.println("ЗАДАЧА №3");
        System.out.println();

        byte bananasQuantity = 5;
        byte BanUnitWeight = 80;
        var totalBanWeigth = bananasQuantity * BanUnitWeight;

        short milkQuantity = 200;
        short milkWeight = 105;
        var totalMilkWeight = (milkQuantity * milkWeight) / 100;

        byte iceCreamQuantity = 2;
        short iceCreamUnitWeight = 100;
        var totalIceCreamWeight = iceCreamQuantity * iceCreamUnitWeight;

        byte eggsQuantity = 4;
        byte eggsUnitWeight = 70;
        var totalEggsWeight = eggsQuantity * eggsUnitWeight;


        var totalMixWeight = totalBanWeigth + totalMilkWeight + totalIceCreamWeight + totalEggsWeight;
        double totalMixWeightKg = totalMixWeight * 0.001;

        System.out.println("Общий вес спорт-завтрака равен " + totalMixWeight + " гр");
        System.out.println("оОбщий вес спорт-завтрака в килограммах равен " + totalMixWeightKg + " кг");
        System.out.println();


        //Задача №4

        System.out.println("ЗАДАЧА №4");
        System.out.println();

        short reduceWeight250 = 250;
        short reduceWeight500 = 500;
        int totalReduce = 7;
        int totalReduceToKg = totalReduce*1000;

        var daysQualityForReduceWeight250 = totalReduceToKg/reduceWeight250;
        var daysQualityForReduceWeight500 = totalReduceToKg/reduceWeight500;
        var averageQuantityOfDays = (daysQualityForReduceWeight250 +daysQualityForReduceWeight500)/2;
        System.out.println("Количество потраченных дней при сбросе веса по 250 грамм равно " + daysQualityForReduceWeight250 + " дней");
        System.out.println("Количество потраченных дней при сбросе веса по 500 грамм равно " + daysQualityForReduceWeight500  + " дней");
        System.out.println("Среднее количество потраченных дней при сбросе веса равно " + averageQuantityOfDays  + " дней");

        System.out.println();

        System.out.println("ЗАДАЧА №5");
        System.out.println();

        double salaryMashaPerMonth = 67760;//для зарплаты лучше double
        double salaryMashaPerYear = salaryMashaPerMonth*12;


        double salaryDenisPerMonth = 83690;
        double salaryDenisPerYear = salaryDenisPerMonth*12;


        double salaryKristinaPerMonth = 76230;
        double salaryKristinaPerYear = salaryKristinaPerMonth*12;


        double salaryMashaPerMonthWithIncrease = (salaryMashaPerMonth * 10)/100;
        double salaryDenisPerMonthWithIncrease = (salaryDenisPerMonth * 10)/100;
        double salaryKristinaPerMonthWithIncrease = (salaryKristinaPerMonth * 10)/100;


        double salaryMashaPerYearAfterIncreace = (salaryMashaPerMonthWithIncrease +salaryMashaPerMonth)*12;
        double salaryDenisPerYearYearAfterIncreace = (salaryDenisPerMonthWithIncrease+salaryDenisPerMonth)*12;
        double salaryKristinaPerYearAfterIncreace = (salaryKristinaPerMonthWithIncrease + salaryKristinaPerMonth)*12;

        System.out.println(" Годовая зарплата Маши с учетом повышения на 10% составила " + salaryMashaPerYearAfterIncreace + " рублей и теперь в год она будет получать на " + (salaryMashaPerYearAfterIncreace-salaryMashaPerYear) +" рублей больше в сравнении зарплатой за прошлый год.");
        System.out.println(" Годовая зарплата Дениса с учетом повышения на 10% составила " + salaryMashaPerYearAfterIncreace +" рублей и теперь в год она будет получать на " + (salaryDenisPerYearYearAfterIncreace-salaryDenisPerYear) +" рублей больше в сравнении зарплатой за прошлый год.");
        System.out.println(" Годовая зарплата Кристины с учетом повышения на 10% составила " + salaryMashaPerYearAfterIncreace + " рублей и теперь в год она будет получать на " + (salaryKristinaPerYearAfterIncreace-salaryKristinaPerYear) + " рублей больше в сравнении зарплатой за прошлый год.");


        System.out.println();
        System.out.println("ЗАДАЧИ ПОВЫШЕННОЙ СЛОЖНОСТИ");
        System.out.println();
        System.out.println(" ЗАДАЧА №6 ");
        System.out.println();


        short a1 = 12; // в обычной домашке уже есть указанные переменные, поэтому проставил индексы
        short b1 = 27;
        short c1 = 44;
        short d1 = 15;
        short e1 = 9;
        var result = a1 * (b1 + (c1 - d1 * e1));
        System.out.println(result);
        result = -result;
        System.out.println(result);
        result = -result;
        System.out.println(result);


        System.out.println();
        System.out.println(" ЗАДАЧА №7 ");
        System.out.println();


        int a2 = 7;
        int b2 = 5;

        a2=a2*b2;

        b2=a2/b2;
        a2=a2/b2;
        System.out.println("b2 = " + b2);
        System.out.println("a2 = " + a2);


        System.out.println();
        System.out.println(" ЗАДАЧА №8 ");
        System.out.println();

//        int a3 = 173; // дана целочисленная переменная
//        System.out.println("Инициализированная переменная а2  " + a3);
//
//        int dg = (int)Math.log10(a3)+1; // находим общее количество цифр в числе
//        System.out.println ("Количество цифр в переменной a3 равно " + dg);
//
//        int b3 = (int) (a3/Math.pow(10,dg/2))%10; // находим среднюю цифру в числе
//        System.out.println ("после присвоения " + b3);

        int a3 = 183;
        var b3 = (a3/10)%10;
        System.out.println (b3);


    }
}
