package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AOPWay2 {


  @Pointcut("execution(* aop.NameService.length())")
  private void pointCut() {}

//  @AfterReturning(value = "execution(* aop.NameService.length())", returning = "result")
  @AfterReturning(value = "pointCut()", returning = "result")
  public void anotherLogger(JoinPoint joinPoint, Object result) {
    System.out.printf(
            "[LOG] Method: %s -> returned: %s\n",
            joinPoint.toShortString(),
            result
    );
  }

  @Before(value = "@annotation(AOPWay2Annotation)")
  public void catchAll (JoinPoint joinPoint) {
    System.out.printf(
            "[WARN] Method: %s called!!!\n",
            joinPoint.toShortString()
    );
  }
}
