enum class ShapeType {
    CIRCLE,
    SQUARE,
    RECTANGLE
}

interface Shape {
    fun area(): Double
    fun perimeter(): Double
}

class Circle(private val radius: Double) : Shape {
    override fun area(): Double = Math.PI * radius * radius
    override fun perimeter(): Double = 2 * Math.PI * radius
}

class Square(private val sideLength: Double) : Shape {
    override fun area(): Double = sideLength * sideLength
    override fun perimeter(): Double = 4 * sideLength
}

class Rectangle(private val width: Double, private val height: Double) : Shape {
    override fun area(): Double = width * height
    override fun perimeter(): Double = 2 * (width + height)
}

class ShapeWithInfo(val type: ShapeType, val shape: Shape) {
    fun printInfo() {
        println("Shape: $type")
        println("Area: ${shape.area()}")
        println("Perimeter: ${shape.perimeter()}")
    }
}

fun main() {
    val circle = Circle(5.0)
    val square = Square(4.0)
    val rectangle = Rectangle(3.0, 6.0)

    val circleInfo = ShapeWithInfo(ShapeType.CIRCLE, circle)
    val squareInfo = ShapeWithInfo(ShapeType.SQUARE, square)
    val rectangleInfo = ShapeWithInfo(ShapeType.RECTANGLE, rectangle)

    println("Circle Information:")
    circleInfo.printInfo()

    println("\nSquare Information:")
    squareInfo.printInfo()

    println("\nRectangle Information:")
    rectangleInfo.printInfo()
}