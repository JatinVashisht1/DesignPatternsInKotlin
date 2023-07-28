package creationalDesignPatterns.abstractFactory


interface WebsiteHostingService {
    fun hostWebsite(website: String);
}

interface WebsiteHostingServiceFactory {
    fun getWebsiteHostingService(): WebsiteHostingService
}

class HerokuFactory(private val server: Server): WebsiteHostingServiceFactory {
    override fun getWebsiteHostingService(): WebsiteHostingService {
        return Heroku(server = server)
    }
}

class Heroku(private val server: Server): WebsiteHostingService {
    override fun hostWebsite(website: String) {
        // note that we can choose which server to upload on based upon what type of user we are dealing with
        server.hostLowRequirementWebsite(website = website)
    }
}