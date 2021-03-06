// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten
package org.kin.stellarfork.xdr

import java.io.IOException

// === xdr source ============================================================
//  union ManageOfferResult switch (ManageOfferResultCode code)
//  {
//  case MANAGE_OFFER_SUCCESS:
//      ManageOfferSuccessResult success;
//  default:
//      void;
//  };
//  ===========================================================================
class ManageOfferResult {
    var discriminant: ManageOfferResultCode? = null
    var success: ManageOfferSuccessResult? = null

    companion object {
        @JvmStatic
        @Throws(IOException::class)
        fun encode(
            stream: XdrDataOutputStream,
            encodedManageOfferResult: ManageOfferResult
        ) {
            stream.writeInt(encodedManageOfferResult.discriminant!!.value)
            when (encodedManageOfferResult.discriminant) {
                ManageOfferResultCode.MANAGE_OFFER_SUCCESS -> ManageOfferSuccessResult.encode(
                    stream,
                    encodedManageOfferResult.success!!
                )
                else -> {
                }
            }
        }

        @JvmStatic
        @Throws(IOException::class)
        fun decode(stream: XdrDataInputStream): ManageOfferResult {
            val decodedManageOfferResult = ManageOfferResult()
            val discriminant = ManageOfferResultCode.decode(stream)
            decodedManageOfferResult.discriminant = discriminant
            when (decodedManageOfferResult.discriminant) {
                ManageOfferResultCode.MANAGE_OFFER_SUCCESS ->
                    decodedManageOfferResult.success = ManageOfferSuccessResult.decode(stream)
                else -> {
                }
            }
            return decodedManageOfferResult
        }
    }
}
