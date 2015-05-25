object Answer1 {
  private var value = 0
  def increment() { if (value < Int.MaxValue) value += 1  else  value = value }
  def current() = value
}
