public class stack{
    int[] stk=new int[10];   // making the array of stack as 10 
    int top;            
    stack(){               
        top=-1;             // considering the value of top of stack as-1 
    }
// to add the data in the stack
void push(int num){
    if(top ==9){
        System.out.println("the stack is full");
    }
    else
    stk[++top]= num;
}
// to pop the upper most data of the stack
void pop(){
        if(top<0){
            System.out.println("stack is empty");
        }
        else
        {
            System.out.println("the poped item is "+ stk[top--]);
        }
}
//to display the data of stack
void display(){
    if(top<0){
        System.out.println("stack is empty");
        }
    else{
        int i;
        for(i=0;i<=top;i++)
        System.out.println(" the value of stack "+ "["+ i + "]"+" is "+ stk[i]);
    }
}
 
public static void main(String[] args) {
    stack mystack=new stack();
    
    // change the number to make your input
    mystack.push(1);
    mystack.push(2);
    mystack.push(3);  
    mystack.push(4);   
    mystack.push(5); 
    mystack.push(6);
    mystack.push(7);
    mystack.push(8);
    mystack.push(9);
    mystack.push(10);
    
    //for poping the number
    mystack.pop();
    //for display 
    mystack.display();

}
}
