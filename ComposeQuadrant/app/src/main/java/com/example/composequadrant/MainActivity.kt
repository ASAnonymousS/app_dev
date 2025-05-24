package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
// REMOVE THIS LINE: import androidx.compose.foundation.layout.FlowRowScopeInstance.weight
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    QuadCompose(

                    )
                }
            }
        }
    }
}

@Composable
fun QuadCompose(modifier: Modifier = Modifier) {
    // This Column needs to be inside a Row or another Column to use weight
    // If it's the root, it cannot use weight.
    // I'm uncommenting your original structure for a complete solution.
    Column(
        modifier = Modifier
            .fillMaxSize() // The outer Column needs to fill its parent (Surface)
    )
    {
        Row(
            modifier = Modifier.weight(1f) // First Row takes half the height
        )
        {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally, // Align content horizontally
                modifier = Modifier
                    .background(Color(0xFFEADDFF))
                    .padding(all = 16.dp)
                    .weight(1f) // Takes half the width of its Row parent
                    .fillMaxHeight() // Ensures it fills its allocated height
            )
            {
                Text(
                    text = stringResource(R.string.quadrant_1_heading),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                )
                Text(
                    text = stringResource(R.string.quadrant_1_content),
                    textAlign = TextAlign.Justify
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally, // Align content horizontally
                modifier = Modifier
                    .background(Color(0xFFD0BCFF))
                    .padding(all = 16.dp)
                    .weight(1f) // Takes half the width of its Row parent
                    .fillMaxHeight() // Ensures it fills its allocated height
            )
            {
                Text(
                    text = stringResource(R.string.quadrant_2_heading),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                )
                Text(
                    text = stringResource(R.string.quadrant_2_content),
                    textAlign = TextAlign.Justify
                )
            }
        }
        Row(
            modifier = Modifier.weight(1f) // Second Row takes the other half of the height
        )
        {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally, // Align content horizontally
                modifier = Modifier
                    .background(Color(0xFFB69DF8))
                    .padding(all = 16.dp)
                    .weight(1f) // Takes half the width of its Row parent
                    .fillMaxHeight() // Ensures it fills its allocated height
            )
            {
                Text(
                    text = stringResource(R.string.quadrant_3_heading),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                )
                Text(
                    text = stringResource(R.string.quadrant_3_content),
                    textAlign = TextAlign.Justify
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally, // Align content horizontally
                modifier = Modifier
                    .background(Color(0xFFF6EDFF))
                    .padding(all = 16.dp)
                    .weight(1f) // Takes half the width of its Row parent
                    .fillMaxHeight() // Ensures it fills its allocated height
            )
            {
                Text(
                    text = stringResource(R.string.quadrant_4_heading),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                )
                Text(
                    text = stringResource(R.string.quadrant_4_content),
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun QuadCompos() {
    ComposeQuadrantTheme {
        QuadCompose()
    }
}