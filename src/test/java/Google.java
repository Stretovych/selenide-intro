import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Google {
    @Test
    void shouldSearch(){
        open("https://google.com/");

        element(byName("q")).setValue("selenide").pressEnter();

        $(By.xpath("//*[@id=\"rso\"]/div/div/div[3]/div/div/div[1]/a[1]")).shouldHave(text("Selenide")).click();

        Wait().until(titleIs("Selenide: concise UI tests in Java"));

    }
}
