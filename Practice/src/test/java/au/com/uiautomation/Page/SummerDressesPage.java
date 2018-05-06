package au.com.uiautomation.Page;

import au.com.uiautomation.BaseConfig;
import au.com.uiautomation.PageObjects.SummerDressesPageObjects;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.apache.commons.lang3.StringUtils.substring;

public class SummerDressesPage extends BaseConfig{

    private static final Logger LOGGER = LoggerFactory.getLogger(HomePage.class);

    public static void clickonLowFirst()
    {
        Select sel = new Select(SummerDressesPageObjects.getsortProduct());
        sel.selectByVisibleText("Price: Lowest first");

    }

    public static void checkingLowtoHighSort() {
        String newcurentPrice = "";
        String newpreviousPrice ="";

        java.util.List<WebElement> price = driver.findElements(By.xpath("//span[@class='price product-price']"));
        System.out.println(price.size());
        for (int i = 0; i < price.size(); i = i + 1) {

                String curentPrice = price.get(i).getText();

                if(curentPrice.length() > 0) {
                    newcurentPrice = substring(curentPrice, 1, curentPrice.length() - 1);
                }

                if(newcurentPrice.length() > 0 && newpreviousPrice.length() > 0 ) {
                    boolean check = Double.parseDouble(newcurentPrice) > Double.parseDouble(newpreviousPrice);
                    Assert.assertTrue(check);
                    System.out.println(price.get(i).getText());
                }
            if(newcurentPrice.length() > 0) {
                newpreviousPrice = newcurentPrice;
                newcurentPrice = "";
            }


        }
        }
    public static void clickonHighFirst()
    {
        Select sel = new Select(SummerDressesPageObjects.getsortProduct());
        sel.selectByVisibleText("Price: Highest first");

    }

    public static void checkingHightoLowSort() {
        String newcurentPrice = "";
        String newpreviousPrice ="";

        java.util.List<WebElement> price = driver.findElements(By.xpath("//span[@class='price product-price']"));
        System.out.println(price.size());

        for (int i = 0; i < price.size(); i = i + 1) {

            String curentPrice = price.get(i).getText();

            if(curentPrice.length() > 0) {
                newcurentPrice = substring(curentPrice, 1, curentPrice.length() - 1);
            }

            if(newcurentPrice.length() > 0 && newpreviousPrice.length() > 0 ) {
                boolean check = Double.parseDouble(newcurentPrice) < Double.parseDouble(newpreviousPrice);
                Assert.assertTrue(check);
                System.out.println(price.get(i).getText());
            }
            if(newcurentPrice.length() > 0) {
                newpreviousPrice = newcurentPrice;
                newcurentPrice = "";
            }


        }
    }

    }



