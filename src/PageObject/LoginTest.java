package PageObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoginTest extends BaseTest {


    public void loginTest() {
        // TODO: Add reading from default input file
        // TODO***: Add xml serialization \ deSerialization for LoginData
        // 3A Rule

        FileInputStream input = null;

        try { 
            input = new FileInputStream("src/PageObject/LoginDataTest.properties");
            Properties prop = new Properties();

            try {
                prop.load(input);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            Credentials ld = new Credentials(prop.getProperty("login"), prop.getProperty("password"));

        } catch (FileNotFoundException e) {

            throw new RuntimeException("Файл не найден");

        } finally{

            try{
                if (input !=null)
                    input.close();
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }


        LoginPage loginPage = new LoginPage();
        loginPage.login(ld);

        HomePage homePage = new HomePage();
        Assert.isTrue(homePage.isImportantLabelAvaliable());
    }
}


