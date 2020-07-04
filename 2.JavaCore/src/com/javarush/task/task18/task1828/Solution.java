package com.javarush.task.task18.task1828;

/* 
Прайсы
*/

import org.omg.CosNaming.NamingContextPackage.NotFound;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) return;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String fileName = in.readLine();
        BufferedReader fileIn = new BufferedReader(new FileReader(fileName));
        ArrayList<Order> orders = new ArrayList<>();

        String orderLine;
        while ((orderLine = fileIn.readLine()) != null) {
            String sId = orderLine.substring(0, 8).trim();
            String sProductName = orderLine.substring(8, 38).trim();
            String sPrice = orderLine.substring(38, 46).trim();
            String sQuantity = orderLine.substring(46).trim();

            Order order = new Order(sId, sProductName, sPrice, sQuantity);
            orders.add(order);
        }
        fileIn.close();

        switch (args[0]) {
            case "-u":
                Order order = createOrder(args);
                Order orderToUpdate = getOrderById(Integer.parseInt(args[1]), orders);
                orderToUpdate.setPrice(order.getPrice());
                orderToUpdate.setProductName(order.getProductName());
                orderToUpdate.setQuantity(order.getQuantity());
                break;
            case "-d":
                Order orderToDelete = getOrderById(Integer.parseInt(args[1]), orders);
                orders.remove(orderToDelete);
                break;
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

        for (Order order : orders) {
            bufferedWriter.write(order.toString() + "\n");
        }

        in.close();
        fileIn.close();
        bufferedWriter.close();
    }

    private static Order getOrderById(int id, ArrayList<Order> orders) throws NotFound {
        for (Order order : orders) {
            if (order.getId() == id) return order;
        }

        throw new NotFound();
    }

    private static Order createOrder(String[] args) {
        return new Order("0", args[2], args[3], args[4]);
    }

    private static class Order {
        private final int id;
        private String productName;
        private double price;
        private int quantity;

        public int getId() {
            return id;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public Order(String sId, String sProductName, String sPrice, String sQuantity) {
            id = Integer.parseInt(sId);
            productName = sProductName;
            price = Double.parseDouble(sPrice);
            quantity = Integer.parseInt(sQuantity);
        }

        @Override
        public String toString() {
            return String.format("%-8d%-30s%-8.2f%-4d", id, productName, price, quantity);
        }
    }
}
