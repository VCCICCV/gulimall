package com.atguigu.gulimall.common.valid;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 自定义校验注解
 */
@Documented
//指定校验器
@Constraint(validatedBy = {ListValueConstraintValidator.class})
//可以标注的位置
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME)
public @interface ListValue {
    /**
     * @NotBlank中 校验信息
     * String message() default "{javax.validation.constraints.NotBlank.message}";
     * 分组
     * Class<?>[] groups() default {};
     * 负载信息
     * Class<? extends Payload>[] payload() default {};
     */
//配置信息在resources
    String message() default "{com.atguigu.common.valid.ListValue.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int[] vals() default {};

}
