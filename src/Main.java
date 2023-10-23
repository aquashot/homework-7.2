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
        int mounthvklad=15000;
        int totalvklad=12000000;
        int procentmounth=7;
        int totalm=1;
        int mounthsproc=1;
        while (totalvklad <12000000) {
            mounthsproc=(mounthvklad/100)*procentmounth;
            totalvklad=totalvklad/mounthsproc;
            System.out.println(mounthsproc+"будет увеличиваться каждый месяц на и понадобиться"+totalm+"чтобы накопить");
        }
    }
}
