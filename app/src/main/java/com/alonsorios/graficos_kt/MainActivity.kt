package com.alonsorios.graficos_kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setBarChart()
    }

    private fun setBarChart() {
        val entries = ArrayList<BarEntry>()
        entries.add(BarEntry(1f, 0f))
        entries.add(BarEntry(2f, 1f))
        entries.add(BarEntry(3f, 2f))
        entries.add(BarEntry(4f, 3f))
        entries.add(BarEntry(5f, 4f))
        entries.add(BarEntry(6f, 5f))

        val barDataSet = BarDataSet(entries, "Cells")

        /*val labels = ArrayList<IBarDataSet>()
        labels.add("18-Jan")
        labels.add("19-Jan")
        labels.add("20-Jan")
        labels.add("21-Jan")
        labels.add("22-Jan")
        labels.add("23-Jan")*/
        val data = BarData( barDataSet)
        barChart.data = data // set the data and list of lables into chart

        //barChart.setDescription("Set Bar Chart Description")  // set the description

        //barDataSet.setColors(ColorTemplate.COLORFUL_COLORS)
        barDataSet.color = resources.getColor(R.color.colorAccent)

        barChart.animateY(5000)
    }
}
