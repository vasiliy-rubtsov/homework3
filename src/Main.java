public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");

        int iVar = -2000000000;
        byte bVar = 127;
        short shVar = 32767;
        long loVar = 3000000000000L;
        float fVar = 3.4e38F;
        double dblVar = 6.67e-12;

        System.out.println("Значение переменной iVar с типом int равно " + iVar);
        System.out.println("Значение переменной bVar с типом byte равно " + bVar);
        System.out.println("Значение переменной shVar с типом short равно " + shVar);
        System.out.println("Значение переменной loVar с типом long равно " + loVar);
        System.out.println("Значение переменной fVar с типом float равно " + fVar);
        System.out.println("Значение переменной dblVar с типом double равно " + dblVar);


        // Задача 2
        float fVar2 = 27.12F;
        long loVar2 = 987678965549L;
        float fVar3 = 2.786F;
        short shVar2 = 569;
        short shVar3 = -159;
        short shVar4 = 27897;
        byte bVar2 = 67;

        // Задача 3
        System.out.println("Задача 3");

        short numbStudentsLP = 23; // У Людмилы Павловны — 23 ученика
        short numbStudentsAS = 27; // у Анны Сергеевны — 27 учеников
        short numbStudentsEA = 30; // у Екатерины Андреевны — 30 учеников
        short numbSheetsTotal = 480; // Три учительницы закупили все вместе 480 листов бумаги на все три класса

        int numbSheetsPerStudent = numbSheetsTotal / (numbStudentsLP + numbStudentsAS + numbStudentsEA);
        System.out.println("На каждого ученика рассчитано " + numbSheetsPerStudent + " листов бумаги");

        // Задача 4
        System.out.println("Задача 4");

        short prod = 16 / 2; // Производительность 16 бутылок за 2 минуты
        int prod20m = prod * 20; // Производительность за 20 минут
        int prod1day = prod * 24 * 60; // Производительность за сутки
        int prod3day = prod * 3 * 24 * 60; // Производительность за 3 дня
        int prod1month = prod * 30 * 24 * 60; // Производительность за 1 месяц

        System.out.println("За 20 минут машина произвела " + prod20m + " штук бутылок");
        System.out.println("За 24 часа машина произвела " + prod1day + " штук бутылок");
        System.out.println("За 3 суток машина произвела " + prod3day + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + prod1month + " штук бутылок");

        // Задача 5
        System.out.println("Задача 5");

        short white = 2; // на 1 класс нужно 2 банки белой краски
        short brown = 4; // на 1 класс нужно 4 банки коричневой
        short total = 120; // Всего купили 120 банок краски

        int numbRooms = total / (white + brown); // количество классов
        int totalWhite = numbRooms * white;
        int totalBrown = numbRooms * brown;

        System.out.println("В школе, где " + numbRooms + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");

        // Задача 6
        System.out.println("Задача 6");

        float bananas = 80.0F * 5; // Бананы — 5 штук (1 банан — 80 грамм).
        float milk = 105.0F * 200 / 100; // Молоко — 200 мл (100 мл = 105 грамм).
        float iceCream = 100.0F * 2; // Мороженое-пломбир — 2 брикета по 100 грамм.
        float eggs = 70.0F * 4; // Яйца сырые – 4 яйца (1 яйцо — 70 грамм).

        float totalG = bananas + milk + iceCream + eggs;
        float totalKg = totalG / 1000;

        System.out.println("Вес завтрака " + totalG + "г (" + totalKg + "кг)");

        // Задача 7
        System.out.println("Задача 7");

        float totalDeltaKg = 7.0F; // Полная потеря веса в килограммах
        float totalDeltaG = totalDeltaKg * 1000; // Полная потеря веса в граммах
        float delta1DayMin = 250.0F; // Минимальная потеря веса за день
        float delta1DayMax = 500.0F; // Максимальная потеря веса за день

        float numDaysMin =totalDeltaG / delta1DayMin;
        float numDaysMax = totalDeltaG / delta1DayMax;
        float numDaysAverage = totalDeltaG * 2 / (delta1DayMin + delta1DayMax);

        System.out.println("На похудание спортсмена на " + totalDeltaKg + "кг при потере веса " + delta1DayMin + "г в день уйдет " + numDaysMin + " дней, при потере веса " + delta1DayMax + "г в день уйдет " + numDaysMax + " дней.");
        System.out.println("В среднем на похудание уйдет " + numDaysAverage + " дней.");

        // Задача 8
        System.out.println("Задача 8");

        int salaryM = 67760; // Маша получает 67 760 рублей в месяц.
        int salaryD = 83690; // Денис получает 83 690 рублей в месяц.
        int salaryK = 76230; // Кристина получает 76 230 рублей в месяц.

        int annualM = salaryM * 12; // Годовй доход Маши до повышения зарплаты
        int annualD = salaryD * 12; // Годовй доход Дениса до повышения зарплаты
        int annualK = salaryK * 12; // Годовй доход Кристины до повышения зарплаты

        int incPercent = 10; // Процент повышения зарплаты

        int salaryNewM = salaryM * (100 + incPercent) / 100; // Зарплата Маши после повышения
        int salaryNewD = salaryD * (100 + incPercent) / 100; // Зарплата Дениса после повышения
        int salaryNewK = salaryK * (100 + incPercent) / 100; // Зарплата Кристины после повышения

        int annualNewM = salaryNewM * 12; // Годовй доход Маши после повышения зарплаты
        int annualNewD = salaryNewD * 12; // Годовй доход Дениса после повышения зарплаты
        int annualNewK = salaryNewK * 12; // Годовй доход Кристины после повышения зарплаты

        int deltaM = annualNewM - annualM; // Изменение годового дохода Маши после повышения зарплаты
        int deltaD = annualNewD - annualD; // Изменение годового дохода Дениса после повышения зарплаты
        int deltaK = annualNewK - annualK; // Изменение годового дохода Кристины после повышения зарплаты

        System.out.println("Маша теперь получает " + salaryNewM + " рублей. Годовой доход вырос на " + deltaM + " рублей.");
        System.out.println("Денис теперь получает " + salaryNewD + " рублей. Годовой доход вырос на " + deltaD + " рублей.");
        System.out.println("Кристина теперь получает " + annualNewK + " рублей. Годовой доход вырос на " + deltaK + " рублей.");
    }
}