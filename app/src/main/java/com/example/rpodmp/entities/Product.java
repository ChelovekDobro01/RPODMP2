package com.example.rpodmp.entities;


import android.database.Observable;

import androidx.databinding.ObservableDouble;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import java.io.Serializable;

public class Product implements Serializable {

    public ObservableField<String> name = new ObservableField<>();
    public ObservableField<String> category = new ObservableField<>();
    public ObservableDouble weight = new ObservableDouble();
    public ObservableDouble price = new ObservableDouble();
    public ObservableInt count = new ObservableInt();
    public ObservableField<String> provider = new ObservableField<>();

    public Product(String name, double price){
        this.name.set(name);
        this.price.set(price);
    }

    public Product(){

    }
}
