package oops;

class Addvinay {
    int x;
    int y;
    int z;
    int v;


    void  insert(int a,int b){
        x=a;
        y=b;
    }
    void  insert(int a,int b,int c){
        x=a;
        y=b;
        v=c;
    }

    void display(){
        System.out.println();
    }
    void add(){
        z=x+y;
        System.out.println("here is the Output " + z);
    }
    void add1(){
        z=x+y+v;
        System.out.println("here is the Output " + z);
    }
}
class Addition{
    public static void main(String[] args) {
        Addvinay v = new Addvinay();
        v.insert(3,5,8);
        v.insert(2,5);
        v.display();
        v.add();
        v.add1();

    }

}