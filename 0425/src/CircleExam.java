import java.util.Scanner;

public class CircleExam {
	public static void main(String args[]) {
		 Scanner scan = new Scanner(System.in);
		 System.out.print("������ �� >>");
		 // �Է¹��� ������ �� radius ������ �ֱ�
		 //  Circle Ŭ������ ���� ��ü c����
		 System.out.println("������ "+ radius + "�� ���� ���̴� " + c.Area() + "�̴�.");  // ��¹�
	}
}

class Circle{
	int radius;
	 // ������(radius) �� �ʱ�ȭ
	
	public Circle(int radius) {
		this.radius = radius;
		
		return radius*radius*3.14;
		// ���� ���� return (���ǳ��� = ������*������*3.14)
	}
}