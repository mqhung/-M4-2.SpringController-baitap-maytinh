package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {
    @GetMapping("")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }

    @PostMapping("")
    public ModelAndView calculator(@RequestParam long firstNumber, long secondNumber, String calculation) {
        ModelAndView modelAndView = new ModelAndView("home");
        long result = 0;
        switch (calculation) {
            case "Addition":
                result = firstNumber + secondNumber;
                break;
            case "Subtraction":
                result = firstNumber - secondNumber;
                break;
            case "Multiplication":
                result = firstNumber * secondNumber;
                break;
            case "Division":
                result = firstNumber / secondNumber;
                break;
        }
        modelAndView.addObject("result", result);
        modelAndView.addObject("calculation", calculation);
        return modelAndView;
    }
}
