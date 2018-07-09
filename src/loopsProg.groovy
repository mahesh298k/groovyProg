class loopingExample {
  static void main(String[] args) {
    def i,j,k
    /*while(i < 6){
      if(i % 2 == 0){
        println("odd number: " + i)
        i++
      continue
    }
    println("Even number: " +i)
    i++
    }*/
    for(i = 1; i < 5; i++) {
      for(j = 0; j >= i; j--) {
        print(" ")
      }
      for(k=1; k <= (2*i-1); k++) {
        print("%-3s *")
        //print("%-3s")
      }
      println("")
    }
  }
}
