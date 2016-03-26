import org.jsoup.nodes.Document;

/**
 * Created by tienhien on 25/03/2016.
 */
public class Post extends Page{

    int post_order;
    String avarta_link;
    String content;
    int parent_id;

    public Post(String name, String link, int post_order, String avarta_link, String content, int parent_id) {
        super(name,link);
        this.post_order = post_order;
        this.avarta_link = avarta_link;
        this.content = content;
        this.parent_id = parent_id;
    }

    public int getPost_order() {
        return post_order;
    }

    public void setPost_order(int post_order) {
        this.post_order = post_order;
    }

    public String getAvarta_link() {
        return avarta_link;
    }

    public void setAvarta_link(String avarta_link) {
        this.avarta_link = avarta_link;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }
     public void ParseHtml(){
         System.out.println("test parse html in sub class");
     };
}
