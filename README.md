# Soal test maggang Backend engineer dengan Springboot

Berikut adalah soal/pertanyaan yang perlu dijawab oleh peserta maggang

## knowledge base

1. Apa yang anda ketahui tentang Rest API?
api (aplication programming interface) adalah sebuah service yang menghubungkan atau menjembatani antara dua komponen secara terpisah

2. Apa yang anda ketahui tentang Server side and Client side processing?

-Clien side processing adalah suatu proses yang berjalan saat client melakukan proses validasi form sebelum dikirim,animasi dan ganti tampilan tanpa reload. -sementara server side processing adalah proses yang terjadi di server. proses yang menangani validasi autentikasi, authorisasi dan semua yang berhubungan dengan data sensitif di proses di server side.

3. Apa yang anda ketahui tentang Monolith dan Microservices, berikan contohnya?

-design arsitektur monolith adalah sebuah pendekatan di mana seluruh bagian dari aplikasi dibangun dan dijalankan dalam satu kesatuan utuh. Artinya, semua fitur dan komponen dalam sistem dijadikan satu proyek aplikasi yang besar, menggunakan satu basis kode, satu proses build, satu proses deploy, dan biasanya juga satu database. 
-sementara microservice arsitektur adalah pendekatan arsitekturyang memecah aplikasi menjadi layanan-layanan kecil (micro), di mana setiap layanan bertanggung jawab atas satu fitur atau fungsi spesifik, dan dapat dijalankan secara independen.
4. Apa yang anda ketahui tentang Design pattern inversion of Control serta Dependency Injection? 

-Inversion of Control secara harfiah berarti “pembalikan kendali”.sebuah prinsip desain dalam pemrograman yang membalikkan cara tradisional dalam mengelola kontrol suatu aplikasi. Dalam paradigma tradisional, kode aplikasi kita yang mengontrol dan memanggil library atau framework. Namun, dalam IoC, kontrol tersebut diserahkan kepada sebuah kontainer atau kerangka kerja yang bertugas mengelola pembuatan, konfigurasi, dan siklus hidup objek-objek dalam aplikasi. 
-Dependency Injection adalah salah satu cara implementasi dari IoC.
Jadi setelah kita membalik kendali pembuatan objek ke framework, cara menyuntikkan objek itu ke dalam class yang membutuhkannya disebut dependency injection (penyuntikan ketergantungan).

5. Apa yang anda ketahui tentang Java programming dan Spring framework khususnya spring-boot?

Java Spring Boot adalah kerangka kerja (framework) berbasis Java yang dibangun di atas Spring Framework. Spring Boot dirancang untuk menyederhanakan pengembangan aplikasi Java, terutama aplikasi web dan layanan mikro, dengan mengurangi kompleksitas konfigurasi.

## Design modules

Dalam suatu schenario ada requirement membuat aplikasi e-commerse seperti Tokopedia seperti berikut:

1. Catalog, pelanggan mencari product di toko
    ![catalog](imgs/catalog.png)
2. Item, bisa melihat detail informasi produk
    ![items](imgs/item.png)
3. Cart, pelanggan bisa menambahkan produk yang ingin di beli ke keranjang
    ![cart](imgs/cart.png)
4. Setelah di checkout, masuk ke list transaction
    ![list-transaction](imgs/list-transaction.png)
5. Kita juga bisa liat detail transactionya
    ![detail-transaction](imgs/detail-transaction.png)

Kemudian temen-temen buat design database, module (monolith/microservices) berdasarkan gambar atau schenario tersebut. Serta jelakan mengapa menggunakan design tersebut.

## Praktek

Berdasarkan analisa tersebut, buat project monorepo (pada repository ini) dengan menggunakan framework springboot seperti berikut specifikasinya:

- Database: `PostgreSQL 15`
- JDK version: `Oracle JDK 17 or later`
- Springboot version: `3.0.x`

terkait design system Toko, Barang, Pembelian pada ecommerse tersebut.