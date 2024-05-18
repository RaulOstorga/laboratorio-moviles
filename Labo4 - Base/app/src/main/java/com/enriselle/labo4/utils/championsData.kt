package com.enriselle.labo4.utils

data class ChampionInformation(
    val id: String = "",
    val name: String = "",
    val title: String= "",
    val blurb: String = "",
    val image: ChampionSprite = ChampionSprite(""),
    val tags: List<String> = emptyList()
)

data class ChampionSprite(
    val sprite: String
)

val ChampionDummyData = listOf(
    ChampionInformation(
        id = "Aatrox",
        name = "Aatrox",
        title = "the Darkin Blade",
        blurb = "Once honored defenders of Shurima against the Void, Aatrox and his brethren would eventually become an even greater threat to Runeterra, and were defeated only by cunning mortal sorcery. But after centuries of imprisonment, Aatrox was the first to find...",
        image = ChampionSprite(
            sprite = "https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt570145160dd39dca/5db05fa8347d1c6baa57be25/RiotX_ChampionList_aatrox.jpg?quality=90&width=250"
        ),
        tags = listOf(
            "Fighter",
            "Tank"
        ),
    ),
    ChampionInformation(
        id = "Ahri",
        name = "Ahri",
        title = "the Nine-Tailed Fox",
        blurb = "Innately connected to the magic of the spirit realm, Ahri is a fox-like vastaya who can manipulate her prey's emotions and consume their essence—receiving flashes of their memory and insight from each soul she consumes. Once a powerful yet wayward...",
        image = ChampionSprite(
            sprite = "https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt1259276b6d1efa78/5db05fa86e8b0c6d038c5ca2/RiotX_ChampionList_ahri.jpg?quality=90&width=250"
        ),
        tags = listOf(
            "Mage",
            "Assassin"
        ),
    ),
    ChampionInformation(
        id = "Akali",
        name = "Akali",
        title = "the Rogue Assassin",
        blurb = "Abandoning the Kinkou Order and her title of the Fist of Shadow, Akali now strikes alone, ready to be the deadly weapon her people need. Though she holds onto all she learned from her master Shen, she has pledged to defend Ionia from its enemies, one...",
        image = ChampionSprite(
            sprite = "https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt80ff58fe809777ff/5db05fa8adc8656c7d24e7d6/RiotX_ChampionList_akali.jpg?quality=90&width=250"
        ),
        tags = listOf(
            "Assassin"
        ),
    ),
    ChampionInformation(
        id = "Akshan",
        name = "Akshan",
        title = "the Rogue Sentinel",
        blurb = "Raising an eyebrow in the face of danger, Akshan fights evil with dashing charisma, righteous vengeance, and a conspicuous lack of shirts. He is highly skilled in the art of stealth combat, able to evade the eyes of his enemies and reappear when they...",
        image = ChampionSprite(
            sprite = "https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/bltdd84b33ec501c137/60f9ede33f40e5481e85c0c6/RiotX_ChampionList_akshan_v2.jpg?quality=90&width=250"
        ),
        tags = listOf(
            "Marksman",
            "Assassin"
        ),
    ),
    ChampionInformation(
        id = "Alistar",
        name = "Alistar",
        title = "the Minotaur",
        blurb = "Always a mighty warrior with a fearsome reputation, Alistar seeks revenge for the death of his clan at the hands of the Noxian empire. Though he was enslaved and forced into the life of a gladiator, his unbreakable will was what kept him from truly...",
        image = ChampionSprite(
            sprite = "https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt3b366925d2fd8fdb/5db05fa856458c6b3fc1750b/RiotX_ChampionList_alistar.jpg?quality=90&width=250"
        ),
        tags = listOf(
            "Tank",
            "Support"
        ),
    ),
    ChampionInformation(
        id = "Amumu",
        name = "Amumu",
        title = "the Sad Mummy",
        blurb = "Legend claims that Amumu is a lonely and melancholy soul from ancient Shurima, roaming the world in search of a friend. Doomed by an ancient curse to remain alone forever, his touch is death, his affection ruin. Those who claim to have seen him describe...",
        image = ChampionSprite(
            sprite = "https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt40dfbe48a61c439f/5db05fa80b39e86c2f83dbf9/RiotX_ChampionList_amumu.jpg?quality=90&width=250"
        ),
        tags = listOf(
            "Tank",
            "Mage"
        ),
    ),
    ChampionInformation(
        id = "Anivia",
        name = "Anivia",
        title = "the Cryophoenix",
        blurb = "Anivia is a benevolent winged spirit who endures endless cycles of life, death, and rebirth to protect the Freljord. A demigod born of unforgiving ice and bitter winds, she wields those elemental powers to thwart any who dare disturb her homeland...",
        image = ChampionSprite(
            sprite = "https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt3d24a1482453088a/5db05fa8df78486c826dcce8/RiotX_ChampionList_anivia.jpg?quality=90&width=250"
        ),
        tags = listOf(
            "Mage",
            "Support"
        ),
    ),
    ChampionInformation(
        id = "Annie",
        name = "Annie",
        title = "the Dark Child",
        blurb = "Dangerous, yet disarmingly precocious, Annie is a child mage with immense pyromantic power. Even in the shadows of the mountains north of Noxus, she is a magical outlier. Her natural affinity for fire manifested early in life through unpredictable...",
        image = ChampionSprite(
            sprite = "https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt28c708665427aef6/5db05fa89481396d6bdd01a6/RiotX_ChampionList_annie.jpg?quality=90&width=250"
        ),
        tags = listOf(
            "Mage"
        ),
    ),
    ChampionInformation(
        id = "Vayne",
        name = "Vayne",
        title = "the Night Hunter",
        blurb = "Shauna Vayne is a deadly, remorseless Demacian monster hunter, who has dedicated her life to finding and destroying the demon that murdered her family. Armed with a wrist-mounted crossbow and a heart full of vengeance, she is only truly happy when...",
        image = ChampionSprite(
            sprite = "https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9eaabc908956c8b0/5db060146af83b6d7032c90a/RiotX_ChampionList_vayne.jpg?quality=90&width=250"
        ),
        tags = listOf(
            "Marksman",
            "Assassin"
        ),
    ),
    ChampionInformation(
        id = "Ashe",
        name = "Ashe",
        title = "the Frost Archer",
        blurb = "Iceborn warmother of the Avarosan tribe, Ashe commands the most populous horde in the north. Stoic, intelligent, and idealistic, yet uncomfortable with her role as leader, she taps into the ancestral magics of her lineage to wield a bow of True Ice...",
        image = ChampionSprite(
            sprite = "https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt943aae038e2dee98/5db05fa8e9effa6ba5295f91/RiotX_ChampionList_ashe.jpg?quality=90&width=250"
        ),
        tags = listOf(
            "Marksman",
            "Support"
        ),
    )
)

