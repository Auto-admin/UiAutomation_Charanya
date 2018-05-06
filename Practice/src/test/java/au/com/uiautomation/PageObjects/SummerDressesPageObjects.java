package au.com.uiautomation.PageObjects;

import au.com.uiautomation.BaseConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SummerDressesPageObjects extends BaseConfig{

    private static WebElement element = null;

    public static WebElement getsortProduct()
    {
        element = driver.findElement(By.id("selectProductSort"));
        return element;
    }

    public static WebElement getAddToCart()
    {
        element = driver.findElement(By.xpath("//*[@id=\"color_20\"][1]/following::*"));
        return element;
    }

    public static WebElement getquantity()
    {
        element =  driver.findElement(By.id("quantity_wanted"));
        return element;
    }

    public static WebElement getColourBlue()
    {
        element =  driver.findElement(By.xpath("//*[@id=\"color_14\"]"));
        return element;
    }

    public static WebElement getDressName()
    {
        element =  driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/h1"));
        return element;
    }

    public static WebElement getCartDressName()
    {
        element =  driver.findElement(By.xpath("//*[@id=\"layer_cart_product_title\"]"));
        return element;
    }

    public static WebElement getCartDressColour()
    {
        element =  driver.findElement(By.xpath("//*[@id=\"layer_cart_product_attributes\"]"));
        return element;
    }

    public static WebElement getCartquantity()
    {
        element =  driver.findElement(By.xpath("//*[@id=\"layer_cart_product_quantity\"]"));
        return element;
    }

    public static WebElement getAddToCartButton()
    {
        element =  driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span  "));
        return element;
    }



}
