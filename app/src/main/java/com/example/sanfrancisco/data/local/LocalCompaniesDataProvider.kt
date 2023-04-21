package com.example.sanfrancisco.data.local

import com.example.sanfrancisco.R
import com.example.sanfrancisco.data.model.Company

object LocalCompaniesDataProvider {

    fun getCompaniesData(): List<Company> {
        return listOf(
            Company(
                name = R.string.uber_name,
                founded = 2009,
                numberOfEmployees = 81965,
                description = R.string.uber_description,
                image = R.drawable.uber
            ),
            Company(
                name = R.string.snap_name,
                founded = 2011,
                numberOfEmployees = 6108,
                description = R.string.snap_description,
                image = R.drawable.snap
            ),
            Company(
                name = R.string.affirm_name,
                founded = 2012,
                numberOfEmployees = 1455,
                description = R.string.affirm_description,
                image = R.drawable.affirm
            ),
            Company(
                name = R.string.serviceNow_name,
                founded = 2004,
                numberOfEmployees = 15000,
                description = R.string.serviceNow_description,
                image = R.drawable.servicenow
            ),
            Company(
                name = R.string.dropbox_name,
                founded = 2007,
                numberOfEmployees = 4765,
                description = R.string.dropbox_description,
                image = R.drawable.dropbox
            )
        )
    }
}