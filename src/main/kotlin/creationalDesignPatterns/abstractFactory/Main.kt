package creationalDesignPatterns.abstractFactory

fun main()  {
    val website = "https://www.github.com/"
    val highEndPC = LaptopFactory(ram = "128 GB", cpu = "intel i91200k", storage = "2TB SSD").getComputer()
    val lowEndPC = LaptopFactory(ram = "56 GB", cpu = "intel i51000k", storage = "500GB SSD").getComputer()


    val amazonECTwoServer = AmazonECTwoFactory(lowEndedComputer = lowEndPC, highEndedComputer = highEndPC).getServer()
    val heroku = HerokuFactory(server = amazonECTwoServer).getWebsiteHostingService()

    heroku.hostWebsite(website = website)
}