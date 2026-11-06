package com.amazon.alexa.assistant.toolkit.storage;

import androidx.datastore.preferences.core.MutablePreferences;
import com.amazon.alexa.assistant.toolkit.storage.DataStoreStorage;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class DataStoreStorage$DataStoreTransaction$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ DataStoreStorage$DataStoreTransaction$$ExternalSyntheticLambda3(String str, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit putString$lambda$0;
        Unit putStringSet$lambda$5;
        switch (this.$r8$classId) {
            case 0:
                putString$lambda$0 = DataStoreStorage.DataStoreTransaction.putString$lambda$0(this.f$0, (String) this.f$1, (MutablePreferences) obj);
                return putString$lambda$0;
            default:
                putStringSet$lambda$5 = DataStoreStorage.DataStoreTransaction.putStringSet$lambda$5(this.f$0, (Set) this.f$1, (MutablePreferences) obj);
                return putStringSet$lambda$5;
        }
    }
}
