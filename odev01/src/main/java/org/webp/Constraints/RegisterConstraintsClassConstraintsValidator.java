package org.webp.Constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class RegisterConstraintsClassConstraintsValidator implements ConstraintValidator<RegisterConstraintsClassConstraints,RegisterConstraints> {


    @Override
    public boolean isValid(RegisterConstraints value, ConstraintValidatorContext context) {

        return false;
    }
}
