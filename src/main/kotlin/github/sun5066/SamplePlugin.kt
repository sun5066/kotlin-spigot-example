package github.sun5066

import org.bukkit.plugin.java.JavaPlugin

class SamplePlugin : JavaPlugin() {
    override fun onEnable() {
        println("프로그램 실행됨.")
    }

    override fun onDisable() {
        println("프로그램 종료됨.")
    }
}