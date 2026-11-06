package org.junit.runners.parameterized;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.Parameterized;
import org.junit.runners.model.FrameworkField;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class BlockJUnit4ClassRunnerWithParameters extends BlockJUnit4ClassRunner {
    private final String name;
    private final Object[] parameters;

    public BlockJUnit4ClassRunnerWithParameters(TestWithParameters testWithParameters) throws InitializationError {
        super(testWithParameters.getTestClass().getJavaClass());
        this.parameters = testWithParameters.getParameters().toArray(new Object[testWithParameters.getParameters().size()]);
        this.name = testWithParameters.getName();
    }

    private Object createTestUsingConstructorInjection() throws Exception {
        return getTestClass().getOnlyConstructor().newInstance(this.parameters);
    }

    private Object createTestUsingFieldInjection() throws Exception {
        List<FrameworkField> annotatedFieldsByParameter = getAnnotatedFieldsByParameter();
        if (annotatedFieldsByParameter.size() != this.parameters.length) {
            StringBuilder sb = new StringBuilder("Wrong number of parameters and @Parameter fields. @Parameter fields counted: ");
            sb.append(annotatedFieldsByParameter.size());
            sb.append(", available parameters: ");
            throw new Exception(a$$ExternalSyntheticOutline0.m(sb, this.parameters.length, "."));
        }
        Object newInstance = getTestClass().getJavaClass().newInstance();
        Iterator<FrameworkField> it2 = annotatedFieldsByParameter.iterator();
        while (it2.hasNext()) {
            Field field = it2.next().getField();
            int value = ((Parameterized.Parameter) field.getAnnotation(Parameterized.Parameter.class)).value();
            try {
                field.set(newInstance, this.parameters[value]);
            } catch (IllegalArgumentException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(getTestClass().getName());
                sb2.append(": Trying to set ");
                sb2.append(field.getName());
                sb2.append(" with the value ");
                sb2.append(this.parameters[value]);
                String simpleName = this.parameters[value].getClass().getSimpleName();
                String simpleName2 = field.getType().getSimpleName();
                sb2.append(" that is not the right type (");
                sb2.append(simpleName);
                sb2.append(" instead of ");
                sb2.append(simpleName2);
                sb2.append(").");
                throw new Exception(sb2.toString(), e);
            }
        }
        return newInstance;
    }

    private boolean fieldsAreAnnotated() {
        return !getAnnotatedFieldsByParameter().isEmpty();
    }

    private List<FrameworkField> getAnnotatedFieldsByParameter() {
        return getTestClass().getAnnotatedFields(Parameterized.Parameter.class);
    }

    @Override // org.junit.runners.ParentRunner
    public Statement classBlock(RunNotifier runNotifier) {
        return childrenInvoker(runNotifier);
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    public Object createTest() throws Exception {
        return fieldsAreAnnotated() ? createTestUsingFieldInjection() : createTestUsingConstructorInjection();
    }

    @Override // org.junit.runners.ParentRunner
    public String getName() {
        return this.name;
    }

    @Override // org.junit.runners.ParentRunner
    public Annotation[] getRunnerAnnotations() {
        return new Annotation[0];
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    public String testName(FrameworkMethod frameworkMethod) {
        return frameworkMethod.getName() + getName();
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    public void validateConstructor(List<Throwable> list) {
        validateOnlyOneConstructor(list);
        if (fieldsAreAnnotated()) {
            validateZeroArgConstructor(list);
        }
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    public void validateFields(List<Throwable> list) {
        super.validateFields(list);
        if (fieldsAreAnnotated()) {
            List<FrameworkField> annotatedFieldsByParameter = getAnnotatedFieldsByParameter();
            int size = annotatedFieldsByParameter.size();
            int[] iArr = new int[size];
            Iterator<FrameworkField> it2 = annotatedFieldsByParameter.iterator();
            while (it2.hasNext()) {
                int value = ((Parameterized.Parameter) it2.next().getField().getAnnotation(Parameterized.Parameter.class)).value();
                if (value < 0 || value > annotatedFieldsByParameter.size() - 1) {
                    StringBuilder m0m = a$$ExternalSyntheticOutline0.m0m(value, "Invalid @Parameter value: ", ". @Parameter fields counted: ");
                    m0m.append(annotatedFieldsByParameter.size());
                    m0m.append(". Please use an index between 0 and ");
                    m0m.append(annotatedFieldsByParameter.size() - 1);
                    m0m.append(".");
                    list.add(new Exception(m0m.toString()));
                } else {
                    iArr[value] = iArr[value] + 1;
                }
            }
            for (int i = 0; i < size; i++) {
                int i2 = iArr[i];
                if (i2 == 0) {
                    list.add(new Exception(a$$ExternalSyntheticOutline0.m(i, "@Parameter(", ") is never used.")));
                } else if (i2 > 1) {
                    list.add(new Exception(ErrorUtils$$ExternalSyntheticOutline0.m(i, i2, "@Parameter(", ") is used more than once (", ").")));
                }
            }
        }
    }
}
