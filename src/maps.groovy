class MapsExample{
  static void main(String[] args){
    def fmap = [
    'name' : 'Alexa',
    'age' : '33',
    'address' : '5555 Astor physics dr, CA, USA',
    'belongings' : ['car',10,3.009,'F']
    ]
    println(fmap)
    println("Name " + fmap['name'])
    println("age " + fmap.get('age'))
    println("List item in Map " + fmap['belongings'][2])
    fmap.put('mobileNo', '+1987654321')
    println("Has mobileNo " + fmap.containsKey('mobileNo'));
    println("Size " + fmap.size())
    println(fmap)
  }
}
  
