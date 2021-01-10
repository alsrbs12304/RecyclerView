package com.study.recyclerviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileList = arrayListOf(
            Profiles(R.drawable.man,"홍드로이드",25,"안드로이드 앱 개발자"),
            Profiles(R.drawable.woman,"안드로이드",15,"아이폰 앱 개발자"),
            Profiles(R.drawable.woman,"김드로이드",20,"리액트 앱 개발자"),
            Profiles(R.drawable.man,"신드로이드",32,"플러터 앱 개발자"),
            Profiles(R.drawable.woman,"이드로이드",19,"유니티 앱 개발자"),
            Profiles(R.drawable.man,"몬드로이드",21,"알고리즈 앱 개발자"),
            Profiles(R.drawable.man,"민드로이드",34,"웹 앱 개발자"),
            Profiles(R.drawable.woman,"공드로이드",30,"하이브리드 앱 개발자"),
            Profiles(R.drawable.man,"정드로이드",24,"그냥 앱 개발자"),
            Profiles(R.drawable.woman,"박드로이드",41,"배고픈 앱 개발자"),
            Profiles(R.drawable.man,"교드로이드",28,"졸린 앱 개발자"),
            Profiles(R.drawable.woman,"저드로이드",26,"추운 앱 개발자")
        )
        rv_profile.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        rv_profile.setHasFixedSize(true)

        rv_profile.adapter = ProfileAdapter(profileList)
    }
}