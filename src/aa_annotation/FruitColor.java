package aa_annotation;

import java.lang.annotation.*;

/**
 * 水果颜色注解
 * <p>
 * Created by peng.tan on 17/8/31.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
    /**
     * 颜色枚举
     */
    public enum Color {
        BULE, RED, YELLOW
    }


    /**
     * 颜色属性
     *
     * @return
     */
    Color fruitColor() default Color.YELLOW;

}
