package com.ovidiu.multiplatformcontacts

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform