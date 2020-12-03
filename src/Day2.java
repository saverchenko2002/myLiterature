public class Day2 {
     /*Day1 day1 = new Day1(4);
        System.out.println(day1.getClass());
        finalizeCheck fin = new finalizeCheck(1L);
        for (long i = 0; i<10000L; i++)
            fin.generator(i);

        int nums[] = {600,66,6};
        int sum=0;
        for (int x:nums)
            sum+=x;
        System.out.println(sum);

        double c = 2.3;
        System.out.println(Double.toString(c));
        int a = 123;
        System.out.println(Integer.hashCode(a));
        int b = 123;
        System.out.println(true);
        a=124;
        System.out.println(b);
        Integer a  = 123;
        Integer b = 123;
        System.out.println(a==b);

        String ch = new String("чухан");
        ch.intern();
        System.out.println(ch.intern());
        String ch1 ="чухан";
        System.out.println(ch==ch1);

        int val = - 7;
        int absVal = val<0? -val:val;
        System.out.println(absVal);
        finalizeCheck a = new finalizeCheck(23);
        for (long i = 0; i<10000000L; i++)
            a.generator(i);
        Test.Inner.solve(new Test(4));
        Test2 t2;
        Test2Extended t3 = new Test2Extended(3);
        t2=t3;
        System.out.println(t2.a);
        Sup[] supRef =  new Sup[3];
        supRef[1]=new Sup1();
        supRef[2]=new Sup2();
        Sup1 sup1=new Sup1();
        supRef[2].who();
        supRef[1].who();*/
}
abstract class Sup{
    abstract void who();
}
class Sup1 extends Sup{
    void who(){
        System.out.println("переопределил бро 1 ");
    }
}
class Sup2 extends Sup{
    void who(){
        System.out.println("переопределил бро 2");
    }
}