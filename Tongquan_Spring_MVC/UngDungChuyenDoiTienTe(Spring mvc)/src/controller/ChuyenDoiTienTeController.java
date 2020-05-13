package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.Converter;
import service.impl.ConverterImpl;

@Controller
public class ChuyenDoiTienTeController {
    @Autowired
    Converter converter;

    @GetMapping("/converter")
    public String convert(@RequestParam String rate, @RequestParam String usd, Model model) {
        double result = converter.convert(Double.parseDouble(rate), Double.parseDouble(usd));
        model.addAttribute("convertUSD", result);
        return "result";
    }
}
