package homework7.manual.task26;

public abstract class Appliance {
    private String name;
    private int price;
    private int issueYear;

    public Appliance (String name, int price, int issueYear){
        this.name = name;
        this.price = price;
        this.issueYear = issueYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(int issueYear) {
        this.issueYear = issueYear;
    }
}
