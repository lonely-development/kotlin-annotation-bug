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
        System.out.println("Retrieving annotation...");
        var oneOf = annotation.oneOf();
        System.out.println("Will not reach here because of ClassCastException: " + oneOf.length);
    }
}
