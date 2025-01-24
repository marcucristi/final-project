public class User {
    private String name;
    private String address;
    private int age;
    private BalanceLogic balance;

    public User(String name, String address, int age, double initialDeposit) {
        if (age < 18) {
            throw new IllegalArgumentException("Trebuia sa ai minim 18 ani.");
        }

        if (initialDeposit < 10) {
            throw new IllegalArgumentException("Depositul minimal e de 10 lei.");
        }

        this.name = name;
        this.address = address;
        this.age = age;
        this.balance = new BalanceLogic(initialDeposit);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public double getBalance() {
        return balance.getBalance();
    }

    public void displayUserInfo() {
        System.out.println("Profil:");
        System.out.println("Nume: " + name);
        System.out.println("Adresa: " + address);
        System.out.println("Varsta: " + age);
        System.out.println("Balanta: " + balance.getBalance());
    }
}



