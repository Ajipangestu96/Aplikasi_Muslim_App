package com.example.aji.aplikasi_muslim_app;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DataDoa extends AppCompatActivity {

    private TextView Getdoa, Getarab, Getbaca, Getarti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_doa);

        getSupportActionBar().setTitle("Doa Harian");
        Getdoa = findViewById(R.id.getdoa);
        Getarab = findViewById(R.id.getarab);
        Getbaca = findViewById(R.id.getbaca);
        Getarti = findViewById(R.id.getarti);
        showData();
    }

@SuppressLint("SetTextI18n")
    private void showData(){
        String doa = getIntent().getExtras().getString("MyName");
        switch (doa){

            case "Doa Niat Berwudhu" :
                Getdoa.setText("Doa Niat Berwudhu");
                Getarab.setText("نَوَيْتُ الْوُضُوْءَ لِرَفْعِ الْحَدَثِ اْلاَصْغَرِ فَرْضًا لِلّٰهِ تَعَالَى");
                Getbaca.setText("Nawaitul whudu-a lirof'il hadatsii ashghori fardhon lillaahi ta'aalaa");
                Getarti.setText("Saya niat berwudhu untuk menghilangkan hadast kecil fardu (wajib) karena Allah ta'ala");
                break;

            case "Doa Setelah Berwudhu" :
                Getdoa.setText("Doa Setelah Berwudhu");
                Getarab.setText("اَشْهَدُ اَنْ لاَّاِلَهَ اِلاَّاللهُ وَحْدَهُ لاَشَرِيْكَ لَهُ وَاَشْهَدُ اَنَّ مُحَمَّدًاعَبْدُهُ وَرَسُوْلُهُ. اَللّٰهُمَّ اجْعَلْنِىْ مِنَ التَّوَّابِيْنَ وَاجْعَلْنِىْ مِنَ الْمُتَطَهِّرِيْنَ");
                Getbaca.setText("Asyhadu allaa ilaaha illalloohu wahdahuu laa syariika lahu wa asyhadu anna muhammadan ‘abduhuuwa rosuuluhuu, alloohummaj’alnii minat tawwaabiina waj’alnii minal mutathohhiriina");
                Getarti.setText("Aku bersaksi, tidak ada Tuhan selain Allah Yang Maha Esa, tidak ada sekutu bagi-Nya, dan aku mengaku bahwa Nabi Muhammad itu adalah hamba dan Utusan Allah. Ya Allah, jadikanlah aku dari golongan orang-orang yang bertaubat dan jadikanlah aku dari golongan orang-orang yang bersuci");
                break;

            case "Doa Untuk Kedua orang Tua" :
                Getdoa.setText("Doa Untuk Kedua Orang Tua");
                Getarab.setText("اللَّهُمَّ اغْفِرْ لِى وَلِوَ الِدَىَّ وَارْ حَمْهُمَا كَمَا رَبَّيَا نِى صَغِيْرًا");
                Getbaca.setText("Allahumma fighfirlii wa liwaa lidhayya warham humaa kamaa rabbayaa nii shokhiroon");
                Getarti.setText("Ya Allah, ampunilah aku dan kedua orang tuaku. Baik ibu maupun bapakku, sayangilah mereka seperti mereka menyayangiku di waktu kecil");
                break;

            case "Doa sebelum tidur" :
                Getdoa.setText("Doa sebelum tidur");
                Getarab.setText("بِسْمِكَ اللّهُمَّ اَحْيَا وَ بِسْمِكَ اَمُوْتُ");
                Getbaca.setText("Bismika Allahumma ahya wabismika amuut");
                Getarti.setText("Dengan menyebut nama-Mu, Ya Allah, aku hidup dan dengan menyebut Nama-Mu aku mati");
                break;

            case "Doa bangun tidur" :
                Getdoa.setText("Doa bangun tidur");
                Getarab.setText("اَلْحَمْدُ ِللهِ الَّذِى أَحْيَانَا بَعْدَمَا أَمَاتَنَا وَإِلَيْهِ النُّشُورُ");
                Getbaca.setText("Alhamdulillahilladzii ahyanaa ba’damaa amatanaa wailaihin nusyuur");
                Getarti.setText("Segala puji bagi Allah yang telah menghidupkan kami sesudah kami mati (membangunkan dari tidur) dan hanya kepada-Nya kami dikembalikan");
                break;

            case "Doa ketika masuk rumah" :
                Getdoa.setText("Doa ketika masuk rumah");
                Getarab.setText("اَللّٰهُمَّ اِنِّىْ اَسْأَلُكَ خَيْرَالْمَوْلِجِ وَخَيْرَالْمَخْرَجِ بِسْمِ اللهِ وَلَجْنَا وَبِسْمِ اللهِ خَرَجْنَا وَعَلَى اللهِ رَبِّنَا تَوَكَّلْنَاْ");
                Getbaca.setText("Allahumma innii as-aluka khoirol mauliji wa khoirol makhroji bismillaahi wa lajnaa wa bismillaahi khorojnaa wa’alallohi robbina tawakkalnaa");
                Getarti.setText("Ya Allah, sesungguhnya aku memohon kepada-Mu baiknya tempat masuk dan baiknya tempat keluar dengan menyebut nama Allah kami masuk,dan dengan menyebut nama Allah kami keluar dan kepada Allah Tuhan kami, kami berserah diri");
                break;

            case "Doa ketika bercermin" :
                Getdoa.setText("Doa ketika bercermin");
                Getarab.setText("اَلْحَمْدُ ِللهِ كَمَا حَسَّنْتَ خَلْقِىْ فَحَسِّـنْ خُلُقِىُْ");
                Getbaca.setText("Alhamdulillaahi kamaa hassanta kholqii fahassin khuluqii");
                Getarti.setText("Segala puji bagi Allah, baguskanlah budi pekertiku sebagaimana Engkau telah membaguskan rupa wajahku");
                break;

            case "Hadist menuntut ilmu" :
                Getdoa.setText("Hadist menuntut ilmu");
                Getarab.setText("مَنْ خَرَجَ فِى طَلَبُ الْعِلْمِ فَهُوَ فِى سَبِيْلِ اللهِ حَتَّى يَرْجِعَ");
                Getbaca.setText("Mankhoroja fitolabul'ilmi fahuwafisabilliahihatta yarji'a");
                Getarti.setText("Barang siapa yang keluar untuk mencari ilmu maka ia berada di jalan Allah hingga ia pulang (HR. Turmudzi)");
                break;




        }
    }
}
