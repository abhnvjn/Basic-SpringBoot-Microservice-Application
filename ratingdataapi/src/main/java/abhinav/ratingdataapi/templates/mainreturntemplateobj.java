package abhinav.ratingdataapi.templates;

import java.util.List;

public class mainreturntemplateobj {
    private List<rattemplate> retobjforrating;

    public mainreturntemplateobj(List<rattemplate> retobjforrating) {
        this.retobjforrating = retobjforrating;
    }

    public List<rattemplate> getRetobjforrating() {
        return retobjforrating;
    }

    public void setRetobjforrating(List<rattemplate> retobjforrating) {
        this.retobjforrating = retobjforrating;
    }
}
