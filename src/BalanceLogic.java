import java.sql.SQLOutput;

public class BalanceLogic {
    private double balance = 0.0;

    public BalanceLogic (double balance) {
        this.balance = balance;
    }

    //getter
    public double getBalance() {
        return balance;
    }

    //setter
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //metoda de a adauga bani
    public void addBalance(double amount) {
        if (amount < 10) {
            System.out.println("Suma de depunere trebuie sa fie mai mare sau egal cu 10");
        } else {
            this.balance += amount;
            System.out.println("Suma a fost adaugata. Balance actual: " + this.balance);
        }
    }

    //metoda de withdraw
    public void withdrawBalance(double amountscoatere) {
        if (amountscoatere < 10) {
            System.out.println("Nu ai destui bani in cont pentru a face withdraw");
            System.out.println("Suma minima trebuie sa fie cel putin 10");
        } else if (amountscoatere < this.balance) {
            System.out.println("Suma de extragere nu poate fi mai mare decat ai in cont" + " Fonduri insuficiente!!!");
        } else {
            this.balance -= amountscoatere;
            System.out.println("Suma " + amountscoatere + " a fost cu succes extrasa");
            System.out.println("Fonduri pe cont dupa extragere " + this.balance);
        }
    }

}
