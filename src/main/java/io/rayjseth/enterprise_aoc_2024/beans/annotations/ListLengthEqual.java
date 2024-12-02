package io.rayjseth.enterprise_aoc_2024.beans.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import io.rayjseth.enterprise_aoc_2024.beans.validators.ListLengthEqualValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

// Define the annotation for the constraint
@Target({ ElementType.TYPE, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ListLengthEqualValidator.class) // Specify the validator to be used
public @interface ListLengthEqual {
    String message() default "The lists must have the same length"; // Default error message

    Class<?>[] groups() default {}; // Used for grouping constraints

    Class<? extends Payload>[] payload() default {}; // Used for additional data
}