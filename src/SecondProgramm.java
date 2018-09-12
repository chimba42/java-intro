public class SecondProgramm {
    public static void main(String[] args) {
        Person.doSomethingElse();

        Person pl = new Person("Dima", "Surname", 58);


        Person p2 = new Person("Viktor", "Tsoy");

        final Person p3 = p2;

        p2.secondName = "Popov";

        System.out.println(p3.secondName);









        /* String strl = "str";
        String str2 = "str";

       {
                if (strl == str2)
                {
                    System.out.println("true");
                }
                else
                {
                System.out.println("false");
                }
        }*/

    }}