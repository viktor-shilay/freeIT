package homework9.task1;

import java.util.Objects;

@Version(version = 0.1, versionName = "Alpha")
public class MyService {

    private int testInt;
    private String testString;
    private boolean testBool;

    public int getTestInt() {
        return testInt;
    }

    public void setTestInt(int testInt) {
        this.testInt = testInt;
    }

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

    public boolean isTestBool() {
        return testBool;
    }

    public void setTestBool(boolean testBool) {
        this.testBool = testBool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return testInt == myService.testInt;
    }

    @Override
    public int hashCode() {
        return Objects.hash(testInt);
    }

    private void thisClassInfo(){
        System.out.println("Class parameters: \nTestInt - " + testInt +
                "\nTestString - " + testString +
                "\nTestBool - " + testBool);
    }
}
