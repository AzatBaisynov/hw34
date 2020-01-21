import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 50; i++){
            list.add(rd.nextInt(100 - 1) + 1);      // Це рандом от 1 до 100:)
            System.out.print(list.get(i) + " [" + i + "] || ");
        }

        System.out.println();
        System.out.println();

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int e : list){
            if (e % 2 == 0){
                even.add(e);
            }
            else {
                odd.add(e);
            }
        }
        System.out.println(even);
        System.out.println(odd);

        FileWriter fr = new FileWriter("hw34.txt");
        fr.write("Как вы понимаете массивы?\nМассив это блок данных, размер которого мы задает заранее " +
                "\nКак вы понимаете ArrayList?\n" +
                "это наследник класса Лист. Лист такой же как и массив, но размер изначальный задавать не обязательно" +
                "и вообще намного удобнее чем массив обычный.\n" +
                "В чем отличия между обычным массивом и ArrayList?\n" +
                "в том что размер у листа задавать не обязательно, а еще его быстрее выводить в консоль без циклов :)\n" +
                "Как вы понимаете Wrapped классы и для чего они нужны?\n" +
                "Это не примитивные объекты, по сути лист не может считывать примитивы, он преобразует их в классы \n" +
                "оболочки, в объекты. То есть int в Integer, а double в Double.\n" +
                "Чем отличаются методы set(a,b) и add(a,b) у ArrayList?\n" +
                "отличие в том что эдд сдвигает все, что справа и добавляет значение, а сэт перегружает.");
        fr.close();

    }
}
