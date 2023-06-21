# Kotlin Wasm Benchmarks

[![JetBrains team project](https://jb.gg/badges/team.svg?style=flat)](https://confluence.jetbrains.com/display/ALL/JetBrains+on+GitHub)
[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0)
[![GitHub license](https://img.shields.io/badge/license-BSD%20License%202.0-blue.svg?style=flat)](http://www.opensource.org/licenses/bsd-license.php)
[![GitHub license](https://img.shields.io/badge/license-MIT%20License%202.0-blue.svg?style=flat)](https://opensource.org/license/mit/)

This is kotlin multiplatform benchmarks to compare Kotlin Wasm vs Kotlin JS performance.

# Description
These benchmarks are based on JetBrains micro-benchmarks benchmarks and macro-benchmarks based on [are-we-fast-yet](https://github.com/smarr/are-we-fast-yet) benchmarks collection.
To perform benchmarks it uses [kotlinx-benchmarks](https://github.com/Kotlin/kotlinx-benchmark) library.

# Build and Run
Specify Kotlin version in `gradle.properties` file or use additional gradle argument `-Pkotlin_version=1.8.0`.

### To run All benchmarks in V8:
`./gradlew benchmark`

### To run All Kotlin/Wasm benchmarks in V8:

`./gradlew wasmBenchmark`

### To run All Kotlin/Wasm benchmarks with binaries optimized by [Binaryen](https://github.com/WebAssembly/binaryen) in V8:

`./gradlew wasmOptBenchmark`

### To run All Kotlin/JS benchmarks in V8:

`./gradlew jsBenchmark`

### To see all tasks:

`./gradlew tasks`

### Result output is located in `build/reports` directory.

# License
See LICENSE.md file for details.
