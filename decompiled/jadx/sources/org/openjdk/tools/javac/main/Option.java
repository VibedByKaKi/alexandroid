package org.openjdk.tools.javac.main;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.devicesetup.softap.listener.BuildConfig;
import com.amazon.clouddrive.model.NodeType;
import com.amazon.leapfrogmapgl.indoor.RoadProbe;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.text.StringSubstitutor;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.openjdk.javax.lang.model.SourceVersion;
import org.openjdk.tools.doclint.DocLint;
import org.openjdk.tools.javac.code.Lint;
import org.openjdk.tools.javac.code.Source;
import org.openjdk.tools.javac.code.Type;
import org.openjdk.tools.javac.jvm.Profile;
import org.openjdk.tools.javac.jvm.Target;
import org.openjdk.tools.javac.main.Option;
import org.openjdk.tools.javac.platform.PlatformProvider;
import org.openjdk.tools.javac.processing.JavacProcessingEnvironment;
import org.openjdk.tools.javac.util.Assert;
import org.openjdk.tools.javac.util.JDK9Wrappers;
import org.openjdk.tools.javac.util.Log;
import org.openjdk.tools.javac.util.Options;
import org.openjdk.tools.javac.util.StringUtils;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'G' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class Option {
    private static final /* synthetic */ Option[] $VALUES;
    public static final Option A;
    public static final Option ADD_EXPORTS;
    public static final Option ADD_MODULES;
    public static final Option ADD_OPENS;
    public static final Option ADD_READS;
    public static final Option AT;
    public static final Option BOOT_CLASS_PATH;
    public static final Option CLASS_PATH;
    private static final String COMPACT_FORMAT = "  %-28s %s";
    public static final Option D;
    public static final Option DEBUG;
    private static final int DEFAULT_MAX_LINE_LENGTH = 80;
    private static final int DEFAULT_SYNOPSIS_WIDTH = 28;
    public static final Option DEPRECATION;
    public static final Option DIAGS;
    public static final Option DJAVA_ENDORSED_DIRS;
    public static final Option DJAVA_EXT_DIRS;
    public static final Option DOCLINT_FORMAT;
    public static final Option DOE;
    public static final Option ENCODING;
    public static final Option ENDORSEDDIRS;
    public static final Option EXTDIRS;
    public static final Option FULLVERSION;
    public static final Option G;
    public static final Option G_CUSTOM;
    public static final Option G_NONE;
    public static final Option H;
    public static final Option HELP;
    public static final Option IMPLICIT;
    public static final Option INHERIT_RUNTIME_ENVIRONMENT;
    public static final Option J;
    private static final String LARGE_INDENT = "        ";
    public static final Option LIMIT_MODULES;
    public static final Option MODULE;
    public static final Option MODULE_PATH;
    public static final Option MODULE_SOURCE_PATH;
    public static final Option MODULE_VERSION;
    public static final Option MOREINFO;
    public static final Option MULTIRELEASE;
    public static final Option NOWARN;
    public static final Option O;
    public static final Option PARAMETERS;
    public static final Option PATCH_MODULE;
    public static final Option PLUGIN;
    public static final Option PRINTSOURCE;
    public static final Option PROC;
    public static final Option PROCESSOR;
    public static final Option PROCESSOR_MODULE_PATH;
    public static final Option PROCESSOR_PATH;
    public static final Option PROFILE;
    public static final Option PROMPT;
    public static final Option RELEASE;
    public static final Option S;
    public static final Option SHOULDSTOP;
    private static final String SMALL_INDENT = "  ";
    public static final Option SOURCE;
    public static final Option SOURCEFILE;
    public static final Option SOURCE_PATH;
    public static final Option SYSTEM;
    public static final Option TARGET;
    public static final Option UPGRADE_MODULE_PATH;
    public static final Option VERBOSE;
    public static final Option VERSION;
    public static final Option WARNUNCHECKED;
    public static final Option WERROR;
    public static final Option X;
    public static final Option XBOOTCLASSPATH;
    public static final Option XBOOTCLASSPATH_APPEND;
    public static final Option XBOOTCLASSPATH_PREPEND;
    public static final Option XD;
    public static final Option XDIAGS;
    public static final Option XDOCLINT;
    public static final Option XDOCLINT_CUSTOM;
    public static final Option XDOCLINT_PACKAGE;
    public static final Option XJCOV;
    public static final Option XLINT;
    public static final Option XLINT_CUSTOM;
    public static final Option XMAXERRS;
    public static final Option XMAXWARNS;
    public static final Option XMODULE;
    public static final Option XPKGINFO;
    public static final Option XPREFER;
    public static final Option XPRINT;
    public static final Option XPRINTPROCESSORINFO;
    public static final Option XPRINTROUNDS;
    public static final Option XSTDOUT;
    public static final Option XXUSERPATHSFIRST;
    private final ArgKind argKind;
    protected final String argsNameKey;
    private final ChoiceKind choiceKind;
    private final Set<String> choices;
    protected final String descrKey;
    private final OptionGroup group;
    private final OptionKind kind;
    public final String[] names;
    public final String primaryName;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: org.openjdk.tools.javac.main.Option$14, reason: invalid class name */
    public enum AnonymousClass14 extends Option {
        public AnonymousClass14(String str, int i, String str2, String str3, String str4, OptionKind optionKind, OptionGroup optionGroup) {
            super(str, i, str2, str3, str4, optionKind, optionGroup);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Stream lambda$help$0(PlatformProvider platformProvider) {
            return StreamSupport.stream(platformProvider.getSupportedPlatformNames().spliterator(), false);
        }

        @Override // org.openjdk.tools.javac.main.Option
        public void help(Log log) {
            int i = 1;
            Set<String> set = (Set) StreamSupport.stream(ServiceLoader.load(PlatformProvider.class, Arguments.class.getClassLoader()).spliterator(), false).flatMap(new Option$7$$ExternalSyntheticLambda0(i)).collect(Collectors.toCollection(new Option$$ExternalSyntheticLambda2(i)));
            StringBuilder sb = new StringBuilder();
            String str = "";
            for (String str2 : set) {
                sb.append(str);
                sb.append(str2);
                str = ", ";
            }
            super.help(log, log.localize(Log.PrefixKind.JAVAC, this.descrKey, sb.toString()));
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: org.openjdk.tools.javac.main.Option$38, reason: invalid class name */
    public enum AnonymousClass38 extends Option {
        public AnonymousClass38(String str, int i, String str2, String str3, OptionKind optionKind, OptionGroup optionGroup) {
            super(str, i, str2, str3, optionKind, optionGroup);
        }

        private Option[] getSupportedRuntimeOptions() {
            return new Option[]{Option.ADD_EXPORTS, Option.ADD_MODULES, Option.LIMIT_MODULES, Option.MODULE_PATH, Option.UPGRADE_MODULE_PATH, Option.PATCH_MODULE};
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$process$0(String str) {
            return a$$ExternalSyntheticOutline0.m("invalid runtime option:", str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$process$1(String str) {
            return (str.isEmpty() || str.equals("ALL-DEFAULT")) ? false : true;
        }

        @Override // org.openjdk.tools.javac.main.Option
        public void process(OptionHelper optionHelper, String str) throws InvalidValueException {
            try {
                Class.forName(JDK9Wrappers.VMHelper.CLASSNAME);
                for (final String str2 : JDK9Wrappers.VMHelper.getRuntimeArguments()) {
                    Option[] supportedRuntimeOptions = getSupportedRuntimeOptions();
                    int length = supportedRuntimeOptions.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            Option option = supportedRuntimeOptions[i];
                            if (option.matches(str2)) {
                                boolean z = true;
                                if (AnonymousClass40.$SwitchMap$com$sun$tools$javac$main$Option[option.ordinal()] != 1) {
                                    option.handleOption(optionHelper, str2, Collections.emptyIterator());
                                } else {
                                    int indexOf = str2.indexOf(61);
                                    if (indexOf <= 0) {
                                        z = false;
                                    }
                                    Assert.check(z, (Supplier<String>) new Supplier() { // from class: org.openjdk.tools.javac.main.Option$38$$ExternalSyntheticLambda0
                                        @Override // java.util.function.Supplier
                                        public final Object get() {
                                            String lambda$process$0;
                                            lambda$process$0 = Option.AnonymousClass38.lambda$process$0(str2);
                                            return lambda$process$0;
                                        }
                                    });
                                    int i2 = indexOf + 1;
                                    String str3 = (String) Arrays.stream(str2.substring(i2).split(",")).filter(new Option$38$$ExternalSyntheticLambda1()).collect(Collectors.joining(","));
                                    if (!str3.isEmpty()) {
                                        option.handleOption(optionHelper, str2.substring(0, i2) + str3, Collections.emptyIterator());
                                    }
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                }
            } catch (ClassNotFoundException | SecurityException unused) {
                throw optionHelper.newInvalidValueException("err.cannot.access.runtime.env", new Object[0]);
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: org.openjdk.tools.javac.main.Option$40, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass40 {
        static final /* synthetic */ int[] $SwitchMap$com$sun$tools$javac$main$Option;

        static {
            int[] iArr = new int[Option.values().length];
            $SwitchMap$com$sun$tools$javac$main$Option = iArr;
            try {
                iArr[Option.ADD_MODULES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: org.openjdk.tools.javac.main.Option$7, reason: invalid class name */
    public enum AnonymousClass7 extends Option {
        public AnonymousClass7(String str, int i, String str2, String str3, String str4, OptionKind optionKind, OptionGroup optionGroup) {
            super(str, i, str2, str3, str4, optionKind, optionGroup);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$process$0(String str) {
            return str.substring(0, str.indexOf(61));
        }

        @Override // org.openjdk.tools.javac.main.Option
        public Pattern getPattern() {
            return Pattern.compile("([^/]+)=(,*[^,].*)");
        }

        @Override // org.openjdk.tools.javac.main.Option
        public void process(OptionHelper optionHelper, String str, String str2) throws InvalidValueException {
            if (str2.isEmpty()) {
                throw optionHelper.newInvalidValueException("err.no.value.for.option", str);
            }
            if (!getPattern().matcher(str2).matches()) {
                throw optionHelper.newInvalidValueException("err.bad.value.for.option", str, str2);
            }
            String str3 = optionHelper.get(Option.PATCH_MODULE);
            if (str3 == null) {
                super.process(optionHelper, str, str2);
                return;
            }
            String substring = str2.substring(0, str2.indexOf(61));
            if (((Set) Arrays.stream(str3.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)).map(new Option$7$$ExternalSyntheticLambda0(0)).collect(Collectors.toSet())).contains(substring)) {
                throw optionHelper.newInvalidValueException("err.repeated.value.for.patch.module", substring);
            }
            super.process(optionHelper, str, a$$ExternalSyntheticOutline0.m((char) 0, str3, str2));
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ArgKind {
        NONE,
        REQUIRED,
        ADJACENT
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ChoiceKind {
        ONEOF,
        ANYOF
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum HiddenGroup {
        DIAGS("diags"),
        DEBUG(BuildConfig.BUILD_TYPE),
        SHOULDSTOP("should-stop");

        static final Set<String> skipSet = new HashSet(Arrays.asList("--diags:", "--debug:", "--should-stop:"));
        final String text;

        HiddenGroup(String str) {
            this.text = str;
        }

        public static boolean skip(String str) {
            return skipSet.contains(str);
        }

        public void process(OptionHelper optionHelper, String str) throws InvalidValueException {
            for (String str2 : str.substring(str.indexOf(58) + 1).trim().split(";")) {
                String str3 = this.text + "." + str2.trim();
                Option.XD.process(optionHelper, str3, str3);
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum OptionGroup {
        BASIC,
        FILEMANAGER,
        INFO,
        OPERAND
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum OptionKind {
        STANDARD,
        EXTENDED,
        HIDDEN
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum PkgInfo {
        ALWAYS,
        LEGACY,
        NONEMPTY;

        public static PkgInfo get(Options options) {
            String str = options.get(Option.XPKGINFO);
            return str == null ? LEGACY : valueOf(StringUtils.toUpperCase(str));
        }
    }

    static {
        OptionKind optionKind = OptionKind.STANDARD;
        OptionGroup optionGroup = OptionGroup.BASIC;
        Option option = new Option("G", 0, "-g", "opt.g", optionKind, optionGroup);
        G = option;
        Option option2 = new Option("G_NONE", 1, "-g:none", "opt.g.none", optionKind, optionGroup) { // from class: org.openjdk.tools.javac.main.Option.1
            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str) {
                optionHelper.put("-g:", "none");
            }
        };
        G_NONE = option2;
        ChoiceKind choiceKind = ChoiceKind.ANYOF;
        Option option3 = new Option("G_CUSTOM", 2, "-g:", "opt.g.lines.vars.source", optionKind, optionGroup, choiceKind, "lines", "vars", "source");
        G_CUSTOM = option3;
        OptionKind optionKind2 = OptionKind.EXTENDED;
        Option option4 = new Option("XLINT", 3, "-Xlint", "opt.Xlint", optionKind2, optionGroup);
        XLINT = option4;
        Option option5 = new Option("XLINT_CUSTOM", 4, "-Xlint:", "opt.arg.Xlint", "opt.Xlint.custom", optionKind2, optionGroup, choiceKind, getXLintChoices()) { // from class: org.openjdk.tools.javac.main.Option.2
            private final String LINT_KEY_FORMAT = a$$ExternalSyntheticOutline0.m(20, "          %-", "s %s");

            @Override // org.openjdk.tools.javac.main.Option
            public void help(Log log) {
                super.help(log);
                log.printRawLines(Log.WriterKind.STDOUT, String.format(this.LINT_KEY_FORMAT, "all", log.localize(Log.PrefixKind.JAVAC, "opt.Xlint.all", new Object[0])));
                for (Lint.LintCategory lintCategory : Lint.LintCategory.values()) {
                    log.printRawLines(Log.WriterKind.STDOUT, String.format(this.LINT_KEY_FORMAT, lintCategory.option, log.localize(Log.PrefixKind.JAVAC, "opt.Xlint.desc." + lintCategory.option, new Object[0])));
                }
                log.printRawLines(Log.WriterKind.STDOUT, String.format(this.LINT_KEY_FORMAT, "none", log.localize(Log.PrefixKind.JAVAC, "opt.Xlint.none", new Object[0])));
            }
        };
        XLINT_CUSTOM = option5;
        Option option6 = new Option("XDOCLINT", 5, "-Xdoclint", "opt.Xdoclint", optionKind2, optionGroup);
        XDOCLINT = option6;
        Option option7 = new Option("XDOCLINT_CUSTOM", 6, "-Xdoclint:", "opt.Xdoclint.subopts", "opt.Xdoclint.custom", optionKind2, optionGroup) { // from class: org.openjdk.tools.javac.main.Option.3
            @Override // org.openjdk.tools.javac.main.Option
            public boolean matches(String str) {
                return DocLint.isValidOption(str.replace(Option.XDOCLINT_CUSTOM.primaryName, DocLint.XMSGS_CUSTOM_PREFIX));
            }

            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str) {
                Option option8 = Option.XDOCLINT_CUSTOM;
                String str2 = optionHelper.get(option8);
                if (str2 != null) {
                    str = a$$ExternalSyntheticOutline0.m$1(str2, " ", str);
                }
                optionHelper.put(option8.primaryName, str);
            }
        };
        XDOCLINT_CUSTOM = option7;
        Option option8 = new Option("XDOCLINT_PACKAGE", 7, "-Xdoclint/package:", "opt.Xdoclint.package.args", "opt.Xdoclint.package.desc", optionKind2, optionGroup) { // from class: org.openjdk.tools.javac.main.Option.4
            @Override // org.openjdk.tools.javac.main.Option
            public boolean matches(String str) {
                return DocLint.isValidOption(str.replace(Option.XDOCLINT_PACKAGE.primaryName, DocLint.XCHECK_PACKAGE));
            }

            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str) {
                Option option9 = Option.XDOCLINT_PACKAGE;
                String str2 = optionHelper.get(option9);
                if (str2 != null) {
                    str = a$$ExternalSyntheticOutline0.m$1(str2, " ", str);
                }
                optionHelper.put(option9.primaryName, str);
            }
        };
        XDOCLINT_PACKAGE = option8;
        ChoiceKind choiceKind2 = ChoiceKind.ONEOF;
        Option option9 = new Option("DOCLINT_FORMAT", 8, "--doclint-format", "opt.doclint.format", optionKind2, optionGroup, choiceKind2, "html4", "html5");
        DOCLINT_FORMAT = option9;
        Option option10 = new Option("NOWARN", 9, "-nowarn", "opt.nowarn", optionKind, optionGroup) { // from class: org.openjdk.tools.javac.main.Option.5
            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str) {
                optionHelper.put("-Xlint:none", str);
            }
        };
        NOWARN = option10;
        Option option11 = new Option("VERBOSE", 10, "-verbose", "opt.verbose", optionKind, optionGroup);
        VERBOSE = option11;
        Option option12 = new Option("DEPRECATION", 11, "-deprecation", "opt.deprecation", optionKind, optionGroup) { // from class: org.openjdk.tools.javac.main.Option.6
            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str) {
                optionHelper.put("-Xlint:deprecation", str);
            }
        };
        DEPRECATION = option12;
        OptionGroup optionGroup2 = OptionGroup.FILEMANAGER;
        Option option13 = new Option("CLASS_PATH", 12, "--class-path -classpath -cp", "opt.arg.path", "opt.classpath", optionKind, optionGroup2);
        CLASS_PATH = option13;
        Option option14 = new Option("SOURCE_PATH", 13, "--source-path -sourcepath", "opt.arg.path", "opt.sourcepath", optionKind, optionGroup2);
        SOURCE_PATH = option14;
        Option option15 = new Option("MODULE_SOURCE_PATH", 14, "--module-source-path", "opt.arg.mspath", "opt.modulesourcepath", optionKind, optionGroup2);
        MODULE_SOURCE_PATH = option15;
        Option option16 = new Option("MODULE_PATH", 15, "--module-path -p", "opt.arg.path", "opt.modulepath", optionKind, optionGroup2);
        MODULE_PATH = option16;
        Option option17 = new Option("UPGRADE_MODULE_PATH", 16, "--upgrade-module-path", "opt.arg.path", "opt.upgrademodulepath", optionKind, optionGroup2);
        UPGRADE_MODULE_PATH = option17;
        Option option18 = new Option("SYSTEM", 17, "--system", "opt.arg.jdk", "opt.system", optionKind, optionGroup2);
        SYSTEM = option18;
        AnonymousClass7 anonymousClass7 = new AnonymousClass7("PATCH_MODULE", 18, "--patch-module", "opt.arg.patch", "opt.patch", optionKind2, optionGroup2);
        PATCH_MODULE = anonymousClass7;
        Option option19 = new Option("BOOT_CLASS_PATH", 19, "--boot-class-path -bootclasspath", "opt.arg.path", "opt.bootclasspath", optionKind, optionGroup2) { // from class: org.openjdk.tools.javac.main.Option.8
            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str, String str2) throws InvalidValueException {
                optionHelper.remove("-Xbootclasspath/p:");
                optionHelper.remove("-Xbootclasspath/a:");
                super.process(optionHelper, str, str2);
            }
        };
        BOOT_CLASS_PATH = option19;
        Option option20 = new Option("XBOOTCLASSPATH_PREPEND", 20, "-Xbootclasspath/p:", "opt.arg.path", "opt.Xbootclasspath.p", optionKind2, optionGroup2);
        XBOOTCLASSPATH_PREPEND = option20;
        Option option21 = new Option("XBOOTCLASSPATH_APPEND", 21, "-Xbootclasspath/a:", "opt.arg.path", "opt.Xbootclasspath.a", optionKind2, optionGroup2);
        XBOOTCLASSPATH_APPEND = option21;
        Option option22 = new Option("XBOOTCLASSPATH", 22, "-Xbootclasspath:", "opt.arg.path", "opt.bootclasspath", optionKind2, optionGroup2) { // from class: org.openjdk.tools.javac.main.Option.9
            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str, String str2) throws InvalidValueException {
                optionHelper.remove("-Xbootclasspath/p:");
                optionHelper.remove("-Xbootclasspath/a:");
                super.process(optionHelper, "-bootclasspath", str2);
            }
        };
        XBOOTCLASSPATH = option22;
        Option option23 = new Option("EXTDIRS", 23, "-extdirs", "opt.arg.dirs", "opt.extdirs", optionKind, optionGroup2);
        EXTDIRS = option23;
        Option option24 = new Option("DJAVA_EXT_DIRS", 24, "-Djava.ext.dirs=", "opt.arg.dirs", "opt.extdirs", optionKind2, optionGroup2) { // from class: org.openjdk.tools.javac.main.Option.10
            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str, String str2) throws InvalidValueException {
                Option.EXTDIRS.process(optionHelper, "-extdirs", str2);
            }
        };
        DJAVA_EXT_DIRS = option24;
        Option option25 = new Option("ENDORSEDDIRS", 25, "-endorseddirs", "opt.arg.dirs", "opt.endorseddirs", optionKind, optionGroup2);
        ENDORSEDDIRS = option25;
        Option option26 = new Option("DJAVA_ENDORSED_DIRS", 26, "-Djava.endorsed.dirs=", "opt.arg.dirs", "opt.endorseddirs", optionKind2, optionGroup2) { // from class: org.openjdk.tools.javac.main.Option.11
            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str, String str2) throws InvalidValueException {
                Option.ENDORSEDDIRS.process(optionHelper, "-endorseddirs", str2);
            }
        };
        DJAVA_ENDORSED_DIRS = option26;
        Option option27 = new Option("PROC", 27, "-proc:", "opt.proc.none.only", optionKind, optionGroup, choiceKind2, "none", "only");
        PROC = option27;
        Option option28 = new Option("PROCESSOR", 28, "-processor", "opt.arg.class.list", "opt.processor", optionKind, optionGroup);
        PROCESSOR = option28;
        Option option29 = new Option("PROCESSOR_PATH", 29, "--processor-path -processorpath", "opt.arg.path", "opt.processorpath", optionKind, optionGroup2);
        PROCESSOR_PATH = option29;
        Option option30 = new Option("PROCESSOR_MODULE_PATH", 30, "--processor-module-path", "opt.arg.path", "opt.processormodulepath", optionKind, optionGroup2);
        PROCESSOR_MODULE_PATH = option30;
        Option option31 = new Option("PARAMETERS", 31, "-parameters", "opt.parameters", optionKind, optionGroup);
        PARAMETERS = option31;
        Option option32 = new Option("D", 32, "-d", "opt.arg.directory", "opt.d", optionKind, optionGroup2);
        D = option32;
        Option option33 = new Option(ExifInterface.LATITUDE_SOUTH, 33, "-s", "opt.arg.directory", "opt.sourceDest", optionKind, optionGroup2);
        S = option33;
        Option option34 = new Option("H", 34, "-h", "opt.arg.directory", "opt.headerDest", optionKind, optionGroup2);
        H = option34;
        Option option35 = new Option("IMPLICIT", 35, "-implicit:", "opt.implicit", optionKind, optionGroup, choiceKind2, "none", RoadProbe.CLASS_PROPERTY);
        IMPLICIT = option35;
        Option option36 = new Option("ENCODING", 36, "-encoding", "opt.arg.encoding", "opt.encoding", optionKind, optionGroup2);
        ENCODING = option36;
        Option option37 = new Option(NodeType.SOURCE, 37, "-source", "opt.arg.release", "opt.source", optionKind, optionGroup) { // from class: org.openjdk.tools.javac.main.Option.12
            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str, String str2) throws InvalidValueException {
                if (Source.lookup(str2) == null) {
                    throw optionHelper.newInvalidValueException("err.invalid.source", str2);
                }
                super.process(optionHelper, str, str2);
            }
        };
        SOURCE = option37;
        Option option38 = new Option("TARGET", 38, "-target", "opt.arg.release", "opt.target", optionKind, optionGroup) { // from class: org.openjdk.tools.javac.main.Option.13
            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str, String str2) throws InvalidValueException {
                if (Target.lookup(str2) == null) {
                    throw optionHelper.newInvalidValueException("err.invalid.target", str2);
                }
                super.process(optionHelper, str, str2);
            }
        };
        TARGET = option38;
        AnonymousClass14 anonymousClass14 = new AnonymousClass14("RELEASE", 39, "--release", "opt.arg.release", "opt.release", optionKind, optionGroup);
        RELEASE = anonymousClass14;
        Option option39 = new Option("PROFILE", 40, "-profile", "opt.arg.profile", "opt.profile", optionKind, optionGroup) { // from class: org.openjdk.tools.javac.main.Option.15
            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str, String str2) throws InvalidValueException {
                if (Profile.lookup(str2) == null) {
                    throw optionHelper.newInvalidValueException("err.invalid.profile", str2);
                }
                super.process(optionHelper, str, str2);
            }
        };
        PROFILE = option39;
        OptionGroup optionGroup3 = OptionGroup.INFO;
        Option option40 = new Option("VERSION", 41, "--version -version", "opt.version", optionKind, optionGroup3) { // from class: org.openjdk.tools.javac.main.Option.16
            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str) throws InvalidValueException {
                optionHelper.getLog().printLines(Log.WriterKind.STDOUT, Log.PrefixKind.JAVAC, "version", optionHelper.getOwnName(), JavaCompiler.version());
                super.process(optionHelper, str);
            }
        };
        VERSION = option40;
        OptionKind optionKind3 = OptionKind.HIDDEN;
        String str = null;
        Option option41 = new Option("FULLVERSION", 42, "--full-version -fullversion", str, optionKind3, optionGroup3) { // from class: org.openjdk.tools.javac.main.Option.17
            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str2) throws InvalidValueException {
                optionHelper.getLog().printLines(Log.WriterKind.STDOUT, Log.PrefixKind.JAVAC, "fullVersion", optionHelper.getOwnName(), JavaCompiler.fullVersion());
                super.process(optionHelper, str2);
            }
        };
        FULLVERSION = option41;
        Option option42 = new Option("HELP", 43, "--help -help", "opt.help", optionKind, optionGroup3) { // from class: org.openjdk.tools.javac.main.Option.18
            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str2) throws InvalidValueException {
                Log log = optionHelper.getLog();
                String ownName = optionHelper.getOwnName();
                Log.WriterKind writerKind = Log.WriterKind.STDOUT;
                log.printLines(writerKind, Log.PrefixKind.JAVAC, "msg.usage.header", ownName);
                Option.showHelp(log, OptionKind.STANDARD);
                log.printNewline(writerKind);
                super.process(optionHelper, str2);
            }
        };
        HELP = option42;
        ArgKind argKind = ArgKind.ADJACENT;
        Option option43 = new Option(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, 44, "-A", "opt.arg.key.equals.value", "opt.A", optionKind, optionGroup, argKind) { // from class: org.openjdk.tools.javac.main.Option.19
            @Override // org.openjdk.tools.javac.main.Option
            public boolean hasArg() {
                return false;
            }

            @Override // org.openjdk.tools.javac.main.Option
            public boolean matches(String str2) {
                return str2.startsWith("-A");
            }

            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str2) throws InvalidValueException {
                int length = str2.length();
                if (length == 2) {
                    throw optionHelper.newInvalidValueException("err.empty.A.argument", new Object[0]);
                }
                int indexOf = str2.indexOf(61);
                if (indexOf != -1) {
                    length = indexOf;
                }
                if (!JavacProcessingEnvironment.isValidOptionName(str2.substring(2, length))) {
                    throw optionHelper.newInvalidValueException("err.invalid.A.key", str2);
                }
                optionHelper.put(str2, str2);
            }
        };
        A = option43;
        Option option44 = new Option("X", 45, "--help-extra -X", "opt.X", optionKind, optionGroup3) { // from class: org.openjdk.tools.javac.main.Option.20
            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str2) throws InvalidValueException {
                Log log = optionHelper.getLog();
                Option.showHelp(log, OptionKind.EXTENDED);
                Log.WriterKind writerKind = Log.WriterKind.STDOUT;
                log.printNewline(writerKind);
                log.printLines(writerKind, Log.PrefixKind.JAVAC, "msg.usage.nonstandard.footer", new Object[0]);
                super.process(optionHelper, str2);
            }
        };
        X = option44;
        Option option45 = new Option("J", 46, "-J", "opt.arg.flag", "opt.J", optionKind, optionGroup3, argKind) { // from class: org.openjdk.tools.javac.main.Option.21
            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str2) {
                throw new AssertionError("the -J flag should be caught by the launcher.");
            }
        };
        J = option45;
        String str2 = null;
        Option option46 = new Option("MOREINFO", 47, "-moreinfo", str2, optionKind3, optionGroup) { // from class: org.openjdk.tools.javac.main.Option.22
            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str3) throws InvalidValueException {
                Type.moreInfo = true;
                super.process(optionHelper, str3);
            }
        };
        MOREINFO = option46;
        Option option47 = new Option("WERROR", 48, "-Werror", "opt.Werror", optionKind, optionGroup);
        WERROR = option47;
        Option option48 = new Option("PROMPT", 49, "-prompt", null, optionKind3, optionGroup);
        PROMPT = option48;
        Option option49 = new Option("DOE", 50, "-doe", null, optionKind3, optionGroup);
        DOE = option49;
        Option option50 = new Option("PRINTSOURCE", 51, "-printsource", null, optionKind3, optionGroup);
        PRINTSOURCE = option50;
        Option option51 = new Option("WARNUNCHECKED", 52, "-warnunchecked", str2, optionKind3, optionGroup) { // from class: org.openjdk.tools.javac.main.Option.23
            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str3) {
                optionHelper.put("-Xlint:unchecked", str3);
            }
        };
        WARNUNCHECKED = option51;
        Option option52 = new Option("XMAXERRS", 53, "-Xmaxerrs", "opt.arg.number", "opt.maxerrs", optionKind2, optionGroup);
        XMAXERRS = option52;
        Option option53 = new Option("XMAXWARNS", 54, "-Xmaxwarns", "opt.arg.number", "opt.maxwarns", optionKind2, optionGroup);
        XMAXWARNS = option53;
        Option option54 = new Option("XSTDOUT", 55, "-Xstdout", "opt.arg.file", "opt.Xstdout", optionKind2, optionGroup3) { // from class: org.openjdk.tools.javac.main.Option.24
            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str3, String str4) throws InvalidValueException {
                try {
                    optionHelper.getLog().setWriters(new PrintWriter((Writer) new FileWriter(str4), true));
                    super.process(optionHelper, str3, str4);
                } catch (IOException e) {
                    throw optionHelper.newInvalidValueException("err.error.writing.file", str4, e);
                }
            }
        };
        XSTDOUT = option54;
        Option option55 = new Option("XPRINT", 56, "-Xprint", "opt.print", optionKind2, optionGroup);
        XPRINT = option55;
        Option option56 = new Option("XPRINTROUNDS", 57, "-XprintRounds", "opt.printRounds", optionKind2, optionGroup);
        XPRINTROUNDS = option56;
        Option option57 = new Option("XPRINTPROCESSORINFO", 58, "-XprintProcessorInfo", "opt.printProcessorInfo", optionKind2, optionGroup);
        XPRINTPROCESSORINFO = option57;
        Option option58 = new Option("XPREFER", 59, "-Xprefer:", "opt.prefer", optionKind2, optionGroup, choiceKind2, "source", "newer");
        XPREFER = option58;
        Option option59 = new Option("XXUSERPATHSFIRST", 60, "-XXuserPathsFirst", "opt.userpathsfirst", optionKind3, optionGroup);
        XXUSERPATHSFIRST = option59;
        Option option60 = new Option("XPKGINFO", 61, "-Xpkginfo:", "opt.pkginfo", optionKind2, optionGroup, choiceKind2, "always", "legacy", "nonempty");
        XPKGINFO = option60;
        Option option61 = new Option("O", 62, "-O", null, optionKind3, optionGroup);
        O = option61;
        Option option62 = new Option("XJCOV", 63, "-Xjcov", null, optionKind3, optionGroup);
        XJCOV = option62;
        Option option63 = new Option("PLUGIN", 64, "-Xplugin:", "opt.arg.plugin", "opt.plugin", optionKind2, optionGroup) { // from class: org.openjdk.tools.javac.main.Option.25
            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str3) {
                String trim = str3.substring(str3.indexOf(58) + 1).trim();
                Option option64 = Option.PLUGIN;
                String str4 = optionHelper.get(option64);
                String str5 = option64.primaryName;
                if (str4 != null) {
                    trim = a$$ExternalSyntheticOutline0.m((char) 0, str4, trim);
                }
                optionHelper.put(str5, trim);
            }
        };
        PLUGIN = option63;
        Option option64 = new Option("XDIAGS", 65, "-Xdiags:", "opt.diags", optionKind2, optionGroup, choiceKind2, "compact", "verbose");
        XDIAGS = option64;
        String str3 = null;
        Option option65 = new Option("DEBUG", 66, "--debug:", str3, optionKind3, optionGroup) { // from class: org.openjdk.tools.javac.main.Option.26
            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str4) throws InvalidValueException {
                HiddenGroup.DEBUG.process(optionHelper, str4);
            }
        };
        DEBUG = option65;
        Option option66 = new Option("SHOULDSTOP", 67, "--should-stop:", str3, optionKind3, optionGroup) { // from class: org.openjdk.tools.javac.main.Option.27
            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str4) throws InvalidValueException {
                HiddenGroup.SHOULDSTOP.process(optionHelper, str4);
            }
        };
        SHOULDSTOP = option66;
        Option option67 = new Option("DIAGS", 68, "--diags:", str3, optionKind3, optionGroup) { // from class: org.openjdk.tools.javac.main.Option.28
            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str4) throws InvalidValueException {
                HiddenGroup.DIAGS.process(optionHelper, str4);
            }
        };
        DIAGS = option67;
        Option option68 = new Option("XD", 69, "-XD", str3, optionKind3, optionGroup) { // from class: org.openjdk.tools.javac.main.Option.29
            @Override // org.openjdk.tools.javac.main.Option
            public boolean matches(String str4) {
                return str4.startsWith(this.primaryName);
            }

            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str4, String str5) {
                int indexOf = str5.indexOf(61);
                String substring = indexOf < 0 ? str5 : str5.substring(0, indexOf);
                if (indexOf >= 0) {
                    str5 = str5.substring(indexOf + 1);
                }
                optionHelper.put(substring, str5);
            }

            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str4) {
                process(optionHelper, str4, str4.substring(this.primaryName.length()));
            }
        };
        XD = option68;
        Option option69 = new Option("ADD_EXPORTS", 70, "--add-exports", "opt.arg.addExports", "opt.addExports", optionKind2, optionGroup) { // from class: org.openjdk.tools.javac.main.Option.30
            @Override // org.openjdk.tools.javac.main.Option
            public Pattern getPattern() {
                return Pattern.compile("([^/]+)/([^=]+)=(,*[^,].*)");
            }

            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str4, String str5) throws InvalidValueException {
                if (str5.isEmpty()) {
                    throw optionHelper.newInvalidValueException("err.no.value.for.option", str4);
                }
                if (!getPattern().matcher(str5).matches()) {
                    throw optionHelper.newInvalidValueException("err.bad.value.for.option", str4, str5);
                }
                Option option70 = Option.ADD_EXPORTS;
                String str6 = optionHelper.get(option70);
                String str7 = option70.primaryName;
                if (str6 != null) {
                    str5 = a$$ExternalSyntheticOutline0.m((char) 0, str6, str5);
                }
                optionHelper.put(str7, str5);
            }
        };
        ADD_EXPORTS = option69;
        Option option70 = new Option("ADD_OPENS", 71, "--add-opens", (String) null, (String) null, optionKind3, optionGroup);
        ADD_OPENS = option70;
        Option option71 = new Option("ADD_READS", 72, "--add-reads", "opt.arg.addReads", "opt.addReads", optionKind2, optionGroup) { // from class: org.openjdk.tools.javac.main.Option.31
            @Override // org.openjdk.tools.javac.main.Option
            public Pattern getPattern() {
                return Pattern.compile("([^=]+)=(,*[^,].*)");
            }

            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str4, String str5) throws InvalidValueException {
                if (str5.isEmpty()) {
                    throw optionHelper.newInvalidValueException("err.no.value.for.option", str4);
                }
                if (!getPattern().matcher(str5).matches()) {
                    throw optionHelper.newInvalidValueException("err.bad.value.for.option", str4, str5);
                }
                Option option72 = Option.ADD_READS;
                String str6 = optionHelper.get(option72);
                String str7 = option72.primaryName;
                if (str6 != null) {
                    str5 = a$$ExternalSyntheticOutline0.m((char) 0, str6, str5);
                }
                optionHelper.put(str7, str5);
            }
        };
        ADD_READS = option71;
        Option option72 = new Option("XMODULE", 73, "-Xmodule:", "opt.arg.module", "opt.module", optionKind3, optionGroup) { // from class: org.openjdk.tools.javac.main.Option.32
            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str4, String str5) throws InvalidValueException {
                Option option73 = Option.XMODULE;
                if (optionHelper.get(option73) != null) {
                    throw optionHelper.newInvalidValueException("err.option.too.many", option73.primaryName);
                }
                optionHelper.put(option73.primaryName, str5);
            }
        };
        XMODULE = option72;
        Option option73 = new Option("MODULE", 74, "--module -m", "opt.arg.m", "opt.m", optionKind, optionGroup);
        MODULE = option73;
        Option option74 = new Option("ADD_MODULES", 75, "--add-modules", "opt.arg.addmods", "opt.addmods", optionKind, optionGroup) { // from class: org.openjdk.tools.javac.main.Option.33
            @Override // org.openjdk.tools.javac.main.Option
            public Pattern getPattern() {
                return Pattern.compile(",*[^,].*");
            }

            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str4, String str5) throws InvalidValueException {
                if (str5.isEmpty()) {
                    throw optionHelper.newInvalidValueException("err.no.value.for.option", str4);
                }
                if (!getPattern().matcher(str5).matches()) {
                    throw optionHelper.newInvalidValueException("err.bad.value.for.option", str4, str5);
                }
                Option option75 = Option.ADD_MODULES;
                String str6 = optionHelper.get(option75);
                String str7 = option75.primaryName;
                if (str6 != null) {
                    str5 = a$$ExternalSyntheticOutline0.m(AbstractJsonLexerKt.COMMA, str6, str5);
                }
                optionHelper.put(str7, str5);
            }
        };
        ADD_MODULES = option74;
        Option option75 = new Option("LIMIT_MODULES", 76, "--limit-modules", "opt.arg.limitmods", "opt.limitmods", optionKind, optionGroup) { // from class: org.openjdk.tools.javac.main.Option.34
            @Override // org.openjdk.tools.javac.main.Option
            public Pattern getPattern() {
                return Pattern.compile(",*[^,].*");
            }

            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str4, String str5) throws InvalidValueException {
                if (str5.isEmpty()) {
                    throw optionHelper.newInvalidValueException("err.no.value.for.option", str4);
                }
                if (!getPattern().matcher(str5).matches()) {
                    throw optionHelper.newInvalidValueException("err.bad.value.for.option", str4, str5);
                }
                optionHelper.put(Option.LIMIT_MODULES.primaryName, str5);
            }
        };
        LIMIT_MODULES = option75;
        Option option76 = new Option("MODULE_VERSION", 77, "--module-version", "opt.arg.module.version", "opt.module.version", optionKind, optionGroup) { // from class: org.openjdk.tools.javac.main.Option.35
            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str4, String str5) throws InvalidValueException {
                if (str5.isEmpty()) {
                    throw optionHelper.newInvalidValueException("err.no.value.for.option", str4);
                }
                try {
                    Class.forName(JDK9Wrappers.ModuleDescriptor.Version.CLASSNAME);
                    try {
                        JDK9Wrappers.ModuleDescriptor.Version.parse(str5);
                    } catch (IllegalArgumentException unused) {
                        throw optionHelper.newInvalidValueException("err.bad.value.for.option", str4, str5);
                    }
                } catch (ClassNotFoundException unused2) {
                    if (str5.charAt(0) < '0' || str5.charAt(0) > '9' || str5.endsWith("-") || str5.endsWith("+")) {
                        throw optionHelper.newInvalidValueException("err.bad.value.for.option", str4, str5);
                    }
                }
                super.process(optionHelper, str4, str5);
            }
        };
        MODULE_VERSION = option76;
        Option option77 = new Option("AT", 78, "@", "opt.arg.file", "opt.AT", optionKind, optionGroup3, argKind) { // from class: org.openjdk.tools.javac.main.Option.36
            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str4) {
                throw new AssertionError("the @ flag should be caught by CommandLine.");
            }
        };
        AT = option77;
        Option option78 = new Option("SOURCEFILE", 79, "sourcefile", str, optionKind3, optionGroup3) { // from class: org.openjdk.tools.javac.main.Option.37
            @Override // org.openjdk.tools.javac.main.Option
            public boolean matches(String str4) {
                if (str4.endsWith(".java")) {
                    return true;
                }
                int indexOf = str4.indexOf(47);
                return indexOf != -1 ? SourceVersion.isName(str4.substring(0, indexOf)) && SourceVersion.isName(str4.substring(indexOf + 1)) : SourceVersion.isName(str4);
            }

            @Override // org.openjdk.tools.javac.main.Option
            public void process(OptionHelper optionHelper, String str4) throws InvalidValueException {
                if (!str4.endsWith(".java")) {
                    optionHelper.addClassName(str4);
                    return;
                }
                Path path = Paths.get(str4, new String[0]);
                if (!Files.exists(path, new LinkOption[0])) {
                    throw optionHelper.newInvalidValueException("err.file.not.found", path);
                }
                if (!Files.isRegularFile(path, new LinkOption[0])) {
                    throw optionHelper.newInvalidValueException("err.file.not.file", path);
                }
                optionHelper.addFile(path);
            }
        };
        SOURCEFILE = option78;
        Option option79 = new Option("MULTIRELEASE", 80, "--multi-release", "opt.arg.multi-release", "opt.multi-release", optionKind3, optionGroup2);
        MULTIRELEASE = option79;
        AnonymousClass38 anonymousClass38 = new AnonymousClass38("INHERIT_RUNTIME_ENVIRONMENT", 81, "--inherit-runtime-environment", "opt.inherit_runtime_environment", optionKind3, optionGroup);
        INHERIT_RUNTIME_ENVIRONMENT = anonymousClass38;
        $VALUES = new Option[]{option, option2, option3, option4, option5, option6, option7, option8, option9, option10, option11, option12, option13, option14, option15, option16, option17, option18, anonymousClass7, option19, option20, option21, option22, option23, option24, option25, option26, option27, option28, option29, option30, option31, option32, option33, option34, option35, option36, option37, option38, anonymousClass14, option39, option40, option41, option42, option43, option44, option45, option46, option47, option48, option49, option50, option51, option52, option53, option54, option55, option56, option57, option58, option59, option60, option61, option62, option63, option64, option65, option66, option67, option68, option69, option70, option71, option72, option73, option74, option75, option76, option77, option78, option79, anonymousClass38};
    }

    private Option(String str, int i, String str2, String str3, String str4, OptionKind optionKind, OptionGroup optionGroup, ChoiceKind choiceKind, Set set, ArgKind argKind) {
        String[] split = str2.trim().split("\\s+");
        this.names = split;
        Assert.check(split.length >= 1);
        this.primaryName = split[0];
        this.argsNameKey = str3;
        this.descrKey = str4;
        this.kind = optionKind;
        this.group = optionGroup;
        this.choiceKind = choiceKind;
        this.choices = set;
        this.argKind = argKind;
    }

    private static int findSeparator(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == ':' || charAt == '=') {
                return i;
            }
        }
        return -1;
    }

    public static Set<Option> getJavaCompilerOptions() {
        return EnumSet.allOf(Option.class);
    }

    public static Set<Option> getJavacFileManagerOptions() {
        return getOptions(OptionGroup.FILEMANAGER);
    }

    public static Set<Option> getJavacToolOptions() {
        return getOptions(OptionGroup.BASIC);
    }

    private static Set<Option> getOptions(OptionGroup optionGroup) {
        return (Set) Arrays.stream(values()).filter(new Option$$ExternalSyntheticLambda1(optionGroup, 0)).collect(Collectors.toCollection(new Option$$ExternalSyntheticLambda2(0)));
    }

    private static Set<String> getXLintChoices() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("all");
        for (Lint.LintCategory lintCategory : Lint.LintCategory.values()) {
            linkedHashSet.add(lintCategory.option);
            linkedHashSet.add("-" + lintCategory.option);
        }
        linkedHashSet.add("none");
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: helpSynopsis, reason: merged with bridge method [inline-methods] */
    public String lambda$help$2(String str, Log log) {
        StringBuilder m = BitVector$$ExternalSyntheticOutline0.m(str);
        if (this.argsNameKey != null) {
            if (!str.matches(".*[=:]$") && this.argKind != ArgKind.ADJACENT) {
                m.append(" ");
            }
            m.append(log.localize(Log.PrefixKind.JAVAC, this.argsNameKey, new Object[0]));
        } else if (this.choices != null) {
            if (!str.endsWith(":")) {
                m.append(" ");
            }
            String str2 = "{";
            for (String str3 : this.choices) {
                m.append(str2);
                m.append(str3);
                str2 = ",";
            }
            m.append(StringSubstitutor.DEFAULT_VAR_END);
        }
        return m.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getOptions$3(OptionGroup optionGroup, Option option) {
        return option.group == optionGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ EnumSet lambda$getOptions$4() {
        return EnumSet.noneOf(Option.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$showHelp$0(OptionKind optionKind, Option option) {
        return option.kind == optionKind;
    }

    public static Option lookup(String str, Set<Option> set) {
        for (Option option : set) {
            if (option.matches(str)) {
                return option;
            }
        }
        return null;
    }

    private boolean matches(String str, String str2) {
        if (str2.startsWith("--") && !HiddenGroup.skip(str2)) {
            return str.equals(str2) || (hasArg() && str.startsWith(str2.concat("=")));
        }
        if (this.argKind != ArgKind.ADJACENT && !str2.endsWith(":") && !str2.endsWith("=")) {
            return str.equals(str2);
        }
        if (!str.startsWith(str2)) {
            return false;
        }
        if (this.choices != null) {
            String substring = str.substring(str2.length());
            if (this.choiceKind == ChoiceKind.ONEOF) {
                return this.choices.contains(substring);
            }
            for (String str3 : substring.split(",+")) {
                if (!this.choices.contains(str3)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void showHelp(Log log, OptionKind optionKind) {
        getJavaCompilerOptions().stream().filter(new Option$$ExternalSyntheticLambda1(optionKind, 2)).sorted(new Comparator<Option>() { // from class: org.openjdk.tools.javac.main.Option.39
            final Collator collator;

            {
                Collator collator = Collator.getInstance(Locale.US);
                this.collator = collator;
                collator.setStrength(0);
            }

            @Override // java.util.Comparator
            public int compare(Option option, Option option2) {
                return this.collator.compare(option.primaryName, option2.primaryName);
            }
        }).forEach(new Option$$ExternalSyntheticLambda4(log, 0));
    }

    public static Option valueOf(String str) {
        return (Option) Enum.valueOf(Option.class, str);
    }

    public static Option[] values() {
        return (Option[]) $VALUES.clone();
    }

    public ArgKind getArgKind() {
        return this.argKind;
    }

    public OptionKind getKind() {
        return this.kind;
    }

    public Pattern getPattern() {
        throw new UnsupportedOperationException();
    }

    public String getPrimaryName() {
        return this.primaryName;
    }

    public void handleOption(OptionHelper optionHelper, String str, Iterator<String> it2) throws InvalidValueException {
        String next;
        String substring;
        String substring2;
        if (!hasArg()) {
            process(optionHelper, str);
            return;
        }
        int findSeparator = findSeparator(str);
        if (getArgKind() == ArgKind.ADJACENT) {
            substring = this.primaryName;
            substring2 = str.substring(substring.length());
        } else {
            if (findSeparator <= 0) {
                if (!it2.hasNext()) {
                    throw optionHelper.newInvalidValueException("err.req.arg", str);
                }
                next = it2.next();
                process(optionHelper, str, next);
            }
            substring = str.substring(0, findSeparator);
            substring2 = str.substring(findSeparator + 1);
        }
        String str2 = substring;
        next = substring2;
        str = str2;
        process(optionHelper, str, next);
    }

    public boolean hasArg() {
        return this.argKind != ArgKind.NONE;
    }

    public void help(final Log log, String str) {
        String str2 = (String) Arrays.stream(this.names).map(new Function() { // from class: org.openjdk.tools.javac.main.Option$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String lambda$help$2;
                lambda$help$2 = this.lambda$help$2(log, (String) obj);
                return lambda$help$2;
            }
        }).collect(Collectors.joining(", "));
        if (str2.length() < 28 && !str.contains("\n") && str.length() + 31 <= 80) {
            log.printRawLines(Log.WriterKind.STDOUT, String.format(COMPACT_FORMAT, str2, str));
            return;
        }
        if (str2.length() <= 80) {
            log.printRawLines(Log.WriterKind.STDOUT, "  ".concat(str2));
        } else {
            for (String str3 : this.names) {
                log.printRawLines(Log.WriterKind.STDOUT, "  " + lambda$help$2(str3, log));
            }
        }
        log.printRawLines(Log.WriterKind.STDOUT, "        " + str.replace("\n", "\n        "));
    }

    public void process(OptionHelper optionHelper, String str, String str2) throws InvalidValueException {
        Set<String> set = this.choices;
        if (set != null) {
            if (this.choiceKind == ChoiceKind.ONEOF) {
                Iterator<String> it2 = set.iterator();
                while (it2.hasNext()) {
                    optionHelper.remove(this.primaryName + it2.next());
                }
                String str3 = this.primaryName + str2;
                optionHelper.put(str3, str3);
                optionHelper.put(this.primaryName.substring(0, r7.length() - 1), str2);
            } else {
                for (String str4 : str2.split(",+")) {
                    String str5 = this.primaryName + str4;
                    optionHelper.put(str5, str5);
                }
            }
        }
        optionHelper.put(this.primaryName, str2);
        if (this.group == OptionGroup.FILEMANAGER) {
            optionHelper.handleFileManagerOption(this, str2);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class InvalidValueException extends Exception {
        private static final long serialVersionUID = -1;

        public InvalidValueException(String str) {
            super(str);
        }

        public InvalidValueException(String str, Throwable th) {
            super(str, th);
        }
    }

    public static Option lookup(String str) {
        return lookup(str, EnumSet.allOf(Option.class));
    }

    private Option(String str, int i, String str2, String str3, OptionKind optionKind, OptionGroup optionGroup) {
        this(str, i, str2, (String) null, str3, optionKind, optionGroup, (ChoiceKind) null, (Set) null, ArgKind.NONE);
    }

    private Option(String str, int i, String str2, String str3, String str4, OptionKind optionKind, OptionGroup optionGroup) {
        this(str, i, str2, str3, str4, optionKind, optionGroup, (ChoiceKind) null, (Set) null, ArgKind.REQUIRED);
    }

    private Option(String str, int i, String str2, String str3, String str4, OptionKind optionKind, OptionGroup optionGroup, ArgKind argKind) {
        this(str, i, str2, str3, str4, optionKind, optionGroup, (ChoiceKind) null, (Set) null, argKind);
    }

    private Option(String str, int i, String str2, String str3, String str4, OptionKind optionKind, OptionGroup optionGroup, ChoiceKind choiceKind, Set set) {
        this(str, i, str2, str3, str4, optionKind, optionGroup, choiceKind, set, ArgKind.REQUIRED);
    }

    private Option(String str, int i, String str2, String str3, OptionKind optionKind, OptionGroup optionGroup, ChoiceKind choiceKind, String... strArr) {
        this(str, i, str2, (String) null, str3, optionKind, optionGroup, choiceKind, new LinkedHashSet(Arrays.asList(strArr)), ArgKind.REQUIRED);
    }

    public boolean matches(String str) {
        for (String str2 : this.names) {
            if (matches(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public void process(OptionHelper optionHelper, String str) throws InvalidValueException {
        if (this.argKind == ArgKind.NONE) {
            process(optionHelper, this.primaryName, str);
        } else {
            process(optionHelper, this.primaryName, str.substring(findSeparator(str) + 1));
        }
    }

    public void help(Log log) {
        help(log, log.localize(Log.PrefixKind.JAVAC, this.descrKey, new Object[0]));
    }
}
