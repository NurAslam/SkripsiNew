package com.example.skripsi.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.skripsi.MainActivity;
import com.example.skripsi.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class KuisActivity extends AppCompatActivity {
    Button close;
    private SoundPool soundPool;
    private int suaraBenar, suaraSalah, suaraFinish;

    private TextView countQuestion;
    private TextView questionLabel;
    private Button ansButton1;
    private Button ansButton2;
    private Button ansButton3;
    private Button ansButton4;
    private String rightAnswer;
    private int rightAnswerCount=0;
    private int quizCount=1;
    private final int QUIZ_COUNT=10;
    ArrayList<ArrayList<String>> quizArray =new ArrayList<>();
    String quizData [][]={
            {"Huruf hijaiyah urutan ke-13 adalah","Syin","Sad","Mim","Lam"},
            {"Tanda baca fathah dibaca","a","u","i","in"},
            {"Huruf nun adalah urutan yang ke- ","25","24","26","22"},
            {"Selain harokat fathah dan kasroh, harokat apa lagi yang ada dalam bacaan hijaiyah","Tanwin","Kasroh tain","Domah tain","Fathah tain"},
            {"Berapakah jumlah harokat dalam bacaan hijaiyah","3","4","5","6"},
            {"Ilmu yang mempelajari tata cara membaca al qur'an dinamakan ilmu","Tajwid","Harakat","Takwa","Hijaiyah"},
            {"Selain kasroh tain dan domah tain, tanwin apa lagi yang ada dalam bacaan hijaiyah","Fathah tain","Kasroh","Fathah","Domah"},
            {"Berapakah jumlah tanwin dalam bacaan hijaiyah","3","6","4","5"},
            {"Jika salah satu huruf hijaiyah bertemu Alif tanpa tanda baca, maka dibaca","Panjang (2 ketukan)","Pendek","Panjang (3 ketukan)","Panjang (5 ketukan)"},
            {"Huruf da adalah urutan yang ke-","8","9","10","12"},
            {"Tanda baca yang terdapat pada huruf hijaiyah dinamakan","Harakat","Takwa","Tajwid","Fathah"},
            {"Jika mad thabi'i/mad asli 'i' bertemu ya sukun/ya mati, maka dibaca","Panjang (2 ketukan)","Panjang (3 ketukan)","Pendek","Panjang (5 ketukan)"},
            {"Tanda baca dhomah dibaca","u","i","un","a"},
            {"Huruf jim jika diberi harakat domah maka dibaca","ju","ja","ji","jin"},
            {"Jika mad thabi'i/mad asli 'u' bertemu wawu sukun/wawu mati, maka dibaca","Panjang (2 ketukan)","Panjang (5 ketukan)","Pendek","Panjang (3 ketukan)"},
            {"Huruf hijaiyah urutan ke-26 yaitu","Wawu","Sad","Syin","Lam"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_GAME).setContentType(AudioAttributes.CONTENT_TYPE_MUSIC).build();
            soundPool = new SoundPool.Builder()
                    .setMaxStreams(3)
                    .setAudioAttributes(audioAttributes).build();

        } else {
            soundPool = new SoundPool(3, AudioManager.STREAM_MUSIC, 0);
        }
        suaraBenar = soundPool.load(this, R.raw.yes, 1);
        suaraSalah = soundPool.load(this, R.raw.no, 1);
        suaraFinish = soundPool.load(this, R.raw.sound_selesai, 1);

        close = findViewById(R.id.keluar);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(KuisActivity.this, MainActivity.class));
            }
        });

        countQuestion = findViewById(R.id.jumlahLabel);
        questionLabel = findViewById(R.id.pertanyaan);
        ansButton1 = findViewById(R.id.ansButton1);
        ansButton2 = findViewById(R.id.ansButton2);
        ansButton3 = findViewById(R.id.ansButton3);
        ansButton4 = findViewById(R.id.ansButton4);

//        Membuat Kuis Array dari Quis Data
        for (int i=0;i<quizData.length;i++){
            ArrayList<String> tmpArray=new ArrayList<>();
            tmpArray.add(quizData[i][0]);
            tmpArray.add(quizData[i][1]);
            tmpArray.add(quizData[i][2]);
            tmpArray.add(quizData[i][3]);
            tmpArray.add(quizData[i][4]);

    // Membuat tmpArray ke QuizArray
            quizArray.add(tmpArray);
}
    showNextQuiz();
}
    public  void showNextQuiz(){
        countQuestion.setText(quizCount + "/10");

        //acak random nomor berbeda 0 dan quizArray length -1
        Random random = new Random();
        int randomNum = random.nextInt(quizArray.size());
        ArrayList<String> Quiz = quizArray.get(randomNum);
        questionLabel.setText(Quiz.get(0) + "? ");
        rightAnswer=Quiz.get(1);
        Quiz.remove(0);
        Collections.shuffle(Quiz);
        ansButton1.setText(Quiz.get(0));
        ansButton2.setText(Quiz.get(1));
        ansButton3.setText(Quiz.get(2));
        ansButton4.setText(Quiz.get(3));

        quizArray.remove(randomNum);
    }

    public void checkAnswer(View view){
        Button ansButton= findViewById(view.getId());
        String btntxt = ansButton.getText().toString();
        if(btntxt.equals(rightAnswer)){
            soundPool.play(suaraBenar, 1, 1, 0, 0, 1);
            Toast.makeText(KuisActivity.this, "Benar!", Toast.LENGTH_SHORT).show();
            rightAnswerCount++;
        }
        else{
            soundPool.play(suaraSalah, 1, 1, 0, 0, 1);
            Toast.makeText(KuisActivity.this, "Salah!", Toast.LENGTH_SHORT).show();
        }
        if (quizCount == QUIZ_COUNT){
            //berpindah ke hasil/skor
            Toast.makeText(KuisActivity.this, "Pertanyaan Terakhir!", Toast.LENGTH_SHORT).show();
            soundPool.play(suaraFinish, 1, 1, 0, 0, 1);
            Intent intent=new Intent(getApplicationContext(),skor_kuis.class);
            intent.putExtra("RIGHT_ANSWER_COUNT",rightAnswerCount);
            startActivity(intent);
        }
        else {
            quizCount++;
            showNextQuiz();
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}