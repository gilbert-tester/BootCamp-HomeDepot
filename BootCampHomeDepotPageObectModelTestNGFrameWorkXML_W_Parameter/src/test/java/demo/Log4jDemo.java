package demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;

public class Log4jDemo {
	
	Logger logger = LogManager.getLogger(Log4jDemo.class);
	
  @Test
  public void f() {
	  
	  System.out.println("\n   Hello World...\n");
	  
	  logger.info("This is information Message");
	  logger.error("This is error message");
	  logger.warn("This is warning message");
	  
	  
	  System.out.println("\n completed");
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
