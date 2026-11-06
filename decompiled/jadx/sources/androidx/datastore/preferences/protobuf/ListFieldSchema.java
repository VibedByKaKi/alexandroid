package androidx.datastore.preferences.protobuf;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@CheckReturnValue
/* loaded from: classes14.dex */
interface ListFieldSchema {
    void makeImmutableListAt(Object obj, long j);

    <L> void mergeListsAt(Object obj, Object obj2, long j);

    <L> List<L> mutableListAt(Object obj, long j);
}
