// Задание
// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее ариф. значение

package Seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * homework3sem
 */
public class homework3sem {

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Список без четных чисел: " + EvenNumbers(AddList(n)));// Полученный список и список 
                                                                                           // в котором удалены четные числа.
        System.out.println("Минимальное значение: " + Min(AddList(n)));     //Минимальное значение
        System.out.println("Максимальное значение: " + Max(AddList(n)));    //Максимальное значение
        Sum(AddList(n));                                                    //Среднее арифметическое
    }
    public static List<Integer> AddList(int n){
        Random random = new Random();
        List<Integer> list1 = new ArrayList<>();
        for (int index = 0; index < n; index++) {
            list1.add(random.nextInt(0,10));
        }
        System.out.println("Список: " + list1);
        return (list1);
    }
    public static List<Integer> EvenNumbers(List<Integer>list1){
        for (int i = list1.size(); i-- > 0;) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
            }
        }
        return (list1);
    }
    public static Integer Min(List<Integer>list1){
        if (list1 == null || list1.size() == 0) {
            return Integer.MAX_VALUE;
        }
        return Collections.min(list1);
    }
    public static Integer Max(List<Integer>list1){
        if (list1 == null || list1.size() == 0) {
            return Integer.MIN_VALUE;
        }
        return Collections.max(list1);
    }
    public static Double Sum(List<Integer>list1){
        Double count = 0.0;
        Double sum = 0.0;
        for (int i : list1) {
            count += i;
        }
        sum = count/list1.size();
        System.out.println("Среднее арифметическое равно: "+ sum);
        return(sum);
    }
}