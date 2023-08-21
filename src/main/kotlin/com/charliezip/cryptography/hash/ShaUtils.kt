package com.charliezip.cryptography.hash

import java.security.MessageDigest
import java.security.NoSuchAlgorithmException

object ShaUtils {

    fun digest(text: String, algorithm: String): ByteArray {
        lateinit var md: MessageDigest
        try {
            md = MessageDigest.getInstance(algorithm)
        } catch (e: NoSuchAlgorithmException) {
            throw IllegalArgumentException(e)
        }
        return md.digest(text.toByteArray())
    }

    fun bytesToHex(bytes: ByteArray): String {
        val sb: StringBuilder = StringBuilder()

        for (byte in bytes) {
            sb.append(String.format("%02x", byte))
        }
        return sb.toString()
    }
}