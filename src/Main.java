//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            User user = new User("Ion Verejan", "Unde e bine", 22, 50.0);
            user.displayUserInfo();
        } catch (IllegalArgumentException e) {
            System.out.println("Atentie: " + e.getMessage());
        }
    }
}