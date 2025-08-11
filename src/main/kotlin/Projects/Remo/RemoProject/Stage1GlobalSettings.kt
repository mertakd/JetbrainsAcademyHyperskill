package Projects.Remo.RemoProject

/**
 * Global settings
 *  Report a typo
 * Description
 * When you install the Git utility on your system, the first thing you need to do is to define the global variables. They can be defined with a git config command followed by --global option, a variable name, and a value. This means every git repository created on your system after that will have these variables pre-defined. Below you will find a simple usage of the command. To learn more about it, you can follow the link git configuration for official documentation.
 *
 * git config --global <variable name> <value>
 *
 * The config command without a value will show you the value of the variable.
 *
 * Objectives
 * Define a global variable with the name user.name and with the value hyper;
 *
 * Define a global variable with the name user.email and with the value hyperskill@hyperskill.org;
 *
 * Define a global variable with the name init.defaultBranch and with the value main;
 *
 * Use the config command to view the user email.
 *
 * Write a program
 *
 * -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 *
 *
 *
 * Global settings (Global ayarlar)
 *
 * Açıklama
 * Sistemine Git aracını kurduğunda yapman gereken ilk şey, global değişkenleri tanımlamaktır.
 * Bu değişkenler git config komutu, ardından --global seçeneği, değişken adı ve değer girilerek tanımlanabilir.
 * Bu, sisteminde bundan sonra oluşturacağın her Git deposunun (repository) bu değişkenleri önceden tanımlı olarak içereceği anlamına gelir.
 *
 * Aşağıda komutun basit bir kullanım örneği verilmiştir. Daha fazlasını öğrenmek için resmi dokümantasyondaki git configuration bağlantısını takip edebilirsin.
 *
 * bash
 * Copy
 * Edit
 * git config --global <variable name> <value>
 * Bir değeri olmadan config komutunu çalıştırmak, o değişkenin değerini gösterir.
 *
 * Hedefler (Objectives)
 *
 * user.name adında bir global değişken tanımla, değeri hyper olsun.
 *
 * user.email adında bir global değişken tanımla, değeri hyperskill@hyperskill.org olsun.
 *
 * init.defaultBranch adında bir global değişken tanımla, değeri main olsun.
 *
 * config komutunu kullanarak kullanıcı e-postasını (user.email) görüntüle.
 *
 *
 *
 *
 *
 * CEVAPLAR
 *
 * git config --global user.name "hyper"
 * git config --global user.email "hyperskill@hyperskill.org"
 * git config --global init.defaultBranch main
 * git config --global user.email
 *
 */