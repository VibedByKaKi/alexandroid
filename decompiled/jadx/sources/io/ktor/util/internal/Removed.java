package io.ktor.util.internal;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0014\u0010\u0002\u001a\u00060\u0003j\u0002`\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lio/ktor/util/internal/Removed;", "", "ref", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "toString", "", "ktor-utils"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
final class Removed {

    @JvmField
    @NotNull
    public final LockFreeLinkedListNode ref;

    public Removed(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
        lockFreeLinkedListNode.getClass();
        this.ref = lockFreeLinkedListNode;
    }

    @NotNull
    public String toString() {
        return "Removed[" + this.ref + AbstractJsonLexerKt.END_LIST;
    }
}
