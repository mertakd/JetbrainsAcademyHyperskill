package OOP.OOPBasic.Constructors

/**
 * Kotlin'de kurucular, bir sınıfın yeni örneklerini oluşturmak için kullanılan özel fonksiyonlardır. Oluşturulduklarında bir nesnenin ilk durumunu oluşturmaktan sorumludurlar. Kotlin iki tür kurucu sağlar: primary ve secondery.
 *
 * kullanılma amacı
 * Properties constructor a aktarılan değerlerle başlatın.
 * Sınıfın ihtiyaç duyabileceği tüm başlatma mantığını gerçekleştirin.
 *
 *
 * */



// Primary Constructor
//Akıcıdır ve herhangi bir kod içeremez.
//
//Başlatma kodu, init ile ön eklenmiş başlatıcı bloklarına yerleştirilebilir.
class PersonPrimary(val name: String, var age: Int) {
    init {
        println("New person instance created: $name, $age")
    }
}




// Secondary Constructor
// İkincil kurucular, kurucu anahtar sözcüğü kullanılarak sınıf gövdesi içinde tanımlanır:
//özellikleri

class Person2 {
    val name: String
    var age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}



//Sınıfınızı başlatmak için birden fazla yönteme ihtiyaç duyduğunuzda kullanılırlar.
//
//Birincil kurucuya (varsa) ya doğrudan ya da başka bir ikincil kurucu aracılığıyla dolaylı olarak delege olmalıdırlar.
// İkincil kurucular, birincil kurucu tarafından kapsanamayan daha karmaşık başlatma işlemlerine ihtiyaç duyduğunuzda kullanışlıdır.
class Person(val name: String, var age: Int) {
    constructor(name: String) : this(name, 0) {
        println("Secondary constructor called")
    }
}







//Primary Constructor and Initialization Blocks in Kotlin
//Kotlin'de birincil kurucu sınıf başlığının bir parçasıdır ve sınıf adından sonra bildirilir. Sınıf özelliklerini doğrudan veya bir init bloğu içinde başlatmak için kullanılabilecek parametrelere sahip olabilir.
//Yukarıdaki örnekte, Person sınıfının name ve age olmak üzere iki parametresi olan bir birincil kurucusu vardır. val ve var anahtar sözcükleri, name ve age'nin sınıfın özellikleri olduğunu gösterir.
//Daha karmaşık kurulum ihtiyaçları için Kotlin init blokları sağlar. Bu bloklar, sınıf gövdesinde göründükleri sırayla çalışır ve özellik başlatıcılarla iç içe geçer:

class Person3(val name: String, var age: Int) {
    init {
        require(age > 0) { "Age must be positive" }
    }
    //Bu durumda, init bloğu yaşın pozitif olduğunu doğrulamak için bir kontrol içerir. Gereksinim karşılanmazsa, bir IllegalArgumentException fırlatılacaktır.
}



//Birden fazla init bloğunuz varsa, bunların sırayla yürütüleceğini unutmayın:
class Person4(val name: String, var age: Int) {
    init {
        println("First initializer block")
    }

    // Property initializer
    val isAdult = age >= 18

    init {
        println("Second initializer block with isAdult: $isAdult")
    }
}

fun main4() {
    val person = Person4("John", 25)
    println("Name: ${person.name}, Age: ${person.age}, Is Adult: ${person.isAdult}")
}






// Secondary Constructors
// Kotlin, bir sınıfta bir birincil kurucu ve bir veya daha fazla ikincil kurucu tanımlanmasına izin verir. İkincil kurucular birincil kurucuya göre daha az düzenlidir ve constructor anahtar sözcüğü ile tanımlanır.
//İkincil kurucular, birincil kurucu yeterli olmadığında veya fazladan başlatma adımları gerçekleştirmeniz gerektiğinde bir nesneyi ayarlamak için ek yollar sağlar.
// Aşağıdaki örnekte, ikincil kurucu iki parametre alır ve this(name) kullanarak birincil kurucuya temsilci gönderir. Birincil kurucu çağrıldıktan sonra, ikincil kurucu gövdesi çalıştırılır ve age özelliğinin ayarlanması gibi ek başlatma işlemlerine izin verir.
class Person5(val name: String) {
    var age: Int

    // Primary constructor
    init {
        age = 0
    }

    // Secondary constructor
    constructor(name: String, age: Int): this(name) {
        this.age = age
    }
}

fun main() {
    // Primary constructor kullanımı
    val person1 = Person("Alice")
    println("Person 1 - Name: ${person1.name}, Age: ${person1.age}")

    // Secondary constructor kullanımı
    val person2 = Person("Bob", 30)
    println("Person 2 - Name: ${person2.name}, Age: ${person2.age}")
}


