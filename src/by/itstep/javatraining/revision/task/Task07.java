package by.itstep.javatraining.revision.task;

/*	Task 07. The Double Max [вторая максимальная цифра]
 *
 *	Дано целое число. Необходимо определить вторую по величине цифру данного числа,
 *	т.е. цифру, которая будет наибольшим, если из числа удалить наибольшую цифру.
 *	Если нет такой цифры, то должно быть возвращено число -1.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа long long.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено число, которое является решение задачи.
 *
 *	[ input 1]: 12345
 *	[output 1]: 4
 *
 *	[ input 2]: -56789
 *	[output 2]: 8
 *
 *	[ input 3]: 11111
 *	[output 3]: -1
 *
 *	[ input 4]: 0
 *	[output 4]: -1
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task07 {
    public static int task07(long number) {
        String s = String.valueOf(number);
        int maxValue = -1;
        int secondMaxValue = -1;
        for (int i = 0; i < s.length(); i++) {
            int digit = Character.getNumericValue(s.charAt(i));
            if (digit > maxValue) {
                secondMaxValue = maxValue;
                maxValue = digit;
            } else if (digit > secondMaxValue && digit != maxValue) {
                secondMaxValue = digit;
            }
        }
        return secondMaxValue;
    }


    public static void main(String[] args) {

        long number = 1;

        if (number == 0) {
            System.out.println(-1);;
        }

        List<Long> list = new ArrayList<>();

        String numbers = String.valueOf(number);


        for (int i = 0; i < numbers.length(); i++) {
            long num2 = Character.getNumericValue(numbers.charAt(i));
            list.add(num2);
        }


        list.sort(null);
        int maxValue = Math.toIntExact(list.get(list.size() - 1));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == maxValue) {
                list.remove(list.get(i));
            }
        }

        System.out.println("ok");
        if (list.size()==1 || list.size()==0){
            System.out.println(-1);;
        }


        System.out.println(Math.toIntExact(list.get(list.size() - 1)));
    }
}
