package autovalue.shaded.com.google.escapevelocity;

import autovalue.shaded.com.google.common.collect.ImmutableMap;
import autovalue.shaded.com.google.escapevelocity.EvaluationContext;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class Template {
    private final ImmutableMap<String, Macro> macros;
    private final MethodFinder methodFinder = new MethodFinder();
    private final Node root;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    public interface ResourceOpener {
        Reader openResource(String str) throws IOException;
    }

    public Template(Node node, ImmutableMap<String, Macro> immutableMap) {
        this.root = node;
        this.macros = immutableMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Reader lambda$parseFrom$0(Reader reader, String str) throws IOException {
        if (str == null) {
            return reader;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2("No ResourceOpener has been configured to read ".concat(str));
        return null;
    }

    public static Template parseFrom(String str, ResourceOpener resourceOpener, Map<String, Template> map) throws IOException {
        Reader openResource = resourceOpener.openResource(str);
        try {
            Template parse = new Parser(openResource, str, resourceOpener, map).parse();
            if (openResource != null) {
                openResource.close();
            }
            return parse;
        } catch (Throwable th) {
            if (openResource != null) {
                try {
                    openResource.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public String evaluate(Map<String, ?> map) {
        EvaluationContext.PlainEvaluationContext plainEvaluationContext = new EvaluationContext.PlainEvaluationContext(map, new LinkedHashMap(this.macros), this.methodFinder);
        StringBuilder sb = new StringBuilder(1024);
        try {
            render(plainEvaluationContext, sb);
        } catch (BreakException e) {
            if (e.forEachScope()) {
                throw new EvaluationException("#break($foreach) not inside #foreach: " + e.getMessage());
            }
        }
        return sb.toString();
    }

    public ImmutableMap<String, Macro> getMacros() {
        return this.macros;
    }

    public void render(EvaluationContext evaluationContext, StringBuilder sb) {
        this.root.render(evaluationContext, sb);
    }

    public static Template parseFrom(String str, ResourceOpener resourceOpener) throws IOException {
        return parseFrom(str, resourceOpener, new TreeMap());
    }

    public static Template parseFrom(final Reader reader) throws IOException {
        try {
            return parseFrom(null, new ResourceOpener() { // from class: autovalue.shaded.com.google.escapevelocity.Template$$ExternalSyntheticLambda0
                @Override // autovalue.shaded.com.google.escapevelocity.Template.ResourceOpener
                public final Reader openResource(String str) {
                    Reader lambda$parseFrom$0;
                    lambda$parseFrom$0 = Template.lambda$parseFrom$0(reader, str);
                    return lambda$parseFrom$0;
                }
            });
        } finally {
            reader.close();
        }
    }
}
