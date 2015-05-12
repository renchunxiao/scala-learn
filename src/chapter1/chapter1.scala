1. def signum(num: Int) = if (num == 0) 0 else if (num > 0) 1 else -1
2. val a = {} a: Unit = () 所以 {} 是 Unit 类型，值是 ()
3. 当 var x: Unit = () 这样定义的时候 x = y = 1 合法
4. var x = 10;while(x >=0) { print(x); x = x-1}
4. 另外写法 for(i <- (0 to 10).reverse) print(i)
5. def charsum(str: String) {var sum:Long = 1; for(ch <- str){sum *= ch}; print(sum)}
6. def countdown(y: Int) = {var x = y; while(x >=0) {print(x);x=x-1}}
