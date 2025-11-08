package unla_grupo24.sistema_de_tickets.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import unla_grupo24.sistema_de_tickets.utils.ViewRouterHelper;

@Controller
public class IndexController {

    @GetMapping("/")
    public String home() {
        return ViewRouterHelper.INDEX;
    }
}
