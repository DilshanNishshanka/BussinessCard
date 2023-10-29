package com.creative.app.sl.businesscard

import android.graphics.Paint.Align
import android.graphics.drawable.PaintDrawable
import android.icu.text.CaseMap.Title
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.creative.app.sl.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCardTitle(modifier: Modifier = Modifier){

    val profileImage = painterResource(id = R.drawable.android_logo)
     Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(top = 70.dp)
    ) {

        Image(
            painter = profileImage,
            contentDescription = null,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .background(color = Color(0xFF073042))
                .height(100.dp)
                .width(100.dp)
        )
        Text(
            text = stringResource(R.string.business_owner_name),
            fontSize = 40.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = stringResource(R.string.owner_profession),
            fontSize = 13.sp,
            textAlign = TextAlign.Center,
            color = Color(0xFF006C3A),
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
        )
    }

}

@Composable
fun BusinessCardBody(modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(top = 170.dp)
    ) {
        Row(
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        ) {
            Column{
                Icon(
                    Icons.Rounded.Phone,
                    contentDescription = null,
                    tint = Color(0xFF006D3B),
                    modifier = Modifier
                        .align(alignment = Alignment.CenterHorizontally)
                        .padding(bottom = 25.dp, start = 20.dp)
                )
                Icon(
                    Icons.Rounded.Share,
                    contentDescription = null,
                    tint = Color(0xFF006D3B),
                    modifier = Modifier
                        .align(alignment = Alignment.CenterHorizontally)
                        .padding(bottom = 25.dp, start = 20.dp)
                )
                Icon(
                    Icons.Rounded.Email,
                    contentDescription = null,
                    tint = Color(0xFF006D3B),
                    modifier = Modifier
                        .align(alignment = Alignment.CenterHorizontally)
                        .padding(start = 20.dp)
                )
            }

            Column {
                Text(
                    text = stringResource(R.string.owner_contact_number),
                    modifier = modifier.padding(start = 30.dp,bottom = 26.dp)
                )
                Text(
                    text = stringResource(R.string.owner_tag),
                    modifier = modifier.padding(start = 30.dp,bottom = 26.dp)
                )

                Text(
                    text = stringResource(R.string.owner_gmail),
                    modifier = modifier.padding(start = 25.dp)
                )
            }


        }

    }

}

@Composable
fun BusinessCard(modifier: Modifier = Modifier){
 Surface(
     modifier = Modifier.fillMaxSize(),
     color = Color(0xFFD2E8D4),
 ) {
     Column(
         verticalArrangement = Arrangement.SpaceAround,
         modifier =modifier.padding(70.dp)
     ) {
         BusinessCardTitle()
         BusinessCardBody()
     }
 }


}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Business Card Preview"
)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}

