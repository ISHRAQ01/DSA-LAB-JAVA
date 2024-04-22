class Bank {
    private int cid;
    private String name;
    private String mobile;
    private float balance;

    public void get_data(int cid, String name, String mobile, float balance) {
        this.cid = cid;
        this.name = name;
        this.mobile =mobile;
        this.balance = balance;
    }

    public void show_data() {
        System.out.println("CUSTOMER ID: " + cid);
        System.out.println("NAME: " + name);
        System.out.println("MOBILE: " + mobile);
        System.out.println("BALANCE: " + balance);
    }

    public static void main(String[] args) {
        Bank c = new Bank();
        c.get_data(142, "ISHRAQ SAIF","7982241430",78333.3F);
        c.show_data();
    }
}
