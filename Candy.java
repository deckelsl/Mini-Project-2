//Add comments

class Candy{
  private String name;

  Candy(){
    name = "";
  }

  Candy(String aName){
    name = aName;
  }

  void setName(String theName){
    name = theName;
  }
  String getName(){
    return name;
  }
  void print(){
    System.out.println(name);
  }
}