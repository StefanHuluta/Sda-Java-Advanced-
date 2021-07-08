package com.sda.billapp;

public abstract class Banknote implements PayableType {

    private int lenght;
    private  int width;
    private int receivement;
    private int receiveWidth;

    public Banknote(int lenght, int width, int receivement, int receiveWidth) {
        this.lenght = lenght;
        this.width = width;
        this.receivement = receivement;
        this.receiveWidth = receiveWidth;
    }
    @Override
    public boolean isFake(){
        return !(lenght == receivement && width == receiveWidth);
    }


}
