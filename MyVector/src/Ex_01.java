
public class Ex_01 {

	public static void main(String[] args) {
		MyVector abc = new MyVector() ;
	}
}
	
	class MyVector{
		Object[] objArr;
		int capacity;
		int size;
		
		MyVector(int capacity) {
			this.capacity = capacity;
			objArr = new Object[capacity];
			}
		
		MyVector() {
			this(16);
			}
		
		//변수 size의 값을 반환하는 메서드 
		int size() {
			return size;
		}
		
		int capacity() {
			return capacity;
		}
		
		boolean isEmpty() {
			return size==0;
		}
		
		//객체배열 objArr에 객체를 추가하는 메서드
		void add(Object obj) {
			//1.objArr에 빈자리가 있는지 확인한다.
			
			
			
			//2. 빈자리가 있으면 추가. 
			//없으면 1.길이를2배늘린 새로운 객체배열을 생성 
			//2. 기존내용복사
			//3. 끝에 추가.
			//4. 참조변경 
		}
		
		
		
		

		}