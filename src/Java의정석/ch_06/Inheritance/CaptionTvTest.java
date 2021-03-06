package Java의정석.ch_06.Inheritance;

class TV{
    boolean power; // 전원상태(on/off)
    int channel; //채널

    void power() {power = !power;}
    void channelUP() {++channel;}
    void channelDown() {--channel;}
}

class CaptionTv extends TV{
    boolean caption; // 캡션상태(on/off)
    void displayCaption(String text){
        if(caption){ // 캡션 상태가 on(true)일 때만 text를 보여준다.
            System.out.println(text);
        }
    }
}

public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10; //조상 클래스로브터 상속받은 멤버
        ctv.channelUP(); //조상 클래스로부터 상속받은 멤버
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello, world");
        ctv.caption = true; // 캡션(자막) 기능을 켠다
        ctv.displayCaption("Hello, world");
    }
}
