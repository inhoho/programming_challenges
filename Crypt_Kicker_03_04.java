/*
 * author : inhoho
 * 2015. 04. 19
 * programming challenges Crypt_Kicker2 solution.
 * No.20
 * ch3_04
 */
package ch3;

public class Crypt_Kicker_03_04 {
	public static void main(String[] args){
		String[] S=new String[3];
		S[0]="vtz ud xnm xugm itr pyy jttk gmv xt otgm xt xnm puk ti xnm fprxq";
		S[1]="xnm ceuob lrtzv ita hegfd tsmr xnm ypwq ktj";
		S[2]="frtjrpgguvj otvxmdxd prm iev prmvx xnmq";
		
		String key="the quick brown fox jumps over the lazy dog";
		char sa[][]=new char[3][];
		char[] ka=key.toCharArray();
		for(int i=0;i<3;i++){
			sa[i]=S[i].toCharArray();
		}
		
		for(int i=0;i<3;i++){
			for(int j=0;j<sa[i].length;j++){
				if(S[1].indexOf(sa[i][j])!=-1){
					sa[i][j]=ka[S[1].indexOf(sa[i][j])];
				}
			}
		}
		System.out.println(sa[0]);
		System.out.println(sa[1]);
		System.out.println(sa[2]);
		
	}

}
