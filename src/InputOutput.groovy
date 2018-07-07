class InputOutput{
  static void main(String[] args){

  /*  def rstr = "Random"
    println("A $rstr string")
    printf("A %s \n", rstr)
    printf("%-10s %d %.2f %10s \n", ['Stuff', 10, 1.234, 'random'])
*/
    print("your name: \n")
    //Scanner s = new Scanner(System.in);
    //def fname = s.nextLine();
    //println("Hello " + fname)

    def fname = System.console().readLine();
    println("Hello " + fname)

    print("Enter Number1: ")
    def num1 = System.console().readLine().toDouble();

    print("Enter Number2: ")
    def num2 = System.console().readLine().toDouble();

    printf("%.2f + %.2f = %.2f \n", [num1, num2, (num1 + num2)])
    println("$num1 + $num2 = " + (num1 + num2))

  }
}
