package ChurchSystem;

import java.util.List;

public class Church {
    private List<Pastor> pastors;
    private List<Members> members;

    public Church(List<Pastor> pastors, List<Members> members) {
        this.pastors = pastors;
        this.members = members;

    }
}

