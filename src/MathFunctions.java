public class MathFunctions
{
    public int add(int a, int b)
    {
        return a + b;
    }
    public float add(float a, float b)
    {
        return a + b;
    }
    public double add(double a, double b)
    {
        return a + b;
    }
    public int sub (int a, int b)
    {
        return a - b;
    }
    public float sub(float a, float b)
    {
        return a - b;
    }
    public double sub(double a, double b)
    {
        return a - b;
    }
    public int multiply(int a, int b)
    {
        return a * b;
    }
    public float multiply(float a, float b)
    {
        return  a * b;
    }
    public double multiply(double a, double b)
    {
        return a * b;
    }
    public int div(int a, int b)
    {
        return a/b;
    }
    public float div (float a, float b)
    {
        return a/b;
    }
    public double div(double a, double b)
    {
        return a/b;
    }
    public int abs(int a)
    {
        return Math.abs(a);
    }
    public float abs(float a)
    {
        return Math.abs(a);
    }
    public double abs(double a)
    {
        return Math.abs(a);
    }
    public int pow(int a)
    {
        return a * a;
    }
    public float pow(float a)
    {
        return a * a;
    }
    public double pow(double a)
    {
        return  a * a;
    }
    public static void main(String[] args)
    {

        MathFunctions mathFunctions = new MathFunctions();

        System.out.println(mathFunctions.add(2, 5));
        System.out.println(mathFunctions.sub(1.5, 3.5));
        System.out.println(mathFunctions.div(3, 4));
        System.out.println(mathFunctions.abs(-25));
        System.out.println(mathFunctions.pow(2));
    }
}
