[kr.bydelta.koala.data](../index.md) / [Tree](./index.md)

# Tree

`open class Tree<T : `[`Tree`](./index.md)`<`[`T`](index.md#T)`>> : `[`Property`](../-property/index.md)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](index.md#T)`>`

[T](index.md#T)-type들의 트리 또는 DAG 구조를 저장할 [Property](../-property/index.md)

**Since**
2.0.0

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Tree(leaf: `[`Word`](../-word/index.md)`?, children: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](index.md#T)`>)`<br>유향 그래프 형태의 구조를 저장합니다. |

### Properties

| Name | Summary |
|---|---|
| [children](children.md) | `val children: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](index.md#T)`>`<br>트리/DAG의 자식 노드들 |
| [leaf](leaf.md) | `val leaf: `[`Word`](../-word/index.md)`?`<br>트리/DAG의 노드에서 연결되는 [Word](../-word/index.md) |

### Inherited Properties

| Name | Summary |
|---|---|
| [properties](../-property/properties.md) | `val properties: `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<`[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)`, `[`Property`](../-property/index.md)`>`<br>가질 수 있는 속성값을 저장할 [MutableMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html) |

### Functions

| Name | Summary |
|---|---|
| [equals](equals.md) | `open fun equals(other: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Indicates whether some other object is "equal to" this one. |
| [getParent](get-parent.md) | `fun getParent(): `[`T`](index.md#T)`?`<br>부모 노드를 반환합니다. |
| [getTerminals](get-terminals.md) | `fun getTerminals(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Word`](../-word/index.md)`>`<br>이 노드의 자식노드들에 속하는 leaf/terminal node들을 모읍니다. |
| [getTreeString](get-tree-string.md) | `fun getTreeString(depth: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 0, buffer: `[`StringBuffer`](http://docs.oracle.com/javase/6/docs/api/java/lang/StringBuffer.html)` = StringBuffer()): `[`StringBuffer`](http://docs.oracle.com/javase/6/docs/api/java/lang/StringBuffer.html)<br>이 트리구조를 표현하는 텍스트 표현을 [buffer](get-tree-string.md#kr.bydelta.koala.data.Tree$getTreeString(kotlin.Int, java.lang.StringBuffer)/buffer)에 담아 반환합니다. |
| [hasNonTerminals](has-non-terminals.md) | `fun hasNonTerminals(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>이 노드가 (leaf node를 제외하고) 자식 노드를 갖는지 확인합니다. |
| [hashCode](hash-code.md) | `open fun hashCode(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Returns a hash code value for the object.  The general contract of hashCode is: |
| [isRoot](is-root.md) | `fun isRoot(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>이 노드가 최상위 노드인지 확인합니다. |
| [toString](to-string.md) | `open fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Returns a string representation of the object. |

### Inherited Functions

| Name | Summary |
|---|---|
| [setListProperty](../-property/set-list-property.md) | `fun <T : `[`Property`](../-property/index.md)`> setListProperty(vararg properties: `[`T`](../-property/set-list-property.md#T)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>[T](../-property/set-list-property.md#T)-type 값들을 가변변수로 하여 [properties](../-property/set-list-property.md#kr.bydelta.koala.data.Property$setListProperty(kotlin.Array((kr.bydelta.koala.data.Property.setListProperty.T)))/properties)로 받은 뒤, 저장합니다. |
| [setProperty](../-property/set-property.md) | `fun <T : `[`Property`](../-property/index.md)`> setProperty(property: `[`T`](../-property/set-property.md#T)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>[T](../-property/set-property.md#T)-type 값 [property](../-property/set-property.md#kr.bydelta.koala.data.Property$setProperty(kr.bydelta.koala.data.Property.setProperty.T)/property)를 저장합니다. |

### Inheritors

| Name | Summary |
|---|---|
| [DepTree](../-dep-tree/index.md) | `class DepTree : `[`Tree`](./index.md)`<`[`DepTree`](../-dep-tree/index.md)`>`<br>의존구문구조 분석의 결과. |
| [RoleTree](../-role-tree/index.md) | `class RoleTree : `[`Tree`](./index.md)`<`[`RoleTree`](../-role-tree/index.md)`>`<br>의미역 구조 분석의 결과. |
| [SyntaxTree](../-syntax-tree/index.md) | `class SyntaxTree : `[`Tree`](./index.md)`<`[`SyntaxTree`](../-syntax-tree/index.md)`>`<br>구문구조 분석의 결과를 저장할 [Property](../-property/index.md). |