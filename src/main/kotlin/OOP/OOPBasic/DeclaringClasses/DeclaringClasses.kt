package OOP.OOPBasic.DeclaringClasses

//Yeni bir sınıf bildirmek için class anahtar sözcüğünü ve ardından sınıf adını yazmanız gerekir. İlk olarak, Emptiness adında bir sınıf bildirelim:
class Emptiness {
    // empty body
}




//Kotlin'de, bir sınıf boş bir gövdeye sahip olduğunda, küme parantezleri atlanabilir. Böylece aynı sınıf aşağıdaki şekilde tanımlanabilir:
class Emptiness2


fun mainEmptiness() {
    //val empty: Emptiness = Emptiness()
    //val empty = Emptiness()
}




//Class Member
//Bir sınıf gövdesi sınıf üyelerini(class member) içerebilir. Şimdilik, sadece Kotlin'deki alanların(fields ) yerini alan özellikleri(properties ) tartışacağız: bunlar da veri depolayabilir.

//Writing properties
//Özellikler(Properties) değişkenlere(variables ) ve değerlere(values) oldukça benzer. Çalışma zamanı sırasında bir özelliğe(Properties ) bir değer atamak istiyorsanız, onu bir var olarak bildirirsiniz, aksi takdirde bir val kullanırsınız.

class Patient {
    var name: String = "Unknown"
    var age: Int = 0
    var height: Double = 0.0
}

fun main() {
    var patient = Patient()
    println(patient.name) // prints "Unknown"
    println(patient.age)  // prints "0"



    val john = Patient()
    john.name = "John"
    john.age = 30
    john.height = 180.0

    val alice = Patient()
    alice.name = "Alice"
    alice.age = 22
    alice.height = 165.0

    println("${john.name}: ${john.age} yrs, ${john.height} cm")
    println("${alice.name}: ${alice.age} yrs, ${alice.height} cm")


}