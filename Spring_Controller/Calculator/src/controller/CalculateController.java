package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculateController {
    @GetMapping("/result")
    public ModelAndView showCalculator() {
        return new ModelAndView("result");
    }
    @PostMapping("/calculator")
    public ModelAndView addition(@RequestParam("firstOperand") String firstOperand, @RequestParam("secondOperand") String secondOperand, @RequestParam("calculator") String calculator, Model model) {
        float first = Float.parseFloat(firstOperand);
        float second = Float.parseFloat(secondOperand);
        model.addAttribute("firstOperand", firstOperand);
        model.addAttribute("secondOperand", secondOperand);
        model.addAttribute("calculator", calculator);
        float result = calculator(first, second, calculator);
        model.addAttribute("firstOperand", firstOperand);
        model.addAttribute("secondOperand", secondOperand);
        return new ModelAndView("result","result",result);
    }
    public float calculator(float firstOperand, float secondOperand, String calculator) {
        float result = 0;
        switch (calculator) {
            case "Addition": {
                result = firstOperand + secondOperand;
                break;
            }
            case "Subtraction": {
                result = firstOperand - secondOperand;
                break;
            }
            case "Multiplication": {
                result = firstOperand * secondOperand;
                break;
            }
            case "Division": {
                if (secondOperand == 0) {
                    throw new RuntimeException("can't division by 0");
                } else {
                    result=firstOperand/secondOperand;
                    break;
                }
            }

        }
        return result;
    }
}
