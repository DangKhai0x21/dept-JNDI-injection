public class RuntimeDemo {

    public static void main(String[] args) {
        try {

            // print a message
            System.out.println("Executing calc.exe");

            // create a process and execute notepad.exe
            Process process = Runtime.getRuntime().exec("gnome-calculator");

            // print another message
            System.out.println("Calc should now open.");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}