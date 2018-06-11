package com.github.metabrain.darkestdungeon

import java.io.File
import java.nio.charset.MalformedInputException
import java.nio.file.Files
import java.util.function.BiPredicate
import kotlin.streams.toList

fun main(args: Array<String>) {
//    val raw = Resources.getResource("tradenodes.txt").readText(Charsets.UTF_8)
//    val raw = Resources.getResource("achievements.txt").readText(Charsets.UTF_8)

    val rootInstalation = File("D:\\Steam\\steamapps\\common\\DarkestDungeon")
    println("Installation valid? -> ${rootInstalation.exists()}")
    if(!rootInstalation.exists()) {
        throw Exception("Could not find installation at ${rootInstalation.absolutePath}")
    }

    val files = Files.find(rootInstalation.toPath(), Int.MAX_VALUE, BiPredicate { t, _ -> t.toAbsolutePath().toString().matches(Regex(".*\\.(json|darkest)")) }).toList()
    files.forEach { println(rootInstalation.toPath().relativize(it).toString()) }

    files.forEach {
        val relPath = rootInstalation.toPath().relativize(it)
        try {
            val lines = Files.readAllLines(it)
            DarkestDungeon.loadConfig(relPath, lines)
        } catch (e: MalformedInputException) {
            // ignore binary json file..?
        }
    }

    println("Loading finished:\n${DarkestDungeon.toString()}")
}
