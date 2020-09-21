package homework12.task4;

import java.io.*;

/*
Сериализовать объект Автомобиль(Марка, скорость, цена). После
сериализации произвести обратный процесс
*/

public class Task4 {
    public static void main(String[] args) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src\\homework12\\task4\\task4.dat"))){
            Car car = new Car("BMW i5", 250.0, 55000);
            objectOutputStream.writeObject(car);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Something went wrong!");
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src\\homework12\\task4\\task4.dat"))) {
            Car car = (Car) objectInputStream.readObject();
            System.out.println(car);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found!");
        } catch (IOException e) {
            System.out.println("Something went wrong!");
        }
    }
}
