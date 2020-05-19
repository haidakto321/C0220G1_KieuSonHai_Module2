package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.Dictionary;

@Controller
public class DictionaryController {
    @Autowired
    Dictionary dictionary;

    @GetMapping("/translate")
    public String translate(@RequestParam String word, Model model) {
        String result = dictionary.translate(word);
        if(result==null) {
            model.addAttribute("eng",word);
            model.addAttribute("vie","Không có từ trong từ điển!");
        } else {
            model.addAttribute("vie",result);
            model.addAttribute("eng",word);
        }
        return "result";
    }

}
