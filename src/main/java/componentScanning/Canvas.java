package componentScanning;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Canvas {

  Circle circle;

  public Canvas (Circle circle) {
    this.circle = circle;
  }

  public void draw () {
    System.out.println(circle);
  }
}
