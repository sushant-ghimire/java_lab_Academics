public class box {            //java code using parameters and overloding method
    double length;
    double breath;
    double height;
    box(){   
        length=1;
        breath=2;
        height=3;
    }
    box(double a,double b, double c){
        length=a;
        breath=b;
        height=c;
        
    }
    box(double l){
        length=height=breath=l;
    }

    public static void main(String[] args) {
        box A=new box();
        box B= new box(5,5,5);
        box C= new box (10);
        double vol;
        vol= A.length *A.breath *A.height; System.out.println(vol);
        vol= B.length *B.breath *B.height;  System.out.println(vol);
        vol= C.length *C.breath *C.height;  System.out.println(vol);
       

    }
}
