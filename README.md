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
