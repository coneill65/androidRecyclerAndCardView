package com.example.androidrecyclerandcardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.androidrecyclerandcardview.adapter.MyAdapter
import com.example.androidrecyclerandcardview.models.MyModel

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var arrayList: ArrayList<MyModel>
    lateinit var thisAdapter: MyAdapter
    lateinit var staggered: StaggeredGridLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rb1)
        gridLayoutManager = GridLayoutManager(applicationContext, 3, LinearLayoutManager.VERTICAL, false)

        staggered = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = staggered

        recyclerView.setHasFixedSize(true)

        arrayList = setupData()

        thisAdapter = MyAdapter(applicationContext, arrayList)
        recyclerView.adapter = thisAdapter
    }

    private fun setupData(): ArrayList<MyModel>{
        val items: ArrayList<MyModel> = ArrayList()

        items.add(MyModel(R.drawable.bishop_black, "bishop_black"))
        items.add(MyModel(R.drawable.bishop_white, "bishop_white"))
        items.add(MyModel(R.drawable.king_black, "king_black"))
        items.add(MyModel(R.drawable.king_white, "king_white"))
        items.add(MyModel(R.drawable.knight_black, "knight_black"))
        items.add(MyModel(R.drawable.knight_white, "knight_white"))
        items.add(MyModel(R.drawable.pawn_black, "pawn_black"))
        items.add(MyModel(R.drawable.pawn_white, "pawn_white"))
        items.add(MyModel(R.drawable.queen_black, "queen_black"))
        items.add(MyModel(R.drawable.queen_white, "queen_white"))
        items.add(MyModel(R.drawable.rook_black, "rook_black"))
        items.add(MyModel(R.drawable.rook_white, "rook_white"))
        items.add(MyModel(R.drawable.android_logo, "android_logo"))
        items.add(MyModel(R.drawable.android_logo_2, "android_logo"))
        items.add(MyModel(R.drawable.bugha, "bugha"))
        items.add(MyModel(R.drawable.faze_logo, "faze_logo"))
        items.add(MyModel(R.drawable.nrg_logo_1, "nrg_logo"))
        items.add(MyModel(R.drawable.nrg_logo_2, "nrg_logo"))
        items.add(MyModel(R.drawable.nrg_logo_3, "nrg_logo"))
        items.add(MyModel(R.drawable.pycharm_logo, "pycharm_logo"))
        items.add(MyModel(R.drawable.python_logo, "python_logo"))
        items.add(MyModel(R.drawable.rocket_league_logo, "rocket_league_logo"))
        items.add(MyModel(R.drawable.rlcs_x, "rlcs_x"))
        items.add(MyModel(R.drawable.rlcs_stadium, "rlcs_stadium"))
        items.add(MyModel(R.drawable.sen_logo, "sen_logo"))
        items.add(MyModel(R.drawable.sen_win, "sen_win"))


        return items
    }
}