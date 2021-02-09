//fun main()
//{
  //  print("Введите a: ")
   // var a = readLine()!!.toDouble()
  //  print("Введите b: ")
   // var b = readLine()!!.toDouble()
   // var average = (a+b)/2
   // print(average)

//}
fun main()
{
    val week_days_list = mapOf(
        1 to "Понедельник",
        2 to "Вторник",
        3 to "Среда",
        4 to "Четверг",
        5 to "Пятница",
        6 to "Суббота",
        7 to "Воскресенье"
    )
    print("Введите день года, который хотите узнать: ")
    var year_days = readLine()!!.toInt()
    var week_day = 2
    var user_choise = (year_days+week_day-1)%7

    print("$year_days-ый день: ${week_days_list[user_choise]}\n")






}










