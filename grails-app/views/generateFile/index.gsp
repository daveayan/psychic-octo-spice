Here s your file. Please save it.

<g:each var="investmentItem" in="${investments}">
	<p>${investmentItem.infoForFile}</p>
</g:each>

<g:each var="cashTransaction" in="${cashTransactions}">
	<p>${cashTransaction.infoForFile}</p>
</g:each>