package PageObject;

class LoginPage extends BasePage {

    public LoginPage(){
        System.out.println("LoginPage default constructor call");
    }
    public void login(Credentials credentials) {
        System.out.println("Login getLogin call with parameters = " + credentials.toString());
        // TODO: Impl me!
        enterLogin(credentials.getLogin());
        enterPassword(credentials.getPassword());
        clickSubmitButton();
    }

    private void enterLogin(String login) {
        // TODO: do something with login_eb
        // TODO: Add logging
        System.out.println("Login getLogin call with parameters = " + login);
        login_eb.enterText(login);
    }

    private void enterPassword(String password) {
        // TODO: do something with password_eb
        // TODO: Add logging

        password_eb.enterText(password);
    }

    private void clickSubmitButton() {
        // TODO: do something with submit_button
        // TODO: Add logging

        submit_button.click();
    }

    public void enterText(String text){

    }
    private WebElement login_eb = new WebElement("Login Edit Box locator");
    private WebElement password_eb = new WebElement("Password Edit Box locator");
    private WebElement submit_button = new WebElement("Submit Button locator");
}
