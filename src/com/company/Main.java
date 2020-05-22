package com.company;

public class Main {

    private static Object Account;

    public static void main(String[] args) {
        Account<Integer> account = new Account<>(12345, 5000);

        account.saveMoney();
        account.count();
        System.out.println(account.getId() + " Saving Money " + "     " +  account.getSum()  + " Count ");


    }


}






