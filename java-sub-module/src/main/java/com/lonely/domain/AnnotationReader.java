package com.lonely.domain;

import com.lonely.annotation.JavaAnnotation;

public class AnnotationReader {

    private AnnotationReader() {
    }

    /**
     * Read Java annotation via Java code.
     *
     * @param annotation Java annotation, created via Kotlin.
     */
    public static void parseAnnotation(JavaAnnotation annotation) {
        var oneOf = annotation.oneOf();
        System.out.println("Should reach here with count 0: " + oneOf.length);
    }
}
