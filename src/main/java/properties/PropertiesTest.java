package properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")
public class PropertiesTest {


  public static void main (String[] args) {
    var context = new AnnotationConfigApplicationContext(PropertiesTest.class);
    var env = context.getBean(Environment.class);
    System.out.println(env.getProperty("my.name"));
    System.out.println(env.getProperty("my.name.surname"));
    System.out.println(env.getProperty("my.name.middlename"));
    context.close();
  }
}
