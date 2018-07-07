class ListExamples{
  static void main(String[] args){
    def lval = [2,3,4,5,7,9,11,13]
    println(lval)
    println("3rd listValue " + lval[2])
    println("6th Lval " + lval.get(5))

    def emp = ['mahesh', 20, 0.009, [9,8,7,4]]
    //println(emp[3][2])
    println("List Size " + emp.size())
    emp.add(24)
    emp<<25
    println(emp)
    //emp - [24];
    println("Is emp empty " + emp.isEmpty())
    println("1st 4 values " + emp[0..3])
    println("Matches " + emp.intersect([20,'mahesh']))
    println("Reverse " + emp.reverse())
    println("Sort " + emp.sort())
    println("Last " + emp.pop())
    println(emp)

  }
}
