
# Visitor pattern

[Wikipedia - Visitor Pattern](https://en.wikipedia.org/wiki/Visitor_pattern)

알고리즘을 객체 구조에서 분리시키는 디자인 패턴이다.  
이렇게 분리를 하면 구조를 수정하지 않고도 실질적으로 새로운 동작을 기존의 객체 구조에 추가할 수 있게 된다.  
개방-폐쇄 원칙을 적용하는 방법의 하나이다.

더블 디스패치 (Double Dispatch)를 활용할 수 있다.
- 메서드 디스패치를 두 번 사용하여 유연성을 높이는 것인데, Visitor pattern에서 사용되는 기법이다
- [토비의 봄 TV 1회 - 재사용성과 다이나믹 디스패치, 더블 디스패치](https://www.youtube.com/watch?v=s-tXAHub6vg&t=2732s)

![[UML] Visitor Pattern](./visitor.png)
