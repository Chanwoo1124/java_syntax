package 학교수업;//버튼 클릭 이벤트 처리

import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyLister implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        //callback method
        //프로그래머가 호출주는 메소드가 아님
        //시스템이 호출해주는 메소드임
        //근데 코딩은 내가 해줌
        //어떤 조건에 호출되는지 알아야 함
        //내가 무슨 코딩을 해줘야 될지 알 수 있다
        //따라서 콜백메소드라는 얘기를 들으면 어떤 상황에서 그 메소드가 호출되는지 조건부터 파악


        //버튼이 클릭되었을때 호출되는 메소드
        System.out.println("버튼이 클릭됨");

    }
}


class MyFrame extends JFrame{
    JButton jb;
    JTextField jf;

    public MyFrame() {
        super("판때기이름");
        jb = new JButton("나는버튼");
        jf = new JTextField(15);

        add(jf);
        this.add(jb);
        this.setSize(300,300);
        this.setLocation(200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        MyLister m = new MyLister();
        jb.addActionListener(m);

    }
}

public class EventHandlingEx {
    public static void main(StringEx[] args) {
        new MyFrame();
    }
}
