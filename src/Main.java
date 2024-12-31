public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        //int, byte, short, long, float, double.
      int a1  = 100;
      byte a2  = 100;
      short a3  = 100;
      long a4  = 10000000000L;
      float a5  = 100.0f;
      double a6  = 100.0;
      System.out.printf("Значение переменной a1 с типом int равно %s%n", a1) ;
      System.out.printf("Значение переменной a2 с типом byte равно%s%n", a2) ;
      System.out.printf("Значение переменной a3 с типом short равно %s%n", a3) ;
      System.out.printf("Значение переменной a4 с типом long равно %s%n", a4) ;
      System.out.printf("Значение переменной a5 с типом float равно %s%n", a5);
      System.out.printf("Значение переменной a6 с типом double равно %s%n", a6) ;


      System.out.println("Task 2");

      double b = 27.12;
      long g = 987_678_965_549L;
      double d = 2.786;
      short v = 569;
      short m = -159;
      short t = 27897;
      byte p = 67;

      System.out.println("Task 3");
      int ludmilaStudentsAmount = 23;
      int annasStudentsAmount = 27;
      int ekaterinasStudentsAmount =30;

      int commonPaperAmount =480;
      int commonStudentAmount = ludmilaStudentsAmount + annasStudentsAmount +ekaterinasStudentsAmount ;
      double paperByOneStudent = (double) commonPaperAmount /commonStudentAmount;
      System.out.printf("На каждого ученика расчитано %s листов бумаги%n ",paperByOneStudent );

        System.out.println("Task 4");
        int machineProductivityPerTwoMinute = 16;
        int machineProductivityPerOneMinute = machineProductivityPerTwoMinute /2;
        int machineProductivityPerTwentyMinutes = machineProductivityPerOneMinute * 20;


        int minutesInOneDay = machineProductivityPerOneMinute * 60* 24;


        int machineProductivityPerDay = machineProductivityPerOneMinute * minutesInOneDay;
        int machineProductivityPerThreeDays = machineProductivityPerDay * 3;
        int machineProductivityPerMonth =machineProductivityPerDay * 31;

        System.out.printf("За 20 минут машина произвела %s штук бутылок%n",machineProductivityPerTwentyMinutes );
        System.out.printf("За день машина произвела %s штук бутылок %n",machineProductivityPerDay );
        System.out.printf("За 3 дня машина произвела %s штук бутылок %n",machineProductivityPerThreeDays );
        System.out.printf("За месяц машина произвела %s штук бутылок %n",machineProductivityPerMonth );

        System.out.println("Task 5");

        int commonCanAmount =120;
        int whitePaintPerClass =2;
        int brownPaintPerClass =4;

        int commonPaintPerClass = whitePaintPerClass + brownPaintPerClass;
        int classAmount = commonCanAmount / commonPaintPerClass;


        int commonWhitePaintAmount = classAmount * whitePaintPerClass;
        int commonBrownPaintAmount = classAmount * brownPaintPerClass;
        System.out.printf("В школе, где %s классов, нужно %s банок белой краски и %s банок коричневой краски %n",classAmount,commonWhitePaintAmount , commonBrownPaintAmount);

        System.out.println("Task 6");
        int bananasAmount = 5;
        int bananasWeight = 80;
        int commonBananasGrAmount =bananasAmount * bananasWeight;

        int milkMLAmount = 200;
        int milkWeightPer100Gr = 105;
        int commonMilkGrAmount = milkMLAmount / 100 * milkWeightPer100Gr;

        int iceCreamAmount = 2;
        int iceCreamWeight = 100;
        int commonIceCreamGrAmount = iceCreamAmount * iceCreamWeight;

        int eggsAmount = 4;
        int eggsWeight = 70;
        int commonEggsGrAmount = eggsAmount * eggsWeight;

        int allProductsGrAmount =commonBananasGrAmount + commonMilkGrAmount + commonIceCreamGrAmount + commonEggsGrAmount;

        double allProductsKgAmount=(double) allProductsGrAmount / 1000;
        System.out.println("Вес завтрака в граммах =" + allProductsGrAmount );
        System.out.println("Вес завтрака в килограммах =" + allProductsKgAmount );

        System.out.println("Task 7");
        int weight = 7;
        int weightInGrams = weight * 1000;
        int minLossWeightAmount = 250;
        int maxLossWeightAmount =500;

        double minDaysAmount =(double) weightInGrams / minLossWeightAmount;
        double maxDaysAmount =(double) weightInGrams / maxLossWeightAmount;
        System.out.println("Минимальное количество дней похудения: " + minDaysAmount );
        System.out.println("Минимальное количество дней похудения:" + maxDaysAmount );

        double avgDaysAmount = (maxDaysAmount + minDaysAmount )/ 2;
        System.out.println("Среднее количество дней похудения: " + avgDaysAmount );

        System.out.println("Task 8");
        double percent =1.1f;
        double  mashaSalaryPerMonth = 67760;
        double  denisSalaryPerMonth = 83690;
        double  kristinaSalaryPerMonth = 76230;


        double  newMashaSalaryPerMonth = mashaSalaryPerMonth * percent;
        double  newDenisSalaryPerMonth = denisSalaryPerMonth * percent;
        double  newKristinaSalaryPerMonth = kristinaSalaryPerMonth * percent;


        double  mashaSalaryPerYear = mashaSalaryPerMonth * 12;
        double  denisSalaryPerYear = denisSalaryPerMonth * 12;
        double  kristinaSalaryPerYear =kristinaSalaryPerMonth * 12;

        double  newMashaSalaryPerYear = newMashaSalaryPerMonth * 12;
        double  newDenisSalaryPerYear = newDenisSalaryPerMonth * 12;
        double  newKristinaSalaryPerYear =newKristinaSalaryPerMonth  * 12;

        double  mashaSalaryDelta = newMashaSalaryPerYear -mashaSalaryPerYear;
        double denisSalaryDelta = newDenisSalaryPerYear - denisSalaryPerYear;
        double kristinaSalaryDelta = newKristinaSalaryPerYear - kristinaSalaryPerYear;

        System.out.printf(" Маша теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей%n",newKristinaSalaryPerMonth, mashaSalaryDelta );
        System.out.printf(" Денис теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей%n", newDenisSalaryPerMonth, denisSalaryDelta );
        System.out.printf(" Кристина теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей%n", newKristinaSalaryPerMonth, kristinaSalaryDelta );

















    }



}