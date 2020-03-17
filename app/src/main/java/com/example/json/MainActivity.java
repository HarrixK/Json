package com.example.json;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<QuizInfo> ArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ArrayList<QuizInfo> list =new ArrayList<>();
//        list.add(new QuizInfo("NewYork Bulls"));
//        list.add(new QuizInfo("Los Angeles Kings"));
//        list.add(new QuizInfo("Golden State Warriors"));
//        list.add(new QuizInfo("Huston Rocket"));
//
//        Quiz Quiz=new Quiz("Quiz",
//                "Sport",
//                "Question",
//                "Which one is correct team in NBA?", list,
//                "Huston Rocket");
//
//        ArrayList<QuizInfo> list2 =new ArrayList<>();
//        list2.add(new QuizInfo("10"));
//        list2.add(new QuizInfo("11"));
//        list2.add(new QuizInfo("11"));
//        list2.add(new QuizInfo("12"));
//
//        Quiz Quiz2=new Quiz("Quiz",
//                "Maths",
//                "Question",
//                "5+7=?", list2,
//                "12");

        Gson gson=new Gson();
            String json="{\"Answer\":\"Huston Rocket\",\"Q1\":\"Question\",\"Question\":\"Which one is correct team in NBA?\",\"Quiz\":\"Quiz\",\"Sport\":\"Sport\",\"objectQuizInfo\":[{\"Options\":\"NewYork Bulls\"},{\"Options\":\"Los Angeles Kings\"},{\"Options\":\"Golden State Warriors\"},{\"Options\":\"Huston Rocket\"}]}";
            Quiz jsonQuiz=gson.fromJson(json, Quiz.class);
//        String MyJson=gson.toJson(Quiz);
//        String obj;


    }

}
