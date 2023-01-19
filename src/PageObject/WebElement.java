package PageObject;

// NOTE: Selenium entity
class WebElement {
    public WebElement(String locator) {
        System.out.println("WebElement constructor call with parameters: " + locator);
    }

    public void enterText(String text){
        System.out.println("WebElement  getPassword call = " + text);
    }

    public void click(){
        System.out.println("WebElement constructor call with parameters: ");
    }
}
