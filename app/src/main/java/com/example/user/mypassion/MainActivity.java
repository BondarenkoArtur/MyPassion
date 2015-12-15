package com.example.user.mypassion;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.parse.Parse;
import com.parse.ParseObject;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // [Optional] Power your app with Local Datastore. For more info, go to
        // https://parse.com/docs/android/guide#local-datastore
//        Parse.enableLocalDatastore(this);
        ParseObject.registerSubclass(Song.class);
        Parse.initialize(this, "4AWyskLCpt9m1IHYJ5rKpB7BIzpejcwgYecOT1T5", "CzsSQGeSThCIRxcxPBZLB06JwiC5li0uUgQ3Z7Sb");

        String[] songs = {"New Activity","Агнец в небесах", "Бесконечный свет", "Благословлю Тебя", "Блуждали все как овцы", "Бог небес и земли",
                "Вгору мої", "Верю я", "Він знає моє ім`я", "Вот он я", "Всем сердцем", "Все о чем мечтаю", "В Твоем святом присутствии",
                "В Христе одном", "Господи Великий", "Господь есть мой свет", "Дом", "Жив", "За те, хто Ти є", "За Тобой пойду", "Ім`я Твоє",
                "Иисус - мой Спаситель", "Как лань желает", "Когда умолкнет звук", "Краще з тобою", "Меня нашел Ты", "Мы собрались",
                "Надія є", "На початку було Слово", "Наш Бог великий", "Небес коснусь", "Небо і земля", "Невимовний", "Нет невозможного",
                "Нет никого как Ты", "О, дивний день", "Океаны", "Осанна", "Петь, петь, петь", "Поклонюсь Тебе", "Полони мене", "Превознесен Царь",
                "Превыше власти", "Прекрасний Ти", "Радій, радій", "Разбитые сосуды", "Силен спасти", "Скрой меня", "Свят наш Господь",
                "Так, Господь", "Тобі хвала", "Только в Тебе", "Трудно обьяснить", "Ты обьемлешь меня", "Хвала, Адонай", "Хліб життя",
                "Эта любовь", "Я буду славить Господа", "Я сдаюсь, Бог"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getListView().getContext(), R.layout.my_list_item, songs);
        getListView().setAdapter(adapter);

        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent Sng0 = new Intent(MainActivity.this, com.example.user.mypassion.SongActivity.class);
                        startActivity(Sng0);
                        break;
                    case 1:
                        Intent Sng1=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng1.class);
                        startActivity(Sng1);
                        break;
                    case 2:
                        Intent Sng2=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng2.class);
                        startActivity(Sng2);
                        break;
                    case 3:
                        Intent Sng3=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng3.class);
                        startActivity(Sng3);
                        break;
                    case 4:
                        Intent Sng4=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng4.class);
                        startActivity(Sng4);
                        break;
                    case 5:
                        Intent Sng5=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng5.class);
                        startActivity(Sng5);
                        break;
                    case 6:
                        Intent Sng6=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng6.class);
                        startActivity(Sng6);
                        break;
                    case 7:
                        Intent Sng7=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng7.class);
                        startActivity(Sng7);
                        break;
                    case 8:
                        Intent Sng8=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng8.class);
                        startActivity(Sng8);
                        break;
                    case 9:
                        Intent Sng9=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng9.class);
                        startActivity(Sng9);
                        break;
                    case 10:
                        Intent Sng10=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng10.class);
                        startActivity(Sng10);
                        break;
                    case 11:
                        Intent Sng11=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng11.class);
                        startActivity(Sng11);
                        break;
                    case 12:
                        Intent Sng12=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng12.class);
                        startActivity(Sng12);
                        break;
                    case 13:
                        Intent Sng13=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng13.class);
                        startActivity(Sng13);
                        break;
                    case 14:
                        Intent Sng14=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng14.class);
                        startActivity(Sng14);
                        break;
                    case 15:
                        Intent Sng15=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng15.class);
                        startActivity(Sng15);
                        break;
                    case 16:
                        Intent Sng16=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng16.class);
                        startActivity(Sng16);
                        break;
                    case 17:
                        Intent Sng17=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng17.class);
                        startActivity(Sng17);
                        break;
                    case 18:
                        Intent Sng18=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng18.class);
                        startActivity(Sng18);
                        break;
                    case 19:
                        Intent Sng19=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng19.class);
                        startActivity(Sng19);
                        break;
                    case 20:
                        Intent Sng20=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng20.class);
                        startActivity(Sng20);
                        break;
                    case 21:
                        Intent Sng21=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng21.class);
                        startActivity(Sng21);
                        break;
                    case 22:
                        Intent Sng22=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng22.class);
                        startActivity(Sng22);
                        break;
                    case 23:
                        Intent Sng23=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng23.class);
                        startActivity(Sng23);
                        break;
                    case 24:
                        Intent Sng24=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng24.class);
                        startActivity(Sng24);
                        break;
                    case 25:
                        Intent Sng25=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng25.class);
                        startActivity(Sng25);
                        break;
                    case 26:
                        Intent Sng26=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng26.class);
                        startActivity(Sng26);
                        break;
                    case 27:
                        Intent Sng27=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng27.class);
                        startActivity(Sng27);
                        break;
                    case 28:
                        Intent Sng28=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng28.class);
                        startActivity(Sng28);
                        break;
                    case 29:
                        Intent Sng29=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng29.class);
                        startActivity(Sng29);
                        break;
                    case 30:
                        Intent Sng30=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng30.class);
                        startActivity(Sng30);
                        break;
                    case 31:
                        Intent Sng31=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng31.class);
                        startActivity(Sng31);
                        break;
                    case 32:
                        Intent Sng32=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng32.class);
                        startActivity(Sng32);
                        break;
                    case 33:
                        Intent Sng33=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng33.class);
                        startActivity(Sng33);
                        break;
                    case 34:
                        Intent Sng34=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng34.class);
                        startActivity(Sng34);
                        break;
                    case 35:
                        Intent Sng35=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng35.class);
                        startActivity(Sng35);
                        break;
                    case 36:
                        Intent Sng36=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng36.class);
                        startActivity(Sng36);
                        break;
                    case 37:
                        Intent Sng37=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng37.class);
                        startActivity(Sng37);
                        break;
                    case 38:
                        Intent Sng38=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng38.class);
                        startActivity(Sng38);
                        break;
                    case 39:
                        Intent Sng39=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng39.class);
                        startActivity(Sng39);
                        break;
                    case 40:
                        Intent Sng40=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng40.class);
                        startActivity(Sng40);
                        break;
                    case 41:
                        Intent Sng41=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng41.class);
                        startActivity(Sng41);
                        break;
                    case 42:
                        Intent Sng42=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng42.class);
                        startActivity(Sng42);
                        break;
                    case 43:
                        Intent Sng43=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng43.class);
                        startActivity(Sng43);
                        break;
                    case 44:
                        Intent Sng44=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng44.class);
                        startActivity(Sng44);
                        break;
                    case 45:
                        Intent Sng45=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng45.class);
                        startActivity(Sng45);
                        break;
                    case 46:
                        Intent Sng46=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng46.class);
                        startActivity(Sng46);
                        break;
                    case 47:
                        Intent Sng47=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng47.class);
                        startActivity(Sng47);
                        break;
                    case 48:
                        Intent Sng48=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng48.class);
                        startActivity(Sng48);
                        break;
                    case 49:
                        Intent Sng49=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng49.class);
                        startActivity(Sng49);
                        break;
                    case 50:
                        Intent Sng50=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng50.class);
                        startActivity(Sng50);
                        break;
                    case 51:
                        Intent Sng51=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng51.class);
                        startActivity(Sng51);
                        break;
                    case 52:
                        Intent Sng52=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng52.class);
                        startActivity(Sng52);
                        break;
                    case 53:
                        Intent Sng53=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng53.class);
                        startActivity(Sng53);
                        break;
                    case 54:
                        Intent Sng54=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng54.class);
                        startActivity(Sng54);
                        break;
                    case 55:
                        Intent Sng55=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng55.class);
                        startActivity(Sng55);
                        break;
                    case 56:
                        Intent Sng56=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng56.class);
                        startActivity(Sng56);
                        break;
                    case 57:
                        Intent Sng57=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng57.class);
                        startActivity(Sng57);
                        break;
                    case 58:
                        Intent Sng58=new Intent(MainActivity.this, com.example.user.mypassion.songs.Sng58.class);
                        startActivity(Sng58);
                        break;
                }
            }
        });
    }


}
