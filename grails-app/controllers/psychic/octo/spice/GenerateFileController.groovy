package psychic.octo.spice

class GenerateFileController {

	def index() {
		request.setAttribute("investments", Investment.findAll())
		request.setAttribute("cashTransactions", CashTransaction.findAll())
	}
}
