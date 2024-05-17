public class zigzag {
        public String convert(String s, int numRows) {
            if(s == null || s.length() <= 2 || numRows<2 || s.length()<=numRows){
                return s;
            }
            StringBuilder[] sbs=new StringBuilder[numRows];
            int indx=-1,n=s.length();
            boolean isUp=false;
            for(int i=0;i<n;i++){
                indx= isUp? indx-1: indx+1;
                if(sbs[indx]==null)
                    sbs[indx]=new StringBuilder(s.charAt(i)+"");
                else
                    sbs[indx].append(s.charAt(i));
                if(isUp && indx==0){
                    isUp=false;
                }else if(!isUp && indx==numRows-1){
                    isUp=true;
                }
            }
            StringBuilder sb=new StringBuilder();
            for (StringBuilder stringBuilder : sbs) {
                sb.append(stringBuilder);
            }
            return sb.toString();
        }
    }

