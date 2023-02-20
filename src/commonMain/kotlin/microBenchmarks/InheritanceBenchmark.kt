/*
 * Copyright 2023 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package microBenchmarks

import kotlinx.benchmark.*

private const val RUNS = 1_000_000

@State(Scope.Benchmark)
class InheritanceBenchmark {

open class A() {
        fun a(): Int = 0

        fun a1(): Int = 1
        fun a2(): Int = 2
        fun a3(): Int = 3
        fun a4(): Int = 4
        fun a5(): Int = 5
        fun a6(): Int = 6
        fun a7(): Int = 7
        fun a8(): Int = 8
        open fun a9(): Int = 9
        open fun a10(): Int = 10
        open fun a11(): Int = 11
        open fun a12(): Int = 12
        open fun a13(): Int = 13
        open fun a14(): Int = 14
        open fun a15(): Int = 15
        open fun a16(): Int = 16
        open fun a17(): Int = 17
        open fun a18(): Int = 18
        open fun a19(): Int = 19
        open fun a20(): Int = 20
        open fun a21(): Int = 21
        open fun a22(): Int = 22
        open fun a23(): Int = 23
        open fun a24(): Int = 24
        open fun a25(): Int = 25
        open fun a26(): Int = 26
        open fun a27(): Int = 27
        open fun a28(): Int = 28
        open fun a29(): Int = 29
        open fun a30(): Int = 30
        open fun a31(): Int = 31
        open fun a32(): Int = 32
        open fun a33(): Int = 33
        open fun a34(): Int = 34
        open fun a35(): Int = 35
        open fun a36(): Int = 36
        open fun a37(): Int = 37
        open fun a38(): Int = 38
        open fun a39(): Int = 39
        open fun a40(): Int = 40
        open fun a41(): Int = 41
        open fun a42(): Int = 42
        open fun a43(): Int = 43
        open fun a44(): Int = 44
        open fun a45(): Int = 45
        open fun a46(): Int = 46
        open fun a47(): Int = 47
        open fun a48(): Int = 48
        open fun a49(): Int = 49
        open fun a50(): Int = 50
        open fun a51(): Int = 51
        open fun a52(): Int = 52
        open fun a53(): Int = 53
        open fun a54(): Int = 54
        open fun a55(): Int = 55
        open fun a56(): Int = 56
        open fun a57(): Int = 57
        open fun a58(): Int = 58
        open fun a59(): Int = 59
        open fun a60(): Int = 60
        open fun a61(): Int = 61
        open fun a62(): Int = 62
        open fun a63(): Int = 63
        open fun a64(): Int = 64
        open fun a65(): Int = 65
        open fun a66(): Int = 66
        open fun a67(): Int = 67
        open fun a68(): Int = 68
        open fun a69(): Int = 69
        open fun a70(): Int = 70
        open fun a71(): Int = 71
        open fun a72(): Int = 72
        open fun a73(): Int = 73
        open fun a74(): Int = 74
        open fun a75(): Int = 75
        open fun a76(): Int = 76
        open fun a77(): Int = 77
        open fun a78(): Int = 78
        open fun a79(): Int = 79
        open fun a80(): Int = 80
        open fun a81(): Int = 81
        open fun a82(): Int = 82
        open fun a83(): Int = 83
        open fun a84(): Int = 84
        open fun a85(): Int = 85
        open fun a86(): Int = 86
        open fun a87(): Int = 87
        open fun a88(): Int = 88
        open fun a89(): Int = 89
        open fun a90(): Int = 90
        open fun a91(): Int = 91
        open fun a92(): Int = 92
        open fun a93(): Int = 93
        open fun a94(): Int = 94
        open fun a95(): Int = 95
        open fun a96(): Int = 96
        open fun a97(): Int = 97
        open fun a98(): Int = 98
        open fun a99(): Int = 99

    }

open class B() : A() {
        override fun a10(): Int = 0

        fun b1(): Int = 1
        fun b2(): Int = 2
        fun b3(): Int = 3
        fun b4(): Int = 4
        fun b5(): Int = 5
        open fun b6(): Int = 6
        open fun b7(): Int = 7
        open fun b8(): Int = 8
        open fun b9(): Int = 9
        open fun b10(): Int = 10
        open fun b11(): Int = 11
        open fun b12(): Int = 12
        open fun b13(): Int = 13
        open fun b14(): Int = 14
        open fun b15(): Int = 15
        open fun b16(): Int = 16
        open fun b17(): Int = 17
        open fun b18(): Int = 18
        open fun b19(): Int = 19
        open fun b20(): Int = 20
        open fun b21(): Int = 21
        open fun b22(): Int = 22
        open fun b23(): Int = 23
        open fun b24(): Int = 24
        open fun b25(): Int = 25
        open fun b26(): Int = 26
        open fun b27(): Int = 27
        open fun b28(): Int = 28
        open fun b29(): Int = 29
        open fun b30(): Int = 30
        open fun b31(): Int = 31
        open fun b32(): Int = 32
        open fun b33(): Int = 33
        open fun b34(): Int = 34
        open fun b35(): Int = 35
        open fun b36(): Int = 36
        open fun b37(): Int = 37
        open fun b38(): Int = 38
        open fun b39(): Int = 39
        open fun b40(): Int = 40
        open fun b41(): Int = 41
        open fun b42(): Int = 42
        open fun b43(): Int = 43
        open fun b44(): Int = 44
        open fun b45(): Int = 45
        open fun b46(): Int = 46
        open fun b47(): Int = 47
        open fun b48(): Int = 48
        open fun b49(): Int = 49
        open fun b50(): Int = 50
        open fun b51(): Int = 51
        open fun b52(): Int = 52
        open fun b53(): Int = 53
        open fun b54(): Int = 54
        open fun b55(): Int = 55
        open fun b56(): Int = 56
        open fun b57(): Int = 57
        open fun b58(): Int = 58
        open fun b59(): Int = 59
        open fun b60(): Int = 60
        open fun b61(): Int = 61
        open fun b62(): Int = 62
        open fun b63(): Int = 63
        open fun b64(): Int = 64
        open fun b65(): Int = 65
        open fun b66(): Int = 66
        open fun b67(): Int = 67
        open fun b68(): Int = 68
        open fun b69(): Int = 69
        open fun b70(): Int = 70
        open fun b71(): Int = 71
        open fun b72(): Int = 72
        open fun b73(): Int = 73
        open fun b74(): Int = 74
        open fun b75(): Int = 75
        open fun b76(): Int = 76
        open fun b77(): Int = 77
        open fun b78(): Int = 78
        open fun b79(): Int = 79
        open fun b80(): Int = 80
        open fun b81(): Int = 81
        open fun b82(): Int = 82
        open fun b83(): Int = 83
        open fun b84(): Int = 84
        open fun b85(): Int = 85
        open fun b86(): Int = 86
        open fun b87(): Int = 87
        open fun b88(): Int = 88
        open fun b89(): Int = 89
        open fun b90(): Int = 90
        open fun b91(): Int = 91
        open fun b92(): Int = 92
        open fun b93(): Int = 93
        open fun b94(): Int = 94
        open fun b95(): Int = 95
        open fun b96(): Int = 96
        open fun b97(): Int = 97
        open fun b98(): Int = 98
        open fun b99(): Int = 99
    }

open class C() : B() {
        fun c(): Int = 0
        override fun a10(): Int = 100

        fun c1(): Int = 1
        fun c2(): Int = 2
        fun c3(): Int = 3
        fun c4(): Int = 4
        fun c5(): Int = 5
        fun c6(): Int = 6
        fun c7(): Int = 7
        fun c8(): Int = 8
        open fun c9(): Int = 9
        open fun c10(): Int = 10
        open fun c11(): Int = 11
        open fun c12(): Int = 12
        open fun c13(): Int = 13
        open fun c14(): Int = 14
        open fun c15(): Int = 15
        open fun c16(): Int = 16
        open fun c17(): Int = 17
        open fun c18(): Int = 18
        open fun c19(): Int = 19
        open fun c20(): Int = 20
        open fun c21(): Int = 21
        open fun c22(): Int = 22
        open fun c23(): Int = 23
        open fun c24(): Int = 24
        open fun c25(): Int = 25
        open fun c26(): Int = 26
        open fun c27(): Int = 27
        open fun c28(): Int = 28
        open fun c29(): Int = 29
        open fun c30(): Int = 30
        open fun c31(): Int = 31
        open fun c32(): Int = 32
        open fun c33(): Int = 33
        open fun c34(): Int = 34
        open fun c35(): Int = 35
        open fun c36(): Int = 36
        open fun c37(): Int = 37
        open fun c38(): Int = 38
        open fun c39(): Int = 39
        open fun c40(): Int = 40
        open fun c41(): Int = 41
        open fun c42(): Int = 42
        open fun c43(): Int = 43
        open fun c44(): Int = 44
        open fun c45(): Int = 45
        open fun c46(): Int = 46
        open fun c47(): Int = 47
        open fun c48(): Int = 48
        open fun c49(): Int = 49
        open fun c50(): Int = 50
        open fun c51(): Int = 51
        open fun c52(): Int = 52
        open fun c53(): Int = 53
        open fun c54(): Int = 54
        open fun c55(): Int = 55
        open fun c56(): Int = 56
        open fun c57(): Int = 57
        open fun c58(): Int = 58
        open fun c59(): Int = 59
        open fun c60(): Int = 60
        open fun c61(): Int = 61
        open fun c62(): Int = 62
        open fun c63(): Int = 63
        open fun c64(): Int = 64
        open fun c65(): Int = 65
        open fun c66(): Int = 66
        open fun c67(): Int = 67
        open fun c68(): Int = 68
        open fun c69(): Int = 69
        open fun c70(): Int = 70
        open fun c71(): Int = 71
        open fun c72(): Int = 72
        open fun c73(): Int = 73
        open fun c74(): Int = 74
        open fun c75(): Int = 75
        open fun c76(): Int = 76
        open fun c77(): Int = 77
        open fun c78(): Int = 78
        open fun c79(): Int = 79
        open fun c80(): Int = 80
        open fun c81(): Int = 81
        open fun c82(): Int = 82
        open fun c83(): Int = 83
        open fun c84(): Int = 84
        open fun c85(): Int = 85
        open fun c86(): Int = 86
        open fun c87(): Int = 87
        open fun c88(): Int = 88
        open fun c89(): Int = 89
        open fun c90(): Int = 90
        open fun c91(): Int = 91
        open fun c92(): Int = 92
        open fun c93(): Int = 93
        open fun c94(): Int = 94
        open fun c95(): Int = 95
        open fun c96(): Int = 96
        open fun c97(): Int = 97
        open fun c98(): Int = 98
        open fun c99(): Int = 99
    }

open class D() : C() {
        override fun a10(): Int = 1000
        fun d(): Int = 0

        fun d1(): Int = 1
        fun d2(): Int = 2
        fun d3(): Int = 3
        fun d4(): Int = 4
        fun d5(): Int = 5
        fun d6(): Int = 6
        fun d7(): Int = 7
        fun d8(): Int = 8
        open fun d9(): Int = 9
        open fun d10(): Int = 10
        open fun d11(): Int = 11
        open fun d12(): Int = 12
        open fun d13(): Int = 13
        open fun d14(): Int = 14
        open fun d15(): Int = 15
        open fun d16(): Int = 16
        open fun d17(): Int = 17
        open fun d18(): Int = 18
        open fun d19(): Int = 19
        open fun d20(): Int = 20
        open fun d21(): Int = 21
        open fun d22(): Int = 22
        open fun d23(): Int = 23
        open fun d24(): Int = 24
        open fun d25(): Int = 25
        open fun d26(): Int = 26
        open fun d27(): Int = 27
        open fun d28(): Int = 28
        open fun d29(): Int = 29
        open fun d30(): Int = 30
        open fun d31(): Int = 31
        open fun d32(): Int = 32
        open fun d33(): Int = 33
        open fun d34(): Int = 34
        open fun d35(): Int = 35
        open fun d36(): Int = 36
        open fun d37(): Int = 37
        open fun d38(): Int = 38
        open fun d39(): Int = 39
        open fun d40(): Int = 40
        open fun d41(): Int = 41
        open fun d42(): Int = 42
        open fun d43(): Int = 43
        open fun d44(): Int = 44
        open fun d45(): Int = 45
        open fun d46(): Int = 46
        open fun d47(): Int = 47
        open fun d48(): Int = 48
        open fun d49(): Int = 49
        open fun d50(): Int = 50
        open fun d51(): Int = 51
        open fun d52(): Int = 52
        open fun d53(): Int = 53
        open fun d54(): Int = 54
        open fun d55(): Int = 55
        open fun d56(): Int = 56
        open fun d57(): Int = 57
        open fun d58(): Int = 58
        open fun d59(): Int = 59
        open fun d60(): Int = 60
        open fun d61(): Int = 61
        open fun d62(): Int = 62
        open fun d63(): Int = 63
        open fun d64(): Int = 64
        open fun d65(): Int = 65
        open fun d66(): Int = 66
        open fun d67(): Int = 67
        open fun d68(): Int = 68
        open fun d69(): Int = 69
        open fun d70(): Int = 70
        open fun d71(): Int = 71
        open fun d72(): Int = 72
        open fun d73(): Int = 73
        open fun d74(): Int = 74
        open fun d75(): Int = 75
        open fun d76(): Int = 76
        open fun d77(): Int = 77
        open fun d78(): Int = 78
        open fun d79(): Int = 79
        open fun d80(): Int = 80
        open fun d81(): Int = 81
        open fun d82(): Int = 82
        open fun d83(): Int = 83
        open fun d84(): Int = 84
        open fun d85(): Int = 85
        open fun d86(): Int = 86
        open fun d87(): Int = 87
        open fun d88(): Int = 88
        open fun d89(): Int = 89
        open fun d90(): Int = 90
        open fun d91(): Int = 91
        open fun d92(): Int = 92
        open fun d93(): Int = 93
        open fun d94(): Int = 94
        open fun d95(): Int = 95
        open fun d96(): Int = 96
        open fun d97(): Int = 97
        open fun d98(): Int = 98
        open fun d99(): Int = 99
    }

open class E() : D() {
        override fun a10(): Int = 200
        open fun e1(): Int = 1
        open fun e2(): Int = 2
        open fun e3(): Int = 3
        open fun e4(): Int = 4
        open fun e5(): Int = 5
        open fun e6(): Int = 6
        open fun e7(): Int = 7
        open fun e8(): Int = 8
        open fun e9(): Int = 9
        open fun e10(): Int = 10
        open fun e11(): Int = 11
        open fun e12(): Int = 12
        open fun e13(): Int = 13
        open fun e14(): Int = 14
        open fun e15(): Int = 15
    }

open class F() : E() {
        open fun f1(): Int = 1
        open fun f2(): Int = 2
        open fun f3(): Int = 3
        open fun f4(): Int = 4
        open fun f5(): Int = 5
        open fun f6(): Int = 6
        open fun f7(): Int = 7
        open fun f8(): Int = 8
        open fun f9(): Int = 9
        open fun f10(): Int = 10
        open fun f11(): Int = 11
        open fun f12(): Int = 12
        open fun f13(): Int = 13
        open fun f14(): Int = 14
        open fun f15(): Int = 15
    }

open class G() : F() {
        open fun g1(): Int = 1
        open fun g2(): Int = 2
        open fun g3(): Int = 3
        open fun g4(): Int = 4
        open fun g5(): Int = 5
        open fun g6(): Int = 6
        open fun g7(): Int = 7
        open fun g8(): Int = 8
        open fun g9(): Int = 9
        open fun g10(): Int = 10
        open fun g11(): Int = 11
        open fun g12(): Int = 12
        open fun g13(): Int = 13
        open fun g14(): Int = 14
        open fun g15(): Int = 15
    }

    val a = A()
    val b = B()
    val c = C()
    val d = D()
    val e = E()
    val f = F()
    val g = G()

    @Benchmark
    fun baseCalls(): Int {
        var x = 0
        var i = 0
        while (i < RUNS) {
            x += a.a()
            x += b.a10()
            x += c.b20()
            x += d.c20()
            x += e.d10()
            x += f.e10()
            x += g.f10()
            x += g.g3()

            i++
        }
        return x
    }
}