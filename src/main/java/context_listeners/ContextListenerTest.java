package context_listeners;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "context_listeners")
public class ContextListenerTest {
  public static void main (String[] args) {
    var context = new AnnotationConfigApplicationContext(ContextListenerTest.class);
    System.out.println("Context started...");
    context.close();
  }
}
