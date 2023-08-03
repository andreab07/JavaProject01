package review1;

public class E3Variables {
    public static void main(String[] args) {
        int age,price,no0fFans;
        age=15;
        price=1000;
        no0fFans=4;

        System.out.println(age+" "+price+" "+no0fFans);
        System.out.println(age+" "+price+no0fFans);
        System.out.println(age+price+no0fFans);

        String op1=age+" ";
        String op2=op1+price;
        String op3=op2+no0fFans;

        System.out.println(op3);

    }
}


