public class finalizeCheck {
    long i;
    finalizeCheck(long x){
        i=x;
    }

    void generator ( long c) {
        finalizeCheck fin = new finalizeCheck(c);
    }

    /* boolean comp() {
        return (fan2 == fan);
    } */
    @Override
    protected void finalize(){
        System.out.println(i+" deleted");
    }

}
