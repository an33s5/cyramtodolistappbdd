package com.toDoListBdd.pageobjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.WatchEvent;

import static com.toDoListBdd.base.TestBase.driver;

public class ToDoListPage {

    public ToDoListPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[name=\"newItem\"]")
    @Getter
    WebElement newItemField;


    @FindBy(css = "[type=\"submit\"]")
    @Getter
    WebElement addItemBtn;


    @FindBy(css = "[class=\"box\"]:nth-of-type(2)")
    @Getter
    WebElement toDoListBox;


    @FindBy(css = "form:nth-child(4) > div > input[type=checkbox]")
    @Getter
    WebElement fourthItemCheckBox;

    @FindBy(css = "form:nth-child(4) > div > p")
    @Getter
    WebElement fourthItem;

}
