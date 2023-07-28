package creationalDesignPatterns.abstractFactory

// interface Computer specifying abstract outline of a computer.
interface Computer {
    fun getRam(): String;
    fun getCpu(): String;
    fun getStorage(): String;
    fun runWebsite(website: String);
}

// interface specifying abstract outline of an abstract factory
interface ComputerFactory {
    fun getComputer(): Computer;
}

/**
 * @property ram RAM specifications
 * @property cpu CPU specifications
 * @property storage storage type and size
 */
class Laptop (private val ram: String, private val cpu: String, private val storage: String): Computer {

    override fun getRam(): String = ram;

    override fun getCpu(): String = cpu;

    override fun getStorage(): String = storage;

    override fun runWebsite(website: String) {
        println ("Running website $website");
    }

    override fun toString(): String {
        return "RAM: $ram, CPU: $cpu, Storage: $storage"
    }
}

class SmartPhone (ram: String, cpu: String, storage: String): Computer {
    private var mRam: String;
    private var mCpu: String;
    private var mStorage: String;

    init {
        mRam = ram;
        mCpu = cpu;
        mStorage = storage;
    }

    override fun getRam(): String = mRam;

    override fun getCpu(): String = mCpu;

    override fun getStorage(): String = mStorage;

    override fun runWebsite(website: String) {
        println("Running website $website")
    }

    override fun toString(): String {
        return "RAM: $mRam, CPU: $mCpu, Storage: $mStorage"
    }
}

/**
 * Laptop Factory inheriting from [ComputerFactory] interface
 * Acting as factory to create an object of type [Laptop].
 *
 * @param ram RAM specifications of Laptop
 * @param cpu CPU specifications of laptop
 * @param storage Storage specifications of laptop
 */
class LaptopFactory(ram: String, cpu: String, storage: String): ComputerFactory {

    private lateinit var mStorage: String;
    private lateinit var mRam: String;
    private lateinit var mCpu: String;

    init {
        mStorage = storage;
        mRam = ram;
        mCpu = cpu;
    }

    override fun getComputer(): Computer {
        val laptop = Laptop(ram = mRam, cpu = mCpu, storage = mStorage);
        return laptop;
    }
}

class SmartPhoneFactory constructor (ram: String, cpu: String, storage: String) : ComputerFactory {
    private var ram: String;
    private var cpu: String;
    private var storage: String;

    init {
        this.ram = ram;
        this.cpu = cpu;
        this.storage = storage;
    }

    override fun getComputer(): Computer {
        return SmartPhone(ram = ram, cpu = cpu, storage = storage);
    }
}

