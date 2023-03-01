fun main(){
    var person = Human("Jane",20,72.7)
    var foodWeight = 4
    person.speak("I am creating a website")
    person.eat(4)
    println(person.weight)
    person.birthday(1)
    val myDetail = Owner("Emmily","Stephanie","emmilystephanie@gmail.com",712345678,123)
    println(myDetail.lastName)
    println(myDetail.email)


}
//Create a class called Human w123ith these attributes: name, age, weight. It has
//the following functions:
//- eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//and increments the human’s weight by the weight of the food eaten
//(3 points)
//-
//- speak(speech: String) :Prints the string passed to it (2
//points)
//- birthday( ) :Increments the human’s age by 1 (2
//points)
//Create an instance of this human class and invoke all its functions
class Human(var name:String, var age:Int, var weight:Double){
    fun eat(foodWeight:Int){
        weight+=foodWeight
        println("I am eating $foodWeight kgs of food")

    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(years:Int){
        age+=1
        println(age)

    }
}
//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
//attributes

data class Owner(var firstaname:String,var lastName:String,var email:String,var phoneNumber:Int,var password:Int)
