package com.example.CalculatorREST.Controller;

import com.example.CalculatorREST.Model.CalculationRequest;
import com.example.CalculatorREST.Model.CalculationResponse;
import com.example.CalculatorREST.Service.CalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {

    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @PostMapping
    public CalculationResponse calculate(@RequestBody CalculationRequest request) {
        double result = service.calculate(
                request.getNum1(),
                request.getNum2(),
                request.getOperation()
        );

        return new CalculationResponse(result);
    }





}

