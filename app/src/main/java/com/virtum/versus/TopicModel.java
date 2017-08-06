package com.virtum.versus;

import java.io.Serializable;

public class TopicModel implements Serializable {

    private String title;
    private String description;

    public TopicModel(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
