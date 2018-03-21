package sunny.springframework.joke.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sunny.springframework.joke.Services.JokeService;

/**
 * Created by Sandu
 * on 21.03.2018
 */
@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String ShowJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }
}
