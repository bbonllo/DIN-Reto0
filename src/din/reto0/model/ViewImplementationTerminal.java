package din.reto0.model;

/**
 *
 * @author JanamUnai;
 */
public class ViewImplementationTerminal implements View {

    /**
     * Shows the greet by terminal
     *
     * @param greet
     */
    @Override
    public void showGreeting(String greet) {
        System.out.println(greet);
    }

}
