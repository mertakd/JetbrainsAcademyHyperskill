package Projects.Remo.RemoProject

/**
 *
 * Initialize
 *  Report a typo
 * Description
 * Create an empty repository and add remote for it. You can use the command below to add a remote.
 *
 * git remote add <name for the remote> <remote URL>
 *
 * The name of the remote can be anything. But, it is a convention to use origin.
 *
 * Objectives
 * Let's break this task into a few steps:
 *
 * In the current working directory, initialize an empty Git repository;
 * Add remote to your repository, with the name origin and with the URL file:///tmp/git-bare.
 *
 * -----------------------------------------------------------------------------------------------
 *
 * Initialize
 *
 * Açıklama
 * Boş bir repository (depo) oluşturun ve ona bir remote (uzak bağlantı) ekleyin. Remote eklemek için aşağıdaki komutu kullanabilirsiniz:
 *
 * php-template
 * Copy
 * Edit
 * git remote add <remote için isim> <remote URL’si>
 * Remote’un ismi herhangi bir şey olabilir. Ancak, yaygın kullanımda origin ismi tercih edilir.
 *
 * Hedefler (Objectives)
 * Bu görevi birkaç adıma bölelim:
 *
 * Mevcut çalışma dizininde boş bir Git repository başlatın.
 *
 * Repository’nize, ismi origin olan ve URL’si file:///tmp/git-bare olan bir remote ekleyin.
 *
 *
 * git init
 * git remote add origin file:///tmp/git-bare
 */


/**
 *
 * EK BİLGİ
 *1. git init – Yeni bir Git repository başlatma
 * bash
 * Copy
 * Edit
 * git init
 * Ne yapar?
 * Çalıştığın mevcut klasörü Git repository hâline getirir.
 *
 * .git adında gizli bir klasör oluşturur.
 *
 * Bu .git klasörü içinde Git’in çalışması için gerekli veritabanı ve ayar dosyaları bulunur.
 *
 * Henüz hiçbir dosya takip edilmiyor (tracked) olmaz, repo tamamen boş başlar.
 *
 * 📂 git init sonrası klasör yapısı:
 *
 * arduino
 * Copy
 * Edit
 * proje-klasoru/
 * └── .git/
 *     ├── HEAD
 *     ├── config
 *     ├── objects/
 *     ├── refs/
 *     └── ...
 * Yani bu adım, “Bu klasörü Git ile versiyon kontrolüne alacağım” demektir.
 *
 * 2. git remote add origin file:///tmp/git-bare – Remote ekleme
 * bash
 * Copy
 * Edit
 * git remote add origin file:///tmp/git-bare
 * Ne yapar?
 * Mevcut repository’ye bir remote (uzak depo) ekler.
 *
 * Remote’a origin adını verir.
 *
 * Remote’un adresi olarak file:///tmp/git-bare gösterilir.
 *
 * 💡 Detaylar:
 *
 * Remote, projenin başka bir kopyasıdır (genelde başka bir makinede veya sunucuda olur).
 *
 * origin → Git’te en yaygın kullanılan varsayılan remote adıdır (ama başka bir ad da verebilirsin).
 *
 * file:///tmp/git-bare → Bu örnekte remote, internet üzerinde değil; yerel dosya sisteminde /tmp/git-bare dizininde bulunuyor.
 *
 * Bu adres bir bare repository olabilir.
 *
 * Bare repository’de çalışma dosyaları yoktur, sadece .git klasörü yapısı bulunur.
 *
 * Takım içi paylaşım ve versiyon saklama amacıyla kullanılır.
 *
 * Sürecin Mantığı
 * git init ile kendi bilgisayarında boş bir proje deposu oluşturdun.
 *
 * git remote add origin ... ile bu yerel depoyu başka bir depo ile ilişkilendirdin.
 *
 * Bundan sonra:
 *
 * git push origin master → yerel commit’lerini uzak depoya gönderebilirsin.
 *
 * git pull origin master → uzak depodaki değişiklikleri çekebilirsin.
 *
 * 📌 Özet Akış
 *
 * java
 * Copy
 * Edit
 * Yerel Depo (Local Repo)     <---->     Uzak Depo (Remote Repo)
 * .git klasörü (.init ile)               file:///tmp/git-bare
 *
 */