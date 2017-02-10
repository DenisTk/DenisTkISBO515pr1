package pr1;


public class Hash {
    public static void main(String [] arg){
        MyHashTable t=new MyHashTable(100);
        t.put("table","стол");
        String r=t.get("table");
        System.out.println(r);


    }
}
