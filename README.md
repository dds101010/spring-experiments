# Spring Experiments


### 1. Bean Scope
Explores singleton and prototype bean scopes

- Package: [`beanScope`](/src/main/java/beanScope)
- Main Class: [`BeanScopeTests`](/src/main/java/beanScope/BeanScopeTests.java)

### 2. Component Scanning
Explores usage of `@Component` and `@ComponentScan` annotation

- Package: [`componentScanning`](/src/main/java/componentScanning)
- Main Class: [`ComponentScanTest`](/src/main/java/componentScanning/ComponentScanTest.java)

### 3. Listeners
Explores using Spring defined Event and its listener `ApplicationListener`

> TODO: Explore custom listeners

- Package: [`context_listeners`](/src/main/java/context_listeners)
- Main Class: [`ContextListenerTest`](/src/main/java/context_listeners/ContextListenerTest.java)

### 4. Properties
Explores using the properties file

> TODO: Explore profile based properties reading

- Package: [`properties`](/src/main/java/properties)
- Main Class: [`PropertiesTest`](/src/main/java/properties/PropertiesTest.java)

### 5. Aspect Oriented Programming

- Package: [`aop`](/src/main/java/aop)
- Main Class: [`AOPTest`](/src/main/java/aop/AOPTest.java)

Below two are equivalent

```java
public @interface SomeAnnotation {
}

@Component
@Aspect
class SomeAspect {
  @Before("@annotation(SomeAnnotation)")
  public void test () {
    // ...
  }
}
```

and

```java

public @interface SomeAnnotation {
}

@Component
@Aspect
class SomeAspect {
  @Pointcut("@annotation(SomeAnnotation)")
  public void pointcut () {
  }

  @Before("pointcut()")
  public void test () {
    // ...
  }
}
```

Second approach may be better if you want to re-use same point-cut for multiple aspect methods.

### 5. Logging
Using Lombok provided annotation for log field injection. In summary, I found `logback` to be more easy to use. Just add one dependency and you're good to go! 

ref:
- https://www.baeldung.com/slf4j-with-log4j2-logback
- https://www.baeldung.com/logback
  - https://logback.qos.ch/manual/layouts.html#conversionWord

```
@Log
- Creates private static final java.util.logging.Logger log = 
    java.util.logging.Logger.getLogger(LogExample.class.getName());

@Slf4j
- Creates private static final org.slf4j.Logger log = 
    org.slf4j.LoggerFactory.getLogger(LogExample.class);

```