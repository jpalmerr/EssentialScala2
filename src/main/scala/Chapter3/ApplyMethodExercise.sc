class Adder2(amount: Int) {
  def apply(in: Int): Int = in + amount
}

val add3 = new Adder2(3)
add3.apply(2) // Int = 5
add3(2) // Int = 5


