package com.example.skripsi.Gharib;

import android.media.MediaPlayer;

import com.example.skripsi.R;

import java.util.ArrayList;

public class DataBacaanGhorib {
    MediaPlayer Bacaan;
    private static final String[] urutanRukun ={
            "1. Imalah",
            "2. Isymam",
            "3. Saktah",
            "4. Tashil",
            "5. Naql",
            "6. Badal",
            "7. Mad dan Qashr"

    };

    private static String detailRukun[] = {
            "Bacaan gharib pertama adalah Imalah. Imalah secara bahasa berarti cenderung atau belok. Dalam istilah Qiraat, Imalah berarti sedikit membunyikan fathah ke arah kasrah (setengah kasrah dan setengah fathah). Sehingga bunyinya menjadi e. Menurut Imam Hafs, hanya ada satu bacaan yang dibaca Imalah. Yaitu pada Surat Hud Ayat 41.\n" +
                    "\n" +
                    "وَقَالَ ارْكَبُوْا فِيْهَا بِسْمِ اللهِ مَجْرَىهَا وَمُرْسَىهَا\n" +
                    "Pada dasarnya, setiap Alif yang berharakat Fathah dibaca a. Namun, khusus pada lafadz مجرىَها dibaca e sehingga bunyinya menjadi “majreehaa”.",
            "Secara istilah Isymam, sebagai bacaan gharib kedua, berarti memasukkan unsur Dhommah pada Sukun dengan cara memoncongkan bibir. Terdapat satu bacaan al-Qur’an yang dibaca Isymam menurut Riwayat Hafs, yaitu pada Surat Yusuf Ayat 11.\n" +
                    "\n" +
                    "قَالُوْا يَا اَبَانَا مَا لَكَ لَا تَأْمَنَّا عَلَى يُوْسُفَ\n" +
                    "Saktah secara istilah berarti berhenti sebentar tanpa bernafas. Terdapat empat bacaan dalam al-Qur’an yang dibaca Saktah.\n" +
                    "\n" +
                    "Surat al-Kahfi Ayat 1-2\n" +
                    "\n" +
                    "…… وَلَمْ يَجْعَلْ لَهُ عِوَجًا (1) قَيِّمًا\n" +
                    "Diantara lafadz عِوَجًا (1) قَيِّمًا terdapat bacaan Saktah, yaitu berhenti sejena tanpa benafas. sehingga bunyinya menjadi عِوَجًا (berhenti sebenar tanpa bernafas) قَيِّمًا\n" +
                    "\n" +
                    "Surat Yasin Ayat\n" +
                    "\n" +
                    "….. مَنْ بَعَثَنَا مِنْ مَّرْقَدِنَا..هَذَا مَا وَعَدَ الرَّحْمَانُ\n" +
                    "Bacaan Saktah pada ayat ini terletak pada lafadz مِنْ مَرْقَدِنَا..هَذَا\n" +
                    "\n" +
                    "Surat al-Qiyamah Ayat\n" +
                    "\n" +
                    "وَقِيْلَ مَنْ .. رَاقٍ\n" +
                    "Bacaan Saktah pada ayat ini terletak pada lafadz مَنْ .. رَاقٍ\n" +
                    "\n" +
                    "Surat al-Muthaffifin Ayat\n" +
                    "\n" +
                    "كَلَّا بَلْ… رَانَ عَلَى\n" +
                    "Bacaan Saktah pada ayat ini terletak pada بَلْ… رَانَ",
            "Saktah secara istilah berarti berhenti sebentar tanpa bernafas. Terdapat empat bacaan dalam al-Qur’an yang dibaca Saktah.\n" +
                    "\n" +
                    "Surat al-Kahfi Ayat 1-2\n" +
                    "\n" +
                    "…… وَلَمْ يَجْعَلْ لَهُ عِوَجًا (1) قَيِّمًا\n" +
                    "Diantara lafadz عِوَجًا (1) قَيِّمًا terdapat bacaan Saktah, yaitu berhenti sejena tanpa benafas. sehingga bunyinya menjadi عِوَجًا (berhenti sebenar tanpa bernafas) قَيِّمًا\n" +
                    "\n" +
                    "Surat Yasin Ayat\n" +
                    "\n" +
                    "….. مَنْ بَعَثَنَا مِنْ مَّرْقَدِنَا..هَذَا مَا وَعَدَ الرَّحْمَانُ\n" +
                    "Bacaan Saktah pada ayat ini terletak pada lafadz مِنْ مَرْقَدِنَا..هَذَا\n" +
                    "\n" +
                    "Surat al-Qiyamah Ayat\n" +
                    "\n" +
                    "وَقِيْلَ مَنْ .. رَاقٍ\n" +
                    "Bacaan Saktah pada ayat ini terletak pada lafadz مَنْ .. رَاقٍ\n" +
                    "\n" +
                    "Surat al-Muthaffifin Ayat\n" +
                    "\n" +
                    "كَلَّا بَلْ… رَانَ عَلَى\n" +
                    "Bacaan Saktah pada ayat ini terletak pada بَلْ… رَانَ",
            "Tashil berarti membunyikan antara Hamzah dan Alif. Terdapat satu bacaan dalam al-Qur’an yang dibaca Tashil, yaitu pada Surat Fusshilat Ayat 44.\n" +
                    "\n" +
                    "….. ءَاَعْجَمِيٌّ وَ عَرَبِيّْ\n" +
                    "Bacaan ءَاَعْجَمِيٌّ semula berbunyi Aa’jamiyyun, karena dibaca Tashil bunyinya menjadi Aha’jamiyyun.",
            "Naql secara istilah adalah memindahlan harakat pada huruf sebelumnya. Dalam Riwayat Hafs, terdapat satu ayat dalam al-Qur’an yang dibaca Naql, yaitu pada Surat al-Hujurat Ayat 11.\n" +
                    "\n" +
                    "بِئْسَ الإِسْمُ الْفُسُوْقُ بَعْدَ الإِيْمَانِ\n" +
                    "Pada bacaan al-Qur’an pada umumnya, lafadz بِئْسَ الإِسْمُ dibaca Bi’sal ismu. namun, karena menurut Imam Hafs lafadz tersebut dibaca Naql, maka bunyinya menjadi Bi’salismu.",
            "Badal dalam hal ini berarti mengganti huruf dalam sebuah bacaan. Badal terdiri dari beberapa macam. Pertama, Badal huruf ء dengan ي. Huruf ء sukun disini diganti menjadi dibaca ي, khusus apabila dibaca waqaf. Contohnya pada Surat al-Ahqaf Ayat 4\n" +
                    "\n" +
                    " أَمْ لَهُمْ شِرْكٌ فِى السَّموَاتِ ائْتُوْنِيْ بِكِتَابٍ\n" +
                    "Pada ayat tersebut apabila dibaca washal berbunyi, Fissamaawaati’tuunii. namun, jika dibaca waaqaf (berhenti), bacaanya menjadi Fissamaawaat..iituuni. Hamzah sukun disini diganti dengan Ya’ (iituuni), sehingga bacaannya menjadi panjang satu harakat dan berhukum Mad Thabi’i.\n" +
                    "\n" +
                    "Kedua, Badal huruf ص dengan س. Terdapat tiga ayat yang dibaca dengan cara ini. Pertama, pada Surat al-Baqarah ayat. Contohnya pada lafadz يبصط , dibaca يبسط.",
            "Mad dan Qashr dalam hal ini adalah bacaan khusus pada bacaan pendek menjadi panjang, ataupun panjang menjadi pendek. Contohnya\n" +
                    "\n" +
                    "Lafadz أَنَا dan لَكِنَّا dibaca pendek. contohnya pada Surat az-Zukhruf ayat 81 dan Surat al-Kahfi Ayat 38\n" +
                    "فَأَنَا أَوَّلُ اْلعَابِدِيْنِ, لَكِنَّ هُوَاللهُ رَبِّيْ\n" +
                    "Lafadz الظُّنُوْنَا, الرَّسُوْلَا, قَوَارِيْرَا tetap dibaca panjang ketika waqaf. Khusus untuk lafadz قَوَارِيْرَا dibaca pendek ketika washal.\n" +
                    "Lafadz سَلَاسِلَا dibaca pendek ketika washal dan dibaca panjang ketika waqaf. Contohnya pada Surat al-Insan Ayat 4\n" +
                    "….لِلْكَافِرِيْنَ سَلَاسِلَا وَ أَغْلَالًا\n" +
                    "Lafadz أَفَإِنْ,مِنْ نَبَائٍ, مَلَائِهِمْ, مَلَئِهِ, مِائَتَيْنِ dan مِائَةٌ selalu dibaca pendek\n" +
                    "Lafadz لِتَتْلُوَا, لِيَبْلُوَا, لِيَرْبُوَا,نَبْلُوَا dan لَنْ نَدْعُوَا selalu dibaca pendek\n" +
                    "Lafadz ثَمُوْدَا selalu dibaca pendek. Contohnya pada Surat Hud Ayat 68\n" +
                    "أَلاَ إِنَّ ثَمُوْدَا كَفَرُوْا رَبَّهُمْ"
    };

    static ArrayList<ModelBacaanGharib> getListData(){
        ArrayList<ModelBacaanGharib> list = new ArrayList<>();
        for (int position = 0; position < urutanRukun.length; position++){
            ModelBacaanGharib rukun = new ModelBacaanGharib();
            rukun.setNama(urutanRukun[position]);
            rukun.setDetail(detailRukun[position]);
            list.add(rukun);
        }
        return list;
    }
}
