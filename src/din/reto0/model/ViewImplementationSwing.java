package din.reto0.model;

import din.reto0.ui.SwingView;

/**
 *
 * @author Janam & Unai
 */
public class ViewImplementationSwing implements View {

    /**
     * Shows the greet by Swing window
     *
     * @param greet
     */
    @Override
    public void showGreeting(String greet) {
        SwingView swingView = new SwingView(greet);
        swingView.setVisible(true);
    }

}
