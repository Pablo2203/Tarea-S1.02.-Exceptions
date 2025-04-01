package Nivel1.Ejercicio1.main;

import Nivel1.Ejercicio1.exception.EmptySaleException;
import Nivel1.Ejercicio1.model.Product;
import Nivel1.Ejercicio1.model.Sale;

public class Main {
    public static void main(String[] args) {
        Sale sale = new Sale();

        try {
        sale.calculateTotal();
    }catch(EmptySaleException e){
        System.out.println(e.getMessage());
    }

        sale.addProduct(new Product("Coca-Cola", 3));
        sale.addProduct(new Product("Pepsi", 2.90));
        sale.addProduct(new Product("Fanta", 2.30));

        System.out.println(sale);

        try{
            sale.calculateTotal();
        }catch (EmptySaleException e){
            System.out.println(e.getMessage());
        }
    }
}


