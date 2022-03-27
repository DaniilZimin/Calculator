package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.CalculatorService;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greeting(){
        return calculatorService.greeting();
    }

    @GetMapping("plus")
    public int addition(@RequestParam("num1") int a, @RequestParam("num2") int b){
        return calculatorService.addition(a, b);
    }

    @GetMapping("minus")
    public int subtraction(@RequestParam("num1") int a, @RequestParam("num2") int b){
        return calculatorService.subtraction(a, b);
    }

    @GetMapping("multiply")
    public int multiplication(@RequestParam("num1") int a, @RequestParam("num2") int b){
        return calculatorService.multiplication(a, b);
    }

    @GetMapping("divide")
    public int division(@RequestParam("num1") int a, @RequestParam("num2") int b){
        return calculatorService.division(a, b);
    }
}
