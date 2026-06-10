package opptest5;

public class Student {
    private String name;
    private int age;
    private int weihght;
    private int height;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setWeihght(int weihght){
        this.weihght = weihght;
    }
    public int getWeihght(){
        return weihght;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    public void show(){
        System.out.println("姓名："+name+"，年龄："+age+"，体重："+weihght+"，身高："+height);
    }
}
