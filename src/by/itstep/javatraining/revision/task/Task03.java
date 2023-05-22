package by.itstep.javatraining.revision.task;

/*	Task 03. All Integer Powers of Two [все целые степени двойк]
 *
 *	По данному числу N распечатайте все целые степени двойки, не превосходящие N, в порядке возрастания.
 *	В случае некорректных данных напечатайте ноль.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа int.
 *
 *	Формат выходных данных [output]
 *	Должна возвращаться строка, которая содержит ответ на задание.
 *
 *	[ input 1]: 40
 *	[output 1]: 1 2 4 8 16 32
 *
 *	[ input 2]: 1
 *	[output 2]: 1
 *
 *	[ input 3]: 0
 *	[output 3]: 0
 *
 *	[ input 4]: -40
 *	[output 4]: 0
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task03 {
    public static String task03(int number) {

        if (number <= 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        int power = 1;

        while (power <= number) {
            result.append(power).append(" ");
            power *= 2;
        }

        return result.toString().trim();
    }


    public static void main(String[] args) {
        int number = 2;

        if (number < 0) {
            System.out.println("0");
        }

        int k = (int) Math.ceil(Math.log(number) / Math.log(2));
        int num = (int) Math.pow(2, k - 1);

        List<Integer> results = new ArrayList<>();
        while (num >= 2) {
            results.add(num);
            num /= 2;
        }

        results.add(num);
        results.sort(null);
        String res = "";

        for (int i = 0; i < results.size(); i++) {
            res += results.get(i) + " ";
        }

        System.out.println(res);

    }

}









