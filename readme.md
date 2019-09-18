# Tutorial Dasar Pemrograman Android

## Modul 1 Layouting

### Pengenalan

- Di dalam Android untuk membuat suatu layout user interface caranya dengan membuat sebuah file xml yang terletak di dalam `res/layout`. 
- Terdapat dua jenis komponen layout di Android, yaitu View dan View Group. 
- View adalah obyek yang digambarkan ke layar dimana user dapat melihat dan berinteraksi langsung. 
- View Group adalah obyek yang mengumpulkan/mewadahi obyek-obyek view dan viewgroup.
- Contoh beberapa View :
    - TextView
    - Button
    - ImageView
    - ListView
    - RecyclerView
    - RadioButton
    - CheckBox
- Contoh beberapa ViewGroup :
    - LinearLayout
    - FrameLayout
    - RelativeLayout
    - ConstraintLayout
    - TableLayout
- View-view tersebut sejatinya adalah turunan (inherit) dari kelas View. Begitupula dengan ViewGroup yang merupakan turunan dari kelas ViewGroup.

### Cara Membuat
Untuk membuat layout baru, cara termudah adalah dengan
1. Klik kanan pada folder `res` -> Klik `New` -> Pilih `Android Resource File`
2. Isi nama file layout. Untuk nama file hanya boleh diisi dengan lowercase a-z, angka 0-9, dan underscore.
3. Ganti `Resource type` menjadi `Layout`.
4. Untuk `Root element` bisa menggunakan tipe-tipe ViewGroup diatas.
5. Untuk `Source set` dan `Directory name` biarkan default.
6. Sedangkan `Available qualifiers` digunakan untuk memberikan batasan-batasan layout tersebut bisa ditampilkan pada device tertentu sesuai qualifiers yang diberikan.
7. Terakhir klik `Ok`

***
Mobile Innovation Studio - 2019