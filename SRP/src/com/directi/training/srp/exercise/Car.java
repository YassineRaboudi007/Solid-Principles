package com.directi.training.srp.exercise;

public class Car
{
    private final String _id;
    private final String _model;
    private final String _brand;

    public Car(String id, String model, String brand)
    {
        _id = id;
        _model = model;
        _brand = brand;
    }

    public String getId()
    {
        return _id;
    }

    public String getModel()
    {
        return _model;
    }

    public String getBrand()
    {
        return _brand;
    }

    public String getCarName(){
        StringBuilder sb = new StringBuilder();
        sb.append(car.getBrand());
        sb.append(" ");
        sb.append(car.getModel());
        sb.append(", ");
        return sb;
    }

    public Car getTheBetterCar(Car bestCar){
        if (bestCar == null){
            return this;
        }
        if (car.getModel().compareTo(bestCar.getModel()) > 0){
            return this;
        }

        return bestCar;
    }
}
