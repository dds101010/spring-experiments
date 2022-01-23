package logging;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Sample {
  public void test() {
    log.info("This is INFO msg");
    log.error("This is ERROR msg");
    log.debug("This is DEBUG msg");

    log.error("This is the {}", Math.random());
  }
}
