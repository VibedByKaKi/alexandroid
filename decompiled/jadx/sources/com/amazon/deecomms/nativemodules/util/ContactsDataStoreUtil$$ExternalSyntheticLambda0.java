package com.amazon.deecomms.nativemodules.util;

import android.database.Cursor;
import com.amazon.deecomms.util.BiConsumer;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class ContactsDataStoreUtil$$ExternalSyntheticLambda0 implements BiConsumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ContactsDataStoreUtil f$0;

    public /* synthetic */ ContactsDataStoreUtil$$ExternalSyntheticLambda0(ContactsDataStoreUtil contactsDataStoreUtil, int i) {
        this.$r8$classId = i;
        this.f$0 = contactsDataStoreUtil;
    }

    @Override // com.amazon.deecomms.util.BiConsumer
    public final void accept(Object obj, Object obj2) {
        Cursor cursor = (Cursor) obj;
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$getHomeGroupsThatCanDropIn$0(cursor, (WritableArray) obj2);
                break;
            case 1:
                this.f$0.lambda$getAllHomeGroups$1(cursor, (WritableMap) obj2);
                break;
            default:
                this.f$0.getBlockContacts(cursor, (WritableArray) obj2);
                break;
        }
    }
}
