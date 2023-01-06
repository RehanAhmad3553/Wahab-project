package com.example.framwork_tasks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.framwork_tasks.Fragment.FragmentActivity;
import com.example.framwork_tasks.databinding.ActivityMainBinding;

import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

public class MainActivity extends AppCompatActivity {

       ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());


        binding.carousel.addData(new CarouselItem("https://i0.wp.com/www.techjunkie.com/wp-content/uploads/2018/09/search-by-image-mac.jpg?resize=660%2C430&ssl=1","System"));
        binding.carousel.addData(new CarouselItem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQdZTyeC1cFCrRVozm6e6jiiXWUJb11KOy4XY4_fY8UcUXcK5F0ba_f99DWg1sCJxaIKyM&usqp=CAU","Search"));
        binding.carousel.addData(new CarouselItem("https://media.istockphoto.com/id/1295900106/photo/data-scientists-male-programmer-using-laptop-analyzing-and-developing-in-various-information.jpg?s=170667a&w=is&k=20&c=sfFRA-dTEz-w_mhzfW2gkmgKcLA35zVQFiME483fF4Y=","Logic"));
        binding.carousel.addData(new CarouselItem("https://www.shutterstock.com/image-photo/young-businesswoman-hand-using-laptop-260nw-1420959233.jpg","Massage"));
        binding.carousel.addData(new CarouselItem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdqF64KZv2egx6MzUJ-oATvbBnF0eSz0zRO_kRFsaKgwvR80LihEMtx1XLV2Y2JrLc1Yc&usqp=CAU","Cooding"));


        
        FragmentActivity fragmentActivity=new FragmentActivity();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.linear_one,fragmentActivity);
        transaction.commit();

    }
}