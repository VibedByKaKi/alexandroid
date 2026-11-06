package org.apache.commons.io.filefilter;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import io.reactivex.rxjava3.core.Maybe$$ExternalSyntheticLambda0;
import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.Function;
import java.util.regex.Pattern;
import org.apache.commons.io.IOCase;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class RegexFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = 4269646126155225062L;
    private final Function<Path, String> pathToString;
    private final Pattern pattern;

    public RegexFileFilter(Pattern pattern, Function<Path, String> function) {
        if (pattern == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Pattern is missing");
            throw null;
        }
        this.pattern = pattern;
        this.pathToString = function;
    }

    private static Pattern compile(String str, int i) {
        if (str != null) {
            return Pattern.compile(str, i);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Pattern is missing");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$new$0(Path path) {
        return path.getFileName().toString();
    }

    private static int toFlags(IOCase iOCase) {
        return IOCase.isCaseSensitive(iOCase) ? 2 : 0;
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return AbstractFileFilter.toFileVisitResult(this.pattern.matcher(this.pathToString.apply(path)).matches(), path);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public String toString() {
        return "RegexFileFilter [pattern=" + this.pattern + MarkdownConstants.RIGHT_BRACKET;
    }

    public RegexFileFilter(Pattern pattern) {
        this(pattern, new Maybe$$ExternalSyntheticLambda0(4));
    }

    public RegexFileFilter(String str) {
        this(str, 0);
    }

    public RegexFileFilter(String str, int i) {
        this(compile(str, i));
    }

    public RegexFileFilter(String str, IOCase iOCase) {
        this(compile(str, toFlags(iOCase)));
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.pattern.matcher(str).matches();
    }
}
