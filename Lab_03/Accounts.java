package Lab_03;

public class Accounts {
    public static void main(String[] args) {
        Payable[] p = new Payable[2];

        p[0] = new DebitAccount(100, 10);
        System.out.println(p[0].pay());

        p[1] = new CreditAccount(100, 10, 2);
        System.out.println(p[1].pay());


    }
}
