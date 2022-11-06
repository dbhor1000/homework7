public class Main {
    public static void main(String[] args) {

        ///Task 1

        int totalSavings1 = 0;
        int months = 0;
        int monthlyInvest1 = 15000;

        while(totalSavings1 < 2459000){

            totalSavings1 = totalSavings1 + monthlyInvest1;
            months = months + 1;
            System.out.println("Месяц " + months + " сумма накоплений равна " + totalSavings1 + " рублей.");


        }

        ///Task 2

        int loop1 = 0;

        while(loop1 < 10) {
            loop1 = loop1 + 1;

            System.out.print(loop1 + " ");
        }

        System.out.println();

        for(int loop2 = 10; loop2 > 0; loop2 --){

            System.out.print(loop2 + " ");
        }

        System.out.println();


        ///Task 3


        int population = 12000000;
        int birthRate = 17;
        int mortRate = 8;
        int totalRate = birthRate - mortRate;


        for(int i = 1; i <= 10; i++){

            population = (population / 1000 * totalRate) + population; ///Численность населения спустя один год

            System.out.println("Год " + i + ", численность населения составляет " + population);

        }

        ///Task 4

        int invest = 15000;
        int currentAmount1 = 0;          ///Текущая сумма на счёте
        int months1 = 0;

        while(currentAmount1 < 12_000_000) {


            months1 = months1 + 1;

            if(months1 <= 1){

                currentAmount1 = invest * 107 / 100; ///Сумма после 1 месяца
                System.out.println("Накопления в " + months1 + " месяце равны " + currentAmount1);

            } else {

                currentAmount1 = currentAmount1 * 107 / 100; ///Сумма накоплений во 2 месяце и далее

                System.out.println("Накопления в " + months1 + " месяце равны " + currentAmount1);

            }



        }


        ///Task 5

        int invest2 = 15000;
        int currentAmount2 = 0;          ///Текущая сумма на счёте
        int months2 = 0;

        while(currentAmount2 < 12_000_000) {


            months2++;

            if(months2 <= 1){

                currentAmount2 = invest2 * 107 / 100; ///Сумма после 1 месяца

            } else {

                currentAmount2 = currentAmount2 * 107 / 100; ///Сумма накоплений во 2 месяце и далее

                if (months2 % 6 == 0) {
                    System.out.println("Накопления в " + months2 + " месяце равны " + currentAmount2);

                }

            }



        }


        ///Task 6

        int invest3 = 15000;
        int currentAmount3 = 0;          ///Текущая сумма на счёте
        int months3 = 0;

        while(months3  <= 98) {


            months3++;

            if(months3 <= 1 ){

                currentAmount3 = invest3 * 107 / 100; ///Сумма после 1 месяца

            } else {

                currentAmount3 = currentAmount3 * 107 / 100; ///Сумма накоплений во 2 месяце и далее

                if (months3 % 6 == 0) {
                    System.out.println("Накопления в " + months3 + " месяце равны " + currentAmount3);

                }

            }



        }


        ///Task 7

        int fridayDate = 4;

        while (fridayDate <= 31){

            System.out.println("Сегодня пятница, " + fridayDate + "-e число. Необходимо подготовить отчёт.");
            fridayDate = fridayDate + 7;
        }


        ///Task 8

        int currentYear=2022;
        int yearsAgo = 200;
        int intoFuture = 100;
        int previousAppear = 0;


        while(previousAppear <= (currentYear + intoFuture)){

            previousAppear++;
            if(previousAppear % 79 == 0 && previousAppear > (currentYear - yearsAgo)){
                System.out.println(previousAppear);

            }
        }



        ///Task 9

        int multiplied = 2;
        int multiplier = 0;
        int multiplication = 0;

        while(multiplier < 10){

            multiplier++;

            multiplication = multiplied * multiplier;
            System.out.println(multiplied + " * " + multiplier + " = " + multiplication);

        }






















    }
}