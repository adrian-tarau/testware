package net.microfalx.testware.core.model;

import com.esotericsoftware.kryo.serializers.TaggedFieldSerializer;
import net.microfalx.binserde.annotation.Tag;

import java.util.Collection;

import static net.microfalx.binserde.utils.ArgumentUtils.requireNonNull;
import static net.microfalx.testware.core.model.AbstractModel.BASE_TAG;
import static net.microfalx.testware.spi.util.CollectionUtils.immutable;
import static net.microfalx.testware.spi.util.CollectionUtils.required;

@Tag(BASE_TAG + 11)
public class ForkModel extends AbstractModel<ForkModel> {

    @Tag(100)
    @TaggedFieldSerializer.Tag(100)
    private Collection<TestModel> tests;

    public Collection<TestModel> getTests() {
        return immutable(tests);
    }

    public ForkModel setTests(Collection<TestModel> tests) {
        this.tests = tests;
        return this;
    }

    public void add(TestModel test) {
        requireNonNull(test);
        tests = required(tests);
        tests.add(test);
    }
}
