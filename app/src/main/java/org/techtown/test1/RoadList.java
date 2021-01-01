package org.techtown.test1;

public class RoadList {
    /*String roadTitle;
    String roadPeriod;
    String roadUsername;

    public RoadList(String roadTitle, String roadPeriod, String roadUsername) {
        this.roadTitle = roadTitle;
        this.roadPeriod = roadPeriod;
        this.roadUsername = roadUsername;
    }

    public String getRoadTitle() {
        return roadTitle;
    }

    public void setRoadTitle(String roadTitle) {
        this.roadTitle = roadTitle;
    }

    public String getRoadPeriod() {
        return roadPeriod;
    }

    public void setRoadPeriod(String roadPeriod) {
        this.roadPeriod = roadPeriod;
    }

    public String getRoadUsername() {
        return roadUsername;
    }

    public void setRoadUsername(String roadUsername) {
        this.roadUsername = roadUsername;
    }*/
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
