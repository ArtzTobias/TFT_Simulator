package com.example.tftsimulator

class TFT_System {

    val cost1_champs = listOf<String>(
        "Ahri",
        "Caitlyn",
        "Chogath",
        "Darius",
        "Garen",
        "Jax",
        "Khazix",
        "Kobuko",
        "KogMaw",
        "Malphite",
        "RekSai",
        "Sivir",
        "Yasuo"
    )

    val cost2_champs = listOf<String>(
        "Aatrox",
        "Gnar",
        "Janna",
        "Kindred",
        "Lux",
        "Neeko",
        "Quiana",
        "Riven",
        "Senna",
        "Shen",
        "Teemo",
        "Yorick",
        "Zyra"
    )

    val cost3_champs = listOf<String>(
        "Alune",
        "Amumu",
        "Aphelios",
        "Bard",
        "Diana",
        "Illaoi",
        "Soraka",
        "Tahm Kench",
        "Thresh",
        "Tristana",
        "Volibear",
        "Yone",
        "Zoe"
    )

    val cost4_champs = listOf<String>(
        "Annie",
        "Ashe",
        "Galio",
        "Kaisa",
        "Kayn",
        "Lee Sin",
        "Lillia",
        "Morgana",
        "Nautilus",
        "Ornn",
        "Sylas",
        "Syndra"
    )

    val cost5_champs = listOf<String>(
        "Azir",
        "Hwei",
        "Irelia",
        "Lissandra",
        "Rakan",
        "Sett",
        "Udyr",
        "Wukong",
        "Xayah"
    )

    val pool_1_cost = 22

    val pool_2_cost = 20

    val pool_3_cost = 17

    val pool_4_cost = 10

    val pool_5_cost = 9

    val cost1_champs_pool = listOf<Pair<String, Int>>(
        Pair("Ahri", pool_1_cost),
        Pair("Caitlyn", pool_1_cost),
        Pair("Chogath", pool_1_cost),
        Pair("Garen", pool_1_cost),
        Pair("Ahri", pool_1_cost),
        Pair("Jax", pool_1_cost),
        Pair("Khazix", pool_1_cost),
        Pair("Kobuko", pool_1_cost),
        Pair("KogMaw", pool_1_cost),
        Pair("Malphite", pool_1_cost),
        Pair("RekSai", pool_1_cost),
        Pair("Sivir", pool_1_cost),
        Pair("Yasuo", pool_1_cost)
    )

    val cost2_champs_pool = listOf<Pair<String, Int>>(
        Pair("Aatrox", pool_2_cost),
        Pair("Gnar", pool_2_cost),
        Pair("Janna", pool_2_cost),
        Pair("Kindred", pool_2_cost),
        Pair("Lux", pool_2_cost),
        Pair("Neeko", pool_2_cost),
        Pair("Quiana", pool_2_cost),
        Pair("Riven", pool_2_cost),
        Pair("Senna", pool_2_cost),
        Pair("Shen", pool_2_cost),
        Pair("Teemo", pool_2_cost),
        Pair("Yorick", pool_2_cost),
        Pair("Zyra", pool_2_cost)
    )

    val cost3_champs_pool = listOf<Pair<String, Int>>(
        Pair("Alune", pool_3_cost),
        Pair("Amumu", pool_3_cost),
        Pair("Aphelios", pool_3_cost),
        Pair("Bard", pool_3_cost),
        Pair("Diana", pool_3_cost),
        Pair("Illaoi", pool_3_cost),
        Pair("Soraka", pool_3_cost),
        Pair("Tahm Kench", pool_3_cost),
        Pair("Thresh", pool_3_cost),
        Pair("Tristana", pool_3_cost),
        Pair("Volibear", pool_3_cost),
        Pair("Yone", pool_3_cost),
        Pair("Zoe", pool_3_cost)
    )

    val cost4_champs_pool = listOf<Pair<String, Int>>(
        Pair("Annie", pool_4_cost),
        Pair("Ashe", pool_4_cost),
        Pair("Galio", pool_4_cost),
        Pair("Kaisa", pool_4_cost),
        Pair("Kayn", pool_4_cost),
        Pair("Lee Sin", pool_4_cost),
        Pair("Lillia", pool_4_cost),
        Pair("Morgana", pool_4_cost),
        Pair("Nautilus", pool_4_cost),
        Pair("Ornn", pool_4_cost),
        Pair("Sylas", pool_4_cost),
        Pair("Syndra", pool_4_cost)
    )

    val cost5_champs_pool = listOf<Pair<String, Int>>(
        Pair("Azir", pool_5_cost),
        Pair("Hwei", pool_5_cost),
        Pair("Irelia", pool_5_cost),
        Pair("Lissandra", pool_5_cost),
        Pair("Rakan", pool_5_cost),
        Pair("Sett", pool_5_cost),
        Pair("Udyr", pool_5_cost),
        Pair("Wukong", pool_5_cost),
        Pair("Xayah", pool_5_cost)
    )

    val level_1_Odds = listOf<Int>(100, 0, 0, 0, 0)
    val level_2_Odds = listOf<Int>(100, 0, 0, 0, 0)
    val level_3_Odds = listOf<Int>(75, 25, 0, 0, 0)
    val level_4_Odds = listOf<Int>(55, 30, 15, 0, 0)
    val level_5_Odds = listOf<Int>(45, 33, 20, 2, 0)
    val level_6_Odds = listOf<Int>(30, 40, 25, 5, 0)
    val level_7_Odds = listOf<Int>(19, 30, 35, 10, 1)
    val level_8_Odds = listOf<Int>(18, 25, 36, 18, 3)
    val level_9_Odds = listOf<Int>(10, 20, 25, 35, 10)
    val level_10_Odds = listOf<Int>(5, 10, 20, 40, 25)
    val level_11_Odds = listOf<Int>(1, 2, 12, 50, 35)

    fun get_list_and_pool_of_all_champs(pool:Int): MutableList<Pair<String, Int>>{

        var champ_pool_list: MutableList<Pair<String, Int>> = when(pool){
            1 -> cost1_champs_pool.toMutableList()
            2 -> cost2_champs_pool.toMutableList()
            3 -> cost3_champs_pool.toMutableList()
            4 -> cost4_champs_pool.toMutableList()
            5 -> cost5_champs_pool.toMutableList()
            else -> {
                throw Exception("wrong champ pool")
            }
        }

        return champ_pool_list
    }

    fun buyChamp(champ_pool_list: MutableList<Pair<String, Int>>, name:String): MutableList<Pair<String, Int>>{
        champ_pool_list.map { it ->
            if (it.first == name) it.copy(first = name, second = it.second - 1)
            else it
        }

        return champ_pool_list
    }

    private fun checkIfChampIsBuyable(champ: Pair<String, Int>): Boolean{

        return champ.second != 0
    }

    private fun getListOfLevelOdds(level: Int):MutableList<Int>{

        val levelOddsList = when(level){
            1 -> level_1_Odds
            2 -> level_2_Odds
            3 -> level_3_Odds
            4 -> level_4_Odds
            5 -> level_5_Odds
            6 -> level_6_Odds
            7 -> level_7_Odds
            8 -> level_8_Odds
            9 -> level_9_Odds
            10 -> level_10_Odds
            11 -> level_11_Odds
            else -> {
                throw Exception("Wrong Level selected")
            }
        }

        var oddsList =  mutableListOf<Int>()
        var pool_number = 1

        for(odd in levelOddsList){

            for(i in 1..odd){
                oddsList.add(pool_number)
            }
            pool_number += 1
        }
        return oddsList
    }

    private fun getPoolOfChampions(oddsList: MutableList<Int>): Int{

        return oddsList.random()

    }

    fun getRandomChamp(level: Int): String{

        val levelOdds = getListOfLevelOdds(level)

        val pool = getPoolOfChampions(levelOdds)

        val champ_pool_list = get_list_and_pool_of_all_champs(pool)

        var champ_pool_pair: Pair<String, Int>

        while(true){
             champ_pool_pair = champ_pool_list.random()

            if (checkIfChampIsBuyable(champ_pool_pair)){
                break
            }
        }

        return champ_pool_list.random().first
    }
}
