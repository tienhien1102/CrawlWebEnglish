import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList category_list = new ArrayList<Category>();

        try {

            try {
                BufferedReader br = new BufferedReader(new FileReader("src/main/java/link_chap.txt"));
                String sCurrentLine;

                while ((sCurrentLine = br.readLine()) != null) {
                    String category_name = sCurrentLine;
                    String category_link = br.readLine();
                    Category category = new Category(category_name, category_link, 0, 0);

                    category_list.add(category);
                    category.ParseHtml();

                }


            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (Exception ex) {
            System.out.print(ex);
        }
        return;
    }

}
