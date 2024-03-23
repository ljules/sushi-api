package org.ldv.sushi.apisushi.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

    @Entity
    class Aliment(val nom: String ) {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null

    }
