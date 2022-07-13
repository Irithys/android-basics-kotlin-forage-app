package com.example.forage.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "forageable_database")
data class Forageable(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val address: String,
    @ColumnInfo(name = "is_season") val inSeason: Boolean,
    val notes: String?
)