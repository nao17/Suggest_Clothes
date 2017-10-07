

public class Test {
	 public static void main(String[] args){
	        int ran = (int)(Math.random()*15);
	        
	        if((ran == 7)&& (ran == 9) && (ran == 12)) {
	        System.out.println(ran + "はいかがでしょうか。");
	        
	        int scores[] = {1, 2, 3 ,4, 5, 6, 8, 10, 11, 12, 13,  14, 15};
	        int cold = (int)(Math.random()*scores.length);
	        int coldindex = cold - 1;
	        System.out.println("もしそれでは寒かったなら、" + scores[coldindex] + "を試してください。");
	       
	        
	        }else {

		        System.out.println(ran + "はいかがでしょうか。");
		        
		      //もし暑かった場合
		        int result[] = {0, 1, 2};
		        result[0] = 7;
		        result[1] = 9;
		        result[2] = 12;
		        
		        int hot = (int)(Math.random()*result.length);
		        int hotprint = hot - 1;
		        System.out.println("もしそれでは暑かったなら、" + result[hotprint] + "をお試しください。");
		       
		        
	        }
	        
	        for(int i = 0; i < 2; i++){
	        	int add = (int)(Math.random()*15);
	        	
	        	int addprint = add + i;
	            System.out.println( "他に、" + addprint + "という選択肢もあります。");
	        }
	        

	        
	       

}}
