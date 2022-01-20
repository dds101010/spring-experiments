package beanScope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanScopeTests {
  public static void main (String[] args) {
    var context = new AnnotationConfigApplicationContext(BeanScopeTests.class);

    System.out.println("> Getting Student...1");
    Student student1 = context.getBean(Student.class);

    System.out.println("> Getting Student...2");
    Student student2 = context.getBean(Student.class);

    System.out.printf("student1: %s%n", student1);
    System.out.printf("student2: %s%n", student2);

    System.out.println("> Getting Teacher...1");
    Teacher teacher1 = context.getBean(Teacher.class);

    System.out.println("> Getting Teacher...2");
    Teacher teacher2 = context.getBean(Teacher.class);

    System.out.printf("teacher1: %s%n", teacher1);
    System.out.printf("teacher2: %s%n", teacher2);

    context.close();
  }

  @Bean
  public Student getStudent () {
    return new Student();
  }

  // for prototype, Spring does not call the destroy method, because it's not managing it
  @Bean
  @Scope("prototype")
  public Teacher getTeacher () {
    return new Teacher();
  }

}
