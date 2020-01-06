case class Cat1(colour: String, food: String)

// Director and films

case class Director1(firstName: String, lastName: String, yearofBirth: Int) {
  def name: String = s"$firstName $lastName"
}

object Director1{
  def older(director1: Director1, director2: Director1): Director1 =
    if (director1.yearofBirth < director2.yearofBirth) director1 else
      director2
}

case class Film1(
                 name: String,
                 yearOfRelease: Int,
                 imdbRating: Double,
                 director: Director1) {
  def directorsAge: Int =
    yearOfRelease - director.yearofBirth
  def isDirectedBy(director: Director1): Boolean =
    this.director == director
}

object Film1 {
  def newer(film1: Film1, film2: Film1): Film1 =
    if (film1.yearOfRelease < film2.yearOfRelease) film1 else film2

  def highestRating(film1: Film1, film2: Film1): Double = {
    val rating1 = film1.imdbRating
    val rating2 = film2.imdbRating
    if (rating1 > rating2) rating1 else rating2
  }
  def oldestDirectorAtTheTime(film1: Film1, film2: Film1): Director1 =
    if (film1.directorsAge > film2.directorsAge ) film1.director else film2.director
}

