public class ProgramFlow1
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
        System.out.println(a == 5 ? "SUCCESS" : "FAILURE");
        
        if (a == 5) {
            System.out.println("SUCCESS");
        }
        else {
            System.out.println("FAILURE");
        }
        if (b == 2) {
            System.out.println("SUCCESS");
        }
        else {
            System.out.println("FAILURE");
        }
        if (c != 1 ) {
            System.out.println("SUCCESS");
        }
        else {
            System.out.println("FAILURE");
        }
        if (d == -8 && a == 4) {
            System.out.println("SUCCESS");
        }
        else {
            System.out.println("FAILURE");
        }
    }
    
    
    public static void main(String[] args)
    {        
        ProgramFlow1 pf = new ProgramFlow1();
        pf.run();
    }
}


