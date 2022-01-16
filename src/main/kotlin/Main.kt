import com.lonely.domain.AnnotationCreator
import com.lonely.domain.AnnotationReader

fun main(args: Array<String>) {
    val annotation = AnnotationCreator.createAnnotation()
    AnnotationReader.parseAnnotation(annotation)
}