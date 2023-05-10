package com.example.rpodmp.entities;


import java.io.Serializable;

public class Product implements Serializable {
    private String _name;
    private String _category;
    private double _weight;
    private double _price;
    private int _count;
    private String _provider;

    public Product(String name, double price){
        _name = name;
        _price = price;
    }

    public Product(){

    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_category() {
        return _category;
    }

    public void set_category(String _category) {
        this._category = _category;
    }

    public double get_weight() {
        return _weight;
    }

    public void set_weight(double _weight) {
        this._weight = _weight;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    public int get_count() {
        return _count;
    }

    public void set_count(int _count) {
        this._count = _count;
    }

    public String get_provider() {
        return _provider;
    }

    public void set_provider(String _provider) {
        this._provider = _provider;
    }
}
