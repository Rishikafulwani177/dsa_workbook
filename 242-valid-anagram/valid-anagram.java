class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Integer> maps= new HashMap<>();
        HashMap<Character,Integer> mapt= new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char m= s.charAt(i);
            char n= t.charAt(i);
            maps.put(m, maps.getOrDefault(m,0)+1);
            mapt.put(n, mapt.getOrDefault(n,0)+1);
        }

        if(maps.size()!=mapt.size()){
            return false;
        }

        for(Map.Entry<Character,Integer> entry: maps.entrySet()){
            char o= entry.getKey();
            int cs= entry.getValue();
            int ct= mapt.getOrDefault(o,0);
            if(cs!=ct){
                return false;
            }
        }

        return true;
    }
}