package com.example.malawi_culture.data.repository

import com.example.malawi_culture.data.model.CultureItem
import com.example.malawi_culture.data.model.CultureType
import com.example.malawi_culture.data.model.Tribe

object TribeRepository {

    val tribes = listOf(
        Tribe(
            id = 1,
            name = "Chewa",
            description = "The largest ethnic group in Malawi, known for their Gule Wamkulu (Great Dance) ceremony which is a UNESCO Intangible Cultural Heritage. They are predominantly found in the central region and are known for their rich cultural traditions.",
            region = "Central Region",
            population = "~2 million",
            traditionalFoods = listOf(
                "• Nsima (maize porridge)",
                "• Ndiwo (vegetable relish)",
                "• Mbewa (field mice)",
                "• Kholowa (pumpkin leaves)"
            ),
            dances = listOf(
                "• Gule Wamkulu (Great Dance)",
                "• Chimtali (women's dance)",
                "• Manganje (celebration dance)"
            ),
            culturalPractices = listOf(
                "• Initiation ceremonies (Chinamwali)",
                "• Nyau secret society",
                "• Ancestral worship",
                "• Rain-making rituals"
            ),
            imageUrl = "chewa"
        ),
        Tribe(
            id = 2,
            name = "Yao",
            description = "Known for their Islamic influence and traditional male initiation ceremonies (Jando). Originally from Mozambique, they are skilled traders and are concentrated in the southern region.",
            region = "Southern Region",
            population = "~1.5 million",
            traditionalFoods = listOf(
                "• Nsima with fish",
                "• Matemba (small dried fish)",
                "• Cassava leaves",
                "• Rice dishes"
            ),
            dances = listOf(
                "• Msondo (wedding dance)",
                "• Likwata (harvest dance)",
                "• Chitelele (celebration)"
            ),
            culturalPractices = listOf(
                "• Lupanda festival",
                "• Islamic practices",
                "• Male initiation (Jando)",
                "• Traditional healing"
            ),
            imageUrl = "yao"
        ),
        Tribe(
            id = 3,
            name = "Tumbuka",
            description = "Known for their Vimbuza healing dance and strong cultural identity. They inhabit the northern region and have a rich history of kingdom and chieftainship.",
            region = "Northern Region",
            population = "~1 million",
            traditionalFoods = listOf(
                "• Kondowole (cassava flour dish)",
                "• Vegetable stews",
                "• Groundnuts",
                "• Beans"
            ),
            dances = listOf(
                "• Vimbuza (healing dance)",
                "• Malipenga (band dance)",
                "• Chiwoda (celebration)"
            ),
            culturalPractices = listOf(
                "• Vimbuza healing ceremonies",
                "• Initiation schools",
                "• Ancestral communication",
                "• Harvest festivals"
            ),
            imageUrl = "tumbuka"
        ),
        Tribe(
            id = 4,
            name = "Lomwe",
            description = "Originally from Mozambique, known for their migration history and rich agricultural traditions. They are mainly found in the southern highlands.",
            region = "Southern Region",
            population = "~1 million",
            traditionalFoods = listOf(
                "• Sweet potato dishes",
                "• Pumpkin leaves",
                "• Mushrooms",
                "• Traditional vegetables"
            ),
            dances = listOf(
                "• Chisamba",
                "• Masewe",
                "• Mganda"
            ),
            culturalPractices = listOf(
                "• Harvest festivals",
                "• Rainmaking ceremonies",
                "• Traditional pottery",
                "• Basket weaving"
            ),
            imageUrl = "lomwe"
        ),
        Tribe(
            id = 5,
            name = "Ngoni",
            description = "Descendants of the Zulu people from South Africa, known for their warrior traditions and vibrant ceremonies. They migrated to Malawi in the 19th century.",
            region = "Central & Northern Regions",
            population = "~750,000",
            traditionalFoods = listOf(
                "• Beef dishes",
                "• Milk products",
                "• Maize dishes",
                "• Traditional beer"
            ),
            dances = listOf(
                "• Ingoma (war dance)",
                "• Chioda",
                "• Mchopwe"
            ),
            culturalPractices = listOf(
                "• First fruit ceremonies",
                "• Warrior traditions",
                "• Cattle keeping rituals",
                "• Reed dance"
            ),
            imageUrl = "ngoni"
        ),
        Tribe(
            id = 6,
            name = "Sena",
            description = "Known for their fishing culture along the Shire River. They have unique river-based traditions and are skilled fishermen and farmers.",
            region = "Lower Shire Valley",
            population = "~500,000",
            traditionalFoods = listOf(
                "• Fish varieties",
                "• River cabbage",
                "• Wild rice",
                "• Water lilies"
            ),
            dances = listOf(
                "• Manganje",
                "• Chitelele",
                "• Fishing dance"
            ),
            culturalPractices = listOf(
                "• Fishing rituals",
                "• River worship",
                "• Basket weaving",
                "• Boat making"
            ),
            imageUrl = "sena"
        ),
        Tribe(
            id = 7,
            name = "Tonga",
            description = "Indigenous people of the Lake Malawi shoreline, known for their fishing culture and unique boat-making skills. They have a deep connection with the lake and its resources.",
            region = "Northern Lakeshore (Nkhata Bay, Likoma Island)",
            population = "~300,000",
            traditionalFoods = listOf(
                "• Chambo (tilapia fish)",
                "• Usipa (small sardine-like fish)",
                "• Cassava",
                "• Lake vegetables",
                "• Dried fish (matemba)"
            ),
            dances = listOf(
                "• Malipenga (drum dance)",
                "• Chiwoda (celebration dance)",
                "• Fishing dance",
                "• Manganje"
            ),
            culturalPractices = listOf(
                "• Fishing rituals and ceremonies",
                "• Boat-making tradition (Ng'wina)",
                "• Lake worship and offerings",
                "• Rain-making ceremonies",
                "• Traditional fishing methods"
            ),
            imageUrl = "tonga"
        ),

        // NEW: Ngonde Tribe
        Tribe(
            id = 8,
            name = "Ngonde",
            description = "Also known as Nyakyusa, they are the original inhabitants of the Karonga district. Known for their banana plantations, traditional kingship (Kyungu), and unique age-set system.",
            region = "Northern Region (Karonga District)",
            population = "~200,000",
            traditionalFoods = listOf(
                "• Bananas (plantains)",
                "• Beans with bananas",
                "• Fish from Lake Malawi",
                "• Cassava",
                "• Banana beer"
            ),
            dances = listOf(
                "• Ingoma (traditional dance)",
                "• Masewe",
                "• Malipenga",
                "• Kisokwe"
            ),
            culturalPractices = listOf(
                "• Kyungu kingship traditions",
                "• Age-set system (Lipya)",
                "• Banana cultivation rituals",
                "• Rain-making ceremonies",
                "• Traditional healing practices"
            ),
            imageUrl = "ngonde"
        ),
        // NEW: Lambya Tribe
        Tribe(
            id = 9,
            name = "Lambya",
            description = "A Bantu ethnic group living in the mountainous regions of Northern Malawi. Known for their agricultural skills, particularly coffee cultivation, and unique cultural ceremonies.",
            region = "Northern Region (Chitipa District)",
            population = "~150,000",
            traditionalFoods = listOf(
                "• Finger millet dishes",
                "• Beans and peas",
                "• Groundnuts",
                "• Traditional vegetables",
                "• Coffee"
            ),
            dances = listOf(
                "• Vimbuza (spirit dance)",
                "• Malipenga",
                "• Chisamba",
                "• Ngoma"
            ),
            culturalPractices = listOf(
                "• Coffee cultivation rituals",
                "• Mountain worship",
                "• Traditional iron smelting",
                "• Harvest festivals",
                "• Initiation ceremonies"
            ),
            imageUrl = "lambya"
        )

    )

    fun getCultureItemsForTribe(tribeId: Int): List<CultureItem> {
        val tribe = tribes.find { it.id == tribeId } ?: return emptyList()

        return listOf(
            CultureItem(
                id = 1,
                title = "🍲 Traditional Foods",
                description = tribe.traditionalFoods.joinToString("\n"),
                type = CultureType.FOOD,
                tribeId = tribeId,
                imageUrl = tribe.imageUrl
            ),
            CultureItem(
                id = 2,
                title = "💃 Cultural Dances",
                description = tribe.dances.joinToString("\n"),
                type = CultureType.DANCE,
                tribeId = tribeId,
                imageUrl = tribe.imageUrl
            ),
            CultureItem(
                id = 3,
                title = "🎭 Cultural Practices",
                description = tribe.culturalPractices.joinToString("\n"),
                type = CultureType.CEREMONY,
                tribeId = tribeId,
                imageUrl = tribe.imageUrl
            )
        )
    }
}
