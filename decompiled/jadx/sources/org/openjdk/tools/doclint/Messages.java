package org.openjdk.tools.doclint;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import java.io.PrintWriter;
import java.text.MessageFormat;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.apache.commons.text.StringSubstitutor;
import org.openjdk.javax.tools.Diagnostic;
import org.openjdk.source.doctree.DocTree;
import org.openjdk.source.tree.Tree;
import org.openjdk.tools.doclint.Env;
import org.openjdk.tools.javac.util.StringUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Messages {
    ResourceBundle bundle;
    Env env;
    private final Options options;
    private final Stats stats;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Group {
        ACCESSIBILITY,
        HTML,
        MISSING,
        SYNTAX,
        REFERENCE;

        public static boolean accepts(String str) {
            for (Group group : values()) {
                if (str.equals(group.optName())) {
                    return true;
                }
            }
            return false;
        }

        public String notOptName() {
            return "-" + optName();
        }

        public String optName() {
            return StringUtils.toLowerCase(name());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Stats {
        public static final String NO_CODE = "";
        public static final String OPT = "stats";
        final ResourceBundle bundle;
        Map<String, Integer> codeCounts;
        int[] dkindCounts;
        int[] groupCounts;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Table {
            private static final Comparator<Integer> DECREASING = new Messages$Stats$Table$$ExternalSyntheticLambda0();
            private final TreeMap<Integer, Set<String>> map;

            private Table() {
                this.map = new TreeMap<>(DECREASING);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ int lambda$static$0(Integer num, Integer num2) {
                return num2.compareTo(num);
            }

            public void print(PrintWriter printWriter) {
                for (Map.Entry<Integer, Set<String>> entry : this.map.entrySet()) {
                    Integer key = entry.getKey();
                    key.intValue();
                    Iterator<String> it2 = entry.getValue().iterator();
                    while (it2.hasNext()) {
                        printWriter.println(String.format("%6d: %s", key, it2.next()));
                    }
                }
            }

            public void put(String str, int i) {
                if (i == 0) {
                    return;
                }
                Set<String> set = this.map.get(Integer.valueOf(i));
                if (set == null) {
                    TreeMap<Integer, Set<String>> treeMap = this.map;
                    Integer valueOf = Integer.valueOf(i);
                    set = new TreeSet<>();
                    treeMap.put(valueOf, set);
                }
                set.add(str);
            }
        }

        public Stats(ResourceBundle resourceBundle) {
            this.bundle = resourceBundle;
        }

        public void record(Group group, Diagnostic.Kind kind, String str) {
            if (this.codeCounts == null) {
                return;
            }
            int[] iArr = this.groupCounts;
            int ordinal = group.ordinal();
            iArr[ordinal] = iArr[ordinal] + 1;
            int[] iArr2 = this.dkindCounts;
            int ordinal2 = kind.ordinal();
            iArr2[ordinal2] = iArr2[ordinal2] + 1;
            if (str == null) {
                str = "";
            }
            Integer num = this.codeCounts.get(str);
            this.codeCounts.put(str, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }

        public void report(PrintWriter printWriter) {
            if (this.codeCounts == null) {
                return;
            }
            printWriter.println("By group...");
            Table table = new Table();
            for (Group group : Group.values()) {
                table.put(group.optName(), this.groupCounts[group.ordinal()]);
            }
            table.print(printWriter);
            printWriter.println();
            printWriter.println("By diagnostic kind...");
            Table table2 = new Table();
            for (Diagnostic.Kind kind : Diagnostic.Kind.values()) {
                table2.put(StringUtils.toLowerCase(kind.toString()), this.dkindCounts[kind.ordinal()]);
            }
            table2.print(printWriter);
            printWriter.println();
            printWriter.println("By message kind...");
            Table table3 = new Table();
            for (Map.Entry<String, Integer> entry : this.codeCounts.entrySet()) {
                String key = entry.getKey();
                try {
                    key = key.equals("") ? "OTHER" : this.bundle.getString(key);
                } catch (MissingResourceException unused) {
                }
                table3.put(key, entry.getValue().intValue());
            }
            table3.print(printWriter);
        }

        public void setEnabled(boolean z) {
            if (z) {
                this.groupCounts = new int[Group.values().length];
                this.dkindCounts = new int[Diagnostic.Kind.values().length];
                this.codeCounts = new HashMap();
            } else {
                this.groupCounts = null;
                this.dkindCounts = null;
                this.codeCounts = null;
            }
        }
    }

    public Messages(Env env) {
        this.env = env;
        ResourceBundle bundle = ResourceBundle.getBundle(getClass().getPackage().getName() + ".resources.doclint", Locale.ENGLISH);
        this.bundle = bundle;
        Stats stats = new Stats(bundle);
        this.stats = stats;
        this.options = new Options(stats);
    }

    public void error(Group group, DocTree docTree, String str, Object... objArr) {
        report(group, Diagnostic.Kind.ERROR, docTree, str, objArr);
    }

    public String localize(String str, Object... objArr) {
        String string = this.bundle.getString(str);
        if (string == null) {
            StringBuilder m3869m = BitVector$$ExternalSyntheticOutline0.m3869m("message file broken: code=", str);
            if (objArr.length > 0) {
                m3869m.append(" arguments={0}");
                for (int i = 1; i < objArr.length; i++) {
                    m3869m.append(", {");
                    m3869m.append(i);
                    m3869m.append(StringSubstitutor.DEFAULT_VAR_END);
                }
            }
            string = m3869m.toString();
        }
        return MessageFormat.format(string, objArr);
    }

    public void report(Group group, Diagnostic.Kind kind, DocTree docTree, String str, Object... objArr) {
        if (this.options.isEnabled(group, this.env.currAccess)) {
            String localize = str == null ? (String) objArr[0] : localize(str, objArr);
            Env env = this.env;
            env.trees.printMessage(kind, localize, docTree, env.currDocComment, env.currPath.getCompilationUnit());
            this.stats.record(group, kind, str);
        }
    }

    public void reportStats(PrintWriter printWriter) {
        this.stats.report(printWriter);
    }

    public void setOptions(String str) {
        this.options.setOptions(str);
    }

    public void setStatsEnabled(boolean z) {
        this.stats.setEnabled(z);
    }

    public void warning(Group group, DocTree docTree, String str, Object... objArr) {
        report(group, Diagnostic.Kind.WARNING, docTree, str, objArr);
    }

    public void report(Group group, Diagnostic.Kind kind, Tree tree, String str, Object... objArr) {
        if (this.options.isEnabled(group, this.env.currAccess)) {
            String localize = localize(str, objArr);
            Env env = this.env;
            env.trees.printMessage(kind, localize, tree, env.currPath.getCompilationUnit());
            this.stats.record(group, kind, str);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Options {
        private static final String ALL = "all";
        Map<String, Env.AccessKind> map = new HashMap();
        private final Stats stats;

        public Options(Stats stats) {
            this.stats = stats;
        }

        private static boolean isValidOption(String str) {
            if (str.equals("none") || str.equals(Stats.OPT)) {
                return true;
            }
            boolean startsWith = str.startsWith("-");
            int indexOf = str.indexOf("/");
            String substring = str.substring(startsWith ? 1 : 0, indexOf != -1 ? indexOf : str.length());
            if ((startsWith || !substring.equals("all")) && !Group.accepts(substring)) {
                return false;
            }
            return indexOf == -1 || Env.AccessKind.accepts(str.substring(indexOf + 1));
        }

        public static boolean isValidOptions(String str) {
            for (String str2 : str.split(",")) {
                if (!isValidOption(StringUtils.toLowerCase(str2.trim()))) {
                    return false;
                }
            }
            return true;
        }

        private void setOption(String str) throws IllegalArgumentException {
            if (str.equals(Stats.OPT)) {
                this.stats.setEnabled(true);
                return;
            }
            int indexOf = str.indexOf("/");
            if (indexOf <= 0) {
                setOption(str, null);
            } else {
                setOption(str.substring(0, indexOf), Env.AccessKind.valueOf(StringUtils.toUpperCase(str.substring(indexOf + 1))));
            }
        }

        public boolean isEnabled(Group group, Env.AccessKind accessKind) {
            if (this.map.isEmpty()) {
                this.map.put("all", Env.AccessKind.PROTECTED);
            }
            Env.AccessKind accessKind2 = this.map.get(group.optName());
            if (accessKind2 != null && accessKind.compareTo(accessKind2) >= 0) {
                return true;
            }
            Env.AccessKind accessKind3 = this.map.get("all");
            if (accessKind3 == null || accessKind.compareTo(accessKind3) < 0) {
                return false;
            }
            Env.AccessKind accessKind4 = this.map.get(group.notOptName());
            return accessKind4 == null || accessKind.compareTo(accessKind4) > 0;
        }

        public void setOptions(String str) {
            if (str == null) {
                setOption("all", Env.AccessKind.PRIVATE);
                return;
            }
            for (String str2 : str.split(",")) {
                setOption(StringUtils.toLowerCase(str2.trim()));
            }
        }

        private void setOption(String str, Env.AccessKind accessKind) {
            Map<String, Env.AccessKind> map = this.map;
            if (accessKind == null) {
                accessKind = str.startsWith("-") ? Env.AccessKind.PUBLIC : Env.AccessKind.PRIVATE;
            }
            map.put(str, accessKind);
        }
    }
}
