package com.example.home13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.home13.adapter.UserAdapter
import com.example.home13.databinding.ActivityMainBinding
import com.example.home13.models.User

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var list: ArrayList<User>
    private lateinit var userAdapter: UserAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadData()

        userAdapter = UserAdapter(list)
        binding.rv.adapter = userAdapter
    }

    private fun loadData() {
        list = ArrayList()
        for (i in 0 until 20){
            list.add(User("Avengers", "https://ee2.pigugroup.eu/colours/516/936/4/5169364/nature-talve-fliiskate-lukuga-70-gm-beez_xbig.jpg", "16 Feb 2018", "500"))
            list.add(User("Avengers", "https://i.pinimg.com/736x/ff/d8/d3/ffd8d334105dbdbe8d8797df440d1b63--digital-backdrops-nature-photos.jpg", "17 March 2018", "400"))
            list.add(User("Iron Man", "https://5.imimg.com/data5/PQ/QN/TE/ANDROID-94896543/screenshot-20191022-125319-jpg-500x500.jpg","17 April 2018", "550" ))
            list.add(User("Avengers", "https://cdn5.vectorstock.com/i/1000x1000/61/89/natural-disaster-retro-cartoon-2x2-icons-set-vector-10906189.jpg", "15 Jan 2018", "1500"))
        }

    }
}