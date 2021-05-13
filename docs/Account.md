
# Account

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | [**UUID**](UUID.md) | UUID of the account. | 
**code** | **String** | Code that represents the account. | 
**description** | **String** | Name of the account. |  [optional]
**description2** | **String** | Other name of the account. |  [optional]
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | Type of the account. Default &#x3D; BANK_ACCOUNT |  [optional]
**closedAccount** | **Boolean** | Flag to show if account is opened (false) or closed (true). Default &#x3D; false. |  [optional]
**closingDate** | [**LocalDate**](LocalDate.md) | Date as of which the account is closed. Default: system date. |  [optional]
**hidden** | **Boolean** | Flag to show if the data shall be hidden in all lists. Default &#x3D; false. |  [optional]
**openingDate** | [**LocalDate**](LocalDate.md) | Date when the account was opened. Default: system date. |  [optional]
**nonResident** | **Boolean** | Flag to show if the account is a non resident account (true) or a resident account (false). Default &#x3D; false. |  [optional]
**currency** | [**ReferenceModel**](ReferenceModel.md) | Currency of the account. | 
**company** | [**ReferenceModel**](ReferenceModel.md) | Company of the account. | 
**branch** | [**ReferenceModel**](ReferenceModel.md) | Bank branch that holds the account. | 
**defaultGroup** | [**ReferenceModel**](ReferenceModel.md) | Account group of the account. |  [optional]
**bankStatementLayout** | [**BankStatementLayoutEnum**](#BankStatementLayoutEnum) | Bank statement layout of the account. |  [optional]
**bankAccountID** | [**AccountIdModel**](AccountIdModel.md) | Account code according to the international banking standards (BAN). | 
**bankAccountIDs** | [**List&lt;AccountIdModel&gt;**](AccountIdModel.md) | Additional BANs for the same account. |  [optional]
**address** | [**AddressModel_**](AddressModel_.md) | Account&#39;s address. | 
**contact** | [**ContactModel**](ContactModel.md) | Account&#39;s contact. |  [optional]
**calendar** | [**ReferenceModel**](ReferenceModel.md) | Account&#39;s calendar. | 
**zbaGenerator** | **Boolean** | Flag to show if account can generate ZBA interco cash flows (true) or no (false). Default &#x3D; false. |  [optional]
**zbaIdentifier** | **String** | Code that used by the bank to identify this account in bank statements. |  [optional]
**generateZBAFlow** | [**GenerateZBAFlowEnum**](#GenerateZBAFlowEnum) | Defines how many flows shall be generated for each ZBA actual. |  [optional]
**settlementAccount** | [**ReferenceModel**](ReferenceModel.md) | Settlement account  of account. |  [optional]
**counterpartySettlementAccount** | [**ReferenceModel**](ReferenceModel.md) | Counterparty settlement account  of account. |  [optional]
**chartOfAccounts** | [**ReferenceModel**](ReferenceModel.md) | Chart of accounts. |  [optional]
**glAccount** | [**ReferenceModel**](ReferenceModel.md) | GL account. |  [optional]
**internalAccountCode** | **String** | Code that represents the current account in the internal chart of GL accounts. |  [optional]
**includeInGLReconciliation** | **Boolean** | Flag to show if the current account should be considered in module GR (true) or no (false). Default &#x3D; false. |  [optional]
**considerBankStatementsFrom** | [**LocalDate**](LocalDate.md) | Date as of which bank statements should be considered in the GL reconciliation process. |  [optional]
**initialAccountingBalance** | [**AmountModel_**](AmountModel_.md) | Initial balance of the account as calculated by the Accounting system on Initial accounting balance date. |  [optional]
**initialAccountingBalanceDate** | [**LocalDate**](LocalDate.md) | Date of the Initial accounting balance. |  [optional]
**userZone** | [**UserZones**](UserZones.md) | User zone section. |  [optional]
**considerOneDayFloatTransactions** | **Boolean** | Flag to show if “one day float” bank transactions should be considered when calculating the account initial balance (true) or no (false). Default &#x3D; false. |  [optional]
**considerTwoDayFloatTransactions** | **Boolean** | Flag to show if “two day float” bank transactions should be considered when calculating the account initial balance (true) or no (false). Default &#x3D; false. |  [optional]
**considerThreeDayFloatTransactions** | **Boolean** | Flag to show if “three day float” bank transactions should be considered when calculating the account initial balance (true) or no (false). Default &#x3D; false. |  [optional]
**considerInvestmentPositionTransactions** | **Boolean** | Flag to show if “investment position” bank transactions should be considered when calculating the account initial balance (true) or no (false). Default &#x3D; false. |  [optional]
**integrateEndOfDayStatements** | **Boolean** | Flag to show if End-of-day bank statements should be integrated (true) or no (false). Default &#x3D; true. |  [optional]
**integrateIntradayStatements** | **Boolean** | Flag to show if Intraday bank statements should be integrated (true) or no (false). Default &#x3D; false. |  [optional]
**timeZone** | **String** | Account&#39;s time zone. | 
**cutOffTime** | **String** | Time until which the intraday bank statements should be considered. |  [optional]
**accountCategory1** | [**ReferenceModel**](ReferenceModel.md) | Account category 1. |  [optional]
**accountCategory2** | [**ReferenceModel**](ReferenceModel.md) | Account category 2. |  [optional]
**accountCategory3** | [**ReferenceModel**](ReferenceModel.md) | Account category 3. |  [optional]
**accountCategory4** | [**ReferenceModel**](ReferenceModel.md) | Account category 4. |  [optional]
**accountCategory5** | [**ReferenceModel**](ReferenceModel.md) | Account category 5. |  [optional]
**accountCategory6** | [**ReferenceModel**](ReferenceModel.md) | Account category 6. |  [optional]
**accountCategory7** | [**ReferenceModel**](ReferenceModel.md) | Account category 7. |  [optional]
**accountCategory8** | [**ReferenceModel**](ReferenceModel.md) | Account category 8. |  [optional]
**accountCategory9** | [**ReferenceModel**](ReferenceModel.md) | Account category 9. |  [optional]
**accountCategory10** | [**ReferenceModel**](ReferenceModel.md) | Account category 10. |  [optional]
**memo** | **String** | Account&#39;s memo |  [optional]
**interestBearing** | **Boolean** | Flag to show if the account is interest bearing (true) or no (false). Default &#x3D; false. |  [optional]
**centrallyManaged** | **Boolean** | Flag to show if the account is managed by Central Treasury (true) or no (false). Default &#x3D; false. |  [optional]
**ownerName** | **String** | Name of the account owner |  [optional]
**reconcilerName** | **String** | Name of the user in charge of the account reconciliation |  [optional]
**freeText1** | **String** | Free zone 1 |  [optional]
**freeText2** | **String** | Free zone 2 |  [optional]
**freeText3** | **String** | Free zone 3 |  [optional]
**freeAmount1** | [**BigDecimal**](BigDecimal.md) | Free amount 1. |  [optional]
**freeAmount2** | [**BigDecimal**](BigDecimal.md) | Free amount 2. |  [optional]
**freeAmount3** | [**BigDecimal**](BigDecimal.md) | Free amount 3. |  [optional]
**signatoryUsers** | [**List&lt;ReferenceModel&gt;**](ReferenceModel.md) | List of users who have authority over the account. |  [optional]
**establishments** | [**List&lt;EstablishmentModel&gt;**](EstablishmentModel.md) | List of the multiple establishments to which the current account belongs. |  [optional]
**domesticTransfer** | **String** | Issuer number to be used for Domestic transfer |  [optional]
**internationalTransfer** | **String** | Issuer number to be used for International transfer |  [optional]
**maturityTransfer** | **String** | Issuer number to be used for Maturity transfer |  [optional]
**domesticDirectDebit** | **String** | Issuer number to be used for Domestic direct debit |  [optional]
**internationalDirectDebit** | **String** | Issuer number to be used for International direct debit |  [optional]
**payablesDrafts** | **String** | Issuer number to be used for Payables drafts |  [optional]
**receivablesDrafts** | **String** | Issuer number to be used for Receivables drafts |  [optional]
**accountAvailableForPayments** | **Boolean** | Flag to show if account is available for payments (true) or no (false). Default &#x3D; true. |  [optional]
**paymentReconciliationOptions** | [**PaymentReconciliationOptionsModel**](PaymentReconciliationOptionsModel.md) | Check payments info. |  [optional]
**accountPaymentInstructions** | [**AccountPaymentInstructions**](AccountPaymentInstructions.md) | Correspondent info. |  [optional]


<a name="AccountTypeEnum"></a>
## Enum: AccountTypeEnum
Name | Value
---- | -----
BANK_ACCOUNT | &quot;BANK_ACCOUNT&quot;
INTERCOMPANY_ACCOUNT | &quot;INTERCOMPANY_ACCOUNT&quot;
OTHER_ACCOUNT | &quot;OTHER_ACCOUNT&quot;
SHARED_ACCOUNT | &quot;SHARED_ACCOUNT&quot;


<a name="BankStatementLayoutEnum"></a>
## Enum: BankStatementLayoutEnum
Name | Value
---- | -----
AFB_120 | &quot;AFB_120&quot;
MT940_STANDARD | &quot;MT940_STANDARD&quot;
MT940_GERMANY | &quot;MT940_GERMANY&quot;
CBI_120 | &quot;CBI_120&quot;
BAI | &quot;BAI&quot;
AEB_43 | &quot;AEB_43&quot;
FINSTA | &quot;FINSTA&quot;


<a name="GenerateZBAFlowEnum"></a>
## Enum: GenerateZBAFlowEnum
Name | Value
---- | -----
ONLY_WHEN_ZBA_GENERATOR | &quot;ONLY_WHEN_ZBA_GENERATOR&quot;
ALSO_WHEN_COUNTERPARTY | &quot;ALSO_WHEN_COUNTERPARTY&quot;



