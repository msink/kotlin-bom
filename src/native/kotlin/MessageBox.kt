/*
 * Licensed under the Apache License, Version 2.0
 */

import kotlinx.cinterop.*
import platform.windows.*

fun MessageBox(message: String) {
    MessageBoxW(
        hWnd = null,
        lpText = message,
        lpCaption = "BOM",
        uType = (MB_OK or MB_ICONEXCLAMATION).convert()
    )
}
