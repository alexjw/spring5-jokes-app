package guru.springframework.joke.Controllers;

import guru.springframework.joke.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private JokeService jokeService;

    @Autowired
    public HomeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String home(Model model) {

        model.addAttribute("theJoke", jokeService.getJoke());

        return "joke";
    }

}
