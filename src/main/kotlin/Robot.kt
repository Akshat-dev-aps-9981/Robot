import java.util.Calendar

// class Robot.kt define the tasks which will be performed by our robot.

class Robot(val name: String) {

    fun ringAlarm(time: Int) = println("Good Morning, I am $name. It's $time:00 AM already! Please wake up.")

    fun makeCoffee(coffee: Coffee) = if(coffee.black) println("Your black coffee with ${coffee.spoonsOfSugar} is ready.") else println("Your coffee with ${coffee.spoonsOfSugar} is ready.")

    fun heatWater(temprature: Int) = println("Your bathing water with $temprature degrees celcius is ready. You can take a bath now.")

    fun packBag(day: Int) {
        val messege = "Books kept for today are: "
        val books = arrayOf("Computer Science", "Mathematics", "Physics", "Chemistry", "Biology", "Moral Science", "Humanities")

        when(day) {
            Calendar.MONDAY -> println("Bag Packed! $messege ${books[0]}, ${books[1]}.")
            Calendar.TUESDAY -> println("Bag Packed! $messege ${books[0]}, ${books[1]}.")
            Calendar.WEDNESDAY -> println("Bag Packed! $messege ${books[1]}, ${books[2]}.")
            Calendar.THURSDAY -> println("Bag Packed! $messege ${books[1]}, ${books[2]}.")
            Calendar.FRIDAY -> println("Bag Packed! $messege ${books[3]}, ${books[4]}.")
            Calendar.SATURDAY -> println("Bag Packed! $messege ${books[5]}, ${books[6]}.")
            Calendar.SUNDAY -> println("No need! It's holiday today :).")
            else -> println("Invalid day.")
        }
    }

    fun cook() {
        val breakfast = mutableListOf<String>("Nuts", "Poha", "Samosa", "Oats", "French Fires")
        val lunch = mutableListOf<String>("Fried Daal", "Boiled Daal", "Salad", "Chawal Khichdi", "Shaahi Paneer", "Mashed Potatoes", "Tomatoes")
        // a random choice by system defined function "random()".
        println("Toaday's breakfast is : ${breakfast.random()} and lunch is : ${lunch.random()}.")
    }

    fun ironClothes(shirtColor: String, trouserColor: String) {
        val shirtColors = mutableListOf("Blue", "Green", "Orange", "Red", "Yellow", "Black")
        val trouserColors = mutableListOf("Blue", "Black", "Gray")

        if (shirtColors.contains(shirtColor)) {
            if (trouserColors.contains(trouserColor)) {
                println("Your Clothes are ready!!")
            } else {
                println("You do not have trouser of this color. May be its time to go for a trouser shopping.")
            }
        } else {
            println("You do not have shirt of this color. May be its time to go for a trouser shopping.")
        }
    }
}