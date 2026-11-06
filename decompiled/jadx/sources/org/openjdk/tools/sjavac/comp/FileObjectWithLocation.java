package org.openjdk.tools.sjavac.comp;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import org.openjdk.javax.tools.FileObject;
import org.openjdk.javax.tools.ForwardingFileObject;
import org.openjdk.javax.tools.JavaFileManager;
import org.openjdk.tools.javac.api.ClientCodeWrapper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ClientCodeWrapper.Trusted
/* loaded from: classes12.dex */
public class FileObjectWithLocation<F extends FileObject> extends ForwardingFileObject<F> {
    private final JavaFileManager.Location loc;

    public FileObjectWithLocation(F f, JavaFileManager.Location location) {
        super(f);
        this.loc = location;
    }

    public FileObject getDelegate() {
        return this.fileObject;
    }

    public JavaFileManager.Location getLocation() {
        return this.loc;
    }

    public String toString() {
        return "FileObjectWithLocation[" + this.fileObject + MarkdownConstants.RIGHT_BRACKET;
    }
}
