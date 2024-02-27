#  Java Polymorphism

### Proje Kurulumu

Projeyi öncelikle forklayın ve clone edin.
Daha sonra projeyi IntellijIDEA kullanarak açınız. README.md dosyasını dikkatli bir şekilde okuyarak istenenleri yapmaya çalışın.
Proje sayımız ilerledikçe proje yönetimimizi kolaylaştırmak adına projelerimizi belli klasör kalıplarında saklamak işimizi kolaylaştırmak adına iyi bir alışkanlıktır.
Örnek bir Lokasyon: Workintech/Sprint_1/Etud.

### Intro

Polymorphism çok biçimlilik demektir. Java'nın ve Nesne Tabanlı Programlama'nın en önemli konularından biridir.
Java Polymorphism'in üzerine kurulmuş bir programlama dilidir. Bundan sonra göreceğimiz tüm konularda karşımıza çıkıcak ve Java'nın bel kemiğini oluşturacak.
Polymorphism soyut bir kavram olduğu için tam olarak nasıl çalıştığını anlamak biraz zaman alabilir. Kısaca Runtime anında objelerin davranış şekillerini değiştirme olarak özetleyebiliriz.


### Hedeflerimiz:

 ### Pacific Brand.Car Company

 * Bugün ki projemizde toplamda 4 tane sınıf oluşturman istenmektedir.
 * İlk sınıfımız ```Brand.Car``` isimli sınıfmız olmalı.
 * ```Brand.Car``` sınıfı diğer oluşturacağımız 3 sınıf olan ```Mitsubishi```, ```Holden```, ```Ford``` sınıflarının parent sınıf olacak.
   * ```Brand.Car``` sınıfı 4 adet ```instance variable``` içermeli.
        
        engine => boolean
   
        cylinders => int
   
        name => String
   
        wheels => int
   
   * Bu 4 değişkende ```private``` olarak tanımlanmalı
   * Brand.Car sınıfı için tek bir ```constructor``` tanımlanmalı. Constructor sadece 2 değeri dışarıdan almalı cylinders ve name değerlerini. İlgili 3 arabanın da motoru bulunduğu için ve 4 tekeri olduğu için contructor metodu içerisinde bu değerler default olarak set edilmeli. Dışarıdan parametre olarak alınmaya ihtiyaç duyulmamalı.
   * name ve cylinders parametreleri için getter metodlarını tanımlayınız.
   * Brand.Car sınıfı için toString ve equals methodlarını da ```Override``` etmelisin. Equals metodu için name ve cylinders alanları birlikte eşitliği kontrol etmeli.
   * Brand.Car sınıfı içerisinde aşağıdaki 3 metod tanımlanmalı
   * ```startEngine()``` hiçbir parametre almayacak ```the car's engine is starting``` mesajını dönmeli.
   * ```accelerate()```  hiçbir parametre almayacak ```the car is accelerating``` mesajını dönmeli.
   * ```brake()``` hiçbir parametre almayacak ```the car is braking``` mesajını dönmeli.
   * Ayrıca bu 3 metodunda içerisinde ```getClass().getSimpleName()``` değeri loglanmalı.
   * ```Mitsubishi```, ```Holden```, ```Ford``` sınıfları ```Brand.Car``` sınıfının alt sınıflarıdır ve bu 3 metoduda ```Override``` etmeliler.

Aşağıdaki gibi bir input değeri için output kısmında her araç türünün kendi override edilmiş metodunun çağırıldığından emin olmalısın.

 ### Brand.Car R&D Company

 * 'Brand.Car R&D Company' 3 farklı arabalarının dizaynını yapabilmek için yardıma ihtiyaç duyuyorlar. Bu konuda sana güvenleri tam. Problemlerini çözebilmen için seni işe aldılar.
 * ```CarSkeleton``` isminde bir sınıf tanımlayınız. ```name ve description``` alanlarını almalı.
 * ```CarSkeleton``` sınıfının 3 adet metodu olmalı. ```startEngine(), drive(), runEngine()``` startEngine ve drive metodları public olarak tanımlanmalı. runEngine protected olarak tanımlanmalı.
 * runEngine metodu drive metodunun içerisinden çağırılmalı.
 * ```CarSkeleton``` sınıfının 3 tane de ```subclass``` değeri tanımlanmalı. ```GasPoweredCar```, ```ElectricCar```, ```HybridCar```
 * ```GasPoweredCar``` iki sınıf değişkeni içerir. ```avgKmPerLitre: double ve cylinders: int```
 * ```ElectricCar``` iki sınıf değişkeni içerir. ```avgKmPerCharge: double ve batterySize: int```
 * ```HybridCar``` üç sınıf değişkeni içerir. ```avgKmPerLitre: double, batterySize: int, cylinders: int```
 * Bu üç farklı sınıfta ```startEngine ve drive``` metodlarını engine(motor) tiplerine göre farklı şekillerde çağırırlar.
 * Tüm dizaynı yapmak senin görevin. Alt sınıflar ```CarSkeleton``` içerisindeki bazı metodları ya da hepsini Override etmeli mi ?
 * Bir adet Main sınıfı tanımlayınız ve tüm sınıfların objelerinden polymorphism kurallarına uyacak şekilde birer instance oluşturunuz.
 * Her instance ile sınıfın davranışını test edin. Bir tane metodunuz sınıfın tipini ekrana basmalı.

### INPUT

Brand.Car car = new Brand.Car(8, "Base car");

System.out.println(car.startEngine());

System.out.println(car.accelerate());

System.out.println(car.brake());

Brand.Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

System.out.println(mitsubishi.startEngine());

System.out.println(mitsubishi.accelerate());

System.out.println(mitsubishi.brake());

Brand.Car ford = new Ford(6, "Ford Falcon");

System.out.println(ford.startEngine());

System.out.println(ford.accelerate());

System.out.println(ford.brake());

Brand.Car holden = new Holden(6, "Holden Commodore");

System.out.println(holden.startEngine());

System.out.println(holden.accelerate());

System.out.println(holden.brake());
