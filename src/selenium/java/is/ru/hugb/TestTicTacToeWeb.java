package is.ru.hugb;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

public class TestTicTacToeWeb extends SeleniumTestWrapper {
  @Test
  public void testTitleMatches() throws Exception {
    driver.get(baseUrl);
    Thread.sleep(2000);
    assertEquals("Tic Tac Toe", driver.getTitle());
  }
  @Test
  public void testSymbolAppears() throws Exception {
    driver.get(baseUrl);
    Thread.sleep(2000);
    WebElement element = driver.findElement(By.id("-1"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(700);
    element = driver.findElement(By.id("0"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(1000);
    assertEquals("x", element.getText());
  }

  @Test
  public void testXwins() throws Exception {
  	driver.get(baseUrl);
  	Thread.sleep(2000);
  	WebElement element = driver.findElement(By.id("-1"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(700);
    element = driver.findElement(By.id("0"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(700);
    element = driver.findElement(By.id("3"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(700);
    element = driver.findElement(By.id("1"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(700);
    element = driver.findElement(By.id("4"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(700);
    element = driver.findElement(By.id("2"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(1000);
    element = driver.findElement(By.id("status"));
    assertEquals("'X' vann!", element.getText());
  }

  @Test
  public void testOwins() throws Exception {
  	driver.get(baseUrl);
  	Thread.sleep(2000);
  	WebElement element = driver.findElement(By.id("-1"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(700);
    element = driver.findElement(By.id("1"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(700);
    element = driver.findElement(By.id("0"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(700);
    element = driver.findElement(By.id("2"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(700);
    element = driver.findElement(By.id("4"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(700);
    element = driver.findElement(By.id("5"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(700);
    element = driver.findElement(By.id("8"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(1000);
    element = driver.findElement(By.id("status"));
    assertEquals("'O' vann!", element.getText());
  }

  @Test
  public void testEvenSteven() throws Exception {
  	driver.get(baseUrl);
  	Thread.sleep(2000);
  	WebElement element = driver.findElement(By.id("-1"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(700);
    element = driver.findElement(By.id("1"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(700);
    element = driver.findElement(By.id("0"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(700);
    element = driver.findElement(By.id("4"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(700);
    element = driver.findElement(By.id("3"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(700);
    element = driver.findElement(By.id("5"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(700);
    element = driver.findElement(By.id("7"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(700);
    element = driver.findElement(By.id("8"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(700);
    element = driver.findElement(By.id("2"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(700);
    element = driver.findElement(By.id("6"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(1000);
    element = driver.findElement(By.id("status"));
    assertEquals("Jafntefli!", element.getText());
  }

  @Test
  public void testNoChange() throws Exception {
  	driver.get(baseUrl);
  	Thread.sleep(2000);
  	WebElement element = driver.findElement(By.id("-1"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(700);
    element = driver.findElement(By.id("1"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(700);
    element = driver.findElement(By.id("1"));
    element.sendKeys(Keys.RETURN);
    Thread.sleep(1000);
    element = driver.findElement(By.id("1"));
    assertEquals("x", element.getText());
  }
}
