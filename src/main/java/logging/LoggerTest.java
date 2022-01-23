package logging;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "logging")
public class LoggerTest {
  public static void main (String[] args) {
    var context = new AnnotationConfigApplicationContext(LoggerTest.class);

    var sample = context.getBean(Sample.class);
    sample.test();

    context.close();
  }
}
