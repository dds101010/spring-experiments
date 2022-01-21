package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class AOPWay1 {

  @Before("execution(* aop.*Service.get*(..))")
  public void logServiceGetters(JoinPoint joinPoint) {
    System.out.printf(
            "[LOG] Method: %s called, Parameters: %s%n",
            joinPoint.getSignature(),
            Arrays.toString(joinPoint.getArgs())
    );
  }
}
