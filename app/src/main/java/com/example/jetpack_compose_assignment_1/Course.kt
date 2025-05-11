package com.example.jetpack_compose_assignment_1

data class Course(
    val title: String,
    val code: String,
    val creditHours: Int,
    val description: String,
    val prerequisites: String
)

val sampleCourses = listOf(
    Course("Introduction to Programming", "CS101", 3, "Learn the fundamentals of programming using Kotlin. Topics include variables, control flow, functions, and classes.", "None"),
    Course("Data Structures and Algorithms", "CS201", 4, "Covers arrays, lists, stacks, queues, trees, graphs, sorting, and searching algorithms.", "CS101"),
    Course("Operating Systems", "CS301", 4, "Explore OS concepts including memory management, processes, threads, and file systems.", "CS201"),
    Course("Database Systems", "CS210", 3, "Introduction to relational databases, SQL, normalization, and basic database design.", "CS101"),
    Course("Mobile App Development", "CS320", 3, "Build modern Android applications using Jetpack Compose and Kotlin.", "CS201"),
    Course("Computer Networks", "CS330", 3, "Study network models, protocols, IP addressing, and socket programming.", "CS201"),
    Course("Artificial Intelligence", "CS410", 3, "Covers AI principles including search algorithms, knowledge representation, and machine learning basics.", "CS301")
)