package com.example.myapplication.sujit.Composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RecyclerScreen()
{
    VerticalRecyler()
    HorizontalRecyclerView()
    GridViewLayout()
}

@Composable
fun VerticalRecyler()
{
    var list = listOf("Tanishka","Wants","To","Slap","Sujit")
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(6.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){

//        item {
//            (1..50).forEach(){
//                Text(text = "Sujit $it",
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(5.dp))
//            }
//        }
        items(list) {
            Text(text = it,
                modifier = Modifier.padding(vertical = 10.dp))
        }
    }
}

@Composable
fun HorizontalRecyclerView() {

    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        state = rememberLazyListState(
            7
        )
    ) {
        showContent()
    }

}

fun LazyListScope.showContent(){
    items(items,
        key = {
            it.id
        }) {
        Text(text = "${it.item} ${it.id} ", modifier = Modifier.padding(horizontal = 20.dp))

    }
}

@Composable
fun GridViewLayout() {

//    LazyVerticalGrid(
//      //  columns = GridCells.Fixed(3)
//    columns = GridCells.Adaptive(75.dp)
//    ){
//        items(items,
//            key = {
//                it.id
//            }) {
//            Text(text = "${it.item} ${it.id} ", modifier = Modifier.padding(horizontal = 20.dp))
//
//        }
//    }

    LazyHorizontalGrid(rows = GridCells.Fixed(4)){
        items(items,
            key = {
                it.id
            }) {
            Text(text = "${it.item} ${it.id} ", modifier = Modifier.padding(horizontal = 20.dp))

        }
    }

}

data class Item(
    val id: Int,
    val item: String
)

val items = listOf(
    Item(
        1,
        "nlkdd"
    ),
    Item(
        2,
        "jkofkd"
    ),
    Item(
        3,
        "jkofkd"
    ),
    Item(
        4,
        "jkofkd"
    ),
    Item(
        5,
        "jkofkd"
    ),
    Item(
        6,
        "jkofkd"
    ),
    Item(
        7,
        "jkofkd"
    )
)