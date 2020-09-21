package homework12.manual.task35;

/*
Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
распечатать числа и их среднее арифметическое.
 */

import java.io.*;
import java.util.Random;

public class Task35 {
    public static void main(String[] args) {
        Random rand = new Random();
        int amountRandoms = 20;
        int sum = 0;
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src\\homework12\\manual\\task35\\task35.txt")))) {
            for (int i = 0; i < amountRandoms; i++) {
                dos.writeInt(rand.nextInt(20));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Something went wrong!");
        }

        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("src\\homework12\\manual\\task35\\task35.txt")))) {
            while (true) {
                int i = dis.readInt();
                System.out.print(i + " ");
                sum += i;
            }
        } catch (EOFException ex) {
            System.out.println();
            System.out.println("The average is: " + (double)sum/amountRandoms);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Something went wrong!");
        }
    }
}
