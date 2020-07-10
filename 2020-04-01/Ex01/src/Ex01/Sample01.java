package Ex01;

import Hyundai.*;
import Hankook.*;
import Kumho.*;

public class Sample01 {		// public - 다른 패키지에서의 사용을 허가

	public static void main(String[] args) {
		
		SnowTire st = new SnowTire();
		Hankook.Tire t = new Hankook.Tire();
		Kumho.Tire t1 = new Kumho.Tire();
		BigWidthTire bt = new BigWidthTire();
		Engine e = new Engine();

	}

}
