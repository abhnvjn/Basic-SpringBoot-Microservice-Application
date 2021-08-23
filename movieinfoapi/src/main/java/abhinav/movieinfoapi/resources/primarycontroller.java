package abhinav.movieinfoapi.resources;

import abhinav.movieinfoapi.templates.mtemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class primarycontroller {

    @RequestMapping("/{mid}")
    public mtemplate getmovieinfo(@PathVariable("mid") String mid){
        return new mtemplate(mid, "John Wick");
    }
}
