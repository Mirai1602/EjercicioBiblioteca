package Validators;

import Materiales.Material;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import java.util.Set;

public class ValidacionService {
    private Validator validator;

    public ValidacionService() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    public boolean validarMaterial(Material m) {
        Set<ConstraintViolation<Material>> errores = validator.validate(m);
        if (!errores.isEmpty()) {
            for (ConstraintViolation<Material> error : errores) {
                System.out.println("Error: " + error.getMessage());
            }
            return false;
        }
        return true;
    }
}
