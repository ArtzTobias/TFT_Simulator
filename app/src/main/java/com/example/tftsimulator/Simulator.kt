package com.example.tftsimulator

import android.util.Log

class Simulator {

    val tftSystem = TFT_System()
    val goldCostList = mutableListOf<Int>()
    val rollsList = mutableListOf<Int>()

    fun getListWithAllChampsInAllPools(): MutableList<Pair<String, Int>>{
        var champs_and_pool_1 = tftSystem.get_list_and_pool_of_all_champs(1)
        var champs_and_pool_2 = tftSystem.get_list_and_pool_of_all_champs(2)
        var champs_and_pool_3 = tftSystem.get_list_and_pool_of_all_champs(3)
        var champs_and_pool_4 = tftSystem.get_list_and_pool_of_all_champs(4)
        var champs_and_pool_5 = tftSystem.get_list_and_pool_of_all_champs(5)

        return (champs_and_pool_1 + champs_and_pool_2 + champs_and_pool_3 + champs_and_pool_4 + champs_and_pool_5).toMutableList()

    }

    fun checkIfChampInPool(pool: Int, name:String):Boolean{

        val champs_and_pool = tftSystem.get_list_and_pool_of_all_champs(pool)

        return champs_and_pool.any { it -> it.first == name }
    }

    fun checkPool_IsNotAvailabile(level:Int, pool:Int): Boolean{

        Log.d("Level: $level", (tftSystem.level_1_Odds[pool-1]==0).toString())

        return when(level){
            1 -> tftSystem.level_1_Odds[pool-1] == 0
            2 -> tftSystem.level_2_Odds[pool-1] == 0
            3 -> tftSystem.level_3_Odds[pool-1] == 0
            4 -> tftSystem.level_4_Odds[pool-1] == 0
            5 -> tftSystem.level_5_Odds[pool-1] == 0
            6 -> tftSystem.level_6_Odds[pool-1] == 0
            7 -> tftSystem.level_7_Odds[pool-1] == 0
            8 -> tftSystem.level_8_Odds[pool-1] == 0
            9 -> tftSystem.level_9_Odds[pool-1] == 0
            10 -> tftSystem.level_10_Odds[pool-1] == 0
            11 -> tftSystem.level_11_Odds[pool-1] == 0
            else -> {
                true
            }
        }

    }

    fun startSimulation(pool:Int, name:String, starLevel: Int){

        var combined_list = getListWithAllChampsInAllPools()

        var bankLimit = 8

        val rollCost = 2
        var champCost = pool

        var goalAmountOfChamp: Int = 0

        if(starLevel == 2){
            goalAmountOfChamp = 3
        }
        if(starLevel == 3){
            goalAmountOfChamp = 9
        }

        var currentAmountOfChamp = 0

        var gold_cost = 0
        var bank_gold = 0

        var current_bank = 0

        var amountOfRolls = 0

        goldCostList.clear()
        rollsList.clear()

        for(level in 1..11){
            Log.d("LEVEL", level.toString())
            combined_list = getListWithAllChampsInAllPools()
            if(checkPool_IsNotAvailabile(level, pool)){
                goldCostList.add(0)
                rollsList.add(0)
                continue
            }


            currentAmountOfChamp = 0
            gold_cost = 0
            bank_gold = 0
            current_bank = 0
            amountOfRolls = 0
            var i = 0
            while (currentAmountOfChamp != goalAmountOfChamp) {
                i += 1
                if (i % 5 == 0){
                    gold_cost += rollCost
                    amountOfRolls += 1
                }

                val champ = tftSystem.getRandomChamp(level)

                if (checkIfChampInPool(pool, champ)) {

                    // Wanted champion
                    if (champ == name) {
                        currentAmountOfChamp += 1
                        combined_list = tftSystem.buyChamp(combined_list, champ)
                        gold_cost += champCost

                        // Correct Pool
                    } else {
                        // Check Bank Limit
                        if (bankLimit != current_bank) {
                            combined_list = tftSystem.buyChamp(combined_list, champ)
                            bank_gold += champCost
                            current_bank += 1
                            gold_cost += champCost
                        }

                    }
                }
            }
            goldCostList.add(gold_cost)
            rollsList.add(amountOfRolls)
            Log.d("Gold in Loop at Level $level", gold_cost.toString())

        }
    }
}