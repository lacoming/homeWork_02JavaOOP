package PageObject;

class  HomePage extends BasePage {
    public boolean isImportantLabelAvaliable() {
        // TODO: Add logging≥
        return true;
    }

    private WebElement important_label = new WebElement("Important Label locator");
}
