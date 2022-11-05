package org.webp.Constraints;



import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


@Constraint(validatedBy = RegisterConstraintsClassConstraintsValidator.class)
@Target({
        ElementType.TYPE,
        ElementType.ANNOTATION_TYPE}
)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RegisterConstraintsClassConstraints {

    String message() default "Register state'inde geçersiz kısıtlama";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
