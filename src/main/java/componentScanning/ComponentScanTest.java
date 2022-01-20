package componentScanning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "componentScanning")
public class ComponentScanTest {

  public static void main (String[] args) {
    var context = new AnnotationConfigApplicationContext(ComponentScanTest.class);

    var canvas = context.getBean(Canvas.class);

    canvas.draw();

    canvas.circle.x = 42;

    canvas = context.getBean(Canvas.class);

    canvas.draw();

    context.close();
  }
}
