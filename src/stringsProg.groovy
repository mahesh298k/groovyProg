class stringExample{
  static void main(String[] args){

  def name = "Mahesh"
/*  println('This is ${name}')
  println('This is $name')

  println("This is ${name}")
  println("This is $name")

  println("My name " + name)
  println("My name ".concat(name))
  println("4th index value " + name[4])
  println("Index of s " + name.indexOf('h'))
  println("First 3 index values " + name[0..2])
  println("required values at specific indexes " + name[0,2,4])
  println("Substring at 1 " + name.substring(1))
  println("Substring from 1 to 4 " + name.substring(1,4))

  println("Multiplying String " * 2)
  println("Mahesh == Mahesh " + 'Mahesh'.equals('Mahesh'))
  println("Mahesh == mahesh " + name.equalsIgnoreCase('mahesh'))

  println("Length of string " + name.length())
*/
  def repeatVar = "What i'm saying is " * 2
  println(repeatVar - "What")
  println("Split String based on space " + repeatVar.split(' '))
  println("String to List conversion " + repeatVar.toList())
  println("Replacing occurence of a word " + repeatVar.replaceAll("i'm", 'she'))
  println("Uppercase " + repeatVar.toUpperCase())
  println("Uppercase " + repeatVar.toLowerCase())
//comparision operator
  println("Ant <=> Banana " + ('Ant' <=> 'Banana'))
  println("Banana <=> Ant " + ('Banana' <=> 'Ant'))
  println("Ant <=> Ant " + ('Ant' <=> 'Ant'))

  }
}
