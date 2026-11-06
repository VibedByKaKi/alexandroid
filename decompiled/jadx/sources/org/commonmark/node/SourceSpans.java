package org.commonmark.node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class SourceSpans {
    private List<SourceSpan> sourceSpans;

    public static SourceSpans empty() {
        return new SourceSpans();
    }

    public void addAll(List<SourceSpan> list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.sourceSpans == null) {
            this.sourceSpans = new ArrayList();
        }
        boolean isEmpty = this.sourceSpans.isEmpty();
        List<SourceSpan> list2 = this.sourceSpans;
        if (isEmpty) {
            list2.addAll(list);
            return;
        }
        int size = list2.size() - 1;
        SourceSpan sourceSpan = this.sourceSpans.get(size);
        SourceSpan sourceSpan2 = list.get(0);
        if (sourceSpan.getLineIndex() == sourceSpan2.getLineIndex()) {
            if (sourceSpan.getLength() + sourceSpan.getColumnIndex() == sourceSpan2.getColumnIndex()) {
                this.sourceSpans.set(size, SourceSpan.of(sourceSpan.getLineIndex(), sourceSpan.getColumnIndex(), sourceSpan2.getLength() + sourceSpan.getLength()));
                this.sourceSpans.addAll(list.subList(1, list.size()));
                return;
            }
        }
        this.sourceSpans.addAll(list);
    }

    public void addAllFrom(Iterable<? extends Node> iterable) {
        Iterator<? extends Node> it2 = iterable.iterator();
        while (it2.hasNext()) {
            addAll(it2.next().getSourceSpans());
        }
    }

    public List<SourceSpan> getSourceSpans() {
        List<SourceSpan> list = this.sourceSpans;
        return list != null ? list : Collections.EMPTY_LIST;
    }
}
