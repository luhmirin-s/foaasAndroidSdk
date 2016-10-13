package com.foass.model.predefined

import com.foass.model.Operation


object Operations {

    fun anyway(company: String, from: String) = Operation(
            name = "Who the fuck are you anyway",
            url = "/anyway/:company/:from",
            fields = listOf(
                    Fields.company(company),
                    Fields.from(from)
            )
    )

    fun awesome(from: String) = Operation(
            name = "Awesome",
            url = "/awesome/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun back(name: String, from: String) = Operation(
            name = "Back the fuck off",
            url = "/back/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun ballmer(name: String, company: String, from: String) = Operation(
            name = "Ballmer",
            url = "/ballmer/:name/:company/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.company(company),
                    Fields.from(from)
            )
    )


    fun bday(name: String, from: String) = Operation(
            name = "Bday",
            url = "/bday/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun because(from: String) = Operation(
            name = "Because",
            url = "/because/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun blackadder(name: String, from: String) = Operation(
            name = "Blackadder",
            url = "/blackadder/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun bm(name: String, from: String) = Operation(
            name = "Bravo Mike",
            url = "/bm/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun bucket(from: String) = Operation(
            name = "Bucket",
            url = "/bucket/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun bus(name: String, from: String) = Operation(
            name = "Bus",
            url = "/bus/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun bye(from: String) = Operation(
            name = "Bye",
            url = "/bye/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun caniuse(tool: String, from: String) = Operation(
            name = "Can I Use",
            url = "/caniuse/:tool/:from",
            fields = listOf(
                    Fields.tool(tool),
                    Fields.from(from)
            )
    )

    fun chainsaw(name: String, from: String) = Operation(
            name = "Chainsaw",
            url = "/chainsaw/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun cocksplat(name: String, from: String) = Operation(
            name = "Cocksplat",
            url = "/cocksplat/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun cool(from: String) = Operation(
            name = "Cool Story",
            url = "/cool/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun dalton(name: String, from: String) = Operation(
            name = "Dalton",
            url = "/dalton/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun deraadt(name: String, from: String) = Operation(
            name = "{name} you are being the usual slimy hypocritical asshole... You may have had value ten years ago, but people will see that you don't anymore.",
            url = "/deraadt/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun diabetes(from: String) = Operation(
            name = "Diabetes",
            url = "/diabetes/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun donut(name: String, from: String) = Operation(
            name = "Donut",
            url = "/donut/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun dosomething(action: String, something: String, from: String) = Operation(
            name = "Do Something",
            url = "/dosomething/:do/:something/:from",
            fields = listOf(
                    Fields.action(action),
                    Fields.something(something),
                    Fields.from(from)
            )
    )

    fun everyone(from: String) = Operation(
            name = "Everyone",
            url = "/everyone/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun everything(from: String) = Operation(
            name = "Everything",
            url = "/everything/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun family(from: String) = Operation(
            name = "Family",
            url = "/family/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun fascinating(from: String) = Operation(
            name = "Fascinating",
            url = "/fascinating/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun field(name: String, from: String, reference: String) = Operation(
            name = "Field of Fucks",
            url = "/field/:name/:from/:reference",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from),
                    Fields.reference(reference)
            )
    )

    fun flying(from: String) = Operation(
            name = "Flying",
            url = "/flying/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun gfy(name: String, from: String) = Operation(
            name = "Golf Foxtrot Yankee",
            url = "/gfy/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun give(from: String) = Operation(
            name = "Give",
            url = "/give/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun greed(noun: String, from: String) = Operation(
            name = "Greed",
            url = "/greed/:noun/:from",
            fields = listOf(
                    Fields.noun(noun),
                    Fields.from(from)
            )
    )

    fun horse(from: String) = Operation(
            name = "Fuck you and the horse you rode in on",
            url = "/horse/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun ing(name: String, from: String) = Operation(
            name = "Fucking",
            url = "/ing/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun keep(name: String, from: String) = Operation(
            name = "Keep",
            url = "/keep/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun keepcalm(reaction: String, from: String) = Operation(
            name = "Keep Calm",
            url = "/keepcalm/:reaction/:from",
            fields = listOf(
                    Fields.reaction(reaction),
                    Fields.from(from)
            )
    )

    fun king(name: String, from: String) = Operation(
            name = "King",
            url = "/king/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun life(from: String) = Operation(
            name = "Life",
            url = "/life/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun linus(name: String, from: String) = Operation(
            name = "Linus",
            url = "/linus/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun look(name: String, from: String) = Operation(
            name = "Look",
            url = "/look/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun looking(from: String) = Operation(
            name = "Looking",
            url = "/looking/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun madison(name: String, from: String) = Operation(
            name = "Madison",
            url = "/madison/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun maybe(from: String) = Operation(
            name = "Maybe",
            url = "/maybe/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun me(from: String) = Operation(
            name = "Fuck Me",
            url = "/me/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun mornin(from: String) = Operation(
            name = "mornin",
            url = "/mornin/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun no(from: String) = Operation(
            name = "No",
            url = "/no/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun nugget(name: String, from: String) = Operation(
            name = "Nugget",
            url = "/nugget/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun off(name: String, from: String) = Operation(
            name = "Fuck Off",
            url = "/off/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun off_with(behavior: String, from: String) = Operation(
            name = "Fuck Off With",
            url = "/off-with/:behavior/:from",
            fields = listOf(
                    Fields.behavior(behavior),
                    Fields.from(from)
            )
    )

    fun outside(name: String, from: String) = Operation(
            name = "Outside",
            url = "/outside/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun particular(thing: String, from: String) = Operation(
            name = "This Thing In Particular",
            url = "/particular/:thing/:from",
            fields = listOf(
                    Fields.thing(thing),
                    Fields.from(from)
            )
    )

    fun pink(from: String) = Operation(
            name = "Pink",
            url = "/pink/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun problem(name: String, from: String) = Operation(
            name = "Problem",
            url = "/problem/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun pulp(language: String, from: String) = Operation(
            name = "Pulp",
            url = "/pulp/:language/:from",
            fields = listOf(
                    Fields.language(language),
                    Fields.from(from)
            )
    )

    fun retard(from: String) = Operation(
            name = "Retard",
            url = "/retard/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun sake(from: String) = Operation(
            name = "sake",
            url = "/sake/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun shakespeare(name: String, from: String) = Operation(
            name = "Shakespeare",
            url = "/shakespeare/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun shit(from: String) = Operation(
            name = "Fuck This Shit",
            url = "/shit/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun shutup(name: String, from: String) = Operation(
            name = "Shut Up",
            url = "/shutup/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun single(from: String) = Operation(
            name = "Single",
            url = "/single/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun thanks(from: String) = Operation(
            name = "Thanks",
            url = "/thanks/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun that(from: String) = Operation(
            name = "Fuck That",
            url = "/that/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun think(name: String, from: String) = Operation(
            name = "You Think",
            url = "/think/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun thinking(name: String, from: String) = Operation(
            name = "Thinking",
            url = "/thinking/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun f_this(from: String) = Operation(
            name = "Fuck This",
            url = "/this/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun thumbs(from: String, name: String) = Operation(
            name = "This Guy",
            url = "/thumbs/:name/:from",
            fields = listOf(
                    Fields.from(from),
                    Fields.name(name)
            )
    )

    fun too(from: String) = Operation(
            name = "Too",
            url = "/too/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun tucker(from: String) = Operation(
            name = "Tucker",
            url = "/tucker/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun what(from: String) = Operation(
            name = "What",
            url = "/what/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun xmas(name: String, from: String) = Operation(
            name = "Xmas",
            url = "/xmas/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun yoda(name: String, from: String) = Operation(
            name = "Yoda",
            url = "/yoda/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun you(name: String, from: String) = Operation(
            name = "Fuck You",
            url = "/you/:name/:from",
            fields = listOf(
                    Fields.name(name),
                    Fields.from(from)
            )
    )

    fun zayn(from: String) = Operation(
            name = "Zayn",
            url = "/zayn/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )

    fun zero(from: String) = Operation(
            name = "Zero",
            url = "/zero/:from",
            fields = listOf(
                    Fields.from(from)
            )
    )
}
