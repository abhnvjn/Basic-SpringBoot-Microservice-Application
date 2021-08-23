package abhinav.ratingdataapi.resources;

import abhinav.ratingdataapi.templates.mainreturntemplateobj;
import abhinav.ratingdataapi.templates.rattemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rating")
public class primarycontroller {

    @RequestMapping("/{mid}")
    public rattemplate getrating(@PathVariable("mid") String mid){
        return new rattemplate(mid, 5);
    }

    @RequestMapping("/user/{uid}")
    public mainreturntemplateobj getlstofratedmovies(@PathVariable("uid") String uid){
        List<rattemplate> ratings = Arrays.asList(
                new rattemplate("12ab", 5),
                new rattemplate("34cd", 9)
        );
        return new mainreturntemplateobj(ratings);
    }

}
