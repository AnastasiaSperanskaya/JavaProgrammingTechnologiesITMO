import static java.util.Calendar.MONTH

class MainClass {
    public static void main(String[] args) {
        def first = new FirstClass(name: 'Cola', ID:  1, price: 40)
        println first

        def second = new FirstClass('Pepsi', 2, 45)
        println second

        def binding = new Binding()
        binding.setVariable("name", 'Pepsi-Cola')
        binding.setVariable("ID", 3)
        binding.setVariable("price", 50)

        def third = new FirstClass(binding)
        println third
        println third.getName()
        third.setName('Pepsi-Cola Light')
        println third.getName()

        println("String instanceof Integer: " + (String instanceof Integer))
        println("Integer instanceof String: " + (Integer instanceof String))

        DefClass check = new DefClass(name: 'Soda', ID: 1, testVar: 'sugar free')
        println(check)
        check.testVar = 2
        println(check)

        println('noReturnFunction: ' + noReturnFunction())

        println('integerFunction: ' + integerFunction(null))
        //println('intFunction: ' + intFunction(null))

        BigDecimal firstDec = new BigDecimal(10)
        BigDecimal secondDec = new BigDecimal(10)

        println("firstDec.equals(secondDec): " + firstDec.equals(secondDec))
        println("firstDec.is(secondDec): " + firstDec.is(secondDec))
        println("firstDec === secondDec: " + (firstDec === secondDec))
        println("firstDec == secondDec: " + (firstDec == secondDec))

        println(firstDec + " add " + secondDec + " = " + firstDec.add(secondDec))
        println(firstDec + " divide " + secondDec + " = " + firstDec.divide(secondDec))
        println(firstDec + " multiply " + secondDec + " = " + firstDec.multiply(secondDec))

        println(firstDec + " + " + secondDec + " = " + (firstDec + secondDec))
        println(firstDec + " / " + secondDec + " = " + firstDec / secondDec)
        println(firstDec + " * " + secondDec + " = " + firstDec * secondDec)

        def noTypeVariable = 10
        println(noTypeVariable.getClass().getName())
        noTypeVariable = 'f'
        println(noTypeVariable.getClass().getName())
        noTypeVariable = 'First'
        println(noTypeVariable.getClass().getName())
        println()
        def noTypeVariable1 = 'f'
        println(noTypeVariable1.getClass().getName())
        noTypeVariable1 = 'First'
        println(noTypeVariable1.getClass().getName())
        noTypeVariable1 = 10
        println(noTypeVariable1.getClass().getName())

        Date date1 = new Date(115, 1, 28)
        Date date2 = new Date(115, 0, 31)

        def res = date1 - date2
        println('date1 - date2: ' + res)

        def prevMonth = date1[MONTH] - 1 //первый метод
        date1.set(month: prevMonth) //второй метод
        println(date1)

        def nextMonth = date1[MONTH] + 1 //первый метод
        date1.set(month: nextMonth) //второй метод
        println(date1)

        date1 = date1.next() //следующий день
        println(date1)

        println('closure divide: ' + closureDivide(6, 3))
        println('closure minus: ' + closureMinus(67, 42))
        println('closure divide then minus: ' + closureDivideMinus(8.0, 2.0, 3))
    }

    static def closureDivide = { x, y -> x / y}
    static def closureMinus = { x, y -> x - y}
    static def closureDivideMinus = { x, y, z -> MainClass.closureMinus(MainClass.closureDivide(x, y), z)}

    static int intFunction(Integer k) {
        return k
    }

    static Integer integerFunction(Integer k) {
        return k
    }

    static Integer noReturnFunction() {
        12
    }
}
