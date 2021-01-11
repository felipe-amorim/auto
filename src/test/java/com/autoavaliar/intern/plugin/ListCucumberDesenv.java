package com.autoavaliar.intern.plugin;

import cucumber.api.event.*;
import com.autoavaliar.intern.Instances;


public class ListCucumberDesenv implements ConcurrentEventListener {
    
    private final EventHandler<TestStepStarted> testStepStartedHandler = new EventHandler<TestStepStarted>() {
        @Override
        public void receive(TestStepStarted event) {
            ListCucumberExecute.testStepStarted(event);
        }
    };
    private final EventHandler<TestStepFinished> testStepFinishedHandler = new EventHandler<TestStepFinished>() {
        @Override
        public void receive(TestStepFinished event) {
        }
    };
    private final EventHandler<TestCaseStarted> testCaseStartedHandler = new EventHandler<TestCaseStarted>() {
        @Override
        public void receive(TestCaseStarted event) {
            Instances.mongoCategoryOfExecution = "desenv";
            ListCucumberExecute.testCaseStarted(event);
        }
    };

    private final EventHandler<TestCaseFinished> testCaseFinishedHandler = new EventHandler<TestCaseFinished>() {
        @Override
        public void receive(TestCaseFinished event) {
            ListCucumberExecute.testCaseFinished(event);
        }
    };
    private EventHandler<TestRunStarted> runStartHandler = new EventHandler<TestRunStarted>() {

        @Override
        public void receive(TestRunStarted event) {
            ListCucumberExecute.testRunStarted(event);
        }
    };
    private EventHandler<TestRunFinished> runFinishHandler = new EventHandler<TestRunFinished>() {

        @Override
        public void receive(TestRunFinished event) {
            ListCucumberExecute.testRunFinished(event);
        }
    };

    @Override
    public void setEventPublisher(final EventPublisher publisher) {
        publisher.registerHandlerFor(TestCaseStarted.class, testCaseStartedHandler);
        publisher.registerHandlerFor(TestCaseFinished.class, testCaseFinishedHandler);
        publisher.registerHandlerFor(TestStepStarted.class, testStepStartedHandler);
        publisher.registerHandlerFor(TestStepFinished.class, testStepFinishedHandler);
        publisher.registerHandlerFor(TestRunFinished.class, runFinishHandler);
        publisher.registerHandlerFor(TestRunStarted.class, runStartHandler);
    }
}
