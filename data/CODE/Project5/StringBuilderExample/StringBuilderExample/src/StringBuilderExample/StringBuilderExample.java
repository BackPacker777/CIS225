package StringBuilderExample;

/**
 * @author bates.he.z
 * See description at bottom of code.
 */
public class StringBuilderExample {
    private StringBuilder builder;

    public StringBuilderExample() {
        builder = new StringBuilder();
        runExampleOne();
        runExampleTwo("Mr.");
        runExampleThree("Mr.");
    }

    private void runExampleOne() {
        builder.append("Hello ");
        builder.append("Howard!\n\n");
        printBuilder();
    }

    private void runExampleTwo(String insertLine){
        builder.append("How are you today?");
        int index = builder.indexOf("Howard");
        builder.insert(index, insertLine);
        printBuilder();
    }

    private void runExampleThree(String deleteLine) {
        int index = builder.indexOf(deleteLine);
        builder.delete(index, index + deleteLine.length());
        printBuilder();
    }
    private void printBuilder() {
        System.out.println(builder.toString() + "\n");
    }

    public static void main(String[] args) {
        StringBuilderExample example = new StringBuilderExample();
    }

    /**
     * Since String are immutable in Java, StringBuilder was created to give you
     * a mutable String mechanism. The primary methods are: append, insert, &
     * delete.
     */
}