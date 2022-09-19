package _12Packages._3CreatingPackage;

// i dont need to import new package cause the NewPackage is in same dir

public class UsingAnotherPackage {
    public static void main(String[] args) {
        System.out.println("I m using my own package");
        NewPackage np = new NewPackage();
        np.state();// yaah its run
    }
}
