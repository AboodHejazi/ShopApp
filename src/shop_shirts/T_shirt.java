package shop_shirts;


  abstract class T_shirt {
    String name;
    String reigon;
    String description;
    String size;
    public T_shirt(String name ,  String size){
    this.name=name;
    this.reigon=reigon;
    this.size=size;
    }
    public String getDescription() {
        return name + " - " + description + ", Size: " + size;
    }
    public abstract void formSize();
}
