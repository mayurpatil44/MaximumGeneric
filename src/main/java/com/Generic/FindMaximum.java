package com.Generic;

public class FindMaximum {

    public double firstFloat = 0;
    public double secondFloat = 0;
    public double thirdFloat = 0;

    public double MaximumFloatNum(double firstFloat, double secondFloat, double thirdFloat) {

        if(Double.compare(firstFloat,secondFloat)> 0){
            return firstFloat;
        }
        else if(Double.compare(secondFloat,thirdFloat) > 0) {
            return secondFloat;
        }
        else{
            return thirdFloat;
        }

    }

}
