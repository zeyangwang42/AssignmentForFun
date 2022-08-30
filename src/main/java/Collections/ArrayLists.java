package Collections;

import java.util.ArrayList;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(Integer element : list2){
            list1.add(element);
        }
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int result=0;
        for(Integer e : list1){
            result+=e;
        }
        for(Integer e : list2){
            result+=e;
        }
        return result;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        /**for(int i=original.size()-1; i>=0; i--){
            if(original.get(i)==toRemove){
                original.remove(i);
            }
        }*/
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(Integer e : original){
            if(e!=toRemove){
                result.add(e);
            }
        }
        return result;
    }

    public boolean happyList(ArrayList<String> original) {
        if(original.isEmpty()){
            return true;
        }
        String pre = original.get(0);
        for(int i=1; i<original.size(); i++){
            if(!happy(original.get(i), pre)){
                return false;
            }
            pre = original.get(i);
        }
        return true;
    }
    private boolean happy(String s1, String s2){
        int[] list = new int[200];
        for(int i=0;i<s1.length();i++){
            list[s1.charAt(i)]++;
        }
        for(int i=0;i<s2.length();i++){
            if(list[s2.charAt(i)]!=0){
                return true;
            }

        }
        return false;
    }
}
