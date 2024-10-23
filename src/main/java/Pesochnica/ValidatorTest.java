package Pesochnica;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface ValidatorTest {
    public Optional<List<ErrorCode>> validate (String test);
    //public Optional<ErrorCode> validateArray(String[] test2);
}
