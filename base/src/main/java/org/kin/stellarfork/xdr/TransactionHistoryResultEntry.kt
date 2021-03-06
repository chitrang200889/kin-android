// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten
package org.kin.stellarfork.xdr

import java.io.IOException

// === xdr source ============================================================
//  struct TransactionHistoryResultEntry
//  {
//      uint32 ledgerSeq;
//      TransactionResultSet txResultSet;
//
//      // reserved for future use
//      union switch (int v)
//      {
//      case 0:
//          void;
//      }
//      ext;
//  };
//  ===========================================================================
class TransactionHistoryResultEntry {
    var ledgerSeq: Uint32? = null
    var txResultSet: TransactionResultSet? = null
    var ext: TransactionHistoryResultEntryExt? = null

    class TransactionHistoryResultEntryExt {
        var discriminant: Int? = null

        companion object {
            @JvmStatic
            @Throws(IOException::class)
            fun encode(
                stream: XdrDataOutputStream,
                encodedTransactionHistoryResultEntryExt: TransactionHistoryResultEntryExt
            ) {
                stream.writeInt(encodedTransactionHistoryResultEntryExt.discriminant!!.toInt())
                when (encodedTransactionHistoryResultEntryExt.discriminant) {
                    0 -> {
                    }
                }
            }

            @JvmStatic
            @Throws(IOException::class)
            fun decode(stream: XdrDataInputStream): TransactionHistoryResultEntryExt {
                val decodedTransactionHistoryResultEntryExt = TransactionHistoryResultEntryExt()
                val discriminant = stream.readInt()
                decodedTransactionHistoryResultEntryExt.discriminant = discriminant
                when (decodedTransactionHistoryResultEntryExt.discriminant) {
                    0 -> {
                    }
                }
                return decodedTransactionHistoryResultEntryExt
            }
        }
    }

    companion object {
        @JvmStatic
        @Throws(IOException::class)
        fun encode(
            stream: XdrDataOutputStream,
            encodedTransactionHistoryResultEntry: TransactionHistoryResultEntry
        ) {
            Uint32.encode(stream, encodedTransactionHistoryResultEntry.ledgerSeq!!)
            TransactionResultSet.encode(stream, encodedTransactionHistoryResultEntry.txResultSet!!)
            TransactionHistoryResultEntryExt.encode(
                stream,
                encodedTransactionHistoryResultEntry.ext!!
            )
        }

        @Throws(IOException::class)
        fun decode(stream: XdrDataInputStream): TransactionHistoryResultEntry {
            val decodedTransactionHistoryResultEntry = TransactionHistoryResultEntry()
            decodedTransactionHistoryResultEntry.ledgerSeq = Uint32.decode(stream)
            decodedTransactionHistoryResultEntry.txResultSet = TransactionResultSet.decode(stream)
            decodedTransactionHistoryResultEntry.ext =
                TransactionHistoryResultEntryExt.decode(stream)
            return decodedTransactionHistoryResultEntry
        }
    }
}
