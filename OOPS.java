public class OOPS {
    int id=20;
    String name;
    public OOPS()
    {

    }
    OOPS(int id,String name)
    {
        this.id =id;
        this.name=name;
    }
    void study()
    {
        System.out.println("Student is playing!!!!"+id+"\t"+name+"\t");

    }
    public static void main(String[] args)
    {
        OOPS op = new OOPS(12,"Aakash");
        System.out.println(op.id);
        op.study();
    }
}
