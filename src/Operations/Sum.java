//***************************
//Kourosh Hassanzadeh 9912762552
//Alireza Sajjadi 9912762596
//Mohammad Amin Afsharian Shandiz 9912762790
//***************************


package Operations;

import Commands.Command;

public class Sum<T> extends Command implements Calculable {

    private T argument1;
    private T argument2;
    private T argument3;
    private boolean isTwoArg;

    public Sum(T argument1, T argument2) {
        setArgument1(argument1);
        setArgument2(argument2);
        isTwoArg = true;
    }

    public Sum(T argument1, T argument2, T argument3) {
        setArgument1(argument1);
        setArgument2(argument2);
        setArgument3(argument3);
        isTwoArg = false;
    }

    @Override
    public T calculate() {
        T sum;
        if (isTwoArg) {
            if (argument1 instanceof Integer) {
                Object sum1 = Integer.parseInt(argument1.toString()) + Integer.parseInt(argument2.toString());
                sum = (T) sum1;
                return sum;
            } else if (argument1 instanceof Float) {
                Object sum2 = Float.parseFloat(argument1.toString()) + Float.parseFloat(argument2.toString());
                sum = (T) sum2;
                return sum;
            }
        } else if (!isTwoArg) {
            if (argument1 instanceof Integer) {
                Object sum1 = Integer.parseInt(argument1.toString()) +
                        Integer.parseInt(argument2.toString()) +
                        Integer.parseInt(argument3.toString());
                sum = (T) sum1;
                return sum;
            } else if (argument1 instanceof Float) {
                Object sum2 = Float.parseFloat(argument1.toString()) +
                        Float.parseFloat(argument2.toString()) +
                        Float.parseFloat(argument3.toString());
                sum = (T) sum2;
                return sum;
            }
        }
        return null;
    }

    public void setArgument1(T argument1) {
        this.argument1 = argument1;
    }

    public void setArgument2(T argument2) {
        this.argument2 = argument2;
    }

    public void setArgument3(T argument3) {
        this.argument3 = argument3;
    }

}