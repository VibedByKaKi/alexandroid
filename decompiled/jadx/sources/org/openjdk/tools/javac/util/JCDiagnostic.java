package org.openjdk.tools.javac.util;

import androidx.core.app.NotificationCompat;
import com.amazon.alexa.mobilytics.event.LogLevel;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Stream;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.lang3.Functions$$ExternalSyntheticLambda11;
import org.openjdk.javax.tools.Diagnostic;
import org.openjdk.javax.tools.JavaFileObject;
import org.openjdk.tools.javac.api.DiagnosticFormatter;
import org.openjdk.tools.javac.code.Lint;
import org.openjdk.tools.javac.tree.EndPosTable;
import org.openjdk.tools.javac.tree.JCTree;
import org.openjdk.tools.javac.util.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class JCDiagnostic implements Diagnostic<JavaFileObject> {

    @Deprecated
    private static DiagnosticFormatter<JCDiagnostic> fragmentFormatter;
    private DiagnosticFormatter<JCDiagnostic> defaultFormatter;
    private final DiagnosticInfo diagnosticInfo;
    private final Set<DiagnosticFlag> flags;
    private final Lint.LintCategory lintCategory;
    private final DiagnosticPosition position;
    private final DiagnosticSource source;
    private SourcePosition sourcePosition;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: org.openjdk.tools.javac.util.JCDiagnostic$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$sun$tools$javac$util$JCDiagnostic$DiagnosticFlag;
        static final /* synthetic */ int[] $SwitchMap$com$sun$tools$javac$util$JCDiagnostic$DiagnosticType;

        static {
            int[] iArr = new int[DiagnosticFlag.values().length];
            $SwitchMap$com$sun$tools$javac$util$JCDiagnostic$DiagnosticFlag = iArr;
            try {
                iArr[DiagnosticFlag.SYNTAX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$util$JCDiagnostic$DiagnosticFlag[DiagnosticFlag.RESOLVE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[DiagnosticType.values().length];
            $SwitchMap$com$sun$tools$javac$util$JCDiagnostic$DiagnosticType = iArr2;
            try {
                iArr2[DiagnosticType.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$util$JCDiagnostic$DiagnosticType[DiagnosticType.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$util$JCDiagnostic$DiagnosticType[DiagnosticType.NOTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$util$JCDiagnostic$DiagnosticType[DiagnosticType.FRAGMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum DiagnosticFlag {
        MANDATORY,
        RESOLVE_ERROR,
        SYNTAX,
        RECOVERABLE,
        NON_DEFERRABLE,
        COMPRESSED,
        MULTIPLE,
        SOURCE_LEVEL
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DiagnosticPosition {
        int getEndPosition(EndPosTable endPosTable);

        int getPreferredPosition();

        int getStartPosition();

        JCTree getTree();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum DiagnosticType {
        FRAGMENT("misc"),
        NOTE("note"),
        WARNING(LogLevel.WARN),
        ERROR(NotificationCompat.CATEGORY_ERROR);

        final String key;

        DiagnosticType(String str) {
            this.key = str;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Error extends DiagnosticInfo {
        public Error(String str, String str2, Object... objArr) {
            super(DiagnosticType.ERROR, str, str2, objArr, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Fragment extends DiagnosticInfo {
        public Fragment(String str, String str2, Object... objArr) {
            super(DiagnosticType.FRAGMENT, str, str2, objArr, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MultilineDiagnostic extends JCDiagnostic {
        private final List<JCDiagnostic> subdiagnostics;

        public MultilineDiagnostic(JCDiagnostic jCDiagnostic, List<JCDiagnostic> list) {
            super(jCDiagnostic.defaultFormatter, jCDiagnostic.diagnosticInfo, jCDiagnostic.getLintCategory(), jCDiagnostic.flags, jCDiagnostic.getDiagnosticSource(), jCDiagnostic.position);
            this.subdiagnostics = list;
        }

        @Override // org.openjdk.tools.javac.util.JCDiagnostic, org.openjdk.javax.tools.Diagnostic
        public /* bridge */ /* synthetic */ JavaFileObject getSource() {
            return super.getSource();
        }

        @Override // org.openjdk.tools.javac.util.JCDiagnostic
        public List<JCDiagnostic> getSubdiagnostics() {
            return this.subdiagnostics;
        }

        @Override // org.openjdk.tools.javac.util.JCDiagnostic
        public boolean isMultiline() {
            return true;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Note extends DiagnosticInfo {
        public Note(String str, String str2, Object... objArr) {
            super(DiagnosticType.NOTE, str, str2, objArr, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SimpleDiagnosticPosition implements DiagnosticPosition {
        private final int pos;

        public SimpleDiagnosticPosition(int i) {
            this.pos = i;
        }

        @Override // org.openjdk.tools.javac.util.JCDiagnostic.DiagnosticPosition
        public int getEndPosition(EndPosTable endPosTable) {
            return this.pos;
        }

        @Override // org.openjdk.tools.javac.util.JCDiagnostic.DiagnosticPosition
        public int getPreferredPosition() {
            return this.pos;
        }

        @Override // org.openjdk.tools.javac.util.JCDiagnostic.DiagnosticPosition
        public int getStartPosition() {
            return this.pos;
        }

        @Override // org.openjdk.tools.javac.util.JCDiagnostic.DiagnosticPosition
        public JCTree getTree() {
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class SourcePosition {
        private final int column;
        private final int line;

        public SourcePosition() {
            int preferredPosition = JCDiagnostic.this.position == null ? -1 : JCDiagnostic.this.position.getPreferredPosition();
            if (preferredPosition == -1 || JCDiagnostic.this.source == null) {
                this.column = -1;
                this.line = -1;
            } else {
                this.line = JCDiagnostic.this.source.getLineNumber(preferredPosition);
                this.column = JCDiagnostic.this.source.getColumnNumber(preferredPosition, true);
            }
        }

        public int getColumnNumber() {
            return this.column;
        }

        public int getLineNumber() {
            return this.line;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Warning extends DiagnosticInfo {
        public Warning(String str, String str2, Object... objArr) {
            super(DiagnosticType.WARNING, str, str2, objArr, null);
        }
    }

    public JCDiagnostic(DiagnosticFormatter<JCDiagnostic> diagnosticFormatter, DiagnosticInfo diagnosticInfo, Lint.LintCategory lintCategory, Set<DiagnosticFlag> set, DiagnosticSource diagnosticSource, DiagnosticPosition diagnosticPosition) {
        if (diagnosticSource == null && diagnosticPosition != null && diagnosticPosition.getPreferredPosition() != -1) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        this.defaultFormatter = diagnosticFormatter;
        this.diagnosticInfo = diagnosticInfo;
        this.lintCategory = lintCategory;
        this.flags = set;
        this.source = diagnosticSource;
        this.position = diagnosticPosition;
    }

    @Deprecated
    public static JCDiagnostic fragment(String str, Object... objArr) {
        return new JCDiagnostic(getFragmentFormatter(), DiagnosticInfo.of(DiagnosticType.FRAGMENT, "compiler", str, objArr), null, EnumSet.noneOf(DiagnosticFlag.class), null, null);
    }

    @Deprecated
    public static DiagnosticFormatter<JCDiagnostic> getFragmentFormatter() {
        if (fragmentFormatter == null) {
            fragmentFormatter = new BasicDiagnosticFormatter(JavacMessages.getDefaultMessages());
        }
        return fragmentFormatter;
    }

    public Object[] getArgs() {
        return this.diagnosticInfo.args;
    }

    @Override // org.openjdk.javax.tools.Diagnostic
    public String getCode() {
        return this.diagnosticInfo.key();
    }

    @Override // org.openjdk.javax.tools.Diagnostic
    public long getColumnNumber() {
        if (this.sourcePosition == null) {
            this.sourcePosition = new SourcePosition();
        }
        return this.sourcePosition.getColumnNumber();
    }

    public DiagnosticPosition getDiagnosticPosition() {
        return this.position;
    }

    public DiagnosticSource getDiagnosticSource() {
        return this.source;
    }

    @Override // org.openjdk.javax.tools.Diagnostic
    public long getEndPosition() {
        return getIntEndPosition();
    }

    public int getIntEndPosition() {
        DiagnosticPosition diagnosticPosition = this.position;
        if (diagnosticPosition == null) {
            return -1;
        }
        return diagnosticPosition.getEndPosition(this.source.getEndPosTable());
    }

    public int getIntPosition() {
        DiagnosticPosition diagnosticPosition = this.position;
        if (diagnosticPosition == null) {
            return -1;
        }
        return diagnosticPosition.getPreferredPosition();
    }

    public int getIntStartPosition() {
        DiagnosticPosition diagnosticPosition = this.position;
        if (diagnosticPosition == null) {
            return -1;
        }
        return diagnosticPosition.getStartPosition();
    }

    @Override // org.openjdk.javax.tools.Diagnostic
    public Diagnostic.Kind getKind() {
        int i = AnonymousClass1.$SwitchMap$com$sun$tools$javac$util$JCDiagnostic$DiagnosticType[this.diagnosticInfo.type.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? Diagnostic.Kind.OTHER : Diagnostic.Kind.NOTE : this.flags.contains(DiagnosticFlag.MANDATORY) ? Diagnostic.Kind.MANDATORY_WARNING : Diagnostic.Kind.WARNING : Diagnostic.Kind.ERROR;
    }

    @Override // org.openjdk.javax.tools.Diagnostic
    public long getLineNumber() {
        if (this.sourcePosition == null) {
            this.sourcePosition = new SourcePosition();
        }
        return this.sourcePosition.getLineNumber();
    }

    public Lint.LintCategory getLintCategory() {
        return this.lintCategory;
    }

    @Override // org.openjdk.javax.tools.Diagnostic
    public String getMessage(Locale locale) {
        return this.defaultFormatter.formatMessage(this, locale);
    }

    @Override // org.openjdk.javax.tools.Diagnostic
    public long getPosition() {
        return getIntPosition();
    }

    public String getPrefix(DiagnosticType diagnosticType) {
        return this.defaultFormatter.formatKind(this, Locale.getDefault());
    }

    @Override // org.openjdk.javax.tools.Diagnostic
    public JavaFileObject getSource() {
        DiagnosticSource diagnosticSource = this.source;
        if (diagnosticSource == null) {
            return null;
        }
        return diagnosticSource.getFile();
    }

    @Override // org.openjdk.javax.tools.Diagnostic
    public long getStartPosition() {
        return getIntStartPosition();
    }

    public List<JCDiagnostic> getSubdiagnostics() {
        return List.nil();
    }

    public DiagnosticType getType() {
        return this.diagnosticInfo.type;
    }

    public boolean hasLintCategory() {
        return this.lintCategory != null;
    }

    public boolean isFlagSet(DiagnosticFlag diagnosticFlag) {
        return this.flags.contains(diagnosticFlag);
    }

    public boolean isMandatory() {
        return this.flags.contains(DiagnosticFlag.MANDATORY);
    }

    public boolean isMultiline() {
        return false;
    }

    public void setFlag(DiagnosticFlag diagnosticFlag) {
        this.flags.add(diagnosticFlag);
        if (this.diagnosticInfo.type == DiagnosticType.ERROR) {
            int i = AnonymousClass1.$SwitchMap$com$sun$tools$javac$util$JCDiagnostic$DiagnosticFlag[diagnosticFlag.ordinal()];
            if (i == 1) {
                this.flags.remove(DiagnosticFlag.RECOVERABLE);
            } else {
                if (i != 2) {
                    return;
                }
                this.flags.add(DiagnosticFlag.RECOVERABLE);
            }
        }
    }

    public String toString() {
        return this.defaultFormatter.format(this, Locale.getDefault());
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class DiagnosticInfo {
        Object[] args;
        String code;
        String prefix;
        DiagnosticType type;

        private DiagnosticInfo(DiagnosticType diagnosticType, String str, String str2, Object... objArr) {
            this.type = diagnosticType;
            this.prefix = str;
            this.code = str2;
            this.args = objArr;
        }

        public static DiagnosticInfo of(DiagnosticType diagnosticType, String str, String str2, Object... objArr) {
            int i = AnonymousClass1.$SwitchMap$com$sun$tools$javac$util$JCDiagnostic$DiagnosticType[diagnosticType.ordinal()];
            if (i == 1) {
                return new Error(str, str2, objArr);
            }
            if (i == 2) {
                return new Warning(str, str2, objArr);
            }
            if (i == 3) {
                return new Note(str, str2, objArr);
            }
            if (i == 4) {
                return new Fragment(str, str2, objArr);
            }
            Assert.error("Wrong diagnostic type: " + diagnosticType);
            return null;
        }

        public String key() {
            return this.prefix + "." + this.type.key + "." + this.code;
        }

        public /* synthetic */ DiagnosticInfo(DiagnosticType diagnosticType, String str, String str2, Object[] objArr, AnonymousClass1 anonymousClass1) {
            this(diagnosticType, str, str2, objArr);
        }
    }

    public String getPrefix() {
        return getPrefix(this.diagnosticInfo.type);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Factory {
        protected static final Context.Key<Factory> diagnosticFactoryKey = new Context.Key<>();
        final Set<DiagnosticFlag> defaultErrorFlags;
        DiagnosticFormatter<JCDiagnostic> formatter;
        final String prefix;

        public Factory(Context context) {
            this(JavacMessages.instance(context), "compiler");
            context.put((Context.Key<Context.Key<Factory>>) diagnosticFactoryKey, (Context.Key<Factory>) this);
            Options instance = Options.instance(context);
            lambda$new$0(instance);
            instance.addListener(new Log$$ExternalSyntheticLambda0(this, instance, 14));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: initOptions, reason: merged with bridge method [inline-methods] */
        public void lambda$new$0(Options options) {
            if (options.isSet("onlySyntaxErrorsUnrecoverable")) {
                this.defaultErrorFlags.add(DiagnosticFlag.RECOVERABLE);
            }
        }

        public static Factory instance(Context context) {
            Factory factory = (Factory) context.get(diagnosticFactoryKey);
            return factory == null ? new Factory(context) : factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$normalize$1(Object obj) {
            return obj instanceof Fragment ? fragment((Fragment) obj) : obj;
        }

        public JCDiagnostic create(DiagnosticType diagnosticType, DiagnosticSource diagnosticSource, DiagnosticPosition diagnosticPosition, String str, Object... objArr) {
            return create((Lint.LintCategory) null, EnumSet.noneOf(DiagnosticFlag.class), diagnosticSource, diagnosticPosition, DiagnosticInfo.of(diagnosticType, this.prefix, str, objArr));
        }

        public JCDiagnostic error(DiagnosticFlag diagnosticFlag, DiagnosticSource diagnosticSource, DiagnosticPosition diagnosticPosition, Error error) {
            JCDiagnostic create = create((Lint.LintCategory) null, EnumSet.copyOf((Collection) this.defaultErrorFlags), diagnosticSource, diagnosticPosition, error);
            if (diagnosticFlag != null) {
                create.setFlag(diagnosticFlag);
            }
            return create;
        }

        public Error errorKey(String str, Object... objArr) {
            return (Error) DiagnosticInfo.of(DiagnosticType.ERROR, this.prefix, str, objArr);
        }

        public JCDiagnostic fragment(Fragment fragment) {
            return create((Lint.LintCategory) null, EnumSet.noneOf(DiagnosticFlag.class), (DiagnosticSource) null, (DiagnosticPosition) null, fragment);
        }

        public Fragment fragmentKey(String str, Object... objArr) {
            return (Fragment) DiagnosticInfo.of(DiagnosticType.FRAGMENT, this.prefix, str, objArr);
        }

        public JCDiagnostic mandatoryNote(DiagnosticSource diagnosticSource, Note note) {
            return create((Lint.LintCategory) null, EnumSet.of(DiagnosticFlag.MANDATORY), diagnosticSource, (DiagnosticPosition) null, note);
        }

        public JCDiagnostic mandatoryWarning(Lint.LintCategory lintCategory, DiagnosticSource diagnosticSource, DiagnosticPosition diagnosticPosition, Warning warning) {
            return create(lintCategory, EnumSet.of(DiagnosticFlag.MANDATORY), diagnosticSource, diagnosticPosition, warning);
        }

        public DiagnosticInfo normalize(DiagnosticInfo diagnosticInfo) {
            return DiagnosticInfo.of(diagnosticInfo.type, diagnosticInfo.prefix, diagnosticInfo.code, Stream.of(diagnosticInfo.args).map(new Functions$$ExternalSyntheticLambda11(this, 28)).toArray());
        }

        public JCDiagnostic note(DiagnosticSource diagnosticSource, DiagnosticPosition diagnosticPosition, Note note) {
            return create((Lint.LintCategory) null, EnumSet.noneOf(DiagnosticFlag.class), diagnosticSource, diagnosticPosition, note);
        }

        public Note noteKey(String str, Object... objArr) {
            return (Note) DiagnosticInfo.of(DiagnosticType.NOTE, this.prefix, str, objArr);
        }

        public JCDiagnostic warning(Lint.LintCategory lintCategory, DiagnosticSource diagnosticSource, DiagnosticPosition diagnosticPosition, Warning warning) {
            return create(lintCategory, EnumSet.noneOf(DiagnosticFlag.class), diagnosticSource, diagnosticPosition, warning);
        }

        public Warning warningKey(String str, Object... objArr) {
            return (Warning) DiagnosticInfo.of(DiagnosticType.WARNING, this.prefix, str, objArr);
        }

        public JCDiagnostic fragment(String str, Object... objArr) {
            return fragment(fragmentKey(str, objArr));
        }

        public JCDiagnostic mandatoryNote(DiagnosticSource diagnosticSource, String str, Object... objArr) {
            return mandatoryNote(diagnosticSource, noteKey(str, objArr));
        }

        public JCDiagnostic mandatoryWarning(Lint.LintCategory lintCategory, DiagnosticSource diagnosticSource, DiagnosticPosition diagnosticPosition, String str, Object... objArr) {
            return mandatoryWarning(lintCategory, diagnosticSource, diagnosticPosition, warningKey(str, objArr));
        }

        public JCDiagnostic note(DiagnosticSource diagnosticSource, DiagnosticPosition diagnosticPosition, String str, Object... objArr) {
            return note(diagnosticSource, diagnosticPosition, noteKey(str, objArr));
        }

        public JCDiagnostic warning(Lint.LintCategory lintCategory, DiagnosticSource diagnosticSource, DiagnosticPosition diagnosticPosition, String str, Object... objArr) {
            return warning(lintCategory, diagnosticSource, diagnosticPosition, warningKey(str, objArr));
        }

        public JCDiagnostic create(DiagnosticSource diagnosticSource, DiagnosticPosition diagnosticPosition, DiagnosticInfo diagnosticInfo) {
            return create((Lint.LintCategory) null, EnumSet.noneOf(DiagnosticFlag.class), diagnosticSource, diagnosticPosition, diagnosticInfo);
        }

        public JCDiagnostic error(DiagnosticFlag diagnosticFlag, DiagnosticSource diagnosticSource, DiagnosticPosition diagnosticPosition, String str, Object... objArr) {
            return error(diagnosticFlag, diagnosticSource, diagnosticPosition, errorKey(str, objArr));
        }

        public JCDiagnostic create(DiagnosticType diagnosticType, Lint.LintCategory lintCategory, Set<DiagnosticFlag> set, DiagnosticSource diagnosticSource, DiagnosticPosition diagnosticPosition, String str, Object... objArr) {
            return create(lintCategory, set, diagnosticSource, diagnosticPosition, DiagnosticInfo.of(diagnosticType, this.prefix, str, objArr));
        }

        public JCDiagnostic create(Lint.LintCategory lintCategory, Set<DiagnosticFlag> set, DiagnosticSource diagnosticSource, DiagnosticPosition diagnosticPosition, DiagnosticInfo diagnosticInfo) {
            return new JCDiagnostic(this.formatter, normalize(diagnosticInfo), lintCategory, set, diagnosticSource, diagnosticPosition);
        }

        public Factory(JavacMessages javacMessages, String str) {
            this.prefix = str;
            this.formatter = new BasicDiagnosticFormatter(javacMessages);
            this.defaultErrorFlags = EnumSet.of(DiagnosticFlag.MANDATORY);
        }
    }
}
