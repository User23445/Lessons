package Lesson2;

public class Exercise2 {
	public static void main(String []args) {
		
	int beerNum = 99;
	String word = "������� (�������) ";

	while (beerNum > 0) {
	System.out.println(beerNum + " " + word + "���� �� �����");
	System.out.println(beerNum + " " + word + "����");
	System.out.println("������ ����, ����� �� �����");
	beerNum = beerNum - 1;
	
	if (beerNum == 1) {
	word = "������� ";
				}
	if (beerNum == 0) {
	word = "�������";
			}
		System.out.println("��� ������� ���� �� �����");
		}
	}
}