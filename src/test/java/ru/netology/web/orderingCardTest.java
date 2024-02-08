package ru.netology.web;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class orderingCardTest {

@Test
void shouldTest() {
    open("http://localhost:9999");
    SelenideElement form = $(By.className("form"));
    form.$("[data-test-id=name] input").setValue("Иванов Иван");
    form.$("[data-test-id=phone] input").setValue("+79996665544");
    form.$("[data-test-id=agreement]").click();
    form.$(By.className("button")).click();
    $("[data-test-id=order-success]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
}

}

