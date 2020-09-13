package homework9.task1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
Придумать и написать собственную аннотацию @Version, которая бует хранить информацию
о версии класса сервиса (поле обязательное) MyService и кодовое название версии (поле
не обязательное) - (например номер версии = 7.1, а кодовое название версии = Nougat).

Класс MyService должен иметь переменные c private модификаторами, конструктор по умолчанию,
get и set методы, переопределенные методы equals и hashcode, а так же private метод
(private thisClassInfo), который будет просто печатать данные о самом классе (данные
любые на ваш выбор), в котором он определен.

Написать программу, которая будет анализировать присутствие аннотации над классом MyService
и если она присутствует - создавать экземпляр этого класса, задавать значения его полям
и вызывать метод thisClassInfo (использовать возможности пакета reflection).

 */
public class Handler {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if(MyService.class.isAnnotationPresent(Version.class)){
            MyService myService = new MyService();
            myService.setTestInt(999);
            myService.setTestBool(true);
            myService.setTestString("TEST");
            Method m = MyService.class.getDeclaredMethod("thisClassInfo");
            m.setAccessible(true);
            m.invoke(myService);
            /*Version ver = MyService.class.getAnnotation(Version.class);
            System.out.println(ver.version());
            System.out.println(ver.versionName());*/
        }
    }
}
