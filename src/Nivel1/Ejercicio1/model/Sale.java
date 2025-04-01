package Nivel1.Ejercicio1.model;

import Nivel1.Ejercicio1.exception.EmptySaleException;

import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> products;
    private double total;

    public Sale () {
        this.products = new ArrayList<>();
        this.total = 0;
    }
    public void addProduct (Product product) {
        products.add(product);
    }
    public ArrayList<Product> getProducts() {
        return products;
    }
    public void calculateTotal () throws EmptySaleException {
        double total = 0;
        if (products.isEmpty()) {
            throw new EmptySaleException();
        }else if (!products.isEmpty()) {
            for (Product product : products) {
               total += product.getPrice();

            }
            System.out.println("Total amount: " + total);
        }
    }

    @Override
    public String toString() {
        return "Sale{" +
                "products=" + products +
                ", total=" + total +
                '}';
    }
}
