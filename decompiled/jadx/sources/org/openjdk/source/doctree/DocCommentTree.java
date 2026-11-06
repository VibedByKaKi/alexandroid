package org.openjdk.source.doctree;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface DocCommentTree extends DocTree {
    List<? extends DocTree> getBlockTags();

    List<? extends DocTree> getBody();

    List<? extends DocTree> getFirstSentence();

    default List<? extends DocTree> getFullBody() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getFirstSentence());
        arrayList.addAll(getBody());
        return arrayList;
    }
}
