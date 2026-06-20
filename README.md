# Workout Tracker (Java OOP)

Bu proje, Java'da Nesne Yönelimli Programlama (OOP) prensiplerini --özellikle Kalıtım (Inheritance), Çok Biçimlilik (Polymorphism) ve Soyutlama (Abstraction)-- göstermek amacıyla tasarlanmış bir konsol uygulamasıdır.

## Mimari ve Özellikler

* **Abstraction (Soyutlama):** `Exercise` adında soyut bir ana sınıf oluşturulmuş ve alt sınıfların kendi detaylarını yazdırmasını zorunlu kılan `abstract void showDetails();` metodu kullanılmıştır.
* **Inheritance (Kalıtım):** Vücut ağırlığı hareketleri (`BodyweightExercise`) ve aletli hareketler (`EquipmentExercise`), ana `Exercise` sınıfından miras alarak ortak özellikleri (`name`, `sets`, `reps`) `super()` metodu ile üst sınıfa iletmiştir.
* **Polymorphism (Çok Biçimlilik):** Ana `Main` sınıfında tek bir `ArrayList<Exercise>` kullanılarak farklı türdeki egzersiz nesneleri aynı listede tutulmuş ve bir `for-each` döngüsü içinde her nesne kendi formatına uygun çıktıyı vermiştir.

## Kullanılan Teknolojiler
* Java (Encapsulation, Inheritance, Polymorphism, Abstraction)
* Java Collections (`ArrayList`)
