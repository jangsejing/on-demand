package com.jess.ondemand

import com.google.android.play.core.splitinstall.model.SplitInstallSessionStatus

fun Int?.getStatusText() = when (this) {
    SplitInstallSessionStatus.PENDING -> "PENDING"
    SplitInstallSessionStatus.REQUIRES_USER_CONFIRMATION -> "REQUIRES_USER_CONFIRMATION"
    SplitInstallSessionStatus.DOWNLOADING -> "DOWNLOADING"
    SplitInstallSessionStatus.DOWNLOADED -> "DOWNLOADED"
    SplitInstallSessionStatus.INSTALLING -> "INSTALLING"
    SplitInstallSessionStatus.INSTALLED -> "INSTALLED"
    SplitInstallSessionStatus.FAILED -> "FAILED"
    SplitInstallSessionStatus.CANCELING -> "CANCELING"
    SplitInstallSessionStatus.CANCELED -> "CANCELED"
    SplitInstallSessionStatus.UNKNOWN -> "UNKNOWN"
    else -> "NULL"
}
