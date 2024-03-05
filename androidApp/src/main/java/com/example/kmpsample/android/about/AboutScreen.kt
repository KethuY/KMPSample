package com.example.kmpsample.android.about

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kmpsample.Platform

/**
 * Created by Kethu on 05/03/2024.
 */
@Composable
fun AboutScreen() {
    Column {
        TopAppBar(title = { Text(text = "About the OS") })
        ContentScreen()
    }
}

@Composable
fun ContentScreen() {
    LazyColumn() {
        items(createItems()) {
            CustomRowView(it.first, it.second)
        }
    }
}

@Composable
fun CustomRowView(label: String, value: String) {
    Column(Modifier.padding(8.dp)) {
        Text(text = label, style = MaterialTheme.typography.body1)
        Spacer(modifier = Modifier.padding(start = 8.dp))
        Text(text = value, style = MaterialTheme.typography.body1)
    }
    Divider()
}

private fun createItems(): List<Pair<String, String>> {
    val platformInfo = Platform()
    return listOf(
        Pair("OS Name", platformInfo.osName),
        Pair("OS VERSION", platformInfo.osVersion),
        Pair("OS MODEL", platformInfo.deviceModel),
        Pair("OS DENSITY", platformInfo.density.toString()),
    )
}