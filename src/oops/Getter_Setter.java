package oops;

public class Getter_Setter {
  private   int id ;
    private  double value;
    private  String ans;
    public void setId(int i){
        id= i;
    }
    public void  setValue(double p){
        value=p;
    }
    public void setAns(String s){
        ans = s;
    }
    public int getId(){
        return id;
    }
    public String getAns(){
        return ans;
    }
    public double getValue(){
        return value;
    }
}
