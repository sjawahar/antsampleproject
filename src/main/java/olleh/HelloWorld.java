package olleh;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld{
    List<Integer> mystack;
    HelloWorld(){
        mystack = new ArrayList<Integer>();
    }
    public void push(Integer n){
        if(mystack.size() >= 10)
            mystack.clear();
        mystack.add(n);
    }
    public  Integer top(){
        return mystack.get(0);
    }
    public Integer pop(){
        Integer ret = mystack.get(0);
        mystack.remove(0);
        return ret;
    }
    public int getCount(){

        return mystack.size();
    }
    public static void main(String[] args){
        System.out.println("Hello World");
    }

}