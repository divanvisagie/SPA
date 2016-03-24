package com.fibonacci

import scala.annotation.tailrec

/**
  * Created by divanvisagie on 2016/03/24.
  */
class RecursiveMath {
  def fibonacci(n :Int) : Int = {
    @tailrec
    def fib(n : Int, next :Int, acc :Int) :Int = {
      if(n == 0) acc
      else fib(n-1, acc + next,next)
    }
    fib(n,1,0)
  }
}

object RecursiveMath {
  def apply() = new RecursiveMath()
}