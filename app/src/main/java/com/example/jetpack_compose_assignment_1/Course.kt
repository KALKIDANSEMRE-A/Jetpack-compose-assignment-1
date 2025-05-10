package com.example.jetpack_compose_assignment_1

data class Course(
    val title: String,
    val code: String,
    val creditHours: Int,
    val description: String,
    val prerequisites: String
)

val sampleCourses = listOf(
    Course(
        title = "Introduction to Programming",
        code = "CS101",
        creditHours = 3,
        description = "Learn the fundamentals of programming using Kotlin. Topics include variables, control flow, functions, and classes.",
        prerequisites = "None"
    ),
    Course(
        title = "Data Structures and Algorithms",
        code = "CS201",
        creditHours = 4,
        description = "Covers arrays, lists, stacks, queues, trees, graphs, sorting, and searching algorithms.",
        prerequisites = "CS101"
    ),
    Course(
        title = "Operating Systems",
        code = "CS301",
        creditHours = 4,
        description = "Explore OS concepts including memory management, processes, threads, and file systems.",
        prerequisites = "CS201"
    ),
    Course(
        title = "Database Systems",
        code = "CS210",
        creditHours = 3,
        description = "Introduction to relational databases, SQL, normalization, and basic database design.",
        prerequisites = "CS101"
    ),
    Course(
        title = "Mobile App Development",
        code = "CS320",
        creditHours = 3,
        description = "Build modern Android applications using Jetpack Compose and Kotlin.",
        prerequisites = "CS201"
    ),
    Course(
        title = "Computer Networks",
        code = "CS330",
        creditHours = 3,
        description = "Study network models, protocols, IP addressing, and socket programming.",
        prerequisites = "CS201"
    ),
    Course(
        title = "Artificial Intelligence",
        code = "CS410",
        creditHours = 3,
        description = "Covers AI principles including search algorithms, knowledge representation, and machine learning basics.",
        prerequisites = "CS301"
    )
)
