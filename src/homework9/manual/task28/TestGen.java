package homework9.manual.task28;

public class TestGen <T>{
    private T[] array;

    public TestGen(T[] array) {
        this.array = array;
    }
    public T get(int index){
        return array[index];
    }
}
