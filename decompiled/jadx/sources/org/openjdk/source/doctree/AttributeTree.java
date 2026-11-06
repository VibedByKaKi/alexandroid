package org.openjdk.source.doctree;

import java.util.List;
import org.openjdk.javax.lang.model.element.Name;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface AttributeTree extends DocTree {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ValueKind {
        EMPTY,
        UNQUOTED,
        SINGLE,
        DOUBLE
    }

    Name getName();

    List<? extends DocTree> getValue();

    ValueKind getValueKind();
}
