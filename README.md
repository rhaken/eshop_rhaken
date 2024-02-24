# Tutorial - 3
## Refleksi

### 1. Implementasi Prinsip SOLID
**Prinsip SRP (Single Responsibility Principle):**  
Prinsip SRP menegaskan bahwa satu kelas seharusnya memiliki satu tanggung jawab utama.

Dalam implementasi ini, kelas-kelas controller seperti Homepage, Car, dan Product dipisahkan, masing-masing bertanggung jawab atas fungsionalitasnya sendiri tanpa intervensi terhadap kelas lain.

**Prinsip DIP (Dependency Inversion Principle):**  
Prinsip DIP menyarankan agar kode tingkat tinggi tidak bergantung pada kode tingkat rendah, melainkan pada abstraksi.

Di sini, Car Controller menggunakan antarmuka Service Car tanpa terikat pada implementasi khusus dari antarmuka tersebut.

**Prinsip ISP (Interface Segregation Principle):**  
Prinsip ISP menyatakan bahwa antarmuka seharusnya dibagi menjadi bagian yang lebih kecil sesuai fungsinya.

Implementasi ini membedakan antarmuka yang digunakan antara Car dan Product, memastikan setiap antarmuka menjalankan fungsinya sendiri.

*Catatan:*  
Meskipun ada kesempatan untuk menerapkan prinsip OCP dengan membuat abstraksi dari Car dan Product Repository, hal itu tidak dilakukan karena perbedaan sintaksis antara Repository Produk dan Car Repository, yang akan mengganggu tes dan layanan lainnya.

### 2. Keunggulan Implementasi SOLID
- **Memudahkan Pelacakan Masalah dalam Pengujian Kode:**
  Dengan memecah kode menjadi unit-unit kecil, memudahkan pelacakan masalah saat pengujian. Hal ini memungkinkan identifikasi sumber kesalahan dengan lebih mudah.
  
- **Meningkatkan Keterbacaan Kode:**
  Memecah method menjadi bagian yang lebih kecil meningkatkan keterbacaan kode. Kode yang lebih pendek cenderung lebih mudah dipahami oleh pembaca baru.

- **Meningkatkan Batasan Dependency Kode:**
  Penggunaan Dependency Inversion memastikan bahwa perubahan pada kode tidak memengaruhi bagian lain. Ini memungkinkan fleksibilitas dalam perubahan tanpa merusak kode lain.

### 3. Kerugian Tidak Mengimplementasikan SOLID
- **Sulit Dipahami:**
  Kode yang tidak mematuhi prinsip SOLID akan sulit dipahami. Metode yang melakukan terlalu banyak tugas akan sulit untuk didebug dan dipahami tujuannya.

- **Sulit diuji:**
  Kode yang kompleks atau memiliki banyak ketergantungan akan sulit diuji. Proses pengujian unit akan memerlukan usaha ekstra karena perlu mensimulasikan variabel yang dibutuhkan.

- **Sulit Diubah:**
  Kode yang tidak mematuhi prinsip SOLID akan sulit diubah. Hal ini dapat menyebabkan kerusakan pada modul lain atau memerlukan perombakan saat mengubah tipe data yang diterima oleh sebuah method.


# TUTORIAL - 2
## Refleksi

### 1. _List Quality Code Issues_ yang sudah di fix

- Mengubah modifier dari class interface service:

  Disini saya mengubah modifier yang sebelumnya public menjadi default.
  Ini dilakukan karena class merupakan interface class.

- Mengubah import dari annotation *:
  
  Dalam controller saya mengubah yang awalnya:
  ```java
  import org.springframework.web.bind.annotation.*
  ```
  Menjadi kode dibawah hanya import yang perlu perlu saja

### 2. Implementasi kode sekarang untuk memenuhi CI/CD
Menurut saya, implementasi saya memenuhi basic CI/CD . Dengan github workflows, projek  kita  bisa otomatis melakukan testing dan deployment setiap kali push ke repository GitHub. 
Setiap push akan diuji dengan ci.yml dan diperiksa sekuritas dan kebenaran dari kode menggukan PMD. 
Setelah itu, kode akan di-merge ke branch main dan otomatis di-deploy ke PaaS Koyeb dengan action scorecard.yml, membentuk workflows pada Software Development Lifecycle dengan CI/CD.


# Tutorial - 1
## Refleksi 1
Saya telah mempelajari standar kode dari modul seperti clean code, git flow, secure coding, dan pengujian.

Berikut adalah beberapa implementasi dari standar kode yang diterapkan dalam kode tutorial 1 saya.

### 1. Nama yang Bermakna - Clean Code
Dalam kode tutorial 1 ini, saya telah menerapkan standar `nama yang bermakna`, yang dapat dilihat dari
nama variabel dan fungsi yang jelas dan relevan.

Contoh:

- variabel: `idProduk`, `jumlahProduk`, `namaProduk`, dll
- fungsi: `buat`, `perbaruiProduk`, `hapusProduk`, `buatHalamanProduk`, dll

### 2. Fungsi - Clean Code
Dalam fungsi-fungsi dalam kode saya, saya memastikan bahwa setiap fungsi hanya melakukan satu tugas sesuai dengan tujuannya. Fungsi juga seharusnya tidak memiliki efek samping.

Selain itu, baris-baris fungsi relatif pendek (kecuali mungkin Testing), yang merupakan salah satu implementasi dari konsep bahwa fungsi seharusnya pendek atau kecil.


#### Area untuk Ditingkatkan:
- Belum dapat menangani kasus edge


- Ruang untuk peningkatan dalam penggabungan dan menjaga alur kerja branching yang lebih teratur.


- Kesempatan untuk meningkatkan keamanan kode untuk operasi yang lebih bersih dan aman dari halaman kami.


## Refleksi 2

### Setelah Menulis Unit Test:
Setelah menulis unit test, saya merasa yakin bahwa kode berperilaku seperti yang diharapkan. Ini memberikan keyakinan penting saat membuat perubahan pada kode.

### Jumlah Unit Test dalam Kelas:
Di kelas ProductRepositoryTest, ada beberapa unit test yang mencakup berbagai aspek dari ProductRepository. Jumlahnya sudah cukup, mencakup skenario pembuatan, pengambilan, pembaruan, dan penghapusan produk.

### Memastikan Unit Test Sudah Cukup:
Unit test mencakup berbagai skenario, termasuk mencari produk berdasarkan ID, memperbarui produk, dan menangani kasus di mana produk tidak ditemukan. Penting untuk secara teratur meninjau dan memperbarui unit test ini.

### Cakupan Kode:
Meskipun tidak disebutkan secara eksplisit, penggunaan alat cakupan kode akan membantu memahami sejauh mana kode diuji. Namun, perlu diingat bahwa cakupan kode 100% tidak menjamin kode bebas dari bug.

### Suite Uji Fungsional Baru:
Untuk suite uji fungsional baru untuk `jumlah item dalam daftar produk`, menurut pandangan saya, kebersihan kode mungkin terganggu karena ada pengulangan dalam program, yang bertentangan dengan prinsip `jangan mengulang` dari materi pemrograman.

Selain itu, fungsi-fungsi tersebut mungkin dapat disederhanakan dengan memisahkan setup produk menjadi fungsi-fungsi terpisah sehingga setiap fungsi memiliki tujuan masing-masing.
