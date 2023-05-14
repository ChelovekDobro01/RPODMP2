package com.example.rpodmp.LR3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.rpodmp.R;
import com.example.rpodmp.databinding.ActivityNewProductFirstStepBinding;
import com.example.rpodmp.entities.Product;

import java.util.Arrays;

public class NewProductFirstStep extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_product_first_step);

        Bundle arguments = getIntent().getExtras();
        ActivityNewProductFirstStepBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_new_product_first_step);
        if (arguments != null){
            Product product = (Product)arguments.getSerializable(Product.class.getSimpleName());
            binding.setProduct(product);
        }
    }
}