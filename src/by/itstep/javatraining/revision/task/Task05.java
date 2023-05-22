package by.itstep.javatraining.revision.task;

/*	Task 05. Max Number Digit [максимальная цифра числа]
 *
 *	Дано целое число. Необходимо найти максимальную цифру заданного числа
 *	с использованием эффективного алгоритма.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа long long.
 *
 *	Формат выходных данных [output]
 *	Должна быть возвращена максимальная цифра числа.
 *
 *	[ input 1]: 987_654_321
 *	[output 1]: 9
 *
 *	[ input 2]: 12345
 *	[output 2]: 5
 *
 *	[ input 3]: 0
 *	[output 3]: 0
 *
 *	[ input 4]: -15
 *	[output 4]: 5
 */


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task05 {
    public static int task05(long number) {
       /* if (number < 0) {
            number *= -1;
        }

        if (number == 0) {
            return 0;
        }

        List<Long> list = new ArrayList<>();
        long sym = 0;
        for (int i = 0; i < number; i++) {

            sym = number % 10;
            number /= 10;
            list.add(sym);

        }

        list.sort(Comparator.reverseOrder());
        long otvet = list.get(0);
        System.out.println("ok");
        return (int) otvet;*/
        String numbers = String.valueOf(number);
        int maxNum = 0;
        for (int i = 0; i < numbers.length(); i++) {
            int num2 = Character.getNumericValue(numbers.charAt(i));

            if (num2 > maxNum){
                maxNum = num2;
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {


        long num = 9_223_372_036_854_775_807L;

        String numbers = String.valueOf(num);
        int maxNum = 0;
        for (int i = 0; i < numbers.length(); i++) {
            int num2 = Character.getNumericValue(numbers.charAt(i));

            if (num2 > maxNum){
                maxNum = num2;
            }
        }
        System.out.println(maxNum);

    }


}