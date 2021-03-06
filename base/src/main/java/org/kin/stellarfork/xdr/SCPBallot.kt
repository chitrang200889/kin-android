// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten
package org.kin.stellarfork.xdr

import java.io.IOException

// === xdr source ============================================================
//  struct SCPBallot
//  {
//      uint32 counter; // n
//      Value value;    // x
//  };
//  ===========================================================================
class SCPBallot {
    var counter: Uint32? = null
    var value: Value? = null

    companion object {
        @JvmStatic
        @Throws(IOException::class)
        fun encode(stream: XdrDataOutputStream, encodedSCPBallot: SCPBallot) {
            Uint32.encode(stream, encodedSCPBallot.counter!!)
            Value.encode(stream, encodedSCPBallot.value!!)
        }

        @JvmStatic
        @Throws(IOException::class)
        fun decode(stream: XdrDataInputStream): SCPBallot {
            val decodedSCPBallot = SCPBallot()
            decodedSCPBallot.counter = Uint32.decode(stream)
            decodedSCPBallot.value = Value.decode(stream)
            return decodedSCPBallot
        }
    }
}
