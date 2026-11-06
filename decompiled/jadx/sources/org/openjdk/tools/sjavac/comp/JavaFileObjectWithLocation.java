package org.openjdk.tools.sjavac.comp;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import org.openjdk.javax.tools.ForwardingJavaFileObject;
import org.openjdk.javax.tools.JavaFileManager;
import org.openjdk.javax.tools.JavaFileObject;
import org.openjdk.tools.javac.api.ClientCodeWrapper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ClientCodeWrapper.Trusted
/* loaded from: classes12.dex */
public class JavaFileObjectWithLocation<F extends JavaFileObject> extends ForwardingJavaFileObject<F> {
    private final JavaFileManager.Location loc;

    public JavaFileObjectWithLocation(F f, JavaFileManager.Location location) {
        super(f);
        this.loc = location;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof JavaFileObjectWithLocation)) {
            return false;
        }
        JavaFileObjectWithLocation javaFileObjectWithLocation = (JavaFileObjectWithLocation) obj;
        return this.loc.equals(javaFileObjectWithLocation.loc) && ((JavaFileObject) this.fileObject).equals(javaFileObjectWithLocation.fileObject);
    }

    public F getDelegate() {
        return (F) this.fileObject;
    }

    public JavaFileManager.Location getLocation() {
        return this.loc;
    }

    public int hashCode() {
        return ((JavaFileObject) this.fileObject).hashCode() ^ this.loc.hashCode();
    }

    public String toString() {
        return "JavaFileObjectWithLocation[loc: " + this.loc + ", " + this.fileObject + MarkdownConstants.RIGHT_BRACKET;
    }
}
