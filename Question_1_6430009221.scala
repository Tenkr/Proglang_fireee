object Question_1_6430009221 {
  def main(arg: Array[String]): Unit = {
      var list = List(1,2,3,4)
      println(insertLast(69,list))
  }
  def insertLast(x:Any, l:List[Any]) :  List[Any] ={
      return l ++ List(x);
  }
}
