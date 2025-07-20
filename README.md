# 🐲 Chinese Zodiac Calculator (Java)

Bu proje, kullanıcının doğum yılını alarak **Çin Zodyağı burcunu** hesaplayan basit ve öğretici bir **Java konsol uygulamasıdır**.  
Program, temel kontrol yapılarından biri olan `switch-case` kullanılarak yazılmıştır.

---

## 🎯 Projenin Amacı

Bu uygulama, Java programlama dilini öğrenenler için;

- Kullanıcı girişi alma (`Scanner` kullanımı),
- Matematiksel işlem yapma (% mod alma),
- Koşullu yapılar (`switch-case`),
- String tanımlama ve yazdırma

gibi temel konuları kavratmayı hedefler.

Aynı zamanda **Çin Zodyağı sistemi hakkında da öğretici** bir örnek oluşturur.

---

## 🧮 Çin Zodyağı Nasıl Hesaplanır?

Çin Zodyağı 12 hayvandan oluşan döngüsel bir takvimdir.  
Kişinin **doğum yılı** 12’ye bölünerek kalana göre hayvan burcu belirlenir.

Formül:
```
ZodyakIndex = DoğumYılı % 12
```

| Kalan | Burç    |
|-------|---------|
| 0     | Maymun  |
| 1     | Horoz   |
| 2     | Köpek   |
| 3     | Domuz   |
| 4     | Fare    |
| 5     | Öküz    |
| 6     | Kaplan  |
| 7     | Tavşan  |
| 8     | Ejderha |
| 9     | Yılan   |
| 10    | At      |
| 11    | Koyun   |

---

## 💻 Uygulamanın Çalışma Mantığı

1. Kullanıcıdan doğum yılı alınır.
2. `% 12` işlemiyle zodyak indexi hesaplanır.
3. `switch-case` ile bu indexe karşılık gelen burç belirlenir.
4. Sonuç ekrana yazdırılır.

---

## 🔧 Gereksinimler

- Java JDK 8 veya üzeri
- Komut satırı veya bir IDE (IntelliJ IDEA, Eclipse, VS Code vs.)

---

## ▶️ Uygulama Nasıl Çalıştırılır?

1. Projeyi klonlayın veya ZIP olarak indirin:

```bash
git clone https://github.com/berkerduran/ChineseZodiac.git
cd ChineseZodiac
```

2. Java dosyasını derleyin:

```bash
javac ChineseZodiacSwitch.java
```

3. Programı çalıştırın:

```bash
java ChineseZodiacSwitch
```

4. Doğum yılınızı girin ve Çin burcunuzu öğrenin 🎉

---

## 📁 Dosya Yapısı

```
ChineseZodiac/
├── ChineseZodiacSwitch.java   # Ana Java sınıfı
└── README.md                  # Proje açıklama dosyası
```

---

## 📚 Ekstra Bilgi

- Bu programda sadece burç hesaplanır, Çin element döngüsü (toprak, su, ateş, metal, ağaç) gibi gelişmiş detaylar bulunmaz.
- İleride bu proje, kullanıcı arayüzü (GUI) veya doğum tarihi üzerinden otomatik element belirleme gibi özelliklerle geliştirilebilir.

---

## 👤 Geliştirici

**Süleyman Berk Erduran**  
GitHub: [@berkerduran](https://github.com/berkerduran)

---

## 📜 Lisans

Bu proje açık kaynaklıdır ve MIT lisansı ile lisanslanmıştır. Dilediğiniz gibi kullanabilir, geliştirebilir ve paylaşabilirsiniz.