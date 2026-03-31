package com.example.CalculatorREST.Service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public double calculate(double a,double b, String operation){
        switch(operation.toLowerCase()){
            case "add":
                return a+b;
            case "subtract":
                return a-b;
            case "multiply":
                return a*b;
            case "divide":
                if(a == 0 || b == 0){
                    throw new RuntimeException("cannot divide by zero");
                }
                return a / b;
            default:
                throw new RuntimeException("unknown operation");

        }
    }


}
