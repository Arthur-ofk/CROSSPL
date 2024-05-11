package org.example.jnest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        String message = "Це приклад текстового повідомлення";
        List<String> items = new ArrayList<>();
        items.add("Пункт 1");
        items.add("Пункт 2");
        items.add("Пункт 3");

        model.addAttribute("message", message);
        model.addAttribute("items", items);

        return "home"; // Повернення назви шаблону
    }
}
