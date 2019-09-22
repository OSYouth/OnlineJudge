import java.util.Scanner;
import java.util.HashMap;
public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		char[] line = in.nextLine().toCharArray();
		HashMap<Character,Integer> judge = new HashMap<Character,Integer>();
		char result = 'a';

		// int mark = 0;
		judge.put(line[0], 1);
		for(int i = 1; i < line.length; i++){
			// System.out.print(line[i]);
			boolean isABC = (line[i] >= 'A' && line[i] <= 'Z') || (line[i] >= 'a' && line[i] <= 'z');
			if(judge.containsKey(line[i])){
				judge.put(line[i], judge.get(line[i]) + 1);
			}else{
				judge.put(line[i], 1);
			}
			if(judge.get(line[i]) == 3 && isABC){
				result = line[i];
				// mark = i;
				break;
			}
			//another way but throws IOException with the test case:
// 			-)%*usBfvO01E#4qa}z^>-xK;*iXBuXLKT%vs7ChGk'%7PQ"pM-)@V*+EPg>?PNu)2C.|3WZlP!PMQ6v
// }o%]=WT|C6oXjatHG!teXQw[4|5.8gv%$AMM$\*@(\aI9lE6Y[b-&D<$yQJBXd8^uID1fYA*9heF~C:L
// -rTcw2QqD9b\GfeC7,B[3K/d!-T$q:ZmIN#X{,WB`-]*qS*+Mbq}IJ:!<&.t2&FSwSAvy}R]s'z0b|q`
// iLmeUe,R#oB=}ia8K%>Q.Y,;WWvN0W&v/YWA9d]8I2HMFMKtudo7}f\:^$id2c/=^sR[DPMw;,#|~4T&
// h37JsK=Zmi7F;WdF3&')c7w_wo0%F11m1xy\gbV)l(pXaHD3@j[x]m-?z'JB,%)g>gVYJgZj*l*"98]-
// \xU\k{]D+lL!!.uK1w;C(|t.wF[xT=n~;JfD6EOTa{a*!nyleb;M8k&P50xQM_j]\8]7?3Q'&mYl@0vj
// ^`)f=\i)w}P~.}X3<3wz1YBD\S=E(P3J4O`f}G[R?k]2;]~D*,-Fay/g+A8Ns$"jS!@nv~%Tu~6U{e1:
// |tl:m?i~+.)x_{RV0n8NM7}W2]Mk=~5KC=mLv3z@\@!Zm@OiJYY}4VPL!%1U0R6t2qI,oRHDaqbbvK]{
// /|H5@K4vdqUm7j>#Zm_HkTNF-qo]KZ+Z#y'6L!8^Xj&jex_V9>AE~2\T/)^k{bidWy@q5Yo<,y=*P+
		// 	if(isABC){
		// 		if(judge.containsKey(line[i])){
		// 			judge.put(line[i], judge.get(line[i]) + 1);
		// 		}else{
		// 			judge.put(line[i], 1);
		// 		}
		// 	}
		// 	if(judge.get(line[i]) == 3){
		// 		result = line[i];
		// 		// mark = i;
		// 		break;
		// 	}
		//IOException reason: if there is a char which is not an ABC, judge.get() wouldn't work
		//so we can put the judgeblock into the isABC judgeblock to solve this problem
		}
		System.out.println(result);
		// System.out.println(mark);
		// System.out.println(line[mark]);
	}
}