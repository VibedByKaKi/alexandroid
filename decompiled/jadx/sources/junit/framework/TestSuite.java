package junit.framework;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.junit.internal.MethodSorter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class TestSuite implements Test {
    private String fName;
    private Vector<Test> fTests;

    public TestSuite(Class<?>... clsArr) {
        this.fTests = new Vector<>(10);
        for (Class<?> cls : clsArr) {
            addTest(testCaseForClass(cls));
        }
    }

    private void addTestMethod(Method method, List<String> list, Class<?> cls) {
        String name = method.getName();
        if (list.contains(name)) {
            return;
        }
        if (isPublicTestMethod(method)) {
            list.add(name);
            addTest(createTest(cls, name));
        } else if (isTestMethod(method)) {
            addTest(warning("Test method isn't public: " + method.getName() + MarkdownConstants.LEFT_PARENTHESIS + cls.getCanonicalName() + MarkdownConstants.RIGHT_PARENTHESIS));
        }
    }

    private void addTestsFromTestCase(Class<?> cls) {
        this.fName = cls.getName();
        try {
            getTestConstructor(cls);
            if (!Modifier.isPublic(cls.getModifiers())) {
                addTest(warning("Class " + cls.getName() + " is not public"));
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls2 = cls; Test.class.isAssignableFrom(cls2); cls2 = cls2.getSuperclass()) {
                for (Method method : MethodSorter.getDeclaredMethods(cls2)) {
                    addTestMethod(method, arrayList, cls);
                }
            }
            if (this.fTests.size() == 0) {
                addTest(warning("No tests found in ".concat(cls.getName())));
            }
        } catch (NoSuchMethodException unused) {
            addTest(warning("Class " + cls.getName() + " has no public constructor TestCase(String name) or TestCase()"));
        }
    }

    public static Test createTest(Class<?> cls, String str) {
        Object newInstance;
        try {
            Constructor<?> testConstructor = getTestConstructor(cls);
            try {
                if (testConstructor.getParameterTypes().length == 0) {
                    newInstance = testConstructor.newInstance(null);
                    if (newInstance instanceof TestCase) {
                        ((TestCase) newInstance).setName(str);
                    }
                } else {
                    newInstance = testConstructor.newInstance(str);
                }
                return (Test) newInstance;
            } catch (IllegalAccessException e) {
                StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("Cannot access test case: ", str, " (");
                m2m.append(exceptionToString(e));
                m2m.append(MarkdownConstants.RIGHT_PARENTHESIS);
                return warning(m2m.toString());
            } catch (InstantiationException e2) {
                StringBuilder m2m2 = a$$ExternalSyntheticOutline0.m2m("Cannot instantiate test case: ", str, " (");
                m2m2.append(exceptionToString(e2));
                m2m2.append(MarkdownConstants.RIGHT_PARENTHESIS);
                return warning(m2m2.toString());
            } catch (InvocationTargetException e3) {
                StringBuilder m2m3 = a$$ExternalSyntheticOutline0.m2m("Exception in constructor: ", str, " (");
                m2m3.append(exceptionToString(e3.getTargetException()));
                m2m3.append(MarkdownConstants.RIGHT_PARENTHESIS);
                return warning(m2m3.toString());
            }
        } catch (NoSuchMethodException unused) {
            return warning("Class " + cls.getName() + " has no public constructor TestCase(String name) or TestCase()");
        }
    }

    private static String exceptionToString(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static Constructor<?> getTestConstructor(Class<?> cls) throws NoSuchMethodException {
        try {
            return cls.getConstructor(String.class);
        } catch (NoSuchMethodException unused) {
            return cls.getConstructor(null);
        }
    }

    private boolean isPublicTestMethod(Method method) {
        return isTestMethod(method) && Modifier.isPublic(method.getModifiers());
    }

    private boolean isTestMethod(Method method) {
        return method.getParameterTypes().length == 0 && method.getName().startsWith("test") && method.getReturnType().equals(Void.TYPE);
    }

    private Test testCaseForClass(Class<?> cls) {
        if (TestCase.class.isAssignableFrom(cls)) {
            return new TestSuite(cls.asSubclass(TestCase.class));
        }
        return warning(cls.getCanonicalName() + " does not extend TestCase");
    }

    public static Test warning(final String str) {
        return new TestCase("warning") { // from class: junit.framework.TestSuite.1
            @Override // junit.framework.TestCase
            public void runTest() {
                TestCase.fail(str);
            }
        };
    }

    public void addTest(Test test) {
        this.fTests.add(test);
    }

    public void addTestSuite(Class<? extends TestCase> cls) {
        addTest(new TestSuite(cls));
    }

    @Override // junit.framework.Test
    public int countTestCases() {
        Iterator<Test> it2 = this.fTests.iterator();
        int i = 0;
        while (it2.hasNext()) {
            i += it2.next().countTestCases();
        }
        return i;
    }

    public String getName() {
        return this.fName;
    }

    @Override // junit.framework.Test
    public void run(TestResult testResult) {
        Iterator<Test> it2 = this.fTests.iterator();
        while (it2.hasNext()) {
            Test next = it2.next();
            if (testResult.shouldStop()) {
                return;
            } else {
                runTest(next, testResult);
            }
        }
    }

    public void runTest(Test test, TestResult testResult) {
        test.run(testResult);
    }

    public void setName(String str) {
        this.fName = str;
    }

    public Test testAt(int i) {
        return this.fTests.get(i);
    }

    public int testCount() {
        return this.fTests.size();
    }

    public Enumeration<Test> tests() {
        return this.fTests.elements();
    }

    public String toString() {
        return getName() != null ? getName() : super.toString();
    }

    public TestSuite(Class<?> cls) {
        this.fTests = new Vector<>(10);
        addTestsFromTestCase(cls);
    }

    public TestSuite(Class<? extends TestCase> cls, String str) {
        this(cls);
        setName(str);
    }

    public TestSuite(String str) {
        this.fTests = new Vector<>(10);
        setName(str);
    }

    public TestSuite() {
        this.fTests = new Vector<>(10);
    }

    public TestSuite(Class<? extends TestCase>[] clsArr, String str) {
        this(clsArr);
        setName(str);
    }
}
