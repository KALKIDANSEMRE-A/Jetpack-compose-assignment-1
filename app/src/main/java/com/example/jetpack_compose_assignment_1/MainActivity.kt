package com.example.jetpack_compose_assignment_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose_assignment_1.ui.theme.Jetpackcomposeassignment1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var isDarkTheme by remember { mutableStateOf(false) }

            Jetpackcomposeassignment1Theme(darkTheme = isDarkTheme) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        ThemeToggle(isDarkTheme) { isDarkTheme = it }
                        CourseListScreen(sampleCourses)
                    }
                }
            }
        }
    }
}

@Composable
fun ThemeToggle(isDark: Boolean, onToggle: (Boolean) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Switch(
            checked = isDark,
            onCheckedChange = onToggle
        )
    }
}

@Composable
fun CourseListScreen(courses: List<Course>) {
    CourseList(courses = courses)
}

@Composable
fun CourseList(courses: List<Course>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.padding(8.dp)) {
        items(courses) { course ->
            CourseCard(course)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CourseListScreenPreview() {
    Jetpackcomposeassignment1Theme {
        CourseListScreen(courses = sampleCourses)
    }
}
