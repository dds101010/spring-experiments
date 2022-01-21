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