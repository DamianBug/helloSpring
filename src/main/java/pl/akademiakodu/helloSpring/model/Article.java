package pl.akademiakodu.helloSpring.model;

/**
 * Created by Damian on 27.07.2017.
 */
public class Article {

    private String title;
    private String body;
    private String category;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Article(){}

    public Article(String title, String body, String category) {
        this.title = title;
        this.body = body;
        this.category = category;
    }
    public String toString(){
        return title+" "+body+" "+category;
    }
}
