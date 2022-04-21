
class Account {
    String name;
    protected String address;
    private int atmNumber;

    void setAtmNum(int num) {
        atmNumber = num;
    }

    int getAtmNum() {
        return atmNumber;
    }
}

public class bank {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "dbt";
        a1.address = "Dhanera";
        a1.setAtmNum(100);
        System.out.println(a1.getAtmNum());
    }
}
