package abhinav.moviecatalogueapi.resouces;

import abhinav.moviecatalogueapi.templates.citems;
import abhinav.moviecatalogueapi.templates.mainreturntemplateobj;
import abhinav.moviecatalogueapi.templates.rattemplate;
import abhinav.moviecatalogueapi.templates.mtemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalogue")
public class primarycontroller {

    // **** Very imp point to note
    // This is to be defined as the property of the class and not the property of the method
    @Autowired
    private RestTemplate resttemplate;

    @RequestMapping("/{uid}")
    public List<citems> getcatalogue(@PathVariable("uid") String uid){
        // ########################################################
        /*return Arrays.asList(
                new citems("Free Guy", "Awesome Movie", 9),
                new citems("Black Widow", "Awesome Movie", 8),
                new citems("Transformers", "Awesome Movie", 5),
                new citems("Avengers", "Awesome Movie", 7),
                new citems("Passenger", "Awesome Movie", 3),
                new citems("John Wick", "Awesome Movie", 6)
        );
        */
        // ########################################################
        // So basically what we want here is to
        // get all the rated movie id's and then
        // get movie info from movieinfoservice
        // and then put them all together
        // ########################################################
        // Lets assume this is the response we got from the ratings API
        /*List<rattemplate> ratings = Arrays.asList(
                new rattemplate("12ab", 5),
                new rattemplate("34cd", 9)
        );

        return ratings.stream().map(obj -> new citems("John", "Awesome", obj.getRating()))
                .collect(Collectors.toList());

        so, here we create a new citems object for each rattemplate object and store all of them
        in  a list, and return that list.
        Here, we have just put the correct rating, but we are yet to put the correct movie details.
         */

        /*
        So for obtaining the correct movie details we will call the movie details service API
        for each rated movie obtained in the above list. And store the details in the citems
        object.
        And then return a list of these objects
         */

        mainreturntemplateobj robjret = resttemplate.getForObject
                ("http://127.0.0.1:8083/rating/user/" + uid ,mainreturntemplateobj.class);

        return robjret.getRetobjforrating().stream().map(obj->{
            mtemplate mobjret = resttemplate.getForObject
                    ("http://127.0.0.1:8082/movies/"+obj.getMid(), mtemplate.class);
            return new citems(mobjret.getName(), "desc", obj.getRating());
            }).collect(Collectors.toList());
    }
}
