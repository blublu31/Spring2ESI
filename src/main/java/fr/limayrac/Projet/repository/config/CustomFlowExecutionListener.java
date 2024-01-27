package fr.limayrac.Projet.repository.config;

import org.springframework.webflow.execution.FlowExecutionListenerAdapter;
import org.springframework.webflow.execution.FlowExecutionEvent;

public class CustomFlowExecutionListener extends FlowExecutionListenerAdapter {

    @Override
    public void sessionStarting(FlowExecutionEvent event) {
        // Add any custom logic you want to perform when a flow session starts
        System.out.println("Flow Session is starting: " + event.getFlowExecutionId());
    }

    @Override
    public void sessionEnding(FlowExecutionEvent event) {
        // Add any custom logic you want to perform when a flow session ends
        System.out.println("Flow Session is ending: " + event.getFlowExecutionId());
    }

    // You can override other methods to capture different events in the flow execution lifecycle

}
