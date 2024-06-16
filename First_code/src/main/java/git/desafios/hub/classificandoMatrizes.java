package git.desafios.hub;

import java.util.*;


public class classificandoMatrizes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i, aux;
        int N = input.nextInt();
        int [] nums = new int[N];

        for (int j = 0; j < N; j++) {
            nums[j]=input.nextInt();
            
            
        }

        for (i = 0; i < N; i++) {

            if (nums[i] !=0){
                for (int j = (i+1); j < N ; j++) {
                    if (nums[j]%2 == 0){
                        aux = nums[i];
                        nums[i] =  nums[j];
                        nums[j]= aux;
                        j=N;
                    }
                    
                }
            }
            
        }
        for (i = 0; i < N ; i++) {
            System.out.println(nums[i]);
        }

    }
}
