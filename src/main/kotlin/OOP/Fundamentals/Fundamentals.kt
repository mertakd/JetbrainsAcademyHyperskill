package OOP.Fundamentals



/**
 * OOP
 * Nesne yönelimli programlama (OOP), program işlevlerini(FUNCTİONS) yerine getirmek için birbirleriyle etkileşime giren nesneler kavramına dayanan bir programlama paradigmasıdır.
 * Her nesne bir durum ve davranış ile karakterize edilebilir. Bir nesnenin mevcut durumu alanları(fields) tarafından temsil edilir ve bir nesnenin davranışı yöntemleri(methods) tarafından temsil edilir.
 *
 * Objects
 * Bu özellikler nesnenin niteliklerini(attributes) ve yöntemlerini(methods) oluşturur. Nitelikler bir nesnenin durumlarını veya verilerini, yöntemler ise davranışlarını karakterize eder.
 *
 *
 * fields ve attributes dökümanlarda birbirinin yerini tutabiliyor.
 *
 *
 *
 *Aşağıdaki örnekte, bir araba sınıfı oluşturacağız. Araba sınıfının alanları (fields) araba markası, modeli ve hızı olacak. Arabanın davranışlarını (behavior) temsil edecek metodlar ise hızlanmak, yavaşlamak ve durmak olacak
 * */
class Araba(val marka: String, val model: String) {

    var hiz: Int = 0

    fun hizlan(kacKm: Int) {
        hiz += kacKm
        println("$marka $model hızı $kacKm km/s arttı ve şu anki hızı $hiz km/s.")
    }

    fun yavasla(kacKm: Int) {
        hiz -= kacKm
        println("$marka $model hızı $kacKm km/s azaldı ve şu anki hızı $hiz km/s.")
    }

    fun dur() {
        hiz = 0
        println("$marka $model durdu.")
    }
}

fun mainFields() {
    val araba = Araba("Toyota", "Corolla")
    araba.hizlan(50)
    araba.yavasla(20)
    araba.dur()
}








//Uçak örneği üzerinden yani uçak sınıfı içinde ki attributes ve methods yapılarının davranışı

//Bu kod parçasında, Plane sınıfı bir uçağın özelliklerini temsil eder. name, passengerCapacity, standardSpeed ve currentCoordinates, uçağın nitelikleridir. flyTo metodu, uçağın belirli koordinatlara uçmasını simüle eder ve uçağın konumunu günceller. displayPlaneInfo metodu, uçağın bilgilerini ekrana yazdırmak için kullanılır.
//
//main fonksiyonunda ise bir uçak örneği oluşturulur ve bu uçak için bilgiler ekrana yazdırılır. Daha sonra uçak belirli koordinatlara uçurulur ve tekrar bilgileri ekrana yazdırılır.


class Plane(
    val name: String,
    val passengerCapacity: Int,
    val standardSpeed: Int,
    var currentCoordinates: Pair<Double, Double>
) {

    fun flyTo(destination: Pair<Double, Double>) {
        println("$name is flying from (${currentCoordinates.first}, ${currentCoordinates.second}) to (${destination.first}, ${destination.second}) at a speed of $standardSpeed km/h.")
        currentCoordinates = destination
    }

    fun displayPlaneInfo() {
        println("Plane Information:")
        println("Name: $name")
        println("Passenger Capacity: $passengerCapacity")
        println("Standard Speed: $standardSpeed km/h")
        println("Current Coordinates: (${currentCoordinates.first}, ${currentCoordinates.second})")
    }
}

fun main() {
    val plane = Plane("Boeing 777", 300, 900, Pair(0.0, 0.0))
    plane.displayPlaneInfo()
    plane.flyTo(Pair(40.7128, -74.0060)) // New York coordinates
    plane.displayPlaneInfo()
}

