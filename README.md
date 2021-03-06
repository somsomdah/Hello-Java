# Hello-Java

## 자바 : 클래스의 이해와 객체지향 프로그래밍
   <details>
     <summary> 클래스의 이해와 기초</summary>
     <div>

# 클래스의 이해와 기초
### 01. 클래스의 개념

### 02. 패키지의 개념

### 03. 오버로딩

### 04. 생성자

### 05. 메모리 모델
- 자바 가상머신(JVM)은 운영체제 위에서 동작한다
- JVM은 운영체제로부터 할당받은 메모리 공간을 이용해서 자기 자신도 실행을 하고, 자바 프로그램도 실행을 한다.
- JVM의 메모리 모델 : 메소드 영역 / 스택 영역 / 힙 영역
   - __Method Area__
      - Method bite code, Static variable
      - Bitecode : JVM에 의해 실행되는 코드, 고급언어 -(컴파일)-> 바이트코드 -(JVM)-> 기계어
      - 이 영역에 저장된 내용은 프로그램 시작 전에 로드되고 프로그램 종료시 소멸된다.
   - __Stack Area__
      - Local variable, Parameter
      - 프로그램이 실행되는 도중에 임시로 할당되었다가 해당 변수가 선언된 매소드 종료시 소멸
      - 스택의 흐름
         - 지역변수는 스택에 할당된다
         - 스택에 할당된 지역변수는 해당 메서드를 빠져 나가면 소멸된다
         - 할당 및 소멸의 특성상 메서드 별 스택이 구분이 된다  
   - __Heap Area__
      - Instance(Object)
      - 객체가 생성되는 메모리 공간
      - JVM에 의한 메모리 공간의 정리(Garbage Collection)가 이루어지는 공간
      - 할당은 프로그래머가, 소멸은 JVM이 처리
      - 참조변수에 의한 참조가 전혀 이루어지지 않은 인스턴스가 소멸의 대상이 된다
      
            String str=new String("My String")
            str=null // 인스턴스가 사라지는 것이 아닌 참조 관계가 소멸 
            // -> 참조관계가 소멸된 인스턴스는 garbage collection의 대상이 된다

      - 따라서 JVM은 인서턴스의 참조관계를 확인하고 소멸할 대상을 선택한다
      - Garbage Collection
         - GC는 한번도 발생하지 않을 수 있다
         - GC가 발생하면 소멸의 대상이 되는 인스턴스는 결정되지만 이것이 실제 소멸로 바로 이어지지는 않는다
         - 인스턴스의 실제 소멸이 이루어지지 않은 상태에서 프로그램이 종료될 수도 있는데 그렇다면 OS차원에서 어차피 인스턴스는 소멸이 된다.
         - `System.gc()` : GC 명령 / `System.runFinalization()` : GC에 의해 소멸이 결정된 인스턴스를 즉시 소멸하라!
    
  
  
### 06. 접근 제한자 (Access Modifier)
  
   #### 1) 클래스 정의 대상의 접근 제한자 선언
   - public - 어디서든 인스턴스 생성이 가능
   - default - 동일 패키지로 묶인 클래스 내에서만 인스턴스 생성 허용
     
   #### 2)변수와 메서드 대상의 접근제한자 선언
   - public : 모두 접근 가능
   - protected : 상속받은 클래스 접근 가능
   - default : 동일 패키지에서만 접근 가능
   - private : 같은 클래스 내부에서만 접근 가능
 
     </div>
  </details>

<details>
   <summary> 상속과 활용</summary>
   <div>
    
# 상속과 활용

### 07. 상속
- 상위클래스의 모든 것이 하위클래스에게 전달되는 것을 뜻한다
- 그러나 상위클래스의 멤버변수와 멤버함수중 private으로 접근제한이 된 경우에는 하위클래스로 전달이 되지 않는다
- 장점 : 재사용성 증대, 확장 용이, 유지보수 용이
- `extends`를 사용하여 상속 구현 : `class Child extends Parent{ ~~ }`
- Java에서 다중상속은 허용되지 않음
- `super.method()` : 상위 클래스의 `method`라는 함수 호출
  
  
  
### 08. 오버라이딩
- 상속된 메서드와 동일한 이름, 동일한 인수를 가지는 메서드를 정의하여 상위 클래스의 메서드를 덮어쓰는 것
- 반환값의 형도 같아야 한다
- 하위클래스에서 상속 받은 메서드를 재정의하여 다른 연산을 수행하고 싶을 때 사용
- 기능의 변경, 기능의 추가
- 오버라이드는 추상클래스와 합쳐져서 객체지향 방법론에서 장점으로 많이 거론되는 확장성을 실현하는데 많은 도움을 줌
- `@override` : http://www.gisdeveloper.co.kr/?p=1265  
- __오버라이딩 vs 오버로딩__
   - 오버라이딩 : 상속 관계에서 발생, 하위클래스에서 상위클래서의 메서드를 재정의하는 것
   - 오버로딩 : 한 클래스 내에서 동일한 이름의 매서드가 여러개 존재할 때
  
  
  
### 09. 스태틱
- 필드와 메서드에 붙이는 제한자
- static을 붙인 멤버(필드, 메서드)의 특징
   - 프로그램 시작 전에 메모리에 로딩된다
   - 객체를 생성하지 않고도 필드, 메서드 사용 가능
   - 이 때, 다를 객체를 참조하기 위해서는 객체 이름이 아닌 클래스명 지정
- 같은 클래스에서 생성된 객체는 static을 붙인 필드의 값을 공유한다
   ```java
   Class A{
      static int a;
   }
   ...
      A.a1=new A();
      A.a2=new A();
   ...
      a1.a=50
      a2.a=10
      // a의 값은 10
   ```
- __static을 붙인 메서드__
   - 어떤 객체에서도 같은 동작을 하는 메서드는 static을 붙여주는 것이 좋다 : 한 번만 생성되기 때문
   - static 메서드는 오버라이딩 할 수 없다
   - static 메서드에서 동일한 객체 내의 멤버(필드, 메서드)를 이용하기 위해서는 맴버에게 static을 붙여야만 한다.
- __`System.out.println`__
   - `java.lang.System.out.println()` : 컴파일러가 `import java.lang.*`을 삽입해 주므로 `java.lang` 생략 가능
   - `out`은 클래스 `System`을 통해 접근하므로 `System`클래스의 클래스 변수명임을 유추 가능
   - `println()`은 `out`이 참조하는 인스턴스의 메소드
- __`public static void main(String[] args){...}`__
   - static인 이유 : 인스턴스 생성과 관계없이 제일 먼저 호출되는 메서드
   - public인 이유 : main 메소드의 호출 명령은 외부로부터 시작되는 명령
   - main 메소드는 유일해야 한다.
   - 클래스 MyTest에 대하여 JVM은 MyTest.main()을 호출한다.



### 10. 추상클래스
  
   #### 1) 추상 클래스
   - 추상 메소드 : 처리 내용을 기술하지 않고 호출하는 방법만을 정의 `abstract void cry();`
   - 추상 클래스 : 추상 메서드를 1개라도 가진 클래스 `abstract class Animal { abstract void cry();}`
   - 추상 메서드, 추상 클래스는 __`abstract`__ 라는 수식자를 사용한다
     
   #### 2) 추상 클래스와 오버라이딩
   - 추상클래스를 상속받는 클래스는 추상메서드를 반드시 오버라이딩 해야 한다
   ```java
   abstract class Animal{
      int age;
      abstract void cry();
   }
   
   class Dog extends Animal{
      void cry(){
         System.out.println("멍멍");
      }
   }
   ```
  
   
   
### 11. 인터페이스
   - 상속 관계가 아닌 클래스에 추상 클래스처럼 기능을 제공하는 구조
   - 정의와 추상 메소드만을 사용한다.
   - __`interface`__ 라는 수식자 사용
   - 인터페이스의 구현 : 클래스에서 인터페이스를 이용하도록 하게 하는 것
   - 인터페이스를 구현하기 위해서는 `implemtns`사용
   ```java
   interface A{
      public static final int a=2; // int a=2;로 사용 가능
      public abstract void say(); // void say();로 사용 가능
   }
   
   class B implements A{
      public void say(){
         ...
      }
   }
   ```
   - 인터페이스는 다중 구현 가능 (상속은 단일 상속만 가능)
   - 인터페이스는 상속 가능
   - 복수의 인터페이스 상속하여 새로운 인터페이스 생성 가능
   - `class A extends B implements C,D,E `식으로 표현 가능
  
  
  
### 12. 다형성
   - 상속한 클래스의 오브젝트는 슈퍼클래스도로, 서브클래스로도 다룰 수 있다
   - 서브클래스의 객체는 슈퍼클래스의 객체에 대입할 수 있다(반대는 불가능).
         ```java
         Super obj=new Sub();
         ```
   - 인터페이스와 추상클래스는 호환 가능, 
   - 클래스간의 계층구조가 필요할 때 추샅클래스, 기능만을 제공하고 싶을 때는 인터페이스
   - 디자인패턴적인 측면에서 인터페이스를 통해 기능을 제공하는 것을 권장
  
  
  
### 13. 클래스 캐스팅 예외

   #### 다형성을 이용한 클래스간의 형변환
   - `Super a=new Sub()`, `Sub b=(Sub)a`
   - nuw Sub()에 의해 Sub 객체가 생성되고(Heap영역에 저장됨) Super 타입의 a(Stack 영역)가 가리킴
   - Sub 타입의 변수 b가 a가 가리키는 곳을 가리킴


   </div>
</details>

<details>
   <summary> 클래스 활용</summary>
   <div>
    
# 클래스 활용

### 14. 은닉화

### 15. 객체 확인

### 16. Class 클래스

### 17. 절차지향 및 객체지향
   </div>
</details>

