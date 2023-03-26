object factorial {
      val mylist: List[Int] = List();
      val listnum = List(1, 2, 3, 4, 5);
      val listnum2 = List(1, 2, 3, 4, 5,4,6,4,5);
      val liststr: List[String] = List("john", "ten", "mint");
      def main(arg:Array[String]): Unit={
            println(member("johnss",liststr));
            println(sorted(listnum));
            println(mylist++ mylist);
            println(delete(3,listnum));
            println(length(listnum));
            println(List());
            println(reverse(listnum));
            println(dot(listnum,listnum2));
            println(setify(listnum2));
      }
      def member(x:Any, l:List[Any]): Boolean={
        if(l.isEmpty){
          return false;
        }
        if(l.head == x){
          return true;
        }
        else{
          return member(x, l.tail);
        }
      }
      def sorted(l:List[Int]): Boolean = {
        if (l.isEmpty || l.length == 1) {
          return true;
        }
        if (l.head > l.tail.head) {
          return false
        }
        else {
          return sorted(l.tail);
        }
      }
      def delete(x:Any , l:List[Any]): List[Any] = {
          if(l.isEmpty){
            return List();
          }
          if(l.head == x){
            return delete(x,l.tail);
          }
          else{
            return l.head :: delete(x,l.tail);
          }
      }
      def length(l:List[Any]): Int={
          if(l.isEmpty){
            return 0;
          }
          else{
            return 1 + length(l.tail);
          }
      }
      def reverse(l:List[Any]): List[Any]= {
         if(l.isEmpty){
           return List();
         }
         else{
           return reverse(l.tail) ++ List(l.head);
         }
      }
      def dot(l1:List[Int] , l2:List[Int]):Int={
          if(l1.isEmpty){
            return 0;
          }
          else{
            return l1.head*l2.head + dot(l1.tail,l2.tail);
          }
      }
      def setify(l:List[Any]): List[Any]={
          if(l.isEmpty){
            return List();
          }
          if(member(l.head,l.tail)){
            return setify((l.tail));
          }
          else{
            return List(l.head) ++ setify(l.tail);
          }
      }



}
