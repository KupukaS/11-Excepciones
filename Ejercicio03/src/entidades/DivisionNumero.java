package entidades;

public class DivisionNumero {
    public int division(int num1, int num2) throws ArithmeticException {
    int division;
    
    division = num1/num2;
    if (num2 == 0){

        throw new ArithmeticException("division por cero");

    }
    System.out.println(division);

    return division;
    }
    
}