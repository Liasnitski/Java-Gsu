package com.company.lab_2;

import by.gsu.pms.*;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[ ] args) {
        Scanner scanner = new Scanner(System.in);

        Truck[] trucks = new Truck[4];
        trucks[0] = new Truck(new Coffees[] {
                new Grains("Baristas", 24.5f, 31120),
                new Grinds("Lavazza", 13.9f, 11120),
                new Solubles("Nestlé", 31.1f, 32200)
        });
        trucks[1] = new Truck( new Coffees[] {
                new Grains("Paulig", 49.1f, 23320),
                new Grinds("Vinacafe", 22.5f, 12310),
                new Solubles("Illy", 11.3f, 74380)
        });
        trucks[2] = new Truck( new Coffees[] {
                new Grains("Dunn Bros", 31.2f, 36210),
                new Grinds("Café Britt", 42.5f, 44520),
                new Solubles("Kraft Foods", 23.9f, 82530)
        });
        trucks[3] = new Truck();

        int numberTruck;
        System.out.println(" ---Выберите номер фургона:");
        numberTruck = scanner.nextInt();

        if ( (numberTruck >= 1) && (numberTruck <= trucks.length)) {

            while (true) {

                System.out.println(" 1 - Подсчитать стоимость и объем всего кофе в фургоне\n" +
                                " 2 - Сортировать кофе по соотношению цена/вес\n" +
                                " 3 - Поиск кофе по цене\n" +
                                " 4 - Выбрать другой фургон\n");

                int pointMenu;
                pointMenu = scanner.nextInt();

                switch (pointMenu) {
                    case 1:
                        System.out.printf(" ---Фургон №%d---\n", numberTruck);
                        System.out.printf(" ---Стоимость    %d\n", trucks[numberTruck - 1].getTruckPrice());
                        System.out.printf(" ---Объем        %.2f\n", trucks[numberTruck - 1].getTruckSize());
                        break;
                    case 2:
                        System.out.printf(" ---Фургон №%d---\n", numberTruck);
                        System.out.printf(" ---Сортировка кофе по соотношению цена/вес---\n");

                        Arrays.sort(trucks[numberTruck - 1].getTruckComponents());
                        for (Coffees coffee : trucks[numberTruck - 1].getTruckComponents()) {
                            System.out.println(coffee.coffeeName + "  - " + coffee.coffeePrice + " $    " + coffee.coffeeSize + " m3 ");
                        }
                        break;
                    case 3:
                        System.out.printf(" ---Поиск по диапазону цены---\n");
                        int priceFrom;
                        int priceTo;
                        System.out.printf(" ---Цена от:\n");
                        priceFrom = scanner.nextInt();
                        System.out.printf(" ---Цена до:\n");
                        priceTo = scanner.nextInt();
                        System.out.printf(" -Название-   -Стоимость- \n");
                        for (Coffees coffee : trucks[numberTruck - 1].getTruckComponents()) {
                            if ((priceFrom <= coffee.coffeePrice) && (coffee.coffeePrice <= priceTo)) {
                                System.out.println(coffee.coffeeName + "      " + coffee.coffeePrice + " $");
                            }
                        }
                        break;
                    case 4:
                        System.out.println(" Выберите номер фургона:");
                        numberTruck = scanner.nextInt();
                        if ( (numberTruck < 1) || (numberTruck > trucks.length)) {
                            System.out.println(" ---Error---");
                            System.exit(0);
                        }
                        break;
                    default:
                        System.out.println(" ---Error---");
                        break;
                }
            }
        }
        else  {
                    System.out.println(" ---Error---");
                    System.exit(0);
        }
    }
}