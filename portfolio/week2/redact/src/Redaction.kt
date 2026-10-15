// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(document: String, text: String, char: Char = 'X'): String {
    val replacement = char.toString().repeat(text.length) //replaces each character in the string with X
    return document.replace(text, replacement)
}