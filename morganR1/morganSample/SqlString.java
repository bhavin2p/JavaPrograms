package morganSample;

import java.util.ArrayList;
import java.util.List;

public class SqlString {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
        list.add("Test");
        list.add("Ramesh");
        
        String str = "select * from employee where name in ";
        
        System.out.println(str + " ("  +list+ ")");
        
        int len = str.length();
        String newString = "";
        String strFormat = str.concat("(");
        //String strFormat = str.append("(");
        
        for(int i=0; i<list.size(); i++){
        newString = newString.concat(list.get(i) +',') ;
        
        }
        
        
        String str1="";
        for(int i=0; i<newString.length(); i++) {
        	if(newString.charAt(i) == '(') {
        		str1 = (String) newString.subSequence(i, newString.length()-2);
        	}
        }
        String f1 = newString.concat(str1);
        
        
        String s1 = strFormat.concat(f1 + ")");

        System.out.println(s1);

	}

}
