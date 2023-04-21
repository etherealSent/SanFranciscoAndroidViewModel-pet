package com.example.sanfrancisco.data.local

import com.example.sanfrancisco.R
import com.example.sanfrancisco.data.model.Restaurant

object LocalRestaurantsDataProvider {

    val standardRestaurant = getRestaurantsData()[0]

    fun getRestaurantsData(): List<Restaurant> {
        return listOf(
            Restaurant(
                name = R.string.mersea_name,
                typeOfKitchen = R.string.mersea_kitchen,
                address = R.string.mersea_address,
                image = R.drawable.mersea_restaurant,
                review = 5.0,
            ),
            Restaurant(
                name = R.string.wipeout_name,
                typeOfKitchen = R.string.wipeout_kitchen,
                address = R.string.wipeout_address,
                image = R.drawable.wipeout,
                review = 4.0,
            ),
            Restaurant(
                name = R.string.kokkari_name,
                typeOfKitchen = R.string.kokkari_kitchen,
                address = R.string.kokkari_address,
                image = R.drawable.kokkari_estiatorio,
                review = 4.4,
            ),
            Restaurant(
                name = R.string.eightam_name,
                typeOfKitchen = R.string.eightam_kitchen,
                address = R.string.eightam_address,
                image = R.drawable.eightam_restaurant,
                review = 4.5,
            ),
            Restaurant(
                name = R.string.tommaso_name,
                typeOfKitchen = R.string.tommaso_kitchen,
                address = R.string.tommaso_address,
                image = R.drawable.vegetarian_antipasto,
                review = 4.1,
            ),
        )
    }
}