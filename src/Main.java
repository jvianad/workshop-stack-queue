import java.io.IOException;
import java.net.URL;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "https://github.com/jvianad/workshop-stack-queue/blob/master/src/example.html";

        // Leemos el archivo HTML y obtenga las etiquetas como una cola
        Queue<HtmlTag> tags = HtmlReader.getTagsFromHtmlFile(filePath);

        // validamos las etiquetas html
        Stack<HtmlTag> result = HtmlValidator.isValidHtml(tags);

        if (result.isEmpty()) {
            System.out.println("The HTML file is well-formatted.");
        } else {
            System.out.println("The HTML file is invalid. Unclosed tags:");
            while (!result.isEmpty()) {
                HtmlTag unclosedTag = result.pop();
                System.out.println(unclosedTag.getElement());
            }
        }

        System.out.println();

        String filePath2 = "https://github.com/jvianad/workshop-stack-queue/blob/master/src/example2.html";

        // Leemos el archivo HTML y obtenga las etiquetas como una cola
        Queue<HtmlTag> tags2 = HtmlReader.getTagsFromHtmlFile(filePath2);

        // validamos las etiquetas html
        Stack<HtmlTag> result2 = HtmlValidator.isValidHtml(tags2);

        if (result2.isEmpty()) {
            System.out.println("The HTML file is well-formatted.");
        } else {
            System.out.println("The HTML file is invalid. Unclosed tags:");
            while (!result2.isEmpty()) {
                HtmlTag unclosedTag = result2.pop();
                System.out.println(unclosedTag.getElement());
            }
        }

    }
}
