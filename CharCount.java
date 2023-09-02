public class CharCount {
    public static void main(String[] args) {
        String str=args[0];
        int counter[]=new int[256];
        for(int i=0;i<str.length();i++){
            counter[str.charAt(i)]++;
        }
        char[] ch=new char[str.length()];
        for(int i=0;i<str.length();i++){
           ch[i]=str.charAt(i);
           int find=0;
           for(int j=0;j<=i;j++){
            if(str.charAt(i)==ch[j])
                find++;
           }
           if(find==1){
            System.out.println("Number of occurrence of "+str.charAt(i)+" is: "+counter[str.charAt(i)]);
           }
        }
    }
}
