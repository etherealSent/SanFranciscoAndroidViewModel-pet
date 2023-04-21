package com.example.sanfrancisco.data.local

import com.example.sanfrancisco.R
import com.example.sanfrancisco.data.model.Park

object LocalParksDataProvider {
    val defaultPark = Park(id=-1, name = R.string.parks, description = R.string.parks, image = R.drawable.golden_gate_park, square = 0)

    fun getParksData(): List<Park> {
        return listOf(
            Park(
                id = 0,
                name = R.string.goldengate_name,
                description = R.string.goldengate_description,
                image = R.drawable.golden_gate_park,
                square = 1017

            ),
            Park(
                id = 1,
                name = R.string.presidio_name,
                description = R.string.presidio_description,
                image = R.drawable.the_presidio_park,
                square = 1500
            ),
            Park(
                id = 2,
                name = R.string.dolores_name,
                description = R.string.dolores_description,
                image = R.drawable.dolores_park,
                square = 16
            ),
            Park(
                id = 3,
                name = R.string.washington_name,
                description = R.string.washington_description,
                image = R.drawable.washington_square_park,
                square = 10
            ),
            Park(
                id = 4,
                name = R.string.pioneer_name,
                description = R.string.pioneer_description,
                image = R.drawable.pioneer_park,
                square = 5
            )
        )
    }
}