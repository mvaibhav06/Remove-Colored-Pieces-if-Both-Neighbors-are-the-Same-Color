class Winner {
    public boolean winnerOfGame(String s) {
        int A = 0;
        int B = 0;
        for(int i=1; i<s.length()-1; i++){
            char ch = s.charAt(i);
            char a = s.charAt(i-1);
            char b = s.charAt(i+1);

            if(ch=='A' && ch==a && ch==b){
                A++;
            }
            if(ch=='B' && ch==a && ch==b){
                B++;
            }
        }
        if(A > B){
            return true;
        }
        return false;
    }
}
