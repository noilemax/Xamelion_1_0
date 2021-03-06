package com.javarush.test.level27.lesson15.big01.kitchen;

import com.javarush.test.level27.lesson15.big01.ConsoleHelper;
import com.javarush.test.level27.lesson15.big01.Tablet;

import java.io.IOException;
import java.util.List;

/**
 * Created by Администратор on 23.01.2016.
 */
public class Order
{
    protected List<Dish> dishes;
    private Tablet tablet;

    public List<Dish> getDishes()
    {
        return dishes;
    }

    public Order(Tablet tablet) throws IOException
    {
        this.tablet = tablet;
        initDishes();
    }

    @Override
    public String toString()
    {
        if (dishes == null || dishes.isEmpty())
        {
            return "";
        }
        return "Your order: " + dishes + " of " + tablet;
    }

    public int getTotalCookingTime()
    {
        int totalDuration = 0;
        for (Dish dish : dishes)
        {
            totalDuration += dish.getDuration();
        }
        return totalDuration;
    }

    public boolean isEmpty()
    {
        return dishes == null || dishes.isEmpty();
    }

    protected void initDishes() throws IOException
    {
        dishes = ConsoleHelper.getAllDishesForOrder();
    }
}