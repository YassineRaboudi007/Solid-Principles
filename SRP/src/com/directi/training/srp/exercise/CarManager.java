package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarManager
{
    private CarDataLayer _carDataLayer;

    public CarManager(CarDataLayer carDataLayer){
        this._carDataLayer = carDataLayer;
    }

    public String getCarsNames()
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : _carsDb) {
            sb.append(car.getCarName());
        }
        return sb.substring(0, sb.length() - 2);
    }

    public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car : _carsDb) {
            bestCar = car.getTheBetterCar(bestCar)
        }
        return bestCar;
    }
}
