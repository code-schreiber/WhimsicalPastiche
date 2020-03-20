package com.toolslab.whimsicalpastiche.mpp

import platform.UIKit.UIDevice

actual fun platformName(): String {
    val currentDevice = UIDevice.currentDevice
    val systemName = currentDevice.systemName
    val systemVersion = currentDevice.systemVersion
    return "$systemName $systemVersion with battery level at ${currentDevice.batteryLevel}"
}
