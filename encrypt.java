class yousif   {

public static StringBuffer encrypt(String x, int s)
{
    StringBuffer result=new StringBuffer();


    for (int i=0;i<x.length();i++)
    {
        if(Character.isUpperCase(x.charAt(i)))
        {


            char ch=(char)(((int)x.charAt(i)+s-65)%26+65);
            result.append(ch);
        }
        else{
              char ch=(char)(((int)x.charAt(i)+s-97)%26+97);
            result.append(ch);
        }
    }
    return result;
}
public static void main(String[]args)
{
    String x="ATTACKATONCE";
    int s=4;
    System.out.println("x is :"+x);
    System.out.println("shift is :"+s);
    System.out.println("cipher is :"+encrypt(x, s));
}
}