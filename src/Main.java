public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int totalmounth = 1;
        while (total < 2459000) {
            total = total + salary;
            totalmounth = total / salary;
            System.out.println(totalmounth + "месяцев" + "  и сумма накоплений равна" + total);
        }
        System.out.println("задача 2");
        int red=0;
        while (red<=10){
            red++;
            System.out.print(red);
        }
        System.out.println(      );
        for (int number = 10; number >=0; number = number -1 ) {
            System.out.print  (number);
        }
        System.out.println("задача 3");
        int countryY=12000000;
        int life=17;
        int year=0;
        int deadpeople=8;
        while (year<10){
            year++;
            countryY=countryY/1000*(life-deadpeople)+countryY;
            System.out.println("год"+year+"численность составляет"+countryY);
        }
        System.out.println("задача 4");
        double current = 15_000;
        double target = 12_000_000;
        for (int month = 0; current < target; month++) {
            current=current*1.07;
            System.out.println("месяц равен"+month+"сумма накполений"+current);
        }
        System.out.println("задача 5");
        double cuRrent = 15_000;
        double taRget = 12_000_000;
        for (int Month =0; cuRrent < taRget; Month=+6) {
                cuRrent = cuRrent * 1.07;
                System.out.println("месяц равен" + Month + "сумма накполений" + cuRrent);
            }
        System.out.println("Задача 6");


        }
    }

