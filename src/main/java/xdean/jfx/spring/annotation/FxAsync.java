package xdean.jfx.spring.annotation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.scheduling.annotation.Async;

@Documented
@Retention(RUNTIME)
@Target({ TYPE, METHOD })
@Async(FxAsync.SCHEDULER)
public @interface FxAsync {
  String SCHEDULER = "scheduler.fx.async";
}