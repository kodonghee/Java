public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    public Person(String pName, int pAge){
        name = pName;
        cashAmount = 0;
        if (pAge < 0){
            age = 12;
        } else {age = pAge;}
    }

    public Person(String pName, int pAge, int pCashAmount){
        name = pName;
        if(pCashAmount < 0){
            cashAmount = 0;
        } else { cashAmount = pCashAmount;}
        if (pAge < 0){
            age = 12;
        } else {age = pAge;}
    }

    public void setAge(int newAge){
        if(newAge >= 0) {
            age = newAge;
        }
    }

    public int getAge(){
        return age;
    }

    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }

    public void setCashAmount(int newCashAmount){
        if(newCashAmount >= 0) {
            cashAmount = newCashAmount;
        }
    }

    public int getCashAmount(){
        return cashAmount;
    }

    public void setAccount(BankAccount newAccount){
        account = newAccount;
    }

    public BankAccount getAccount(){
        return account;
    }

    // 첫 번째 파라미터: 받는 사람 (Person)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(Person to, int amount) {
        return account.transfer(to.account, amount);
    }

    // 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(BankAccount to, int amount) {
        return account.transfer(to, amount);
    }
}
