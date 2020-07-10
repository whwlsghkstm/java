package Ex03;

import java.util.*;

public class Sample03 {

	public static void main(String[] args) {
		
		/*
		//배열사용
		Report[] r=new Report[100];
		int count=0;
		r[0]=new Report();
		r[0].setRnum("01");
		r[0].setRname("홍길동");
		r[0].setKor(98);
		r[0].setEng(94);
		r[0].setMat(83);
		count++;
		
		r[1]=new Report();
		r[1].setRnum("02");
		r[1].setRname("심청이");
		r[1].setKor(87);
		r[1].setEng(34);
		r[1].setMat(69);
		count++;
		
		for(int i=0; i<count; i++) {
			r[i].printReport();
		}
		*/
		
		//ArrayList 사용 - 컬렉션
		ArrayList<Report> array=new ArrayList<Report>();
		
		Report r1=new Report();
		r1.setRnum("01");
		r1.setRname("홍길동");
		r1.setKor(87);
		r1.setEng(94);
		r1.setMat(59);
		array.add(r1);		//r1을 array에 add해준다.
		
		r1=new Report();
		r1.setRnum("02");
		r1.setRname("심청이");
		r1.setKor(89);
		r1.setEng(94);
		r1.setMat(87);
		array.add(r1);		//r1을 array에 add해준다.
		
		for(int i=0; i<array.size(); i++) {
			r1=array.get(i);
			r1.printReport();
		}
	}

}
