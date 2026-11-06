package org.openjdk.tools.javac.code;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.deecomms.common.metrics.MetricKeys;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.openjdk.tools.javac.code.Attribute;
import org.openjdk.tools.javac.code.Symbol;
import org.openjdk.tools.javac.util.Context;
import org.openjdk.tools.javac.util.List;
import org.openjdk.tools.javac.util.Pair;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class Lint {
    protected static final Context.Key<Lint> lintKey = new Context.Key<>();
    private static final Map<String, LintCategory> map = new ConcurrentHashMap(20);
    private final AugmentVisitor augmentor;
    private final EnumSet<LintCategory> suppressedValues;
    private final EnumSet<LintCategory> values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Lint(org.openjdk.tools.javac.util.Context r10) {
        /*
            r9 = this;
            r9.<init>()
            org.openjdk.tools.javac.util.Options r0 = org.openjdk.tools.javac.util.Options.instance(r10)
            org.openjdk.tools.javac.main.Option r1 = org.openjdk.tools.javac.main.Option.XLINT
            boolean r1 = r0.isSet(r1)
            java.lang.Class<org.openjdk.tools.javac.code.Lint$LintCategory> r2 = org.openjdk.tools.javac.code.Lint.LintCategory.class
            if (r1 != 0) goto L52
            org.openjdk.tools.javac.main.Option r1 = org.openjdk.tools.javac.main.Option.XLINT_CUSTOM
            java.lang.String r3 = "all"
            boolean r3 = r0.isSet(r1, r3)
            if (r3 == 0) goto L1c
            goto L52
        L1c:
            java.lang.String r3 = "none"
            boolean r1 = r0.isSet(r1, r3)
            if (r1 == 0) goto L2b
            java.util.EnumSet r1 = java.util.EnumSet.noneOf(r2)
            r9.values = r1
            goto L58
        L2b:
            java.util.EnumSet r1 = java.util.EnumSet.noneOf(r2)
            r9.values = r1
            org.openjdk.tools.javac.code.Source r3 = org.openjdk.tools.javac.code.Source.instance(r10)
            org.openjdk.tools.javac.code.Source r4 = org.openjdk.tools.javac.code.Source.JDK1_9
            int r3 = r3.compareTo(r4)
            if (r3 < 0) goto L42
            org.openjdk.tools.javac.code.Lint$LintCategory r3 = org.openjdk.tools.javac.code.Lint.LintCategory.DEP_ANN
            r1.add(r3)
        L42:
            org.openjdk.tools.javac.code.Lint$LintCategory r3 = org.openjdk.tools.javac.code.Lint.LintCategory.OPENS
            r1.add(r3)
            org.openjdk.tools.javac.code.Lint$LintCategory r3 = org.openjdk.tools.javac.code.Lint.LintCategory.MODULE
            r1.add(r3)
            org.openjdk.tools.javac.code.Lint$LintCategory r3 = org.openjdk.tools.javac.code.Lint.LintCategory.REMOVAL
            r1.add(r3)
            goto L58
        L52:
            java.util.EnumSet r1 = java.util.EnumSet.allOf(r2)
            r9.values = r1
        L58:
            org.openjdk.tools.javac.code.Lint$LintCategory[] r1 = org.openjdk.tools.javac.code.Lint.LintCategory.values()
            int r3 = r1.length
            r4 = 0
        L5e:
            if (r4 >= r3) goto L90
            r5 = r1[r4]
            org.openjdk.tools.javac.main.Option r6 = org.openjdk.tools.javac.main.Option.XLINT_CUSTOM
            java.lang.String r7 = r5.option
            boolean r7 = r0.isSet(r6, r7)
            if (r7 == 0) goto L72
            java.util.EnumSet<org.openjdk.tools.javac.code.Lint$LintCategory> r6 = r9.values
            r6.add(r5)
            goto L8d
        L72:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "-"
            r7.<init>(r8)
            java.lang.String r8 = r5.option
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            boolean r6 = r0.isSet(r6, r7)
            if (r6 == 0) goto L8d
            java.util.EnumSet<org.openjdk.tools.javac.code.Lint$LintCategory> r6 = r9.values
            r6.remove(r5)
        L8d:
            int r4 = r4 + 1
            goto L5e
        L90:
            java.util.EnumSet r0 = java.util.EnumSet.noneOf(r2)
            r9.suppressedValues = r0
            org.openjdk.tools.javac.util.Context$Key<org.openjdk.tools.javac.code.Lint> r0 = org.openjdk.tools.javac.code.Lint.lintKey
            r10.put(r0, r9)
            org.openjdk.tools.javac.code.Lint$AugmentVisitor r0 = new org.openjdk.tools.javac.code.Lint$AugmentVisitor
            r0.<init>(r10)
            r9.augmentor = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.openjdk.tools.javac.code.Lint.<init>(org.openjdk.tools.javac.util.Context):void");
    }

    public static Lint instance(Context context) {
        Lint lint = (Lint) context.get(lintKey);
        return lint == null ? new Lint(context) : lint;
    }

    public Lint augment(Symbol symbol) {
        Lint augment = this.augmentor.augment(this, symbol.getDeclarationAttributes());
        if (symbol.isDeprecated()) {
            if (augment == this) {
                augment = new Lint(this);
            }
            EnumSet<LintCategory> enumSet = augment.values;
            LintCategory lintCategory = LintCategory.DEPRECATION;
            enumSet.remove(lintCategory);
            augment.suppressedValues.add(lintCategory);
        }
        return augment;
    }

    public boolean isEnabled(LintCategory lintCategory) {
        return this.values.contains(lintCategory);
    }

    public boolean isSuppressed(LintCategory lintCategory) {
        return this.suppressedValues.contains(lintCategory);
    }

    public Lint suppress(LintCategory... lintCategoryArr) {
        Lint lint = new Lint(this);
        lint.values.removeAll(Arrays.asList(lintCategoryArr));
        lint.suppressedValues.addAll(Arrays.asList(lintCategoryArr));
        return lint;
    }

    public String toString() {
        return "Lint:[values" + this.values + " suppressedValues" + this.suppressedValues + MarkdownConstants.RIGHT_BRACKET;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum LintCategory {
        AUXILIARYCLASS("auxiliaryclass"),
        CAST("cast"),
        CLASSFILE("classfile"),
        DEPRECATION("deprecation"),
        DEP_ANN("dep-ann"),
        DIVZERO("divzero"),
        EMPTY(MetricKeys.EMPTY_VALUE),
        EXPORTS("exports"),
        FALLTHROUGH("fallthrough"),
        FINALLY("finally"),
        MODULE("module"),
        OPENS("opens"),
        OPTIONS("options"),
        OVERLOADS("overloads"),
        OVERRIDES("overrides"),
        PATH("path"),
        PROCESSING("processing"),
        RAW("rawtypes"),
        REMOVAL("removal"),
        SERIAL("serial"),
        STATIC("static"),
        TRY("try"),
        UNCHECKED("unchecked"),
        VARARGS("varargs");

        public final boolean hidden;
        public final String option;

        LintCategory(String str, boolean z) {
            this.option = str;
            this.hidden = z;
            Lint.map.put(str, this);
        }

        public static LintCategory get(String str) {
            return (LintCategory) Lint.map.get(str);
        }

        LintCategory(String str) {
            this(str, false);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AugmentVisitor implements Attribute.Visitor {
        private final Context context;
        private Lint lint;
        private Lint parent;
        private Symtab syms;

        public AugmentVisitor(Context context) {
            this.context = context;
        }

        private void initSyms() {
            if (this.syms == null) {
                this.syms = Symtab.instance(this.context);
            }
        }

        private void suppress(LintCategory lintCategory) {
            if (this.lint == null) {
                this.lint = new Lint(this.parent);
            }
            this.lint.suppressedValues.add(lintCategory);
            this.lint.values.remove(lintCategory);
        }

        public Lint augment(Lint lint, List<Attribute.Compound> list) {
            initSyms();
            this.parent = lint;
            this.lint = null;
            Iterator<Attribute.Compound> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().accept(this);
            }
            Lint lint2 = this.lint;
            return lint2 == null ? lint : lint2;
        }

        @Override // org.openjdk.tools.javac.code.Attribute.Visitor
        public void visitArray(Attribute.Array array) {
            for (Attribute attribute : array.values) {
                attribute.accept(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.openjdk.tools.javac.code.Attribute.Visitor
        public void visitCompound(Attribute.Compound compound) {
            if (compound.type.tsym == this.syms.suppressWarningsType.tsym) {
                for (List list = compound.values; list.nonEmpty(); list = list.tail) {
                    Pair pair = (Pair) list.head;
                    if (((Symbol.MethodSymbol) pair.fst).name.toString().equals("value")) {
                        ((Attribute) pair.snd).accept(this);
                    }
                }
            }
        }

        @Override // org.openjdk.tools.javac.code.Attribute.Visitor
        public void visitConstant(Attribute.Constant constant) {
            LintCategory lintCategory;
            if (constant.type.tsym != this.syms.stringType.tsym || (lintCategory = LintCategory.get((String) constant.value)) == null) {
                return;
            }
            suppress(lintCategory);
        }

        @Override // org.openjdk.tools.javac.code.Attribute.Visitor
        public void visitClass(Attribute.Class r1) {
        }

        @Override // org.openjdk.tools.javac.code.Attribute.Visitor
        public void visitEnum(Attribute.Enum r1) {
        }

        @Override // org.openjdk.tools.javac.code.Attribute.Visitor
        public void visitError(Attribute.Error error) {
        }

        public Lint augment(Lint lint, Attribute.Compound compound) {
            initSyms();
            this.parent = lint;
            this.lint = null;
            compound.accept(this);
            Lint lint2 = this.lint;
            return lint2 == null ? lint : lint2;
        }
    }

    public Lint augment(Attribute.Compound compound) {
        return this.augmentor.augment(this, compound);
    }

    public Lint(Lint lint) {
        this.augmentor = lint.augmentor;
        this.values = lint.values.clone();
        this.suppressedValues = lint.suppressedValues.clone();
    }
}
