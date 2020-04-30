// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten
package org.kin.stellarfork.xdr

import org.kin.stellarfork.xdr.TimeBounds.Companion.encode
import java.io.IOException

// === xdr source ============================================================
//  struct Transaction
//  {
//      // account used to run the transaction
//      AccountID sourceAccount;
//
//      // the fee the sourceAccount will pay
//      uint32 fee;
//
//      // sequence number to consume in the account
//      SequenceNumber seqNum;
//
//      // validity range (inclusive) for the last ledger close time
//      TimeBounds* timeBounds;
//
//      Memo memo;
//
//      Operation operations<100>;
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
class Transaction {
    var sourceAccount: AccountID? = null
    var fee: Uint32? = null
    var seqNum: SequenceNumber? = null
    var timeBounds: TimeBounds? = null
    var memo: Memo? = null
    var operations: Array<Operation?> = arrayOfNulls(0)
    var ext: TransactionExt? = null

    class TransactionExt {
        var discriminant: Int? = null

        companion object {
            @JvmStatic
            @Throws(IOException::class)
            fun encode(
                stream: XdrDataOutputStream,
                encodedTransactionExt: TransactionExt
            ) {
                stream.writeInt(encodedTransactionExt.discriminant!!.toInt())
                when (encodedTransactionExt.discriminant) {
                    0 -> {
                    }
                }
            }

            @JvmStatic
            @Throws(IOException::class)
            fun decode(stream: XdrDataInputStream): TransactionExt {
                val decodedTransactionExt = TransactionExt()
                val discriminant = stream.readInt()
                decodedTransactionExt.discriminant = discriminant
                when (decodedTransactionExt.discriminant) {
                    0 -> {
                    }
                }
                return decodedTransactionExt
            }
        }
    }

    companion object {
        @JvmStatic
        @Throws(IOException::class)
        fun encode(
            stream: XdrDataOutputStream,
            encodedTransaction: Transaction
        ) {
            AccountID.encode(stream, encodedTransaction.sourceAccount!!)
            Uint32.encode(stream, encodedTransaction.fee!!)
            SequenceNumber.encode(stream, encodedTransaction.seqNum!!)
            if (encodedTransaction.timeBounds != null) {
                stream.writeInt(1)
                encode(stream, encodedTransaction.timeBounds!!)
            } else {
                stream.writeInt(0)
            }
            Memo.encode(stream, encodedTransaction.memo!!)
            val operationssize = encodedTransaction.operations.size
            stream.writeInt(operationssize)
            for (i in 0 until operationssize) {
                Operation.encode(
                    stream,
                    encodedTransaction.operations[i]!!
                )
            }
            TransactionExt.encode(stream, encodedTransaction.ext!!)
        }

        @JvmStatic
        @Throws(IOException::class)
        fun decode(stream: XdrDataInputStream): Transaction {
            val decodedTransaction =
                Transaction()
            decodedTransaction.sourceAccount = AccountID.decode(stream)
            decodedTransaction.fee = Uint32.decode(stream)
            decodedTransaction.seqNum = SequenceNumber.decode(stream)
            val timeBoundsPresent = stream.readInt()
            if (timeBoundsPresent != 0) {
                decodedTransaction.timeBounds = TimeBounds.decode(stream)
            }
            decodedTransaction.memo = Memo.decode(stream)
            val operationssize = stream.readInt()
            decodedTransaction.operations =
                arrayOfNulls(operationssize)
            for (i in 0 until operationssize) {
                decodedTransaction.operations[i] =
                    Operation.decode(stream)
            }
            decodedTransaction.ext = TransactionExt.decode(stream)
            return decodedTransaction
        }
    }
}