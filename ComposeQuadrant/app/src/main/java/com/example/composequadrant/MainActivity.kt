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
    Column(
        modifier = Modifier
            .fillMaxSize()
    )
    {
        Row(
        )
        {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .background(Color(0xFFEADDFF))
                    .padding(all = 16.dp)
                    .fillMaxWidth(0.5F)
                    .fillMaxHeight(0.5F)
            )
            {
                Text(
                    text = stringResource(R.string.quadrant_1_heading),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                        .align(alignment = Alignment.CenterHorizontally)
                )
                Text(
                    text = stringResource(R.string.quadrant_1_content),
                    textAlign = TextAlign.Justify
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .background(Color(0xFFD0BCFF))
                    .padding(all = 16.dp)
                    .fillMaxWidth(1F)
                    .fillMaxHeight(0.5F)
            )
            {
                Text(
                    text = stringResource(R.string.quadrant_2_heading),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                        .align(alignment = Alignment.CenterHorizontally)
                )
                Text(
                    text = stringResource(R.string.quadrant_2_content),
                    textAlign = TextAlign.Justify
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
        )
        {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .background(Color(0xFFB69DF8))
                    .padding(all = 16.dp)
                    .fillMaxWidth(0.5F)
                    .fillMaxHeight(1F)
            )
            {
                Text(
                    text = stringResource(R.string.quadrant_3_heading),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                        .align(alignment = Alignment.CenterHorizontally)
                )
                Text(
                    text = stringResource(R.string.quadrant_3_content),
                    textAlign = TextAlign.Justify
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .background(Color(0xFFF6EDFF))
                    .padding(all = 16.dp)
                    .fillMaxWidth(1F)
                    .fillMaxHeight(1F)
            )
            {
                Text(
                    text = stringResource(R.string.quadrant_4_heading),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                        .align(alignment = Alignment.CenterHorizontally)
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