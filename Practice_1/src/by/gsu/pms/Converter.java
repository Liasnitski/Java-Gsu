package by.gsu.pms;
import  java.math.BigDecimal;
import java.math.RoundingMode;

public class Converter {
    public static BigDecimal convert(double value, int divider, int precision) {
        BigDecimal BigValue, BigDivider;

        BigValue = new BigDecimal(value);
        BigDivider = new BigDecimal(divider);
        return BigValue.divide(BigDivider, precision, RoundingMode.HALF_UP);
    }
}