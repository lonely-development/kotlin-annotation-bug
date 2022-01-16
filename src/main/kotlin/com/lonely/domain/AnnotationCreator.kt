package com.lonely.domain

import com.lonely.annotation.JavaAnnotation

object AnnotationCreator {

    /**
     * Create Java annotation via Kotlin language
     */
    fun createAnnotation(): JavaAnnotation {
        return JavaAnnotation(oneOf = emptyArray())
    }
}