package com.realikea.sigmaphysics.component

import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.realikea.sigmaphysics.R
import com.realikea.sigmaphysics.ui.theme.SigmaPhysicsTheme


@Composable
fun CourseCard(
    @StringRes chapter : Int,
    @StringRes description : Int,

    ){

    Surface(modifier = Modifier.clip(RoundedCornerShape(16.dp))){
        Column(){
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.primaryContainer)
            )
            {
                Text(
                    text = stringResource(chapter),
                    style = MaterialTheme.typography.titleMedium,
                    lineHeight = 22.sp,
                    modifier = Modifier.padding(start = 16.dp, top = 9.dp, bottom = 9.dp, end = 32.dp),
                    softWrap = true
                )
            }
            var expanded by remember {  mutableStateOf(false)}
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    //.size(101.dp)
                    .background(color = MaterialTheme.colorScheme.surfaceContainer)
                    .height(if (expanded) 200.dp else 50.dp)
                    .animateContentSize()
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = LocalIndication.current
                    ) {
                        expanded = !expanded
                    }

            ) {
                Text(
                    text = stringResource(description),
                    modifier = Modifier
                        .padding(start = 16.dp)
                        //.size(height = 100.dp, width = 200.dp)
                    ,
                    lineHeight = 27.sp,
                    softWrap = true,
                    style = MaterialTheme.typography.bodyLarge
                )
                Text(
                    if (expanded){
                        "ใช้เวลา 10 นาทีไอไก่"
                    } else {
                        ""
                    },
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(start = 16.dp)
                )
                Icon(
                    if (expanded)
                    {
                        Icons.Filled.KeyboardArrowUp
                    } else {
                        Icons.Filled.KeyboardArrowDown
                    }
                    ,
                    contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .padding(5.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun CardPreview(){
    SigmaPhysicsTheme {
        CourseCard(
            chapter = R.string.chapter_1,
            description = R.string.description_1
        )
    }
}