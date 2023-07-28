package creationalDesignPatterns.abstractFactory

interface Server {
    fun hostLowRequirementWebsite(website: String)

    fun hostHighRequirementWebsite(website: String)
}

interface ServerFactory {
    fun getServer(): Server
}

class AmazonECTwoFactory(private val lowEndedComputer: Computer, private val highEndedComputer: Computer):
    ServerFactory {
    override fun getServer(): Server {
        return AmazonECTwo(lowEndedComputer = lowEndedComputer, highEndedComputer = highEndedComputer);
    }
}

class GoogleColab(private val lowEndedComputer: Computer, private val highEndedComputer: Computer) : Server {
    override fun hostLowRequirementWebsite(website: String) {
        lowEndedComputer.runWebsite(website = website)
    }

    override fun hostHighRequirementWebsite(website: String) {
        highEndedComputer.runWebsite(website = website)
    }
}

class AmazonECTwo(private val lowEndedComputer: Computer, private val highEndedComputer: Computer) : Server {
    override fun hostLowRequirementWebsite(website: String) {
        lowEndedComputer.runWebsite(website = website);
    }

    override fun hostHighRequirementWebsite(website: String) {
        highEndedComputer.runWebsite(website = website);
    }
}
