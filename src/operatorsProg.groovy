class OperatorsEx{
  static void main(String[] args){
    //Conditional Operators: == != > < >= <=
    //Logical Operators: && !! !

    print("Your Age: ")
    def myAge = System.console().readLine().toInteger();
    //def myAge = 5
      if(myAge <= 10){
      println("You are in School")
    } else if((myAge >= 11) && (myAge < 18)){
      println("you are in High School")
    } else {
      println("you are in College " + myAge)
    }

    def canVote = true
    println(canVote ? "Yes you can" : "No you can't Vote")

    switch(myAge){
      case 16: println("You cannot vote");
        break;
      case 18: println("You can drive")
        break;
      default: println("")
    }
    switch(myAge){
      case 0..10: println("you are in primary school"); break
      case 11..18: println("you are in high school"); break
      case 19..26: println("you are in College or university"); break
      default: println("find your career")
    }
  }
}
