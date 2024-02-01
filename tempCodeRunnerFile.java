while(Math.round(mid*mid) != x){
    
                if(mid*mid < x ){
                    low=mid;
                    System.out.println(low);

                    mid=(low+high) /2;
                    System.out.println(mid);
                }else if( mid* mid > x ){
                    high = mid;
                    System.out.println(high);

                    mid= (low+high) /2;
                    System.out.println(mid);
                }
            }