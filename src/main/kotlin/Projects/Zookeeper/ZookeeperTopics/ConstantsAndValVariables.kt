package Projects.Zookeeper.ZookeeperTopics

/**
Val değişkenleri ve değişebilirlik
Val değişkeninin değişmez ile eşanlamlı olmadığına dikkat etmek önemlidir. Aşağıdaki örnekte, aynı türden öğelerin sıralı bir kümesi olan bir MutableList kullanacağız. Eğer ilerlemek ve MutableList hakkında daha fazla bilgi edinmek istiyorsanız, MutableList hakkında bir konu öğrenebilirsiniz, ancak şu anda bir gereklilik değil.

// liste oluşturma
val myMutableList = mutableListOf(1, 2, 3, 4, 5)
// listeyi güncellemeye çalışıyorum
myMutableList = mutableListOf(1, 2, 3, 4, 5, 6) // hata satırı

Bir val değişkenini yeniden atamaya çalıştığımız için ikinci satır derlenmeyecektir. Ancak, hatırlanması gereken önemli bir nokta vardır.

Bir val değişkeninin iç durumunu değiştirmek her zaman mümkündür: değişkeni yeniden atamak yasak olsa da, içeriği başka şekillerde değiştirilebilir.
Yani, aşağıdaki kod doğrudur:

// liste oluşturma
val myMutableList = mutableListOf(1, 2, 3, 4, 5)
// yeni bir eleman ekleme
myMutableList.add(6) // çalışıyor
// listeyi yazdırma
println(myMutableList) // [1, 2, 3, 4, 5, 6]

Gördüğünüz gibi, bu kod myMutableList'in dahili durumunu başka bir tam sayı ekleyerek değiştirdi. add() fonksiyonunu çağırdığımızda, değişkenin kendisini değil, temsil ettiği listeyi değiştirdik.

Java programlama diline aşinaysanız, Kotlin val değişkenlerini Java final değişkenleri olarak düşünmek sizin için daha kolay olabilir. Oldukça benzerdirler: her ikisi de değişkene yeniden bir değer atanmasını yasaklar, ancak nesnenin iç durumunu değiştirmeye izin verir.
 */


/**
Const değişkenleri
Kotlin'de, bir derleme zamanı sabiti bildirmek için val anahtar sözcüğünden önce kullanılan bir const değiştiricisi de vardır. Bir const değişkenin değeri derleme zamanında bilinir ve çalışma zamanında değiştirilmez:

const val MY_STRING = "Bu sabit bir dizedir"

Aşağıdaki kod, program çalıştırılmadan önce değer bilinmediği ve bir sabit olmadığı için hata verecektir:

const val MY_STRING = readln() // sabit bir String değil!!!

const değiştiricisinin ne zaman uygulanabileceği konusunda bazı kısıtlamalar vardır. İlk olarak, yalnızca bir String veya ilkel tipte bir değişkenle kullanılabilir:

const val CONST_INT = 127
const val CONST_DOUBLE = 3.14
const val CONST_CHAR = 'c'
const val CONST_STRING = "I am constant"
const val CONST_ARRAY = arrayOf(1, 2, 3) // error: only primitives and strings are allowed

Ayrıca, const değişkenlerin herhangi bir fonksiyonun dışında, en üst seviyede bildirilmesi gerekir:

const val MY_INT_1 = 1024 // doğru satır

fun main() {
const val MY_INT_2 = 2048 // hata: 'const' değiştiricisi 'yerel değişken' için geçerli değil
}
 */


/**
Sonuç
Kotlin'de sabit değişkenler val anahtar sözcüğü ile bildirilir.

Değer ataması dışında, val değişkenlerine normal değişkenler gibi davranabilirsiniz.

val anahtar sözcüğü değişken değerinin değiştirilmesini yasaklar, ancak değişkenin temsil ettiği iç durumu değiştirebilirsiniz.

Derleme zamanı üst düzey sabitleri için const değiştiricisini kullanabilirsiniz.

Mümkün olduğunca val değişkenlerini kullanmak, hatalardan kaçınmanızı sağlayacak iyi bir uygulamadır.
 */