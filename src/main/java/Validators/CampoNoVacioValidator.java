package Validators;

import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.Payload;

public class CampoNoVacioValidator  implements CampoNoVacio{



    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) return false; // no puede ser nulo
        return !value.trim().isEmpty();  // no puede estar vacío ni solo espacios
    }

    @Override
    public String message() {
        return "Ek campo no puede estas vacio";
    }

    @Override
    public Class<?>[] groups() {
        return new Class[0];
    }

    @Override
    public Class<? extends Payload>[] payload() {
        return new Class[0];
    }
}
