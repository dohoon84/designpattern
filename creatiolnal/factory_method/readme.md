**factory method**?<br>
 - 객체 생성을 서브클래스에서 생성하도록 객체생성을 위임<br>
 - 서브클래스에서 생성하도록 함으로써 캡슐화 가능<br>
    - new object()를 서브클래스에서 하는것을 말함.

포인트
 - 클래스간의 결합도를 낮춘다.
    - 클래스변경점이 발생했을때 다른 클래스에 얼마만큼의 영향을 주는가를 말함.
 - 의존성 제거 = 결합도를 낮춘다.
 - 객체관리 용이
    - 객체를 한곳에서 관리할 수 있다.

****
**객체 생성시 reflection을 이용하여 객체생성하기**<br>

Class<T> cls = Class.forName("");<br>
Object obj = cls.newInstance();<br>
return (?)obj;<br><br>

