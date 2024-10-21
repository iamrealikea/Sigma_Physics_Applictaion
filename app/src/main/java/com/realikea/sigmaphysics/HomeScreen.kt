package com.realikea.sigmaphysics

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.realikea.sigmaphysics.component.CourseCard
import com.realikea.sigmaphysics.data.course.courseData
import com.realikea.sigmaphysics.ui.theme.SigmaPhysicsTheme

@Composable
fun HomeScreen(modifier: Modifier){
    Column(modifier = Modifier.fillMaxHeight()) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .size(150.dp)
            .background(color = MaterialTheme.colorScheme.inversePrimary)
        ){
            Text(
                text = "Σ Sigma Physics",
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomEnd)
                    .padding(start = 22.dp, bottom = 26.dp),
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.displayMedium
            )
        }
        LazyColumn(
            contentPadding = PaddingValues(),
            modifier = modifier,
            userScrollEnabled = true,
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ){
            items(courseData) { item ->
                CourseCard(
                    chapter = item.chapter,
                    description = item.description
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview(){
    SigmaPhysicsTheme(){
        HomeScreen(modifier = Modifier)
    }
}