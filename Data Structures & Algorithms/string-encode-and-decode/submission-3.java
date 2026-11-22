class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s: strs){
           sb.append(s+"~");
        }
        System.out.print(sb);
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c != '~') sb.append(c);
            else{
                list.add(sb.toString());
                sb.setLength(0); 
            }
        }
        return list;
    }
}
