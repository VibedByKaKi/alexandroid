package net.kaki87.alexandroid

/**
 * Amazon's device list gives a model ID (`deviceType`) and no model name for Echo devices, so the names live here.
 * The list comes from community tables and is incomplete. Unknown IDs show up as the raw code.
 */
object DeviceModels {
    private val names = mapOf(
        "AB72C64C86AW2" to "Echo (1st gen)",
        "A7WXQPH584YP" to "Echo (2nd gen)",
        "A2M35JJZWCQOMZ" to "Echo Plus (1st gen)",
        "A18O6U1UQFJ0XK" to "Echo Plus (2nd gen)",
        "A3S5BH2HU6VAYF" to "Echo Dot (2nd gen)",
        "A32DOYMUN6DTXA" to "Echo Dot (3rd gen)",
        "A1RABVCI4QCIKC" to "Echo Dot (3rd gen)",
        "A3RMGO6LYLH7YN" to "Echo Dot (4th gen)",
        "A4ZXE0RM7LQ7A" to "Echo Dot (5th gen)",
        "A3RBAYBE7VM004" to "Echo Studio",
        "A3VRME03NAXFUB" to "Echo Flex",
        "A10A33FOX2NUBK" to "Echo Spot",
        "A1NL4BVLQ4L3N3" to "Echo Show (1st gen)",
        "AWZZ5CVHX2CD" to "Echo Show (2nd gen)",
        "A4ZP7ZC4PI6TO" to "Echo Show 5",
        "A1Z88NGR2BK6A2" to "Echo Show 8",
        "A15996VY63BQ2D" to "Echo Show 8 (2nd gen)",
    )

    fun name(type: String): String = names[type] ?: "Unknown model ($type)"
}
