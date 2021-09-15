package challenge_3;

import java.util.Scanner;

public class Challenge_3 {
    
       static int sumax=0;
       static int sumay=0;
       static int sumaxy=0;
       static int sumax2=0;
       static double B1=0; 
       static double B0=0;
       static double yr=0;     
      
       
   public static void SRL(){
       
       Scanner scanner = new Scanner(System.in);
       
       int []x={23,26,30,34,43,48,52,57,58};
       int []y={651,762,856,1063,1190,1298,1421,1440,1518};
       int []xy={14973,19812,25680,36142,51170,62304,73892,82080,88044};
       int []x2={529,676,900,1156,1849,2304,2704,3249,3364};
       int n=9;
       int X=0;
       
        for (int i=0; i<n; i++){
            sumax=sumax+x[i];
            sumay=sumay+y[i];
            sumaxy=sumaxy+xy[i];
            sumax2=sumax2+x2[i];
        }
        
          B1=(n*(sumaxy)-(sumax)*(sumay))/(n*(sumax2)-(sumax)*(sumax)); 
          B0=((sumax2)*(sumay)-(sumax)*(sumaxy))/(n*(sumax2)-(sumax)*(sumax));
          System.out.print(" -Cual seria el valor que usaria en la prediccion?  ");
          X = scanner.nextInt();
          yr=((B0)+(B1)*(X));
          System.out.println();
             
}
    public static void main(String[] args) {
        SRL();
        
       System.out.println(" -Sumatoria de x:   "+sumax);
       System.out.println(" -Sumatoria de y:   "+sumay);
       System.out.println(" -Sumatoria de xy:  "+sumaxy);
       System.out.println(" -Sumatoria de x²:  "+sumax2);
       System.out.println(" -B1:               "+B1);
       System.out.println(" -B0:               "+B0);
       System.out.println(" -Regression Equation:  "+yr);
     
}
}
