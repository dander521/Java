package JavaBasic.Chapter2;

public class Dog {
    /* 繁殖 */
    String breed;
    /* 年龄 */
    int age;
    /* 颜色 */
    String color;

    /* 咬 */
    void barking() {

    }

    /* 饥饿 */
    void hungry() {

    }

    /* 睡觉 */
    void sleeping() {

    }

    public Dog() {

    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public Dog(String name) {
        System.out.println("小狗的名字是" + name);
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Tom");

        myDog.setAge(10);
        myDog.getAge();
        System.out.println("小狗的狗龄是" + myDog.age);
    }


}
