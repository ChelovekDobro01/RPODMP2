package com.example.rpodmp.LR3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rpodmp.R;
import com.example.rpodmp.entities.Product;

import java.sql.Array;
import java.util.ArrayList;

public class ProductsActivity extends AppCompatActivity {

    private ProductsActivity instance;
    private RecyclerView _recyclerView;
    private Button _addButton;
    private Button _clearButton;
    private  ProductAdapter _productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        instance = this;
        initializeRecyclerView();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    private void initializeRecyclerView() {
        _recyclerView = findViewById(R.id.productsRecyclerView);
        _recyclerView.setLayoutManager(new LinearLayoutManager(this));

        _productAdapter = new ProductAdapter();
        _recyclerView.setAdapter(_productAdapter);

        loadProducts();

        _addButton = findViewById(R.id.newProductButton);
        _clearButton = findViewById(R.id.clearProductsButton);
        View.OnClickListener addClickListener = v -> {
            Intent intent = new Intent(instance, NewProductFirstStep.class);
            Product newProduct = new Product();
            intent.putExtra(Product.class.getSimpleName(), newProduct);
            startActivity(intent);
        };
        _addButton.setOnClickListener(addClickListener);

        View.OnClickListener clearClickListener = v -> _productAdapter.clearItems();
        _clearButton.setOnClickListener(clearClickListener);
    }

    private void loadProducts() {
        ArrayList<Product> array = new ArrayList<Product>();
        array.add(new Product("Test1", 3.00));
        array.add(new Product("Test2", 4.00));
        array.add(new Product("Test3", 12.00));
        _productAdapter.setItems(array);
    }
}