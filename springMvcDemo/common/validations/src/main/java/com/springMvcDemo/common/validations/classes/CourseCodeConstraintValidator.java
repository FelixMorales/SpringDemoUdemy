package com.springMvcDemo.common.validations.classes;

import com.springMvcDemo.common.validations.annotations.CourseCode;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>
{

    private String _coursePrefix;

    @Override
    public void initialize( CourseCode constraintAnnotation )
    {
        _coursePrefix = constraintAnnotation.value();
    }

    @Override
    public boolean isValid( String s, ConstraintValidatorContext constraintValidatorContext )
    {
        boolean result = true;
        try
        {
            result =  s.startsWith( _coursePrefix );
        }
        catch ( Exception ignored )
        {

        }


        return result;
    }
}
