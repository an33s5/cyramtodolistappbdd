package com.toDoListBdd.stepdefinitions;

import com.toDoListBdd.pageobjects.ToDoListPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.toDoListBdd.base.TestBase.driver;

public class AddNewItemStep {

    ToDoListPage toDoListPage = new ToDoListPage();

    @Given("user is on todolist page")
    public void user_is_on_todolist_page() {
       driver.get("https://mongodblist.herokuapp.com/Apocalpse");
    }
    @Given("user enter text into new item field")
    public void user_enter_text_into_new_item_field() {
        toDoListPage.getNewItemField().sendKeys("ayooooo");
    }
    @Given("clicks the plus add button")
    public void clicks_the_plus_add_button() {
       toDoListPage.getAddItemBtn().click();
    }
    @Then("verify item has been added to the list")
    public void verify_item_has_been_added_to_the_list() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(toDoListPage.getToDoListBox().getText().contains("ayooooo"));
        Thread.sleep(6000);
    }

}
