package autovalue.shaded.com.squareup.javapoet;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.media3.exoplayer.upstream.CmcdData;
import autovalue.shaded.com.squareup.javapoet.CodeBlock;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.StreamSupport;
import javax.lang.model.element.Element;
import javax.lang.model.type.TypeMirror;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class CodeBlock {
    final List<Object> args;
    final List<String> formatParts;
    private static final Pattern NAMED_ARGUMENT = Pattern.compile("\\$(?<argumentName>[\\w_]+):(?<typeChar>[\\w]).*");
    private static final Pattern LOWERCASE = Pattern.compile("[a-z]+[\\w_]*");

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CodeBlockJoiner {
        private final Builder builder;
        private final String delimiter;
        private boolean first = true;

        public CodeBlockJoiner(String str, Builder builder) {
            this.delimiter = str;
            this.builder = builder;
        }

        public CodeBlockJoiner add(CodeBlock codeBlock) {
            if (!this.first) {
                this.builder.add(this.delimiter, new Object[0]);
            }
            this.first = false;
            this.builder.add(codeBlock);
            return this;
        }

        public CodeBlock join() {
            return this.builder.build();
        }

        public CodeBlockJoiner merge(CodeBlockJoiner codeBlockJoiner) {
            CodeBlock build = codeBlockJoiner.builder.build();
            if (!build.isEmpty()) {
                add(build);
            }
            return this;
        }
    }

    private CodeBlock(Builder builder) {
        this.formatParts = Util.immutableList(builder.formatParts);
        this.args = Util.immutableList(builder.args);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CodeBlock join(Iterable<CodeBlock> iterable, String str) {
        return (CodeBlock) StreamSupport.stream(iterable.spliterator(), false).collect(joining(str));
    }

    public static Collector<CodeBlock, ?, CodeBlock> joining(final String str, String str2, final String str3) {
        final Builder add = builder().add("$N", str2);
        return Collector.of(new Supplier() { // from class: autovalue.shaded.com.squareup.javapoet.CodeBlock$$ExternalSyntheticLambda4
            @Override // java.util.function.Supplier
            public final Object get() {
                CodeBlock.CodeBlockJoiner lambda$joining$1;
                lambda$joining$1 = CodeBlock.lambda$joining$1(str, add);
                return lambda$joining$1;
            }
        }, new CodeBlock$$ExternalSyntheticLambda1(), new CodeBlock$$ExternalSyntheticLambda2(), new Function() { // from class: autovalue.shaded.com.squareup.javapoet.CodeBlock$$ExternalSyntheticLambda5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                CodeBlock lambda$joining$2;
                lambda$joining$2 = CodeBlock.lambda$joining$2(add, str3, (CodeBlock.CodeBlockJoiner) obj);
                return lambda$joining$2;
            }
        }, new Collector.Characteristics[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CodeBlockJoiner lambda$joining$0(String str) {
        return new CodeBlockJoiner(str, builder());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CodeBlockJoiner lambda$joining$1(String str, Builder builder) {
        return new CodeBlockJoiner(str, builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CodeBlock lambda$joining$2(Builder builder, String str, CodeBlockJoiner codeBlockJoiner) {
        builder.add(of("$N", str));
        return codeBlockJoiner.join();
    }

    public static CodeBlock of(String str, Object... objArr) {
        return new Builder().add(str, objArr).build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CodeBlock.class == obj.getClass()) {
            return toString().equals(obj.toString());
        }
        return false;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public boolean isEmpty() {
        return this.formatParts.isEmpty();
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.formatParts.addAll(this.formatParts);
        builder.args.addAll(this.args);
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            new CodeWriter(sb).emit(this);
            return sb.toString();
        } catch (IOException unused) {
            Buffer$$ExternalSyntheticBUOutline0.m$2();
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        final List<Object> args;
        final List<String> formatParts;

        private Builder() {
            this.formatParts = new ArrayList();
            this.args = new ArrayList();
        }

        private void addArgument(String str, char c, Object obj) {
            if (c == 'L') {
                this.args.add(argToLiteral(obj));
                return;
            }
            if (c == 'N') {
                this.args.add(argToName(obj));
                return;
            }
            if (c == 'S') {
                this.args.add(argToString(obj));
            } else if (c == 'T') {
                this.args.add(argToType(obj));
            } else {
                Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("invalid format string: '", str, "'"));
            }
        }

        private String argToName(Object obj) {
            if (obj instanceof CharSequence) {
                return obj.toString();
            }
            if (obj instanceof ParameterSpec) {
                return ((ParameterSpec) obj).name;
            }
            if (obj instanceof FieldSpec) {
                return ((FieldSpec) obj).name;
            }
            if (obj instanceof MethodSpec) {
                return ((MethodSpec) obj).name;
            }
            if (obj instanceof TypeSpec) {
                return ((TypeSpec) obj).name;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(DoubleList$$ExternalSyntheticOutline0.m(obj, "expected name but was "));
            return null;
        }

        private String argToString(Object obj) {
            if (obj != null) {
                return String.valueOf(obj);
            }
            return null;
        }

        private TypeName argToType(Object obj) {
            if (obj instanceof TypeName) {
                return (TypeName) obj;
            }
            if (obj instanceof TypeMirror) {
                return TypeName.get((TypeMirror) obj);
            }
            if (obj instanceof Element) {
                return TypeName.get(((Element) obj).asType());
            }
            if (obj instanceof Type) {
                return TypeName.get((Type) obj);
            }
            Single$$ExternalSyntheticBUOutline0.m$3(DoubleList$$ExternalSyntheticOutline0.m(obj, "expected type but was "));
            return null;
        }

        private boolean isNoArgPlaceholder(char c) {
            return c == '$' || c == '>' || c == '<' || c == '[' || c == ']' || c == 'W' || c == 'Z';
        }

        public Builder add(String str, Object... objArr) {
            int i;
            char charAt;
            boolean z;
            int i2;
            int[] iArr = new int[objArr.length];
            int i3 = 0;
            boolean z2 = false;
            int i4 = 0;
            boolean z3 = false;
            while (true) {
                if (i3 >= str.length()) {
                    break;
                }
                if (str.charAt(i3) != '$') {
                    int indexOf = str.indexOf(36, i3 + 1);
                    if (indexOf == -1) {
                        indexOf = str.length();
                    }
                    this.formatParts.add(str.substring(i3, indexOf));
                    i3 = indexOf;
                } else {
                    int i5 = i3 + 1;
                    int i6 = i5;
                    while (true) {
                        Util.checkArgument(i6 < str.length(), "dangling format characters in '%s'", str);
                        i = i6 + 1;
                        charAt = str.charAt(i6);
                        if (charAt < '0' || charAt > '9') {
                            break;
                        }
                        i6 = i;
                    }
                    if (isNoArgPlaceholder(charAt)) {
                        Util.checkArgument(i5 == i6, "$$, $>, $<, $[, $], $W, and $Z may not have an index", new Object[0]);
                        this.formatParts.add("$" + charAt);
                    } else {
                        if (i5 < i6) {
                            int parseInt = Integer.parseInt(str.substring(i5, i6)) - 1;
                            if (objArr.length > 0) {
                                int length = parseInt % objArr.length;
                                iArr[length] = iArr[length] + 1;
                            }
                            i2 = i4;
                            i4 = parseInt;
                            z = true;
                        } else {
                            z = z3;
                            i2 = i4 + 1;
                            z2 = true;
                        }
                        Util.checkArgument(i4 >= 0 && i4 < objArr.length, "index %d for '%s' not in range (received %s arguments)", Integer.valueOf(i4 + 1), str.substring(i3, i6 + 1), Integer.valueOf(objArr.length));
                        Util.checkArgument((z && z2) ? false : true, "cannot mix indexed and positional parameters", new Object[0]);
                        addArgument(str, charAt, objArr[i4]);
                        this.formatParts.add("$" + charAt);
                        i4 = i2;
                        z3 = z;
                    }
                    i3 = i;
                }
            }
            if (z2) {
                Util.checkArgument(i4 >= objArr.length, "unused arguments: expected %s, received %s", Integer.valueOf(i4), Integer.valueOf(objArr.length));
            }
            if (z3) {
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < objArr.length; i7++) {
                    if (iArr[i7] == 0) {
                        arrayList.add("$" + (i7 + 1));
                    }
                }
                Util.checkArgument(arrayList.isEmpty(), "unused argument%s: %s", arrayList.size() == 1 ? "" : CmcdData.Factory.STREAMING_FORMAT_SS, String.join(", ", arrayList));
            }
            return this;
        }

        public Builder addNamed(String str, Map<String, ?> map) {
            for (String str2 : map.keySet()) {
                Util.checkArgument(CodeBlock.LOWERCASE.matcher(str2).matches(), "argument '%s' must start with a lowercase character", str2);
            }
            int i = 0;
            while (i < str.length()) {
                int indexOf = str.indexOf("$", i);
                if (indexOf == -1) {
                    this.formatParts.add(str.substring(i));
                    return this;
                }
                if (i != indexOf) {
                    this.formatParts.add(str.substring(i, indexOf));
                    i = indexOf;
                }
                int indexOf2 = str.indexOf(58, i);
                Matcher matcher = indexOf2 != -1 ? CodeBlock.NAMED_ARGUMENT.matcher(str.substring(i, Math.min(indexOf2 + 2, str.length()))) : null;
                if (matcher == null || !matcher.lookingAt()) {
                    Util.checkArgument(i < str.length() - 1, "dangling $ at end", new Object[0]);
                    int i2 = i + 1;
                    Util.checkArgument(isNoArgPlaceholder(str.charAt(i2)), "unknown format $%s at %s in '%s'", Character.valueOf(str.charAt(i2)), Integer.valueOf(i2), str);
                    int i3 = i + 2;
                    this.formatParts.add(str.substring(i, i3));
                    i = i3;
                } else {
                    String group = matcher.group("argumentName");
                    Util.checkArgument(map.containsKey(group), "Missing named argument for $%s", group);
                    char charAt = matcher.group("typeChar").charAt(0);
                    addArgument(str, charAt, map.get(group));
                    this.formatParts.add("$" + charAt);
                    i = matcher.regionEnd() + i;
                }
            }
            return this;
        }

        public Builder addStatement(String str, Object... objArr) {
            add("$[", new Object[0]);
            add(str, objArr);
            add(";\n$]", new Object[0]);
            return this;
        }

        public Builder beginControlFlow(String str, Object... objArr) {
            add(str + " {\n", objArr);
            indent();
            return this;
        }

        public CodeBlock build() {
            return new CodeBlock(this);
        }

        public Builder clear() {
            this.formatParts.clear();
            this.args.clear();
            return this;
        }

        public Builder endControlFlow(String str, Object... objArr) {
            unindent();
            add("} " + str + ";\n", objArr);
            return this;
        }

        public Builder indent() {
            this.formatParts.add("$>");
            return this;
        }

        public boolean isEmpty() {
            return this.formatParts.isEmpty();
        }

        public Builder nextControlFlow(String str, Object... objArr) {
            unindent();
            add("} " + str + " {\n", objArr);
            indent();
            return this;
        }

        public Builder unindent() {
            this.formatParts.add("$<");
            return this;
        }

        public Builder addStatement(CodeBlock codeBlock) {
            return addStatement("$L", codeBlock);
        }

        private Object argToLiteral(Object obj) {
            return obj;
        }

        public Builder endControlFlow() {
            unindent();
            add("}\n", new Object[0]);
            return this;
        }

        public Builder add(CodeBlock codeBlock) {
            this.formatParts.addAll(codeBlock.formatParts);
            this.args.addAll(codeBlock.args);
            return this;
        }
    }

    public static Collector<CodeBlock, ?, CodeBlock> joining(final String str) {
        return Collector.of(new Supplier() { // from class: autovalue.shaded.com.squareup.javapoet.CodeBlock$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                CodeBlock.CodeBlockJoiner lambda$joining$0;
                lambda$joining$0 = CodeBlock.lambda$joining$0(str);
                return lambda$joining$0;
            }
        }, new CodeBlock$$ExternalSyntheticLambda1(), new CodeBlock$$ExternalSyntheticLambda2(), new CodeBlock$$ExternalSyntheticLambda3(0), new Collector.Characteristics[0]);
    }
}
