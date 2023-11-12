 if(str1.equals(str2)) return false;
       StringBuffer s=new StringBuffer(str1);
       if((s.reverse().toString()).equals(str2)) return false;
       str1=str1+str1;
       return str1.contains(str2);
