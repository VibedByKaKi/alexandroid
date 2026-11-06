package org.openjdk.tools.sjavac.options;

import com.amazon.alexa.mobilytics.event.LogLevel;
import com.amazon.leapfrogmapgl.indoor.RoadProbe;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openjdk.tools.sjavac.CopyFile;
import org.openjdk.tools.sjavac.Transformer;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public enum Option {
    SRC("-src", "Location of source files to be compiled") { // from class: org.openjdk.tools.sjavac.options.Option.1
        @Override // org.openjdk.tools.sjavac.options.Option
        public void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
            List<Path> fileListArg = getFileListArg(argumentIterator, optionHelper);
            if (fileListArg != null) {
                optionHelper.sourceRoots(fileListArg);
            }
        }
    },
    SOURCE_PATH("--source-path", "Specify search path for sources.") { // from class: org.openjdk.tools.sjavac.options.Option.2
        @Override // org.openjdk.tools.sjavac.options.Option
        public void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
            List<Path> fileListArg = getFileListArg(argumentIterator, optionHelper);
            if (fileListArg != null) {
                optionHelper.sourcepath(fileListArg);
            }
        }
    },
    SOURCEPATH("-sourcepath", "An alias for -sourcepath") { // from class: org.openjdk.tools.sjavac.options.Option.3
        @Override // org.openjdk.tools.sjavac.options.Option
        public void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
            Option.SOURCE_PATH.processMatching(argumentIterator, optionHelper);
        }
    },
    MODULE_PATH("--module-path", "Specify search path for modules.") { // from class: org.openjdk.tools.sjavac.options.Option.4
        @Override // org.openjdk.tools.sjavac.options.Option
        public void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
            List<Path> fileListArg = getFileListArg(argumentIterator, optionHelper);
            if (fileListArg != null) {
                optionHelper.modulepath(fileListArg);
            }
        }
    },
    P("-p", "An alias for --module-path") { // from class: org.openjdk.tools.sjavac.options.Option.5
        @Override // org.openjdk.tools.sjavac.options.Option
        public void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
            Option.MODULE_PATH.processMatching(argumentIterator, optionHelper);
        }
    },
    CLASS_PATH("--class-path", "Specify search path for classes.") { // from class: org.openjdk.tools.sjavac.options.Option.6
        @Override // org.openjdk.tools.sjavac.options.Option
        public void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
            List<Path> fileListArg = getFileListArg(argumentIterator, optionHelper);
            if (fileListArg != null) {
                optionHelper.classpath(fileListArg);
            }
        }
    },
    CLASSPATH("-classpath", "An alias for -classpath.") { // from class: org.openjdk.tools.sjavac.options.Option.7
        @Override // org.openjdk.tools.sjavac.options.Option
        public void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
            Option.CLASS_PATH.processMatching(argumentIterator, optionHelper);
        }
    },
    CP("-cp", "An alias for -classpath") { // from class: org.openjdk.tools.sjavac.options.Option.8
        @Override // org.openjdk.tools.sjavac.options.Option
        public void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
            Option.CLASS_PATH.processMatching(argumentIterator, optionHelper);
        }
    },
    X("-x", "Exclude files matching the given pattern") { // from class: org.openjdk.tools.sjavac.options.Option.9
        @Override // org.openjdk.tools.sjavac.options.Option
        public void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
            String filePatternArg = getFilePatternArg(argumentIterator, optionHelper);
            if (filePatternArg != null) {
                optionHelper.exclude(filePatternArg);
            }
        }
    },
    I("-i", "Include only files matching the given pattern") { // from class: org.openjdk.tools.sjavac.options.Option.10
        @Override // org.openjdk.tools.sjavac.options.Option
        public void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
            String filePatternArg = getFilePatternArg(argumentIterator, optionHelper);
            if (filePatternArg != null) {
                optionHelper.include(filePatternArg);
            }
        }
    },
    TR("-tr", "Translate resources") { // from class: org.openjdk.tools.sjavac.options.Option.11
        @Override // org.openjdk.tools.sjavac.options.Option
        public void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
            if (!argumentIterator.hasNext()) {
                optionHelper.reportError(this.arg + " must be followed by a translation rule");
                return;
            }
            String next = argumentIterator.next();
            Matcher matcher = Pattern.compile("(?<suffix>\\.[a-zA-Z_][a-zA-Z0-9_]*)=(?<class>[a-zA-Z_][a-zA-Z0-9_]*(\\.[a-zA-Z_][a-zA-Z0-9_]*)*)(?<extra>,.*)?").matcher(next);
            if (!matcher.matches()) {
                optionHelper.reportError("The string \"" + next + "\" is not a valid translate pattern");
                return;
            }
            String group = matcher.group("suffix");
            String group2 = matcher.group(RoadProbe.CLASS_PROPERTY);
            String group3 = matcher.group("extra");
            if (group.matches("\\.(class|java)")) {
                optionHelper.reportError("You cannot have a translator for " + group + " files!");
                return;
            }
            try {
                Transformer transformer = (Transformer) Class.forName(group2).getConstructor(null).newInstance(null);
                transformer.setExtra(group3);
                optionHelper.addTransformer(group, transformer);
            } catch (Exception e) {
                StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("Cannot use ", group2, " as a translator: ");
                m2m.append(e.getMessage());
                optionHelper.reportError(m2m.toString());
            }
        }
    },
    COPY("-copy", "Copy resources") { // from class: org.openjdk.tools.sjavac.options.Option.12
        @Override // org.openjdk.tools.sjavac.options.Option
        public void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
            if (!argumentIterator.hasNext()) {
                optionHelper.reportError(this.arg + " must be followed by a resource type");
                return;
            }
            String next = argumentIterator.next();
            if (next.matches("\\.[a-zA-Z_][a-zA-Z0-9_]*")) {
                optionHelper.addTransformer(next, new CopyFile());
                return;
            }
            optionHelper.reportError("The string \"" + next + "\" is not a valid resource type.");
        }
    },
    J("-j", "Number of cores") { // from class: org.openjdk.tools.sjavac.options.Option.13
        @Override // org.openjdk.tools.sjavac.options.Option
        public void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
            if (argumentIterator.hasNext() && argumentIterator.peek().matches("\\d+")) {
                optionHelper.numCores(Integer.parseInt(argumentIterator.next()));
                return;
            }
            optionHelper.reportError(this.arg + " must be followed by an integer");
        }
    },
    SERVER("--server:", "Specify server configuration file of running server") { // from class: org.openjdk.tools.sjavac.options.Option.14
        @Override // org.openjdk.tools.sjavac.options.Option
        public void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
            optionHelper.serverConf(argumentIterator.current().substring(this.arg.length()));
        }
    },
    STARTSERVER("--startserver:", "Start server and use the given configuration file") { // from class: org.openjdk.tools.sjavac.options.Option.15
        @Override // org.openjdk.tools.sjavac.options.Option
        public void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
            optionHelper.startServerConf(argumentIterator.current().substring(this.arg.length()));
        }
    },
    IMPLICIT("-implicit:", "Specify how to treat implicitly referenced source code") { // from class: org.openjdk.tools.sjavac.options.Option.16
        @Override // org.openjdk.tools.sjavac.options.Option
        public void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
            optionHelper.implicit(argumentIterator.current().substring(this.arg.length()));
        }
    },
    LOG("--log=", "Specify logging level") { // from class: org.openjdk.tools.sjavac.options.Option.17
        @Override // org.openjdk.tools.sjavac.options.Option
        public void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
            optionHelper.logLevel(argumentIterator.current().substring(this.arg.length()));
        }
    },
    VERBOSE("-verbose", "Set verbosity level to \"info\"") { // from class: org.openjdk.tools.sjavac.options.Option.18
        @Override // org.openjdk.tools.sjavac.options.Option
        public void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
            optionHelper.logLevel(LogLevel.INFO);
        }
    },
    PERMIT_ARTIFACT("--permit-artifact=", "Allow this artifact in destination directory") { // from class: org.openjdk.tools.sjavac.options.Option.19
        @Override // org.openjdk.tools.sjavac.options.Option
        public void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
            optionHelper.permitArtifact(Paths.get(argumentIterator.current().substring(this.arg.length()), new String[0]).toFile().getAbsolutePath());
        }
    },
    PERMIT_UNIDENTIFIED_ARTIFACTS("--permit-unidentified-artifacts", "Allow unidentified artifacts in destination directory") { // from class: org.openjdk.tools.sjavac.options.Option.20
        @Override // org.openjdk.tools.sjavac.options.Option
        public void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
            optionHelper.permitUnidentifiedArtifacts();
        }
    },
    PERMIT_SOURCES_WITHOUT_PACKAGE("--permit-sources-without-package", "Permit sources in the default package") { // from class: org.openjdk.tools.sjavac.options.Option.21
        @Override // org.openjdk.tools.sjavac.options.Option
        public void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
            optionHelper.permitDefaultPackage();
        }
    },
    COMPARE_FOUND_SOURCES("--compare-found-sources", "Compare found sources with given sources") { // from class: org.openjdk.tools.sjavac.options.Option.22
        @Override // org.openjdk.tools.sjavac.options.Option
        public void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
            Path fileArg = getFileArg(argumentIterator, optionHelper, true, false);
            if (fileArg != null) {
                optionHelper.compareFoundSources(fileArg);
            }
        }
    },
    D("-d", "Output destination directory") { // from class: org.openjdk.tools.sjavac.options.Option.23
        @Override // org.openjdk.tools.sjavac.options.Option
        public void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
            Path fileArg = getFileArg(argumentIterator, optionHelper, false, true);
            if (fileArg != null) {
                optionHelper.destDir(fileArg);
            }
        }
    },
    S("-s", "Directory for generated sources") { // from class: org.openjdk.tools.sjavac.options.Option.24
        @Override // org.openjdk.tools.sjavac.options.Option
        public void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
            Path fileArg = getFileArg(argumentIterator, optionHelper, false, true);
            if (fileArg != null) {
                optionHelper.generatedSourcesDir(fileArg);
            }
        }
    },
    H("-h", "Directory for header files") { // from class: org.openjdk.tools.sjavac.options.Option.25
        @Override // org.openjdk.tools.sjavac.options.Option
        public void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
            Path fileArg = getFileArg(argumentIterator, optionHelper, false, true);
            if (fileArg != null) {
                optionHelper.headerDir(fileArg);
            }
        }
    },
    STATE_DIR("--state-dir=", "Directory used to store sjavac state and log files.") { // from class: org.openjdk.tools.sjavac.options.Option.26
        @Override // org.openjdk.tools.sjavac.options.Option
        public void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
            optionHelper.stateDir(Paths.get(argumentIterator.current().substring(this.arg.length()), new String[0]));
        }
    };

    public final String arg;
    final String description;

    Option(String str, String str2) {
        this.arg = str;
        this.description = str2;
    }

    public Path getFileArg(ArgumentIterator argumentIterator, OptionHelper optionHelper, boolean z, boolean z2) {
        String concat;
        if (argumentIterator.hasNext()) {
            return Paths.get(argumentIterator.next(), new String[0]);
        }
        String m = a$$ExternalSyntheticOutline0.m(new StringBuilder(), this.arg, " must be followed by ");
        if (z && z2) {
            concat = m.concat("a file or directory.");
        } else if (z) {
            concat = m.concat("a file.");
        } else {
            if (!z2) {
                Single$$ExternalSyntheticBUOutline0.m$3("File or directory must be acceptable.");
                return null;
            }
            concat = m.concat("a directory.");
        }
        optionHelper.reportError(concat);
        return null;
    }

    public List<Path> getFileListArg(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
        if (!argumentIterator.hasNext()) {
            optionHelper.reportError(this.arg + " must be followed by a list of files separated by " + File.pathSeparator);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : argumentIterator.next().split(File.pathSeparator)) {
            arrayList.add(Paths.get(str, new String[0]));
        }
        return arrayList;
    }

    public String getFilePatternArg(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
        if (argumentIterator.hasNext()) {
            return argumentIterator.next();
        }
        optionHelper.reportError(this.arg + " must be followed by a glob pattern.");
        return null;
    }

    public boolean hasOption() {
        return this.arg.endsWith(":") || this.arg.endsWith("=");
    }

    public final boolean processCurrent(ArgumentIterator argumentIterator, OptionHelper optionHelper) {
        String current = argumentIterator.current();
        boolean hasOption = hasOption();
        String str = this.arg;
        if (hasOption) {
            if (!current.startsWith(str)) {
                return false;
            }
        } else if (!current.equals(str)) {
            return false;
        }
        processMatching(argumentIterator, optionHelper);
        return true;
    }

    public abstract void processMatching(ArgumentIterator argumentIterator, OptionHelper optionHelper);
}
