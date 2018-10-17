[kr.bydelta.koala.ext](../index.md) / [kotlin.Char](index.md) / [isChosungJamo](./is-chosung-jamo.md)

# isChosungJamo

`fun `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`.isChosungJamo(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

현재 문자 [this](is-chosung-jamo/-this-.md)가 현대 한글 초성 자음 문자인지 확인합니다.

## 사용법

### Kotlin

``` kotlin
'가'.isChosungJamo()
```

### Scala

``` kotlin
import kr.bydelta.koala.Implicits.*
'가'.isChosungJamo
```

### Java

``` java
Utils.isChosungJamo('가')
```

**Since**
2.0.0

**Return**
조건에 맞으면 true
