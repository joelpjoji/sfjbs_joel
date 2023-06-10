package com.assignment.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Reverse reverse = new Reverse();
        System.out.println( Reverse.rev("Hello World!") );
        Pallindrome pal = new Pallindrome();
        System.out.println( Pallindrome.Pal("malayalam") );
        Append plus = new Append();
        System.out.println( Append.plus("Hell o", "World!") );

    }
}
