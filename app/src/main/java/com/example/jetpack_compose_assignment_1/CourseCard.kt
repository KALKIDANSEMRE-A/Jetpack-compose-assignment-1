package com.example.jetpack_compose_assignment_1

import android.content.res.Configuration
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpack_compose_assignment_1.ui.theme.Jetpackcomposeassignment1Theme

@Composable
fun CourseCard(course: Course) {
    var isExpanded by rememberSaveable { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { isExpanded = !isExpanded }
            .animateContentSize(),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = course.title,
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.height(4.dp))
            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                Text(
                    text = "Code: ${course.code}",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = "Credits: ${course.creditHours}",
                    style = MaterialTheme.typography.bodyMedium
                )
            }

            if (isExpanded) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Description: ${course.description}",
                    style = MaterialTheme.typography.bodySmall
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Prerequisites: ${course.prerequisites}",
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LightPreview() {
    Jetpackcomposeassignment1Theme {
        CourseCard(course = sampleCourses[0])
    }
}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun DarkPreview() {
    Jetpackcomposeassignment1Theme {
        CourseCard(course = sampleCourses[0])
    }
}
