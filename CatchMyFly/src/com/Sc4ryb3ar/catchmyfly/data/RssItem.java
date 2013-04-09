package com.Sc4ryb3ar.catchmyfly.data;
/**
 * This code encapsulates RSS item data.
 * Our application needs title and link data.
 *
 * @author ITCuties
 */
public class RssItem {
 
    private String title;
    private String link;
      
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    @Override
    public String toString() {
        return title;
    }
}