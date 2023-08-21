package com.charliezip.cryptography.hash

import com.charliezip.cryptography.hash.ShaUtils.bytesToHex
import com.charliezip.cryptography.hash.ShaUtils.digest
import org.junit.jupiter.api.Test

class ShaUtilsTest {

    @Test
    fun `SHA-256 해쉬 값 출력`() {
        val algorithm = "SHA-256"

        val input = "charliezip hash code"

        val digestBytes = digest(input, algorithm)
        val result = bytesToHex(digestBytes)

        println("Input (string) = $input")
        println("SHA-256 (hex) = $result")
    }

    @Test
    fun `SHA3-256 해쉬 값 출력`() {
        val algorithm = "SHA3-256"

        val input = "charliezip hash code"

        val digestBytes = digest(input, algorithm)
        val result = bytesToHex(digestBytes)

        println("Input (string) = $input")
        println("SHA3-256 (hex) = $result")
    }
}