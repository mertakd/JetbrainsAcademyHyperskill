package Projects.Zookeeper.ZookeeperProjects

fun mainSolution1() {
    println("I love animals!")
    println("Let's check on the animals...")
    println("The deer looks fine.")
    println("The bat looks happy.")
    println("The lion looks healthy.")
}




fun mainSolution2() {
    println("""
        I love animals!
        Let's check on the animals...
        The deer looks fine.
        The bat looks happy.
        The lion looks healthy.
    """.trimIndent()
    )
}







class ZooKeeper {

    fun helloWorld() {
        println("I love animals!\n" +
                "Let's check on the animals...\n" +
                "The deer looks fine.\n" +
                "The bat looks happy.\n" +
                "The lion looks healthy.")
    }

}

fun mainSolution3() {
    val myZoo = ZooKeeper()
    myZoo.helloWorld()
}