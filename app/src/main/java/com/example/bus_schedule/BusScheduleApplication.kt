package com.example.bus_schedule

import android.app.Application
import com.example.bus_schedule.data.BusScheduleDatabase

class BusScheduleApplication: Application() {
    val database: BusScheduleDatabase by lazy { BusScheduleDatabase.getDatabase(this) }
}