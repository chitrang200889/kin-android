[kin-android](../../../../index.md) / [org.kin.sdk.base.network.api](../../../index.md) / [KinAccountCreationApi](../../index.md) / [CreateAccountResponse](../index.md) / [Result](./index.md)

# Result

`sealed class Result`

### Types

| Name | Summary |
|---|---|
| [Exists](-exists.md) | `object Exists : Result` |
| [Ok](-ok.md) | `object Ok : Result` |
| [TransientFailure](-transient-failure/index.md) | `data class TransientFailure : Result` |
| [Unavailable](-unavailable.md) | `object Unavailable : Result` |
| [UndefinedError](-undefined-error/index.md) | `data class UndefinedError : Result` |
| [UpgradeRequiredError](-upgrade-required-error.md) | `object UpgradeRequiredError : Result` |

### Properties

| Name | Summary |
|---|---|
| [value](value.md) | `val value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
