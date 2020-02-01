fun convert(number: String, from: Int): Int {
    require(from >= 1) { "Positive radix is required but $from is received" }

    if (from == 1) {
        return number.length
    }

    return number.toInt(from)
}
