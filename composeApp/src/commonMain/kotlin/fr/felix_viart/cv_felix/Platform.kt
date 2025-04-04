package fr.felix_viart.cv_felix

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform