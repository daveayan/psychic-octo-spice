package psychic.octo.spice

class Investment {
	String investedBy
	String institutionName
	Date investedOnDate
	long principleAmount
	int numberOfMonths
	float interestRate
	long actualReturnAmount

	def getInfoForFile() {
		def string = ""
		string += "\nInvested By: ${investedBy}"
		string += "\nInstitution Name: ${institutionName}"
		string += "\nInvested On: ${investedOnDate}"
		string += "\nPrinciple: ${principleAmount}"
		string += "\nNumber of Months: ${numberOfMonths}"
		string += "\nInterest Rate: ${interestRate}"
		string += "\nReturn Amount: ${actualReturnAmount}"
		string += "\n"
		return 	string
	}
	
    static constraints = {
    }
}
