package Pesochnica;

import java.util.List;
import java.util.Optional;

public class Validation_2 implements ValidatorTest{
    @Override
    public Optional<List<ErrorCode>> validate(String test) {
        return Optional.empty();
    }
//    @Override
//    public Optional<ErrorCode> validate(String test) {
//        if(test==null){
//            return Optional.empty();
//        }
//        return (test.length()<5 )? Optional.of(new ErrorCode("Test Text","Must be longer")): Optional.empty();
//    }
}
