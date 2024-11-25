package org.example.models;

import java.util.*;

public class Grocery {

    public static List<String> groceryList = new ArrayList<>();


    public static void addItems(String input){
            String[] itemsToAdd = input.split(",");
            for( String item : itemsToAdd) {
                item = item.trim();
                if(!checkItemIsInList(item)){
                    groceryList.add(item);
                }
            }
         printSorted();
    }

public static void removeItems(String input){
        String[] itemsToRemove = input.split(",");
        for(String item : itemsToRemove){
            item = item.trim();
            if(checkItemIsInList(item)) {
               groceryList.remove(item);
            }
        }
        printSorted();

}
public static  boolean checkItemIsInList(String product){
        return groceryList.contains(product.trim());

}


public static void printSorted(){
    Collections.sort(groceryList);
    System.out.println(groceryList);


}
 public static void startGrocery(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("0 - Çıkış");
            System.out.println("1 - Ürün Ekle");
            System.out.println("0 - Ürün Çıkar");

            int choice = scanner.nextInt();
            scanner.nextLine();
            if(choice == 0) {
                System.out.println("Çıkılıyor");
                break;
            } else if(choice == 1){
                System.out.println("Eklemek istediğiniz elemanları girin (virgülle ayırarak): ");
               String input =  scanner.nextLine();
                addItems(input);
                printSorted();
            } else if(choice == 2){
                System.out.print("Çıkarmak istediğiniz elemanları girin (virgülle ayırarak): ");
                String input = scanner.nextLine();
                removeItems(input);
                printSorted();
            } else {
                System.out.println("Geçersiz seçim! Lütfen 0, 1 veya 2 girin.");
            }
        }
     scanner.close();

 }
}
