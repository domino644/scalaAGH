enum ThreeColors:
  case Blue, White, Red

import ThreeColors.*

def leadingActor(part: ThreeColors) = part match
  case Blue => "Juliette Binoche"
  case White => "Zbigniew Zamachowski"
  case Red => "Irene Jacob"

@main def ex_enum(): Unit =
  for part <- ThreeColors.values do
    println(part.toString() + ": " + leadingActor(part))
