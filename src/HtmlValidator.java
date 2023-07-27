import java.util.Queue;
import java.util.Stack;

public class HtmlValidator {
    //creamos un validados de tipo stack que reciba como paramatro una cola(queue)
    public static Stack<HtmlTag> isValidHtml(Queue<HtmlTag> tags) {
        Stack<HtmlTag> stack = new Stack<>();

        while (!tags.isEmpty()) {
            HtmlTag tag = tags.remove();
            if (tag.isOpenTag()) {
                stack.push(tag);
            } else {
                if (stack.isEmpty() || !tag.matches(stack.peek())) {
                    // aqui checkeamos que la pila está vacía o la etiqueta de cierre no coincide con la última etiqueta de apertura
                    return stack; // La pila contiene etiquetas sin cerrar, lo que significa que el HTML no es válido
                }
                stack.pop(); // La etiqueta de cierre coincide con la última etiqueta de apertura, así que se saca
            }
        }
        return stack; // aqui me devuelve el stack vacio si esta well formated o bien formateado
    }
}

