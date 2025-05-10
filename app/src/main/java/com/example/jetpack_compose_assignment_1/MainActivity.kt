package com.example.jetpack_compose_assignment_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding

import com.example.jetpack_compose_assignment_1.ui.theme.Jetpackcomposeassignment1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Jetpackcomposeassignment1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CourseListScreen(sampleCourses)
                }
            }
        }
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
