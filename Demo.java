public class Demo{

public static void main(){
int a=10;
System.out.println("Hello Worl");
if(test(a)){
System.out.println("value"+a);
}
else{
System.out.println("error");

}
}

public static boolean test(int a){
if(a!=null){
return true
}
else{
return false
}
}
}