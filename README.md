业务需求
你是一名体育老师，在某次课距离下课还有五分钟时，你决定搞一个游戏。此时有N名学生在上课。游戏的规则是：

1. 让所有学生排成一队，然后按顺序报数。
2. 学生报数时，如果所报数字是3的倍数，那么不能说该数字，而要说Fizz；如果所报数字是5的倍数，那么要说Buzz；如果所报数字是第7的倍数，那么要说Whizz。
3. 学生报数时，如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如3和5的倍数，那么不能说该数字，而是要说FizzBuzz, 以此类推。如果同时是三个特殊数的倍数，那么要说FizzBuzzWhizz。

Tasking
1. Given 数字只是3的倍数,  When 报数, Then Fizz
2. Given 数字只是5的倍数,  When 报数, Then Buzz
3. Given 数字只是7的倍数,  When 报数, Then Whizz
4. Given 数字是3和5的倍数, When 报数 Then FizzBuzz
5. Given 数字是3和7的倍数, When 报数 Then FizzWhizz
6. Given 数字是5和7的倍数, When 报数 Then BuzzWhizz
7. Given 数字是3, 5和7的倍数, When 报数 Then FizzBuzzWhizz
8. Given 数字不是3, 5和7的倍数, When 报数 Then 输出数字本身
