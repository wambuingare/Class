fun main(){
var person=Human("Tessa",24, 50)
    person.weight
    person.eat(2)
    person.speak("Hello people")
    person.birthday(1)
var student= User("Nancy", "Ngare", "wambuinancyngare@gmail.com", 725124209, 123897)
    println(student.firstName)
    println(student.phoneNumber)

}
class Human(var name: String, var age: Int, var weight: Int){

    fun eat(foodweight: Int) {
        weight += foodweight
        println("I am eating $foodweight kgs of food")
    }

       fun speak(speech: String){
           println("Hello people")
       }


fun birthday(add: Int){
    age +=1
    println(age)
}


       }

    data class User(var firstName: String, var lastName: String, var email: String, var phoneNumber: Int, var password: Int)





