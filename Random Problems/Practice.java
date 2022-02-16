class Practice {
    static int sum(int a , int b)
    {
        //code here
        
        
        for(int i=a; true; i++){
            a++;
            if(a==b){
                break;
            } 
        }
        
    //   while(b!=0){
    //       a++;
    //       b--;
    //   }
return a; 
    }


    public static char solve(String s, int n, int r)
    {
        //code here
         String res="";
         char a ='0';
        
        // for(int i=0;i< n ;i++){

        //       res +=s;
        // }

        // a = res.charAt(n);
        // return a;

        res = s.repeat(r);

        System.out.println(res);
        System.out.println(a);


        if(n > res.length()){
            a='1';
        }
        else {

        System.out.println(res);
        a = res.charAt(n);    
    }

        return a;
    }





public static void main(String[] args) {
    System.out.println(sum(10,20));
    String s="0111";
    int n=37963,r=16;



    //  0111 16 37963

    System.out.println(solve(s,n,r));

}

}