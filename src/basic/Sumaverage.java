package basic;

public class Sumaverage {

  float a,b,c,d,e,sum,average;

  public Sumaverage(float p,float q,float r,float s,float t)
  {
      a=p;
      b=q;
      c=r;
      d=s;
      e=t;

  }

  public void sum()
  {
      sum=a+b+c+d+e;
      System.out.println("sum is " +sum);
      average=sum/5;

  }








}
