package com.furkanharmanci.kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.furkanharmanci.kotlinrecyclerview.adapter.AgentAdapter
import com.furkanharmanci.kotlinrecyclerview.databinding.ActivityMainBinding
import com.furkanharmanci.kotlinrecyclerview.model.Valorant

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var agentObjectList : ArrayList<Valorant>
    private val agentAboutList = mutableMapOf<String, String>()
    private var agentNameList = mutableMapOf <Int,String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Agent object list created
        agentObjectList = ArrayList<Valorant>()

        // Agent Names
        agentNameList[1] = "Sova"
        agentNameList[2] = "Sage"
        agentNameList[3] = "Astra"
        agentNameList[4] = "Brimstone"
        agentNameList[5] = "Reyna"
        agentNameList[6] = "Neon"
        agentNameList[7] = "Phoenix"
        agentNameList[8] = "Harbor"
        agentNameList[9] = "Skye"
        agentNameList[10] = "Gekko"
        agentNameList[11] = "Omen"
        agentNameList[12] = "Viper"
        agentNameList[13] = "Kay/o"
        agentNameList[14] = "Breach"
        agentNameList[15] = "Yoru"
        agentNameList[16] = "Jett"
        agentNameList[17] = "Killjoy"
        agentNameList[18] = "Cypher"
        agentNameList[19] = "Chamber"
        agentNameList[20] = "Deadlock"
        agentNameList[21] = "Fade"
        agentNameList[22] = "Raze"

        // Agent about map created
        //The key of the map is the translation of the value corresponding to the index of the list named 'agentNameList' into string
        agentAboutList[agentNameList[1].toString()] = "Born from the eternal winter of Russia's tundra, Sova tracks, finds, and eliminates enemies with ruthless efficiency and precision. His custom bow and incredible scouting abilities ensure that even if you run, you cannot hide.\n" +
                "\n"
        agentAboutList[agentNameList[2].toString()] = "The stronghold of China, Sage creates safety for herself and her team wherever she goes. Able to revive fallen friends and stave off aggressive pushes, she provides a calm center to a hellish fight.\n" +
                "\n"
        agentAboutList[agentNameList[3].toString()] = "Ghanaian Agent Astra harnesses the energies of the cosmos to reshape battlefields to her whim. With full command of her astral form and a talent for deep strategic foresight, she's always eons ahead of her enemy's next move.\n" +
                "\n"
        agentAboutList[agentNameList[4].toString()] = "Joining from the U.S.A., Brimstone's orbital arsenal ensures his squad always has the advantage. His ability to deliver utility precisely and safely make him the unmatched boots-on-the-ground commander.\n" +
                "\n"
        agentAboutList[agentNameList[5].toString()] = "Forged in the heart of Mexico, Reyna dominates single combat, popping off with each kill she scores. Her capability is only limited by her raw skill, making her highly dependent on performance.\n" +
                "\n"
        agentAboutList[agentNameList[6].toString()] = "Filipino Agent Neon surges forward at shocking speeds, discharging bursts of bioelectric radiance as fast as her body generates it. She races ahead to catch enemies off guard, then strikes them down quicker than lightning.\n" +
                "\n"
        agentAboutList[agentNameList[7].toString()] = "Hailing from the U.K., Phoenix's star power shines through in his fighting style, igniting the battlefield with flash and flare. Whether he's got backup or not, he'll rush into a fight on his own terms.\n" +
                "\n"
        agentAboutList[agentNameList[8].toString()] = "Hailing from India’s coast, Harbor storms the field wielding ancient technology with dominion over water. He unleashes frothing rapids and crushing waves to shield his allies, or pummel those that oppose him.\n" +
                "\n"
        agentAboutList[agentNameList[9].toString()] = "Hailing from Australia, Skye and her band of beasts trail-blaze the way through hostile territory. With her creations hampering the enemy, and her power to heal others, the team is strongest and safest by Skye’s side.\n" +
                "\n"
        agentAboutList[agentNameList[10].toString()] = "Gekko the Angeleno leads a tight-knit crew of calamitous creatures. His buddies bound forward, scattering enemies out of the way, with Gekko chasing them down to regroup and go again.\n" +
                "\n"
        agentAboutList[agentNameList[11].toString()] = "A phantom of a memory, Omen hunts in the shadows. He renders enemies blind, teleports across the field, then lets paranoia take hold as his foe scrambles to learn where he might strike next.\n" +
                "\n"
        agentAboutList[agentNameList[12].toString()] = "The American Chemist, Viper deploys an array of poisonous chemical devices to control the battlefield and choke the enemy's vision. If the toxins don't kill her prey, her mindgames surely will.\n" +
                "\n"
        agentAboutList[agentNameList[13].toString()] = "KAY/O is a machine of war built for a single purpose: neutralizing radiants. His power to Suppress enemy abilities dismantles his opponents' capacity to fight back, securing him and his allies the ultimate edge.\n" +
                "\n"
        agentAboutList[agentNameList[14].toString()] = "Breach, the bionic Swede, fires powerful, targeted kinetic blasts to aggressively clear a path through enemy ground. The damage and disruption he inflicts ensures no fight is ever fair.\n" +
                "\n"
        agentAboutList[agentNameList[15].toString()] = "Japanese native, Yoru, rips holes straight through reality to infiltrate enemy lines unseen. Using deception and aggression in equal measure, he gets the drop on each target before they know where to look.\n" +
                "\n"
        agentAboutList[agentNameList[16].toString()] = "Representing her home country of South Korea, Jett's agile and evasive fighting style lets her take risks no one else can. She runs circles around every skirmish, cutting enemies before they even know what hit them.\n" +
                "\n"
        agentAboutList[agentNameList[17].toString()] = "The genius of Germany. Killjoy secures the battlefield with ease using her arsenal of inventions. If the damage from her gear doesn't stop her enemies, her robots' debuff will help make short work of them.\n" +
                "\n"
        agentAboutList[agentNameList[18].toString()] = "The Moroccan information broker, Cypher is a one-man surveillance network who keeps tabs on the enemy's every move. No secret is safe. No maneuver goes unseen. Cypher is always watching.\n" +
                "\n"
        agentAboutList[agentNameList[19].toString()] = "Well-dressed and well-armed, French weapons designer Chamber expels aggressors with deadly precision. He leverages his custom arsenal to hold the line and pick off enemies from afar, with a contingency built for every plan.\n" +
                "\n"
        agentAboutList[agentNameList[20].toString()] = "Norwegian operative Deadlock deploys an array of cutting-edge nanowire to secure the battlefield from even the most lethal assault. No one escapes her vigilant watch, nor survives her unyielding ferocity.\n" +
                "\n"
        agentAboutList[agentNameList[21].toString()] = "Turkish bounty hunter, Fade, unleashes the power of raw nightmares to seize enemy secrets. Attuned with terror itself, she hunts targets and reveals their deepest fears—before crushing them in the dark.\n" +
                "\n"
        agentAboutList[agentNameList[22].toString()] = "Raze explodes out of Brazil with her big personality and big guns. With her blunt-force-trauma playstyle, she excels at flushing entrenched enemies and clearing tight spaces with a generous dose of \"boom.\"\n" +
                "\n"

        /// Data
        val sova = Valorant(agentNameList[1], "Initiator", R.drawable.sova,agentAboutList[agentNameList[1]])
        val sage = Valorant(agentNameList[2], "Sentinel", R.drawable.sage,agentAboutList[agentNameList[2]])
        val astra = Valorant(agentNameList[3], "Controller", R.drawable.astra,agentAboutList[agentNameList[3]])
        val brimstone = Valorant(agentNameList[4], "Controller", R.drawable.brimstone,agentAboutList[agentNameList[4]])
        val reyna = Valorant(agentNameList[5], "Duelist", R.drawable.reyna,agentAboutList[agentNameList[5]])
        val neon = Valorant(agentNameList[6], "Duelist", R.drawable.neon,agentAboutList[agentNameList[6]])
        val phoenix = Valorant(agentNameList[7], "Duelist", R.drawable.phoenix,agentAboutList[agentNameList[7]])
        val harbor = Valorant(agentNameList[8], "Controller", R.drawable.harbor,agentAboutList[agentNameList[8]])
        val skye = Valorant(agentNameList[9], "Initiator", R.drawable.skye,agentAboutList[agentNameList[9]])
        val gekko = Valorant(agentNameList[10], "Initiator", R.drawable.gekko,agentAboutList[agentNameList[10]])
        val omen = Valorant(agentNameList[11], "Controller", R.drawable.omen,agentAboutList[agentNameList[11]])
        val viper = Valorant(agentNameList[12], "Controller", R.drawable.viper,agentAboutList[agentNameList[12]])
        val kayo = Valorant(agentNameList[13], "Initiator", R.drawable.kayo,agentAboutList[agentNameList[13]])
        val breach = Valorant(agentNameList[14], "Initiator", R.drawable.breach,agentAboutList[agentNameList[14]])
        val yoru = Valorant(agentNameList[15], "Duelist", R.drawable.yoru,agentAboutList[agentNameList[15]])
        val jett = Valorant(agentNameList[16], "Duelist", R.drawable.jett,agentAboutList[agentNameList[16]])
        val killjoy = Valorant(agentNameList[17], "Sentinel", R.drawable.killjoy,agentAboutList[agentNameList[17]])
        val cypher = Valorant(agentNameList[18], "Sentinel", R.drawable.cypher,agentAboutList[agentNameList[18]])
        val chamber = Valorant(agentNameList[19], "Sentinel", R.drawable.chamber,agentAboutList[agentNameList[19]])
        val deadlock = Valorant(agentNameList[20], "Sentinel", R.drawable.deadlock,agentAboutList[agentNameList[20]])
        val fade = Valorant(agentNameList[21], "Initiator", R.drawable.fade,agentAboutList[agentNameList[21]])
        val raze = Valorant(agentNameList[22], "Duelist", R.drawable.raze,agentAboutList[agentNameList[22]])

        // Object List created
        agentObjectList.add(sova)
        agentObjectList.add(sage)
        agentObjectList.add(astra)
        agentObjectList.add(brimstone)
        agentObjectList.add(reyna)
        agentObjectList.add(neon)
        agentObjectList.add(phoenix)
        agentObjectList.add(harbor)
        agentObjectList.add(skye)
        agentObjectList.add(gekko)
        agentObjectList.add(omen)
        agentObjectList.add(viper)
        agentObjectList.add(kayo)
        agentObjectList.add(breach)
        agentObjectList.add(yoru)
        agentObjectList.add(jett)
        agentObjectList.add(killjoy)
        agentObjectList.add(cypher)
        agentObjectList.add(chamber)
        agentObjectList.add(deadlock)
        agentObjectList.add(fade)
        agentObjectList.add(raze)

        // Adapter binding and layout select
        val adapter = AgentAdapter(agentObjectList)
        binding.recycler.adapter = adapter
        binding.recycler.layoutManager = LinearLayoutManager(this)
    }
}