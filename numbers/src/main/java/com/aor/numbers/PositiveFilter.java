package com.aor.numbers;

public class PositiveFilter implements GenericListFilter {
    @Override
    public boolean accept(Integer number) {
        boolean acception ;
        return (number>0);
    }
}
