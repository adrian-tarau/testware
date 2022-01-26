package net.tarau.testware.api;

/**
 * An enum for types of tests
 */
public enum Type {

    /**
     * Unit tests verify that a unit of code (method/class) works as designed and protect
     * against unexpected changed.
     */
    UNIT,

    /**
     * Integration tests verify that different modules or services used by your application
     * work well together.
     */
    INTEGRATION,

    /**
     * Functional tests focus on the business requirements of an application. They only verify
     * the output of an  action and do not check the intermediate states of the system when
     * performing that action.
     */
    FUNCTIONAL,

    /**
     * Performance tests check the behaviors of a component or a collection of components when
     * it is under significant load.
     */
    PERFORMANCE,

    /**
     * End-to-end tests replicates a user behavior with the software in a complete application
     * environment. It verifies that various user flows work as expected.
     */
    E2E,

    /**
     * Any test except from above
     */
    OTHER
}