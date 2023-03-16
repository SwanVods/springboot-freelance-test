# Readme
## Deskripsi
Potongan kode ini merupakan contoh aplikasi REST API sederhana menggunakan Spring Boot. Aplikasi ini memiliki dua endpoint, yaitu `/api/v1/prime` dan `/api/v1/sort`.

### Endpoint `/api/v1/prime`
Endpoint ini berfungsi untuk mengembalikan bilangan prima yang kurang dari atau sama dengan bilangan bulat `n` yang diberikan sebagai parameter.

- Metode: `GET`
- Parameter: `n` (bilangan bulat)

Contoh request:
```bash
GET /api/v1/prime?n=10
```

Contoh response :
```json
{
    "status": true,
    "data": [2, 3, 5, 7]
}
```

### Endpoint `/api/v1/sort`
Endpoint ini berfungsi untuk mengurutkan kumpulan bilangan bulat yang diberikan dalam permintaan dan mengembalikannya dalam urutan yang diurutkan.

- Metode: `POST`
- Konten permintaan: JSON array berisi bilangan bulat

- Contoh permintaan:

```text
POST /api/v1/sort
Content-Type: application/json

[5, 1, 9, 3]
```
Contoh respons:
```json
{
    "status": true,
    "data": [1, 3, 5, 9]
}
```

## Instalasi dan Penggunaan
Untuk menjalankan aplikasi ini, diperlukan untuk menginstal JDK dan Maven, serta mengimpor dependency Spring Boot. Setelah mengonfigurasi environment, jalankan aplikasi menggunakan perintah berikut:
```bash
mvn spring-boot:run
```
Aplikasi akan berjalan di `localhost:8080`. endpoint dapat diakses menggunakan tools seperti `curl` atau aplikasi API Testing seperti Postman.