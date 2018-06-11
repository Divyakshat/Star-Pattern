/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starpattern;
import java.util.*;
/**
 *
 * @author divyanshu
 */
public class StarPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        
        int i,j,k,l;
        int ch,m2;
        Scanner S= new Scanner(System.in);
      
        
        System.out.println("Enter the choices as follows:");
        System.out.println("1. to print left-aligned right angle star(*) trinagular pattern");
        System.out.println("2. to print right-aligned right angle star(*) triangular pattern");
        System.out.println("3. to print plus(+)-type star(*) triangular pattern");
        System.out.println("4. to print normal star(*) triangular pattern");
        System.out.println("5. to print square/rectangular type star(*) pattern");
        
        System.out.println("Enter any one of above choices-");
        ch=S.nextInt();
        
        if(ch>5||ch<1)
        {
            System.out.println("Your choice is INVALID!");
        }   
        else {
            System.out.println("Enter the no. of rows-");
            m2=S.nextInt();
            if(ch==1)
        {
             //left-aligned right angle star* trinagular pattern
                for(i=1;i<=m2;i++)
                { 
                    for(j=1;j<=i;j++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                } 
        }    
        else if(ch==2)//right-aligned right angle star* trinagular pattern
        {       for(i=1;i<=m2;i++)
                { 
                    for(j=m2;j>=i;j--)
                    {
                        System.out.print(" ");
                    }    for(k=1;k<=i;k++)
                        {
                            System.out.print("*");
                        }
                    System.out.println();
                }
        }
            
        else if(ch==3) //plus(+) type star* trinagular pattern
        {        for(i=1;i<=m2;i++)//upper part
                {                            
                    for(j=1;j<=m2;j++)//space square pattern
                    {
                        System.out.print(" ");
                        
                    }
                    for(k=1;k<=1;k++)//star pattern
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                 }//end for i
      
                 for(l=1;l<=m2;l++)//* row
                 { 
                    System.out.print(" *");
                 }
                 System.out.println();
          
          for(i=1;i<=m2;i++)//lower part
          {  
              for(j=1;j<=m2;j++)
              {  
                  System.out.print(" ");
               }
              for(k=1;k<=1;k++)//star pattern
              {
                System.out.print("*");
              }
                System.out.println();
          }//end for i
        }
          else if(ch==4)
          { //normal star* trinagular pattern
            for(i=1;i<=m2;i++)
            { 
                    for(j=(m2-1);j>=i;j--)
                    {
                       System.out.print(" ");
                    } 
                    for(k=1;k<=i;k++)
                    {
                        System.out.print("*");
                    } 
                    for(l=2;l<=i;l++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
            }  
          }  
            else
           {//square type star* pattern
              for(i=1;i<=m2;i++)
                { 
                    for(j=1;j<=m2;j++)
                    {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
            }
        }
       
       
        
    }
}   
    

