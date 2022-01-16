import com.lonely.domain.AnnotationCreator
import com.lonely.domain.AnnotationReader

fun main() {
    val annotation = AnnotationCreator.createAnnotation()
    AnnotationReader.parseAnnotation(annotation)
}