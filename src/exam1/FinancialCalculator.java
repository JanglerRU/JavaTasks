package exam1;
import java.util.Scanner;

public class FinancialCalculator {
    static double[] dailyExpenses = new double[30]; // Расходы за каждый день

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Ввести расходы за определенный день\n2 - Траты за месяц\n3 - Самая большая сумма расхода за месяц\n4 - Конвертер\n0 - Выход");
        int option = scanner.nextInt();

        int dayCounter = 1;

        switch (option){
            case 1:
                while (true){
                    System.out.println("Введите день, за который хотите узнать расходы");
                    int day = scanner.nextInt();
                    if (day >= 1 && day <= 30){
                        System.out.println("Введите затраченную сумму за указанный день");
                        dailyExpenses[day] = scanner.nextInt();
                        System.out.println("1 - Ввести затраты за другой день\n2 - Вернуться в меню");
                        int choice = scanner.nextInt();

                        if (choice == 2){
                            while (true){
                                main(new String[]{});
                            }
                        }
                    }
                }

            case 2:
                for (int i = 0; i <= 29; i++){
                    System.out.println(dayCounter + " День: " + dailyExpenses[i]);
                    dayCounter++;
                }

                System.out.println("1 - Вернуться в меню");
                int choice = scanner.nextInt();

                if (choice == 1){
                    while (true){
                        main(new String[]{});
                    }
                }

            case 3:
                int maxDayIndex = 0;
                double maxExpense = dailyExpenses[0];

                for (int i = 1; i < dailyExpenses.length; i++) {
                    if (dailyExpenses[i] > maxExpense) {
                        maxDayIndex = i;
                        maxExpense = dailyExpenses[i];
                    }
                }
                System.out.println("Максимальная расход за месяц: " + maxExpense + " в день " + (maxDayIndex + 1));

                System.out.println("1 - Вернуться в меню");
                int choice3 = scanner.nextInt();

                if (choice3 == 1){
                    while (true){
                        main(new String[]{});
                    }
                }
                break;

            case 4:
                System.out.println("Во что вы хотите перевести все затраты за месяц?\n1 - Евро\n2 - Доллары\n3 - Юани");

                int currencyChoice = scanner.nextInt();

                switch (currencyChoice){
                    case 1:
                        for (int i = 0; i <= 29; i++){
                            dailyExpenses[i] = dailyExpenses[i] / 97.4;
                        }
                        break;
                    case 2:
                        for (int i = 0; i <= 29; i++){
                            dailyExpenses[i] = dailyExpenses[i] / 90.23;
                        }
                        break;
                    case 3:
                        for (int i = 0; i <= 29; i++){
                            dailyExpenses[i] = dailyExpenses[i] / 12.6;
                        }
                        break;
                }
                break;

            case 0:
                System.out.println("Всего хорошего!");
                System.exit(0);
                break;

            default:
                while (true){
                    main(new String[]{});
                }
        }

    }
}
