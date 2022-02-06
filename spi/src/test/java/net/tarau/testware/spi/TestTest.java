package net.tarau.testware.spi;

import net.tarau.testware.spi.metadata.ClassDescriptor;
import net.tarau.testware.spi.metadata.MethodDescriptor;
import net.tarau.testware.spi.metadata.TestDescriptor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TestTest {

    @org.junit.jupiter.api.Test
    void createDefault() throws Exception {
        Test test = Test.create(create("createDefault").build()).build();
        assertNotNull(test);
        assertNotNull(test.getTestDescriptor());
        assertEquals(net.tarau.testware.api.Test.Type.UNIT, test.getType());
    }

    @org.junit.jupiter.api.Test
    void createIntegration() throws Exception {
        Test test = Test.create(create("createDefault").build()).type(net.tarau.testware.api.Test.Type.INTEGRATION).build();
        assertEquals(net.tarau.testware.api.Test.Type.INTEGRATION, test.getType());
    }

    private TestDescriptor.Builder create(String methodName) throws Exception {
        ClassDescriptor classDescriptor = ClassDescriptor.create(TestTest.class).build();
        return TestDescriptor.create(classDescriptor,
                MethodDescriptor.create(classDescriptor, TestTest.class.getDeclaredMethod(methodName)).build());
    }
}