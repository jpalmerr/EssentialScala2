/*

Write a program to generate all possible sentences given the following model:

- subjects are List("Noel", "The cat", "The dog")
- verbs are List("wrote", "chased", "slept on")
- objects are List("the book", "the ball", "the bed")
 */

val subjects = List("Noel", "The cat", "The dog")
val verbs = List("wrote", "chased", "slept on")
val objects = List("the book", "the ball", "the bed")

def allSentences : List[(String, String, String)] = {
  for {
    subjects <- subjects
    verbs <- verbs
    objects <- objects
  } yield (subjects, verbs, objects)
}

allSentences

/*

- The subjects are as before.

- For the verbs:
 If the subject is “Noel” the possible verbs are “wrote”, “chased”, and “slept on”.
 If the subject is “The cat” the possible verbs are “meowed at”, “chased”, and “slept on”.
 If the subject is “The dog” the possible verbs are “barked at”, “chased”, and “slept on”.

- For the objects:
 If the verb is “wrote” the possible objects are “the book”, “the letter”, and “the code”.
 If the verb is “chased” the possible objects are “the ball”, “the dog”, and “the cat”.
 If the verb is “slept on” the possible objects are “the bed”, “the mat”, and “the train”.
 If the verb is “meowed at” the possible objects are “Noel”, “the door”, “the food cupboard”.
 If the verb is “barked at” the possible objects are “the postman”, “the car”, and “the cat”.

 */

def verbsFor(subject: String): List[String] =
  subject match {
    case "Noel" => List("wrote", "chased", "slept on")
    case "The cat" => List("meowed at", "chased", "slept on")
    case "The dog" => List("barked at", "chased", "slept on")
  }
def objectsFor(verb: String): List[String] =
  verb match {
    case "wrote" => List("the book", "the letter", "the code")
    case "chased" => List("the ball", "the dog", "the cat")
    case "slept on" => List("the bed", "the mat", "the train")
    case "meowed at" => List("Noel", "the door", "the food cupboard")
    case "barked at" => List("the postman", "the car", "the cat")
  }

def allSentencesConditional: List[(String, String, String)] = {
  for {
    subject <- subjects
    verb <- verbsFor(subject)
    obj <- objectsFor(verb)
  } yield (subject, verb, obj)
}

allSentencesConditional