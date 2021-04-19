fun main() {
    var cars=Cars("simple","special","pink",20)
    cars.carry(23)
    cars.carry(17)
    cars.carry(14)
    cars.carry(25)
    cars.identity()
    println(cars.calculateParkingFees(6))
    var bus=Bus("large","dark","red",90)
    bus.carry(100)
    bus.carry(80)
    println(bus.maxTripFare(345780000.0667))

}
open class Cars(var make: String,var model:String,var color:String,var capacity: Int){
    fun carry(people:Int){

        var x=people-capacity
        if(people<=capacity){
            println("carrying $people passengers")
        }
        else{
            println("over capacity by $x people")
        }
    }
    fun identity(){
        println("I am a $color $make $model")

    }
    fun calculateParkingFees(hours:Int):Int{
        return hours*20
    }
}
class Car(make:String,Model:String,color:String,capacity:Int):Cars(make,Model,color,capacity){


    }
class Bus(make:String,Model:String,color:String,capacity:Int):Cars(make,Model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        return fare
    }
}





