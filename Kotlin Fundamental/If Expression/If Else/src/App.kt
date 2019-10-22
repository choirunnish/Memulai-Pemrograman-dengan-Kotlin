// main function
fun main() {
    val openHours = 7
    val now = 20
    val office: String
    if (now > openHours) {
        office = "Office already open"
    } else {
        office = "Office is closed"
    }

    print(office)
}