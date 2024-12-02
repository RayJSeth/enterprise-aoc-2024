package io.rayjseth.enterprise_aoc_2024.beans.validators;

import io.rayjseth.enterprise_aoc_2024.beans.annotations.ListLengthEqual;
import io.rayjseth.enterprise_aoc_2024.beans.model.Day1;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ListLengthEqualValidator implements ConstraintValidator<ListLengthEqual, Day1> {

    @Override
    public void initialize(ListLengthEqual constraintAnnotation) {
    }

    @Override
    public boolean isValid(Day1 day1, ConstraintValidatorContext context) {
        if (day1 == null) {
            return true;
        }
        return day1.getList1().size() == day1.getList2().size();
    }
}
