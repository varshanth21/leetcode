class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();
        int m = part.length();

        for(char c : s.toCharArray()){
            sb.append(c);
        
        if(sb.length()>=m){
            String lastpart = sb.substring(sb.length()-m);
        
        if(lastpart.equals(part)){
            sb.delete(sb.length()-m,sb.length());
        }
    }
}
        return sb.toString();
    }
}