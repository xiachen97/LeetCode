package D1;

public class StringBuilderBuffer {
    public static void main(String[] args){
        String s1 = "aaa";
        concat1(s1);
        System.out.println("String: " + s1);//String: aaa

        StringBuilder s2=new StringBuilder("bbb");
        concat2(s2);
        System.out.println("String: " + s2);//String: aaa

        s2.reverse();
        System.out.println("reverse s2: " + s2);//reverse s2: tsetbbb

        StringBuilder s3=new StringBuilder("bbb");
        concat2(s3);
        System.out.println("String: " + s3);//reverse s2: tsetbbb

        s3.reverse();
        System.out.println("reverse s3: " + s3);//reverse s3: tsetbbb

    }
    public static void concat1(String s1)
    {
        s1 = s1 + "test";
    }
    public static void concat2(StringBuilder s2){
        s2.append("test");
    }

    public static void concat3(StringBuffer s3){
        s3.append("test");
    }

}
