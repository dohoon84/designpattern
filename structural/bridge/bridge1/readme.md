**Bridge pattern**
- 의도
  - 결합도를 낮추자.
  - 인터페이스간 의존만 하고 그외 의존도를 없애자.
  - 한쪽에서 변경한 영향은 타 인터페이스의 구현체에 영향을 주지 말자.
  
- 장점
  - 낮은 결합도 설계
  - 인터페이스를 통해 기능과 구현체부분을 분리 하여
  의존도를 낮추었다.
  - 서로 클래스에 영향이 없다.
  
- 포인트
  - 브릿지(다리)라고 하는 연결고리를 만들고 서로 분리된 객체들끼리 통신할 수 있도록 만들었다.
  - 통신구간을 통해서 원하는 메시지를 전달할 수 있다.
