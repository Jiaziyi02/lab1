package banking;
//测试类
public class TestBanking {
    public static void main(String[]args){
        Customer customer;
        Account account;
        //Create an account that can has a 500.00 balance.
        System.out.println("Creating the customer JaneSmith.");
        customer=new Customer("Jane","Smith",33);
        System.out.println("Creating her account with a 500.00 balance.");
        account = new Account(500.00);
        customer.setAccount(account);
        //   customer.setAccount(new Account(500.00));
        //    account=customer.getAccount();
        //Perform some account transactions 执行一些账户交易
        System.out.println("Withdraw150.00:"+account.withdraw(150.00));
        System.out.println("Deposit22.50:"+account.deposit(22.50));
        System.out.println("Withdraw47.62:"+account.withdraw(47.62));
        System.out.println("Withdraw400.00:"+account.withdraw(400.00));
        //Print out the final account balance
        System.out.println("Customer["+customer.getLastName()
                +","+customer.getFirstName()
                +"]hasabalanceof"+account.getBalance());
    }
}