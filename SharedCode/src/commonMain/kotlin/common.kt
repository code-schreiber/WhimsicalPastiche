package com.toolslab.whimsicalpastiche.mpp

expect fun platformName(): String

fun createApplicationScreenMessage(): String {
    return "Kotlin runs on ${platformName()}"
}
