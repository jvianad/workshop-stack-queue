import java.io.IOException;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        /***********************PROFE AQUI COLOCA SU RUTA LOCAL EN EL FILEPATH********************************/
        String filePath = "C:\\Users\\Jean Viaña\\Desktop\\workshop-stack-queue\\src\\example.html";

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
        /***********************PROFE AQUI COLOCA SU RUTA LOCAL EN EL FILEPATH2********************************/
        String filePath2 = "C:\\Users\\Jean Viaña\\Desktop\\workshop-stack-queue\\src\\example2.html";

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

        System.out.println();
        /***********************PROFE AQUI COLOCA SU RUTA LOCAL EN EL FILEPATH3********************************/
        String filePath3 = "C:\\Users\\Jean Viaña\\Desktop\\workshop-stack-queue\\src\\example3.html";

        // Leemos el archivo HTML y obtenga las etiquetas como una cola
        Queue<HtmlTag> tags3 = HtmlReader.getTagsFromHtmlFile(filePath3);

        // validamos las etiquetas html
        Stack<HtmlTag> result3 = HtmlValidator.isValidHtml(tags3);

        if (result3.isEmpty()) {
            System.out.println("The HTML file is well-formatted.");
        } else {
            System.out.println("The HTML file is invalid. Unclosed tags:");
            while (!result3.isEmpty()) {
                HtmlTag unclosedTag = result3.pop();
                System.out.println(unclosedTag.getElement());
            }
        }

    }
}
