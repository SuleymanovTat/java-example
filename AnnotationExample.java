import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AnnotationExample implements MyInterface {

    public static void main(String[] args) {
        AnnotationExample example = new AnnotationExample();
        example.showMessage();
    }

    @Override
    public void showMessage() {
        System.out.println("showMessage");
    }
}

@MyAnnotation
interface MyInterface {

    @MyAnnotation
    void showMessage();
}

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {

    int count = 5;
}