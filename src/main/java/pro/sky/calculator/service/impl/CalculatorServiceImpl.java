package pro.sky.calculator.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.calculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String greeting() {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public String addition(int a, int b) {
        int c = a + b;
        return a + "+" + b + "=" + c;
    }

    @Override
    public String subtraction(int a, int b) {
        int c = a - b;
        return a + "-" + b + "=" + c;
    }

    @Override
    public String multiplication(int a, int b) {
        int c = a * b;
        return  a + "*" + b + "=" + c;
    }

    @Override
    public String division(int a, int b) {
        if(b == 0){
            return "Ошибка! На 0 делить нельзя!";
        }
        int c = a / b;
        return a + "/" + b + "=" + c;
    }
}
