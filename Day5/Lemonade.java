class Solution {
    public boolean lemonadeChange(int[] bills) {
        int c5= 0 ;
        int c10 = 0 ;
        int c20 = 0 ;
        for(int i = 0 ; i< bills.length ;i++){
            if(bills[i]==5){
                c5++;
            }
            if(bills[i]==10){
                c10++;
                if(c5>0){
                    c5--;
                }else{
                    return false ;
                }
            }
            if(bills[i]==20){
                c20++;
                if((c10>0 && c5>0) || c5>=3){
                    if(c10==0){
                        c5--;
                        c5--;
                        c5--;
                    }else{
                        c5--;
                        c10--;
                    }
                }else{
                    return false ;
                }
                
            }
            
        }
        return true ;
    }
}