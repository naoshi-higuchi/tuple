# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build Commands

```bash
mvn compile          # Compile
mvn test             # Run all tests
mvn test -Dtest=ClassName  # Run a single test class
mvn package          # Build JAR
mvn clean            # Clean build artifacts
```

## Project Overview

A minimal Java library providing immutable generic tuple types: `Pair<E1, E2>` and `Triple<E1, E2, E3>`. Both classes use the static factory method pattern (`Pair.newPair(...)`, `Triple.newTriple(...)`) with private constructors.

Package: `jp.nhiguchi.libs.tuple`

## Java Version Note

The current branch (`feature/java26`) is updating the project for Java 26 compatibility. The `pom.xml` originally targeted Java 7 (`<source>1.7</source>`), which is incompatible with modern JDKs (Java 17+). When modifying `pom.xml`, update the compiler source/target accordingly.

## Conventions

- Fields use an `f` prefix (e.g., `fElem1`, `fElem2`)
- Classes are `final` and immutable
- All public-facing types have `equals()`, `hashCode()`, and `toString()` implementations
