package org.example.complexNumbers.complexNumbersClasses;

import lombok.Data;
import lombok.Getter;


@Getter
@Data
public final class ComplexNumbers {
    private final int realNum;
    private final int imaginaryNum;

    public ComplexNumbers(int realNum, int imaginaryNum) {
        this.realNum = realNum;
        this.imaginaryNum = imaginaryNum;
    }

    public int getRealNum() {
        return realNum;
    }

    public int getImaginaryNum() {
        return imaginaryNum;
    }

    public ComplexNumbers addFive (int realNum, int imaginaryNum) {
        int newRealNum = realNum + 5;
        int newImagNum = imaginaryNum + 5;
        return new ComplexNumbers(newImagNum, newRealNum);
    }
    public static ComplexNumbers sum (ComplexNumbers firstNum, ComplexNumbers secondNum){
        return new ComplexNumbers((firstNum.getRealNum() + secondNum.getRealNum()), (firstNum.getImaginaryNum() + secondNum.getImaginaryNum()));
    }
}
