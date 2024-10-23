package Pesochnica;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Validation_1 implements ValidatorTest{
    @Override
    public Optional<List<ErrorCode>> validate(String test) {
        List<ErrorCode> errorCodes = new ArrayList<>();
        return (test==null || test.isBlank())?
                Optional.of(errorCodes.add( new ErrorCode("Test","Must not be empty"))) :
                Optional.empty();
    }
}
