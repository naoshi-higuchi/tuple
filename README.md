# tuple

A minimal Java library providing immutable generic tuple types: `Pair` and `Triple`.

## Requirements

- Java 26+
- Maven 3.x

## Installation

Add the dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>jp.nhiguchi.libs</groupId>
    <artifactId>tuple</artifactId>
    <version>0.2</version>
</dependency>
```

Or build and install locally:

```bash
mvn install
```

## Usage

### Pair

```java
import jp.nhiguchi.libs.tuple.Pair;

Pair<String, Integer> p = Pair.newPair("hello", 42);

p.get1st(); // "hello"
p.get2nd(); // 42

p.toString(); // "<hello, 42>"
```

### Triple

```java
import jp.nhiguchi.libs.tuple.Triple;

Triple<String, Integer, Boolean> t = Triple.newTriple("hello", 42, true);

t.get1st(); // "hello"
t.get2nd(); // 42
t.get3rd(); // true

t.toString(); // "<hello, 42, true>"
```

### Equality

Both types implement `equals()` and `hashCode()` based on their elements, so they work correctly as map keys and in collections.

```java
Pair<String, Integer> a = Pair.newPair("x", 1);
Pair<String, Integer> b = Pair.newPair("x", 1);
a.equals(b); // true
```

## API

### `Pair<E1, E2>`

| Method | Description |
|---|---|
| `Pair.newPair(E1, E2)` | Static factory method |
| `get1st()` | Returns the first element |
| `get2nd()` | Returns the second element |
| `equals(Object)` | Value-based equality |
| `hashCode()` | Hash of both elements |
| `toString()` | `<e1, e2>` |

### `Triple<E1, E2, E3>`

| Method | Description |
|---|---|
| `Triple.newTriple(E1, E2, E3)` | Static factory method |
| `get1st()` | Returns the first element |
| `get2nd()` | Returns the second element |
| `get3rd()` | Returns the third element |
| `equals(Object)` | Value-based equality |
| `hashCode()` | Hash of all three elements |
| `toString()` | `<e1, e2, e3>` |

## Build

```bash
mvn compile   # Compile
mvn test      # Run tests
mvn package   # Build JAR
mvn clean     # Clean build artifacts
```

## License

[MIT](LICENSE)
