package com.example.homework23.controllers;

import com.example.homework23.services.CalcService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcControllerImpl implements CalcController {

    CalcService calcService;

    public CalcControllerImpl(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String defaultGreetings() {
        return "<h1><strong>Welcome!</strong></h1>";
    }

    @Override
    @GetMapping("/mul")
    public double multiply(@RequestParam double a, double b) {
        return calcService.multiply(a, b);
    }

    @Override
    @GetMapping("/div")
    public double divide(@RequestParam double a, double b) {
        return calcService.divide(a, b);
    }

    @Override
    @GetMapping("/add")
    public double add(@RequestParam double a, double b) {
        return calcService.add(a, b);
    }

    @Override
    @GetMapping("/sub")
    public double subtract(@RequestParam double a, double b) {
        return calcService.subtract(a, b);
    }

}
