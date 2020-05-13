package service.impl;

import org.springframework.stereotype.Service;
import service.Converter;
@Service
public class ConverterImpl implements Converter {
    @Override
    public double convert(double rate, double usd) {
        return rate*usd;
    }
}
