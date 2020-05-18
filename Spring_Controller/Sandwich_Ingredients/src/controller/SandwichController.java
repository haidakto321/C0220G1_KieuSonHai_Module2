package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SandwichController {
    @PostMapping("/condiment")
    public ModelAndView save(@RequestParam("condiment")String[] condiment){

        return new ModelAndView("result", "condiment", condiment);
        }

}
