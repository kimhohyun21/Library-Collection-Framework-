/*
 * 컬렉션 프레임워크(Collection Framework)
 * 
 * - 배열의 문제점 
 * 		: 1) 저장할 수 있는 객체 수가 배열을 생성할 때 결정됨.
 * 		  	   불특정 다수의 개체를 저장하기는 문제가 됨.  
 * 		  2) 객체가 삭제했을 때 인덱스가 비게 됨
 * 			   객체를 저장하려면 어디가 비어 있는지 확인해야 함
 * 
 * - 컬렉션 프레임워크
 * 		: 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록 제공되는 컬렉션 라이브러리
 * 		     인터페이스를 통해서 정형화 된 방법으로 다양한 컬렉션 클래스 이용.
 * 		  => 컬렉션은 제네릭(Generic) 기법으로 구현됨
 * 		  => 제네릭 : 특정 타입만 다루지 않고, 여러 종류의 타입으로 변신 할 수 있도록
 * 			   클래스나 메소드를 일반화 시키는 방법
 * 			 - <E>, <K>, <V> : 타입 매개변수(요소 타입을 일반화 한 것)
 * 			 - 예) 제네릭 벡터 : Vector<E>
 * 							E에 특정 타입을 구체화 함
 * 							정수만 다루는 벡터 Vector<Integer>
 * 							문자열만 다루는 벡터 Vector<String>
 * 
 * - 컬렉션 클래스
 * 		List         
 * 		Set            
 * 		Map  ==> 인터페이스
 * 		
 * 		List => ArrayList, Vector, LikedList, Queue, StringList
 * 				=========  ======
 * 			 => 순서를 유지하고 있음.(각 데이터마다 Index를 가지고 있음.
 * 			 => 중복을 허용함.
 * 			 => 데이터 베이스 프로그램.
 * 		
 * 		Set => TreeSet, HashSet
 * 			=> 순서가 없다.
 * 			=> 중복을 허용하지 않음
 * 			=> XML 프로그램
 * 	
 * 		Map => HashTable, HashMap
 * 			=> 순서가 있음
 * 			=> 중복허용(Value), 중복허용하지 않음 (Key)
 * 			=> Key, Value를 동시에 저장
 * 			=> 클래스 관리, 우편번호....(String)
 * 			=> 빅데이터 (MapReduce)
 * 			        웹 ==>
 * 					a.jsp ==> b.jsp : id, pwd
 * 					b.jsp?id=aaa&pwd=1234
 * 					일반 프로그램 => 데이터를 전송할 때 메소드의 매개 변수
 * - ArrayList => 클래스만 저장이 가능(사용자 정의, 라이브러리)
 * 			   => add(객체값) 그냥 저장 (뒤에 붙는다)
 * 			   => add(index, 객체명) 원하는 위치에 저장
 * 				     쿼리문의 INSERT INTO~~~와 동일한 
 * 				     함수에서 insert()
 * 		       
 *             => remove(index) : 데이터 삭제
 *             	  DELETE ~~ FROM
 *             	  remove()
 *             
 *             => set(index) : 데이터 
 *                UPDATE ~~ SET
 *                Update() 
 *                
 *             => get(index) : 데이터 검색
 *             	  SELECT ~~ FROM
 *                find()
 *             
 *             => size() : 저장 개수
 *             	  SELECT COUNT(*) FROM
 *             	  count()
 * 	
 * 			   A a=new A();
 * 			   add(a)
 * 			   ======
 * 				 a =====> 100
 * 			   ======
 * 				0번째
 * 	
 * 			   A b=new A();
 * 		       add(b)
 * 			   ====== ======
 * 				 a      b
 * 			   ====== ======
 * 				 0번째       1번째 
 * 
 * 			   A c=new A();
 * 		       add(1, c)
 * 			   ====== ====== =======
 * 				 a      c		b
 * 			   ====== ====== =======
 * 				 0번째       1번째          2번째
 *
 *			   
 *			   remove(2)
 *			   ====== ======
 * 				 a      c		
 * 			   ====== ======
 * 				 0번째       1번째         
 */		

import java.util.*;

import javax.sound.sampled.LineListener;

public class MainClass {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		//Integer i=10;
		list.add(10); // Integer    ==> 0번째
		list.add(15.5); // Double   ==> 2번째
		list.add("이성계"); // String ==> 3번째
		list.add(1,'A');  //	    ==> 1번째
				
		System.out.println("저장개수 : "+list.size());
		
		int a=(int)list.get(0);
		double b=(double) list.get(2);
		String c=(String) list.get(3);
		char d=(char) list.get(1);
		
		System.out.println("Index : 0 =>"+a);
		System.out.println("Index : 1 =>"+d);
		System.out.println("Index : 2 =>"+b);
		System.out.println("Index : 3 =>"+c);
		System.out.println();
		
		ArrayList<String> list2=new ArrayList<>();
		//Object => String
		list2.add("이방원"); //0
		list2.add("하륜");  //1
		list2.add("민씨");
		list2.add("최씨");
		list2.add("인임");
		
		for(int i=0;i<list2.size();i++){
			String name=list2.get(i);
			System.out.println("index:"+(i)+"==>"+name);
		}
		
		System.out.println();
		
		for(String name : list2){
			System.out.println(name);
		}
	}
}
