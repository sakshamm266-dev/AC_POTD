public class Solution {
    public int calPoints(String[] operations) {
       int len=operations.length,index=0;
       int record[]=new int[len];
       for(int i=0;i<len;i++){
        String op=operations[i];
        if(op.equals("C")){
            index-=1;
        }
        else if(op.equals("D")){
            record[index]=2*record[index-1];
            index+=1;
            }
        else if(op.equals("+")){
            record[index]=record[index-1]+record[index-2];
            index+=1;
            }else{
            record[index]=Integer.parseInt(op);
            index+=1;
            }
             }
             int sum=0;
             for(int i=0;i<index;i++){
                sum+=record[i];
             }
             return(sum);
       } 
    }
