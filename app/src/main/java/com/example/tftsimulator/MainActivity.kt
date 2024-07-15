package com.example.tftsimulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Scroller
import android.widget.Spinner


private lateinit var spinnerUnits:Spinner
private var TftSystemClass=TFT_System()

private val cost1= TftSystemClass.cost1_champs
private val cost2= TftSystemClass.cost2_champs
private val cost3= TftSystemClass.cost3_champs
private val cost4= TftSystemClass.cost4_champs
private val cost5= TftSystemClass.cost5_champs
private var currentPool=1
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spinnerUnits=findViewById(R.id.spinnerUnits)

        var radioGroupCost=findViewById<RadioGroup>(R.id.radioGroupCost)
        var buttonGo=findViewById<Button>(R.id.buttonGo)


        fillPool(1)

        radioGroupCost.setOnCheckedChangeListener{_, checkedId ->
            when (checkedId) {
                R.id.radioButtonCost1->setChampionPool(1)
                R.id.radioButtonCost2->setChampionPool(2)
                R.id.radioButtonCost3->setChampionPool(3)
                R.id.radioButtonCost4->setChampionPool(4)
                R.id.radioButtonCost5->setChampionPool(5)

            }
        }
        buttonGo.setOnClickListener {
            var costPool= currentPool
        }


    }
    private fun setChampionPool(selectedPool:Int){
      fillPool(selectedPool)
        currentPool=selectedPool
    }
    private fun fillPool(unitCost:Int){
        val items=when (unitCost){
            1-> cost1
            2-> cost2
            3-> cost3
            4-> cost4
            5-> cost5
            else-> cost1
        }
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, items)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerUnits.adapter = adapter


    }
}