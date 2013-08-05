package psychic.octo.spice

class LaunchFileController {

    def index() { }
	
	def launch() { 
		println params.fileContents
		redirect(uri: "/")
	}
}
