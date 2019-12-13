package com.example.a191213_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var dogList = arrayListOf<Dog>(
        Dog("Chow Chow", "Male", "4", "ic_launcher_background"),
        Dog("Breed Pomeranian", "Female", "1", "ic_launcher_background"),
        Dog("Golden Retriver", "Female", "3", "ic_launcher_background"),
        Dog("Yorkshire Terrier", "Male", "5", "ic_launcher_background"),
        Dog("Pug", "Male", "4", "ic_launcher_background"),
        Dog("Alaskan Malamute", "Male", "7", "ic_launcher_background"),
        Dog("Shih Tzu", "Female", "5", "ic_launcher_background"),
        Dog("Chow Chow", "Male", "4", "ic_launcher_background"),
        Dog("Breed Pomeranian", "Female", "1", "ic_launcher_background"),
        Dog("Golden Retriver", "Female", "3", "ic_launcher_background"),
        Dog("Yorkshire Terrier", "Male", "5", "ic_launcher_background"),
        Dog("Pug", "Male", "4", "ic_launcher_background"),
        Dog("Alaskan Malamute", "Male", "7", "ic_launcher_background"),
        Dog("Shih Tzu", "Female", "5", "ic_launcher_background")
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mAdapter = MainRvAdapter(this,dogList)
        mRecyclerView.adapter=mAdapter
        mRecyclerView.setHasFixedSize(true)

        val lm = LinearLayoutManager(this)
        mRecyclerView.layoutManager = lm
        mRecyclerView.setHasFixedSize(true)
    }

}
