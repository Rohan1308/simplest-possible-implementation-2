package simplest.possible.implementation;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public <T> List<T> of(int num) {
        ArrayList primeFactors = new ArrayList<>();
        if(num==1) return primeFactors;
        else primeFactors.add(2);
        return primeFactors;
    }
}

