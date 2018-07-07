class firstProg {
static void main(String[] args) {
    def age =10
/*    println("Your age:" + age)
    println("Addition:" + (age + 10))
    println("FloatingPointAddition:" + (4.2.plus(3.9)))
    println("Sub:" + (age - 5))
    println("FloatingPointSub:" + (4.2.minus(3.9)))
    println("Multiplication:" + (age * 2))
    println("FloatingPointMulti:" + (4.2.multiply(3.9)))
    println("Division:" + (10.intdiv(3)))
    println("FloatingPointDivision:" + (4.2 / 3))
    println("Modulus:" + (age % 3))

    //Operator Precedence
    println("3 + 2 * 5 = " + (3 + 2 * 5))
    println("((3 + 2) * 5) = " + ((3 + 2) * 5))

    // Increment & decerement
    println("age++ = " + (age++))
    println("++age = " + (++age))
    println("age-- = " + (age--))
    println("--age = " + (--age))

  println("Biggest Int " + Integer.MAX_VALUE)
  println("Smallest Int " + Integer.MIN_VALUE)
  println("Biggest Float " + Float.MAX_VALUE)
  println("Smallest Float " + Float.MIN_VALUE)
  println("Biggest Double " + Double.MAX_VALUE)
  println("Smallest Double " + Double.MIN_VALUE)
  */
  //Math Functions
  /*
  def randNum = 2.0
  println("Math.abs(-2.45) = " + (Math.abs(-2.45)))
  println("Math.round(2.45) = " + (Math.round(2.45)))
  println("Math.round(2.55) = " + (Math.round(2.55)))
  println("randNum.pow(4) = " + (randNum.pow(4)))
  println("3.0.equals(2.0) = " + (3.0.equals(2.0)))
  println("randNum.equals(Float.NaN) = " + (randNum.equals(Float.NaN)))
  println("Math.sqrt(16) = " + (Math.sqrt(16)))
  println("Math.cbrt(27) = " + (Math.cbrt(27)))
  println("Math.ceil(3.45) = " + (Math.ceil(3.45)))
  println("Math.floor(3.45) = " + (Math.floor(3.45)))
  println("Math.min(2.3) = " + (Math.min(2,3)))
  println("Math.max(2.3) = " + (Math.max(2,3)))
  */
  println("RandomNumber = " + (Math.abs(new Random().nextInt() % 70) + 1));
  }
}
