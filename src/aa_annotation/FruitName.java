package aa_annotation;

import java.lang.annotation.*;

/**
 * 水果名称注解
 * <p>
 * Created by peng.tan on 17/8/31.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
    String value() default "";
}
