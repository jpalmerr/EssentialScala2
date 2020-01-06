case class CaseClassCounter(count: Int) {
  def dec = copy(count - 1)
  def inc = copy(count + 1)
}

// very few differences but extra functionality for free

val counter = CaseClassCounter(0) // construct objects without `new`
// res16: Counter = Counter(0)
counter.inc.count // Int = 1

