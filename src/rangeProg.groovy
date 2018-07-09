class RangeExample{
  static void main(String[] args){
    def oneto10 = 1..10;
    def atoz = 'a'..'z';
    def ztoa = 'z'..'a';
    println "$oneto10"
    println("$atoz")
    println("$ztoa")
    println("Size of Range " + oneto10.size())
    println("Get 10th item " + atoz.get(10))
    println("Size of Range " + oneto10.contains())
    println("Get last element " + atoz.getTo())
    println("Get First elaemnt " + atoz.getFrom())
  }
}
