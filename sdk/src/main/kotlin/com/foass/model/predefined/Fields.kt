package com.foass.model.predefined

import com.foass.model.Field

object Fields {

    fun name(name: String) = Field(name = "Name", field = "name", value = name)

    fun from(from: String) = Field(name = "From", field = "from", value = from)

    fun company(company: String) = Field(name = "Company", field = "company", value = company)

    fun tool(tool: String) = Field(name = "Tool", field = "tool", value = tool)

    fun something(something: String) = Field(name = "Something", field = "something", value = something)

    fun action(action: String) = Field(name = "Do", field = "do", value = action)

    fun reference(reference: String) = Field(name = "Reference", field = "reference", value = reference)

    fun noun(noun: String) = Field(name = "Noun", field = "noun", value = noun)

    fun reaction(reaction: String) = Field(name = "Reaction", field = "reaction", value = reaction)

    fun behavior(behavior: String) = Field(name = "Behavior", field = "behavior", value = behavior)
    fun thing(thing: String) = Field(name = "Thing", field = "thing", value = thing)

    fun language(language: String) = Field(name = "Language", field = "language", value = language)
}