package context_listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStarted implements ApplicationListener<ContextRefreshedEvent> {

  @Override
  public void onApplicationEvent (ContextRefreshedEvent event) {
    System.out.println("Listener called: " + event.getSource());
  }
}
