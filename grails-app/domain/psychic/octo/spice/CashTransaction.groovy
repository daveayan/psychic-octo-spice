package psychic.octo.spice

class CashTransaction {
	String institutionName
	Date transactionDate
	long amount
	boolean isThisDeposit

	def getInfoForFile() {
		def string = ""
		string += "\nInstitution Name: ${institutionName}"
		string += "\nTransaction On: ${transactionDate}"
		string += "\nAmount: ${amount}"
		if(isThisDeposit)
			string += "\nType: Deposit"
		else
			string += "\nType: Withdraw"
		string += "\n"
		return 	string
	}
		
    static constraints = {
    }
}
