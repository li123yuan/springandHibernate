package com.perry.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @Title:XXXX
 * @Description:
 * @author: zenghuapei
 * @date 2016/9/5
 * @update [修改人] [修改时间] [变更描述]
 */
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Log {
    String name() default "";

}
