package ru.startandroid.weatherapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var items = listOf(
            "Mon 6/23 - Sunny - 31/17",
            "Tue 6/24 - Foggy - 31/17",
            "Mon 6/25 - Cloudy - 31/17",
            "Mon 6/26 - Rainy - 31/17",
            "Mon 6/27 - Foggy - 31/17",
            "Mon 6/28 - TRAPPED IN WEATHERSTATION - 31/17",
            "Mon 6/29 - Sunny - 31/17"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        forecast_list.layoutManager = LinearLayoutManager(this)
        forecast_list.adapter = ForecastListAdapter(items)

    }

    fun niceToast(msg: String, length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, msg, length).show()
    }
}
