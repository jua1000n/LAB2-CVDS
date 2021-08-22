package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("");
        System.out.print( "Hello World! \nHello ");
        for(String i: args){
                System.out.print(i+" ");
        }
        System.out.println("");
    }
}
