import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Category extends Page {

	int sum_post;
	int parent_category; // if parent_category = 0 <-> no parent_category
	

	public Category(String name, String link, int sum_post, int parent_category) {
		super(name,link);
		this.sum_post = sum_post;
		this.parent_category = parent_category;
	}
	public void show(){
		System.out.print(this.getName() +"\n" +this.getLink() +"\n");
	}

	public void ParseHtml(){
		try {
			Document document = Jsoup.connect(this.link).get();
			document.select(".listbaihoc > script").remove();
			document.removeAttr("ins");
			Elements list_title_tag = document.select(".listbaihoc h2");
			Elements list_title_p = document.select(".listbaihoc p");

			for (Element element : list_title_tag) {
				System.out.println(element.text());
				Element tag_p = element.nextElementSibling();
				Elements tag_a = tag_p.select("a");
				for (Element element_a : tag_a) {
					System.out.println(element_a.text());
				}

			}
			//get file tranfer
			for(int i=0;i<list_title_tag.size();i++){
				System.out.println("fix bug when add database");

			}
		}catch (Exception ex){
			ex.printStackTrace();
		}
	}

	public int getParent_category() {
		return parent_category;
	}

	public void setParent_category(int parent_category) {
		this.parent_category = parent_category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getSum_post() {
		return sum_post;
	}

	public void setSum_post(int sum_post) {
		this.sum_post = sum_post;
	}
	

}
