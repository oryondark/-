/* hj Kim */
// N == 11 --> 11�Ҽ� ���
// N == 30 --> 2,3,5 ���μ� �� ���
// example 
//�Ҽ� : 11
//���� �� �� : 2
//���� �� �� : 3
//���� �� �� : 5
public class primeFactorization {
//���μ� ���� ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 30;
		int i = 2;
		int k = 0; // ���ʷ� ���ص� ������ k �� ī������ ���� �ʾ��� ���, �̴� �Ҽ���. 
		
		
		while(true) {
			
			if( N % i == 0) {
				//System.out.printf("�Է� �� : %d\n", N);
				if( N == i ) {
					if( k == 0)
						System.out.printf("�Ҽ� : %d\n", i);
					else
						System.out.printf("���� �� �� : %d\n", i);
					break;
					
				}
				
				k++;
				N = N / i;
				System.out.printf("���� �� �� : %d\n", i);
				
			} else {
				i++;
				
			}
					
		}
		
	}

}
