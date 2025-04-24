//*
package ex06.innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerEventMain {  // Outer class
	
	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스");  // 프레임(화면)
		Button  btn = new Button("Button-Start");
		
		//2.
		btn.addActionListener(new ActionListener() {  // 익명(무명) 클래스
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent  발생했습니다.22");
				System.out.println(e.getActionCommand());
				System.out.println(e.getSource());
				System.out.println();
			}
		});  
		
		//3.
		frame.addWindowListener(new WindowAdapter() {   // 익명(무명) 클래스
			@Override
			public void windowClosing(WindowEvent e) {  // 닫기
					System.exit(0);
			}
		});
		
		
		frame.add(btn);  // 프레임(윈도우)에 버튼 컴포넌트를 추가
		frame.setVisible(true);
		frame.setSize(500, 300);
		frame.setLocation(300	, 150);
	}
}
//*/


/*
package ex06.innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEventMain {  // Outer class
	
	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스");  // 프레임(화면)
		Button  btn = new Button("Button-Start");
		
		//2.
		btn.addActionListener(new ActionListener() {  
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent  발생했습니다.22");
				System.out.println(e.getActionCommand());
				System.out.println(e.getSource());
				System.out.println();
			}
		});  
		
		frame.add(btn);  // 프레임(윈도우)에 버튼 컴포넌트를 추가
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocation(300	, 150);
	}
}
//*/

/*
package ex06.innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEventMain {  // Outer class
	
	class EventHandler implements ActionListener {   // Inner class
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("ActionEvent  발생했습니다.");
			System.out.println(e.getActionCommand());
			System.out.println(e.getSource());
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스");  // 프레임(화면)
		Button  btn = new Button("Button-Start");
		
		//1.
		EventHandler handler = new InnerEventMain().new EventHandler();
		btn.addActionListener(handler);  // 버튼에 액션이벤트 추가
		
		frame.add(btn);  // 프레임(윈도우)에 버튼 컴포넌트를 추가
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocation(300	, 150);
	}
}
//*/