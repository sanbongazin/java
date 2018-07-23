import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class MyP2dTest {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
			System.out.println("空白を開けて入力:");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			int n = 0;
//			double [][] data = new double [2][100];
//			while(n>=0) {
//			String input_check = br.readLine();
//			if(input_check.isEmpty()) {
//				break;
//			}
//			String [] input = input_check.split(" ");
//			data[0][n] = Double.parseDouble(input[0]);
//			data[1][n] = Double.parseDouble(input[1]);
//			n++;
//
//			}
//			int i = 0;
//			for (double[] ds : data) {
//				MyP2d p = new MyP2d(data[0][i],data[1][i]);
//				p.showPoint();
//				i++;
//			}

			String str;
			String [] strArray;
			double x,y,z;
			List<MyP2d> pList = new ArrayList<MyP2d>();
			for(;;) {
				str = br.readLine();
				if(str.isEmpty()) {
					break;
				}
				strArray = str.split(" ");

				x = Double.parseDouble(strArray[0]);
				y = Double.parseDouble(strArray[1]);
				z = Double.parseDouble(strArray[2]);
				pList.add(new MyP2d(x, y, z));

				}

				for (MyP2d myP2d : pList) {
					myP2d.showPoint();
				}


		}


}
