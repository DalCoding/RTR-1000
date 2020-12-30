package org.techtown.test1;

public class RoadList {
    String roadTitle;
    String roadTag;
    String roadPeriod;

    public RoadList(String roadTitle, String roadTag, String roadPeriod) {
        this.roadTitle = roadTitle;
        this.roadTag = roadTag;
        this.roadPeriod = roadPeriod;
    }

    public String getRoadTitle() {
        return roadTitle;
    }

    public void setRoadTitle(String roadTitle) {
        this.roadTitle = roadTitle;
    }

    public String getRoadTag() {
        return roadTag;
    }

    public void setRoadTag(String roadTag) {
        this.roadTag = roadTag;
    }

    public String getRoadPeriod() {
        return roadPeriod;
    }

    public void setRoadPeriod(String roadPeriod) {
        this.roadPeriod = roadPeriod;
    }

}
