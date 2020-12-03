public class Test {
    static int c;
    int a;
    Test(int i) { a = i; }
    public void swap(Test a) {
        int c=this.a;
        this.a=a.a;
        a.a=c;
    }
    public void output()
    {
        System.out.println("ЧИСЛО " + a);
    }
    static class Inner {
        Inner(){
            c=4;
        }

        static void solve(Test a){
            System.out.println(Math.sqrt(a.a));
        }
    }
}
