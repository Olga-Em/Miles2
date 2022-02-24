package com.company;

public class Main {
    public static void main(String[] args) {
        int ticketPrice = 16_200;
        int mile = 20;
        int miles = ticketPrice / mile;
        System.out.println("Ваши накопленные мили " + miles);
    }
}
