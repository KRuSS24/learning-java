package Pesochnica;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ErrorCollector {
    private List<ErrorCode> errorCodes = new ArrayList<>();


    public List<ErrorCode> codesCollector(String test){
        List<ValidatorTest> validatorTests = testsCreator();
        Optional<ErrorCode> ec;
        for(ValidatorTest element: validatorTests){
            ec=element.validate(test);
            if(ec.isPresent()) {
                errorCodes.add(ec.get());
            }
        }
        return errorCodes;
    }

    private List<ValidatorTest> testsCreator(){
        List<ValidatorTest> vt = new ArrayList<>();
        vt.add(new Validation_1());
        vt.add(new Validation_2());
        return vt;
    }
}
