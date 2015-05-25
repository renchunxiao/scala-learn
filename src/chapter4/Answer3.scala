class Answer3 (val hours: Int,val minutes: Int) {
  
  def before(other: Answer3) = {
    hours < other.hours || (hours == other.hours && minutes < other.minutes)
  }
  
  override def toString() = {
    hours + " : " + minutes
  }
}
