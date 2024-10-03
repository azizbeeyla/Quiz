//package com.example.application
//
//import android.content.Intent
//import android.os.Bundle
//import android.view.View
//import android.widget.Adapter
//import android.widget.AdapterView
//import android.widget.ArrayAdapter
//import android.widget.Toast
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//import com.example.application.databinding.ActivityMalumotBinding
//import com.example.application.databinding.CustomerBinding
//import java.time.Year
//
//class Malumot : AppCompatActivity() {
//    private var monthPosition = 0
//    private var dayPosition = 0
//    private var yearPosition = 0
//
//
//    private lateinit var daylist: ArrayList<String>
//    private lateinit var monthlist: ArrayList<String>
//    private lateinit var yearlist: ArrayList<String>
//
//    private lateinit var binding: ActivityMalumotBinding
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMalumotBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//   //     val countries = resources.getStringArray(R.array.Countries)
//
//        daylist = generateDay()
////        this.resources.getStringArray(R.array.month).also {
//        }
//        yearlist = generateYear()
//        binding.Countryspinner.adapter =
//            ArrayAdapter(this, android.R.layout.simple_list_item_1, countries)
//
//        val dayAdapter = ArrayAdapter(this@Malumot, android.R.layout.simple_list_item_1, daylist)
//        val monthAdapter =
//            ArrayAdapter(this@Malumot, android.R.layout.simple_list_item_1, monthlist)
//        val yearAdapter = ArrayAdapter(this@Malumot, android.R.layout.simple_list_item_1, yearlist)
//        binding.monthspinner.adapter = monthAdapter
//        binding.daySpinner.adapter = dayAdapter
//        binding.yearSpinner.adapter = yearAdapter
//
//        binding.monthspinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(
//                parent: AdapterView<*>?,
//                view: View?,
//                position: Int,
//                id: Long
//            ) {
//                monthPosition = position
//                generateDay()
//                binding.daySpinner.adapter =
//                    ArrayAdapter(this@Malumot, android.R.layout.simple_list_item_1, daylist)
//
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                TODO("Not yet implemented")
//            }
//
//
//        }
//        binding.daySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(
//                parent: AdapterView<*>?,
//                view: View?,
//                position: Int,
//                id: Long
//            ) {
//                dayPosition = position
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                TODO("Not yet implemented")
//            }
//
//
//        }
//        binding.yearSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(
//                parent: AdapterView<*>?,
//                view: View?,
//                position: Int,
//                id: Long
//            ) {
//                yearPosition = 2024 - position
//                generateDay()
//                binding.daySpinner.adapter =
//                    ArrayAdapter(this@Malumot, android.R.layout.simple_list_item_1, daylist)
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                TODO("Not yet implemented")
//            }
//
//        }
//
//        binding.okspiner.setOnClickListener {
//
//            var gender = ""
//            if (binding.male.isChecked)
//                gender="Male"
//            if (binding.female.isChecked)
//                gender="Female"
//
//
//            val name = binding.textname.text.toString()
//            val country = binding.Countryspinner.selectedItem.toString()
//            val month = binding.monthspinner.selectedItem.toString()
//            val day = binding.daySpinner.selectedItem.toString()
//            val year = binding.yearSpinner.selectedItem.toString()
//            val data = "$year/ $month / $day"
//
//            Intent(this, Spinner::class.java).apply {
//
//                putExtra("name", name)
//                putExtra("Gender", gender)
//                putExtra("country", country)
//                putExtra("data", data)
//                startActivity(this)
//
//            }
//        }
//
//    }
//    private fun generateYear(): ArrayList<String> {
//     val yearList=ArrayList<String>()
//     yearList.add("Year")
//     for (i in 2023 downTo 1900){
//         yearList.add(i.toString())
//     }
//      return yearList
//
//    }
//private fun generateDay():ArrayList<String>{
//
//    daylist=ArrayList()
//    daylist.add("Day")
//    if (monthPosition !=0&&yearPosition !=0){
//        Toast.makeText(this,"$monthPosition $yearPosition",Toast.LENGTH_SHORT).show()
//        when(monthPosition){
//
//            1,3,5,7,8,10,12->{
//                daylist.addAll(generatecurrentDay(31))
//            }
//            4,6,9,11->{
//                daylist.addAll(generatecurrentDay(30))
//
//
//            }
//            2->{
//
//                if (yearPosition%100==0){
//                    if (yearPosition%400==0)
//                        daylist.addAll(generatecurrentDay(29))
//
//                    else
//                        daylist.addAll(generatecurrentDay(28))
//                        } else{
//                            if (yearPosition%4==0)
//                                daylist.addAll(generatecurrentDay(29))
//                    else
//
//                                daylist.addAll(generatecurrentDay(28))
//
//
//                }
//            }
//        }
//
//    }
//    return daylist
//}
//    private fun generatecurrentDay(to:Int):ArrayList<String>{
//        val daylist=ArrayList<String>()
//        for (i in 1..to){
//            daylist.add(i.toString())
//        }
//        return daylist
//
//    }
//}