package Validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CampoNoVacioValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public interface CampoNoVacio {
    String message() default "El campo no puede estar vacío";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
