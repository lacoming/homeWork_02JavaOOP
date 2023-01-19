package PageObject;

// DTO = Data Transfer Object
// POJO = Plain Old Java Object
class Credentials {
    public Credentials(String login, String password) {

        System.out.println("WebElement constructor call with parameters: " + login + " " + password);
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        System.out.println("Credentials getLogin call = " + login);
        return login;
    }

    public String getPassword() {
        // TODO: Add logging
        System.out.println("Credentials  getPassword call = " + password);
        return password;
    }

    private String login;
    private String password;
}
