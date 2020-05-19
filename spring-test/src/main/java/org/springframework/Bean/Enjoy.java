package org.springframework.Bean;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.springframework.context.annotation.Import;

@Retention(RetentionPolicy.RUNTIME)
@Import(EnjoyBeanPostProcess.class)
public @interface Enjoy {
}
