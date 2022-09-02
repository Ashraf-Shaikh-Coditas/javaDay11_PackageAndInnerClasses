package Week3.Day11;
public class TestGC {
    public void finalize() {
        System.out.println("Garbage Collector Called ...");
    }
    public static void main(String[] args) {
        TestGC t1 = new TestGC();
        TestGC t2 = new TestGC();

        new TestGC();

        t1 = null;
        t2 = null;

        TestGC t3 = new TestGC();
        TestGC t4 = new TestGC();


        t3 = t4;



        System.gc();
    }
}
