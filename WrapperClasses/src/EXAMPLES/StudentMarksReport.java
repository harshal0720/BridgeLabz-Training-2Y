package EXAMPLES;

import java.util.ArrayList;
public class StudentMarksReport{
    public static void main(String[] args){
        Object[] inputs={"85",95,Integer.valueOf(88),"null","abc",null};
        ArrayList<Integer> marks=new ArrayList<>();
        for(Object o:inputs){
            try{
                if(o==null) continue;
                if(o instanceof String){
                    String s=(String)o;
                    if(s.equalsIgnoreCase("null")) continue;
                    marks.add(Integer.parseInt(s));
                }else if(o instanceof Integer){
                    marks.add((Integer)o);
                }
            }catch(Exception e){}
        }
        int sum=0;
        for(int m:marks) sum+=m;
        double avg=marks.isEmpty()?0:(double)sum/marks.size();
        System.out.println("Average = "+avg);
    }
}