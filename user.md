Payment Gateaway Ecommerce

user login

Endpoint : /api/users/
GET
response body (success)

{
    id :""
    name:""
}

Endpoint : /api/products

GET /api/products
Request Body :
{
    id : " "
    namaProduk : ""
    deskripsi :""
    stock : ""
    harga : "" 
    category : ""
    Image : ""
    Created_at : ""
    Update_at :""
}

POST /api/products
Response Body :
{
    id : " "
    namaProduk : ""
    deskripsi :""
    stock : ""
    harga : "" 
    category :""
    Image : ""
    Created_at : ""
    Update_at :""
}

liat detail product 

Endpoint : /api/products/{id}

GET /api/products/{id}
response body
{
  "id": 1,
  "name": "Kopi Arabika",
  "description": "Kopi khas Aceh Gayo",
  "price": 25000,
  "stock": 50,
  "category": "minuman",
  "image_url": "https://example.com/images/kopi-arabika.jpg",
  "created_at": "2025-07-31T14:00:00",
  "updated_at": "2025-07-31T14:00:00"
}

user menambahkan ke keranjang belanja 

Endpoint : /api/cart
GET /api/cart
{
  "user_id": 123,
  "product_id": 5,
  "quantity": 2
}

POST /api/cart

{
  "message": "Produk berhasil ditambahkan ke keranjang",
  "data": {
    "cart_item_id": 101,
    "user_id": 123,
    "product": {
      "id": 5,
      "name": "Kopi Robusta",
      "price": 23000,
      "image_url": "https://example.com/images/kopi-robusta.jpg"
    },
    "quantity": 2,
    "total_price": 46000,
    "added_at": "2025-07-31T15:10:00"
  }
}

setelah checkout, dapat menampilkan list transaksi 

Endpoint : /api/transactions/checkout/{UserId}
GET /api/transactions/checkout/{UserId}
{
  "user_id": 123,
  "payment_method": "virtual_account",
  "address": "Jl. Contoh No. 123, Bandung",
  "notes": "Tolong kirim sebelum jam 12 siang"
}

POST /api/transactions/checkout/{UserId}

{
  "message": "Checkout berhasil, silakan lakukan pembayaran",
  "transaction": {
    "transaction_id": 1001,
    "user_id": 123,
    "status": "PENDING",
    "payment_method": "virtual_account",
    "address": "Jl. Contoh No. 123, Bandung",
    "total_amount": 92000,
    "created_at": "2025-07-31T15:30:00",
    "items": [
      {
        "product_id": 5,
        "name": "Kopi Robusta",
        "price": 23000,
        "quantity": 2,
        "subtotal": 46000
      },
      {
        "product_id": 6,
        "name": "Kopi Arabika",
        "price": 23000,
        "quantity": 2,
        "subtotal": 46000
      }
    ]
  }
}

user bisa liat detail transaksi / history transaksi

Endpoint : /api/transaction-items/detail-transaction/{/transactionid}

GET /api/transaction-items/detail-transaction/{/transactionid}

Response body
{
  "transaction_id": 1001,
  "user_id": 123,
  "status": "PAID",
  "payment_method": "virtual_account",
  "address": "Jl. Contoh No. 123, Bandung",
  "total_amount": 92000,
  "created_at": "2025-07-31T15:30:00",
  "updated_at": "2025-07-31T15:40:00",
  "items": [
    {
      "product_id": 5,
      "name": "Kopi Robusta",
      "price": 23000,
      "quantity": 2,
      "subtotal": 46000,
      "image_url": "https://example.com/images/kopi-robusta.jpg"
    },
    {
      "product_id": 6,
      "name": "Kopi Arabika",
      "price": 23000,
      "quantity": 2,
      "subtotal": 46000,
      "image_url": "https://example.com/images/kopi-arabika.jpg"
    }
  ],
  "notes": "Tolong kirim sebelum jam 12 siang"
}
