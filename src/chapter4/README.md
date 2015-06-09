1. 修改 Counter 类，让它在 Int.MaxValue 的时候不溢出
2. 编写一个 BankAccount 类，加入 deposit 和 withdraw 方法，和一个只读 balance 属性。
3. 编写一个Time类，加入只读属性hours和minutes，和一个检查某一时刻是否早于另一时刻的方法 before(other:Time):Boolean。Time对象应该以new Time(hrs,min)方式构建。其中hrs以军用时间格式呈现(介于0和23之间)  
4. 编写 Person 类提供一个主构造器，将负年龄转换成 0
5. 编写 Person 类，接受一个字符串的主构造器，该字符串包含名字、空格、姓，例如 new Person("Ren Chunxiao")，提供只读属性 firstName 和 lastName。
6. 创建一个 Car 类，以只读属性对应制造商、型号名称、型号年份以及一个可读写属性车牌。每一个构造器都要求制造商和型号必填。型号年份未填，默认为-1，车牌默认成空字符串。
