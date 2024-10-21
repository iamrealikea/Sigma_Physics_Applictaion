package com.realikea.sigmaphysics.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.realikea.sigmaphysics.R
import com.realikea.sigmaphysics.ui.theme.SigmaPhysicsTheme

@Composable
fun BottomNavigate(modifier: Modifier) {
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surface,
        modifier = modifier
    ) {
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = null
                )
            },
            label = {
                Text(stringResource(R.string.bottom_navigation_home))
            },
            selected = true,
            onClick = {},
        )
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = null
                )
            },
            label = {
                Text(stringResource(R.string.bottom_navigation_setting))
            },
            selected = false,
            onClick = {}
        )
    }
}


@Preview
@Composable
fun NavigatePreview() {
    SigmaPhysicsTheme {
        BottomNavigate(modifier = Modifier)
    }
}
