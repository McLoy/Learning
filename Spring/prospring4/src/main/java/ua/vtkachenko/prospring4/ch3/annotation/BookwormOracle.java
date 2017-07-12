package ua.vtkachenko.prospring4.ch3.annotation;

import org.springframework.stereotype.Service;
import ua.vtkachenko.prospring4.ch3.Oracle;

/**
 * @author Vladyslav T
 * @version 1.0
 */
@Service("oracle")
public class BookwormOracle implements Oracle {
    @Override
    public String defineMeaningOfLife() {
        return "Annotated: Encyclopedias are waste of money - use the internet";
    }
}
