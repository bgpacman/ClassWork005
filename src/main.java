import java.util.Scanner;

import com.sun.org.apache.xml.internal.security.utils.SignerOutputStream;

/*�������� ������, ����� ��������� �� ������ ������
 *  ������� ����� �� 1 �� n (������� �� �� ������������),
 *   ����������� ������ while.
*/

/*�������� ��������, ����� ������ ��� 
 * ����� N � M. ���������� ������ ��
 *  ��������� ����� � N �� ������ �.
*/
public class main {

	public static void task1() {
		int num = 1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while (num < n) {
			if (num % 2 != 0) {
				System.out.println(num);
			}

			num++;
		}

		sc.close();
	}

	public static void main(String[] args) {
//task1();
/*Scanner sc = new Scanner(System.in);
int m = sc.nextInt();
int n = sc.nextInt();
int s =1;
for(int i = 1; i <= m; i++){
    s *= n;
}
System.out.println(s);*/

		
		//�������� ��������, ����� ���� 
		//����������� �� ������� ����� � 
		//�� ������. ���� �� ���������� ��������, 
		//���������� ������ ����������� ������ 
		//������� 0.
	/*	Scanner sc = new Scanner(System.in);
		int chislo = sc.nextInt();
		int sum =0;
		while(chislo !=0){
			sum += chislo; 
			System.out.println(sum);
			chislo = sc.nextInt();
			
		}
		System.out.println(sum);*/
		
		/*
		 * ��������� ��������, ����� ������� ��
		 *  ���������
		 *  ������ ����� �� 1 ��
		 * 100, ����� �� ����� ��� �� 7, ��� �� 11,
		 *  ��� �������.
		 */

		for (int i = 1; i < 100; i++){
			if(i % 7 ==0 || i % 11 ==0){
				System.out.print(i + " ");
			}
			
		}
	}
}