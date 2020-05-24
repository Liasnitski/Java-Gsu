package com.company.Practice_6;

import java.io.IOException;
import by.gsu.pms.Purchase;
import by.gsu.pms.PricePurchase;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) throws IOException {

        ArrayList<Purchase> purchases = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("test.csv"));

        String thisLine;
        while ((thisLine = bufferedReader.readLine()) != null) {

            String[] params = thisLine.split(";");

            switch (params.length){
                case 3:
                    purchases.add(new Purchase(params[0], Integer.parseInt(params[1]), Integer.parseInt(params[2])));
                    break;
                case 4:
                    purchases.add(new PricePurchase(params[0], Integer.parseInt(params[1]), Integer.parseInt(params[2]), Integer.parseInt(params[3])));
                    break;
            }
        }
        bufferedReader.close();

        System.out.println("Print:");
        for (Purchase purchase: purchases){
            System.out.println(purchase.toString());
        }

        System.out.println("\nPrinting the purchase with the index 6:");
        System.out.println(purchases.get(5).toString());

        System.out.println("\nDeleting purchases with the price less than 10000...");

        Iterator<Purchase> iterator = purchases.iterator();
        while (iterator.hasNext()){
            Purchase purchase = iterator.next();
            if (purchase.totalPrice() < 10000){
                iterator.remove();
            }
        }

        Collections.sort(purchases);
        System.out.println();
        for (Purchase purchase: purchases){
            System.out.println(purchase.toString());
        }

        Comparator<Purchase> c = new Comparator<Purchase>() {
            public int compare(Purchase p1, Purchase p2) {
                return Integer.compare(p1.getPriceOfPurchase(), p2.getPriceOfPurchase());
            }
        };

        int purchaseCostEqualed  = Collections.binarySearch(purchases, new Purchase("", 8500, 0), c);
        System.out.println( "\nPrinting any purchase with the cost equaled 35000 : \n" + purchaseCostEqualed);
    }
}
