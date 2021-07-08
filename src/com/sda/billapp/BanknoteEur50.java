package com.sda.billapp;

public class BanknoteEur50 extends  Banknote {
    public BanknoteEur50(int lenght, int width, int receivement, int receiveWidth) {
        super(lenght, width, receivement, receiveWidth);
    }

    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public CurrencyType getCurrency() {
        return null;
    }
}
