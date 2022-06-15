public class Unit10MCQ {
    public static void main(String[] args) {
        System.out.println(f(6));
    }

    public static int f(int x)

    {

        if (x <= 0)

        {

            return 0;

        }

        else

        {

            return g(x - 1);

        }

    }

    public static int g(int x)

    {

        if (x <= 0)

        {

            return 0;

        }

        else

        {

            return (f(x - 1) + x);

        }

    }
}
