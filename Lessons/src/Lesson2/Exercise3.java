package Lesson2;

public class Exercise3 {
	public static void main(String []args) {
		String[] wordListOne = {"����������", "������������", "���������"};
		String[] wordListTwo = {"�������,", "�����,", "������,", "������,"};
		String[] wordListThree = {"��������� ������ ���� ��������."};
		
		int oneLenght = wordListOne.length;
		int twoLenght = wordListTwo.length;
		int threeLenght = wordListThree.length;
		
		int rand1 = (int) (Math.random() * oneLenght);
		int rand2 = (int) (Math.random() * twoLenght);
		int rand3 = (int) (Math.random() * threeLenght);
		
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		System.out.println("���, ��� ��� ����� - ��� " + phrase);
	}
}