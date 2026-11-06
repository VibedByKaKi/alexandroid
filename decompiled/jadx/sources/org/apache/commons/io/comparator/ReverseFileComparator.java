package org.apache.commons.io.comparator;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
class ReverseFileComparator extends AbstractFileComparator implements Serializable {
    private static final long serialVersionUID = -4808255005272229056L;
    private final Comparator<File> delegate;

    public ReverseFileComparator(Comparator<File> comparator) {
        if (comparator != null) {
            this.delegate = comparator;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Delegate comparator is missing");
            throw null;
        }
    }

    @Override // org.apache.commons.io.comparator.AbstractFileComparator
    public String toString() {
        return super.toString() + MarkdownConstants.LEFT_BRACKET + this.delegate.toString() + MarkdownConstants.RIGHT_BRACKET;
    }

    @Override // java.util.Comparator
    public int compare(File file, File file2) {
        return this.delegate.compare(file2, file);
    }
}
