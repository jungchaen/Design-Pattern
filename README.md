# GoF 디자인 패턴
하나의 프로젝트를 추상화하는 과정에서 여러 개의 문제로 쪼갤 수 있습니다. <br>
각각의 문제에 대해 서로 다른 디자인 패턴이 적용될 수 있습니다.

SOLID 5원칙을 준수합니다.

# 1. 자판기
<b> 1. 사용 디자인 패턴 </b> 
1. Decorator : 음료 휘핑크림, 샷 추가
2. Factory Method : 음료 객체 생성
3. Strategy : 결제 방식(현금, 신용카드, 온라인 페이)

<b> 2. 사용 알고리즘 </b>
1. 그리디 알고리즘 : 거스름돈 

<b> 3. 클래스 다이어그램 </b>
![클래스 다이어그램](https://user-images.githubusercontent.com/50093044/182033586-375cccd8-ee20-4dfd-bfb5-da49016597fd.jpg)


# 2. 인터프리터_사칙연산
<b> 1. 사용 디자인 패턴 </b> 
1. Interpreter : 사칙연산, mini language

<b> 2. 구현 단계 </b>
1. infix를 postfix로 변환
2. BNF 분석
3. BNF를 추상 구문 트리로 만들기
4. 인터프리터 패턴 사용 클래스 구현

<b> 3. 클래스 다이어그램 </b>
![인터프리터](https://user-images.githubusercontent.com/50093044/183231724-349ee2e5-79f5-4162-80cb-860beefafdea.jpg)
