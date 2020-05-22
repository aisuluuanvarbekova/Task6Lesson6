package com.company;

public class Account<T extends Number> implements Countable {
    private T id;
    private T sum;

    public Account(String s, String s1) {

    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public T getSum() {
        return sum;
    }

    public void setSum(T sum) {
        this.sum = sum;
    }

    public Account(T id, T sum) {
        this.id = id;
        this.sum = sum;

    }


    @Override
    public void saveMoney() {

    }

    @Override
    public void count() {

    }
}

