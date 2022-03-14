package com.toDoListBdd.stepdefinitions;

import com.toDoListBdd.pageobjects.ToDoListPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class DeleteItemStep {

    ToDoListPage toDoListPage = new ToDoListPage();

    @Given("finds the added item")
    public void finds_the_added_item() {
        Assert.assertTrue(toDoListPage.getFourthItem().getText().contains("ayooooo"));
    }
    @Given("deletes the item")
    public void deletes_the_item() {
        toDoListPage.getFourthItemCheckBox().click();
    }
    @Then("verify item is delete from the list")
    public void verify_item_is_delete_from_the_list() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertFalse(toDoListPage.getToDoListBox().getText().contains("ayooooo"));
        Thread.sleep(2000);
    }
}
