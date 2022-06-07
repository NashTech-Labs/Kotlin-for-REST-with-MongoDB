package com.example.demo.models

import nonapi.io.github.classgraph.json.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class User {
    @Id
    var Id = ""
    var name = ""
    var email = ""
    var password = ""
}