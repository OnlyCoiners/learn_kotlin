// $kotlinc Main.kt -include-runtime -d Main.jar
// $java -jar Main.kt
// You can also install some plugins and use Control + Option + n to run code.

// class Car {
//   var name = ""
// }

data class CarBase(var name: String)

class Car(private val fields: CarBase) {
  fun show_name() {
    println(fields.name)
  }

  fun set_new_name(new_name: String) {
    fields.name = new_name // Update the 'name' property
  }
}


// class Car(var name: String) {
//   fun show_name() {
//     println(name)
//   }

//   fun set_new_name(new_name: String) {
//     name = new_name // Update the 'name' property
//   }
// }

val COMPANY_NAME = "OnlyCoiners"
fun main() {
  // var newCar = Car()
  // newCar.name = "new"

  var newCar = Car(CarBase("new"))
  newCar.show_name()
  newCar.set_new_name("another")
  newCar.show_name()
  // print(newCar.name)
  // reuse(COMPANY_NAME)
}

// This also works
// data class Car(var name: String)

// fun main() {
//   val myCar = Car("new")
//   println(myCar.name) // Output: new
//   myCar.name = "another"
//   println(myCar.name) // Output: another
// }

