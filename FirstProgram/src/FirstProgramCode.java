public class FirstProgramCode {
    public static void main(String[] args) {
        Firework.chorus();
        double num = Firework.doubleMath(5.3);
        System.out.println(num);
        double triple = trip(312);
        System.out.println(triple);


    }
    public static double trip(double num2){
        return num2 * 3;
    }
}
