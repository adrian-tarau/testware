package net.microfalx.testware.api.metadata;

import java.lang.reflect.Method;
import java.util.Optional;
import java.util.Set;

/**
 * Holds information about a test.
 */
public interface TestDescriptor extends AnnotationAwareDescriptor, MetadataAwareDescriptor {

    /**
     * Get the {@link Class} associated with the current test or container, if available.
     */
    Optional<ClassDescriptor> getClassDescriptor();

    /**
     * Get the {@link Method} associated with the current test or container, if available.
     */
    Optional<MethodDescriptor> getMethodDescriptor();

    /**
     * Returns the issue identifiers attached to the current test or container.
     *
     * @return a non-null instance
     */
    Set<String> getIssues();

    /**
     * Returns whether the test as written to validate a bug.
     *
     * @return {@code true} if test was written for a bug, {@code false} otherwise
     */
    boolean isBug();

    /**
     * Returns whether the test is flaky (has random failures).
     *
     * @return {@code true} if test is flaky, {@code false} otherwise
     */
    boolean isFlaky();



}
