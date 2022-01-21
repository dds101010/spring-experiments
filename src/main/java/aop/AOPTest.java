package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.stream.IntStream;

@Configuration
@ComponentScan(basePackages = "aop")
@EnableAspectJAutoProxy
public class AOPTest {
  public static void main (String[] args) {
    var context = new AnnotationConfigApplicationContext(AOPTest.class);

    var nameService = context.getBean(NameService.class);
    var randomService = context.getBean(RandomService.class);

    System.out.println("Winner of the lucky draw are: ");
    IntStream.range(0, 5)
            .map(i -> randomService.getRandom(nameService.length()))
            .mapToObj(nameService::getName)
            .forEach(System.out::println);

    context.close();
  }
}
