import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    @Test
    void DragAndDropTest(){
        // Вариант 1
        // Открыть страницу
        open("https://the-internet.herokuapp.com/drag_and_drop");
        // Перенести обьект А на место обьекта Б
        actions().moveToElement($("#column-a")).clickAndHold().
                moveByOffset(150, 0).release().perform();
        // Проверить, что обьект Б встал на место А и обьект А встал на место Б
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }
    void DragAndDropTest2(){
        // Вариант 2
        // Открыть страницу
        open("https://the-internet.herokuapp.com/drag_and_drop");
        // Перенести обьект А на место обьекта Б
        actions().moveToElement($("#column-a")).clickAndHold().
                moveToElement($("#column-b")).release().perform();
        // Проверить, что обьект Б встал на место А и обьект А встал на место Б
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }
}
