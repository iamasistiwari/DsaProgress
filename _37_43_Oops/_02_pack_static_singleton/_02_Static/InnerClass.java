package DsaProgress._37_43_Oops._02_pack_static_singleton._02_Static;



//                 FOURTH CLASS


public class InnerClass {
    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }

//        @Override
//        public String toString() {
//            return name;
//        }
    }

    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

        System.out.println(a);

//        System.out.println(a.name);
//        System.out.println(b.name);
    }
}

//static class A {
//
//}
