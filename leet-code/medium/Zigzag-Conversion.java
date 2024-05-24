class Solution {
    public String convert(String s, int numRows) {
        Boolean flag  = false ;
        ArrayList<ArrayList<Character>> arr = new ArrayList<>();
        int ctr = 0;
        for(int i=0;i<numRows;i++){
            ArrayList<Character> a =new ArrayList<>();
            arr.add(a);
        }
        while(ctr<s.length()){
            int ii=0;
            if(flag== true)
                ii=1;
            for(;ii<numRows;ii++){
                if(ctr>=s.length())
                    break;
                arr.get(ii).add(s.charAt(ctr));
                ctr++;
            }
            if(numRows>1){
                for(int i=numRows-2;i>=0;i--){
                    if(ctr>=s.length())
                        break;
                    arr.get(i).add(s.charAt(ctr));
                    ctr++;
                }
                flag = true;}
        }
        String ans = "";
        for(int i=0;i<numRows;i++){
            ArrayList<Character > a=arr.get(i);
            for(int j=0;j<a.size();j++){
                ans+=arr.get(i).get(j);
            }
        }
        return ans;
    }
}