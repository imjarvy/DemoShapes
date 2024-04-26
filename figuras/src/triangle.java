import java.lang.Math;
public class triangle extends shape{
 public triangle(int newSide1,int newSide2,int newSide3){
   setSide1(newSide1);
   setSide2(newSide2);
   setSide3(newSide3);
 }
 private int[] sides=new int[3];
 
 public int getSide1(){
    return sides[0];
 }
 public void setSide1(int newSize){
    sides[0]=newSize;
 }

 public int getSide2(){
    return sides[1];
 }

 public void setSide2(int newSize2){
    sides[1]=newSize2;
 }

 public int getSide3(){
    return sides[2];
 }
 public void setSide3(int newSize3){
    sides[2]=newSize3;
 }

public float getArea() {
  float s=(getSide1()+getSide2()+getSide3())/2;

  float area=(float)Math.sqrt(s*(s-getSide1())*(s-getSide2())*(s-getSide3()));
  return area;
}
public float getPerimetro() {
  return getSide1()+getSide2()+getSide3();
}
}
