package beanScope;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
  public Student () {
    System.out.println("Student object being created...");
  }

  @PostConstruct
  private void init () {
    System.out.println("Inside PostConstruct of: " + this);
  }

  @PreDestroy
  private void destroy () {
    System.out.println("Inside PreDestroy of: " + this);
  }
}
