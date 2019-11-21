package aop_examples;

/**
 * @author Evgeny Borisov
 */
public class DBNotFoundException extends RuntimeException {
    public DBNotFoundException(String message) {
        super(message);
    }
}
