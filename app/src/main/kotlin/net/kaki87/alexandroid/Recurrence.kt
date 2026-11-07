package net.kaki87.alexandroid

/** Alarm repeat patterns as stored by Alexa. Days are ISO numbers, 1 = Monday through 7 = Sunday. */
object Recurrence {
    private val dateRegex = Regex("\\d{4}-\\d{2}-\\d{2}")

    /** A one-time alarm on a chosen day is stored with the date itself as its pattern. */
    fun date(pattern: String?): String? = pattern?.takeIf { dateRegex.matches(it) }

    private val names = listOf("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")

    fun parse(pattern: String?): Set<Int> {
        if (pattern.isNullOrBlank()) return emptySet()
        val days = HashSet<Int>()
        for (token in pattern.split(',')) when {
            token == "P1D" -> days += 1..7
            token == "XXXX-WD" -> days += 1..5
            token == "XXXX-WE" -> days += 6..7
            token.startsWith("XXXX-WXX-") -> token.removePrefix("XXXX-WXX-").toIntOrNull()?.let { if (it in 1..7) days += it }
        }
        return days
    }

    /** Empty string means "once": the server ignores null when clearing a pattern. */
    fun toPattern(days: Set<Int>): String = when {
        days.isEmpty() -> ""
        days.size == 7 -> "P1D"
        days == setOf(1, 2, 3, 4, 5) -> "XXXX-WD"
        days == setOf(6, 7) -> "XXXX-WE"
        else -> days.sorted().joinToString(",") { "XXXX-WXX-$it" }
    }

    fun describe(days: Set<Int>): String = when {
        days.isEmpty() -> "Once"
        days.size == 7 -> "Every day"
        days == setOf(1, 2, 3, 4, 5) -> "Weekdays"
        days == setOf(6, 7) -> "Weekends"
        else -> days.sorted().joinToString(", ") { names[it - 1] }
    }

    fun dayName(day: Int) = names[day - 1]
}
