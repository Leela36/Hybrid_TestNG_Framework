package HybridTestNGFramework.Datadrivenframework;


import java.util.Scanner;
public class App 
{
    public static void main( String[] args ) {
String s="leela";
StringBuilder sb=new StringBuilder(s);
sb.setCharAt(0, s.charAt(1));
System.out.print(sb);
}}