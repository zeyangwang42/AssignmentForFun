package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {

        return string2+string1;
    }

    public char getChar(String string, int index) {

        return string.charAt(index);
    }

    public String iCantSee(String string) {
        String result = "";
        for(int i=0;i<string.length();i++){
            result+=" ";
        }
        return result;
    }

    public String loudAndClear(String string) {
        String result="";
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)>='a'&&string.charAt(i)<='z'){
                result=result+(char)(string.charAt(i)-32);
            }else{
                result=result+string.charAt(i);
            }
        }
        return result;
    }

    public String reverseCase(String string) {
        String result="";
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)>='a'&&string.charAt(i)<='z'){
                result=result+(char)(string.charAt(i)-32);
            }else if(string.charAt(i)>='A'&&string.charAt(i)<='Z'){
                result=result+(char)(string.charAt(i)+32);
            }else{
                result=result+string.charAt(i);
            }
        }
        return result;
    }

    public String oneAtATime(String string1, String string2) {
        int index1=0;
        int index2=0;
        String result ="";
        while(index1<string1.length()||index2<string2.length()){

            if(index1<string1.length()){
                result+=string1.charAt(index1);
                index1++;
            }
            if(index2<string2.length()){
                result+=string2.charAt(index2);
                index2++;
            }


        }
        return result;

    }
}
