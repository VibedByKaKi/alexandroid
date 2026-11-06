package com.bugsnag.android.repackaged.dslplatform.json;

import androidx.annotation.Nullable;
import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
interface TypeLookup {
    @Nullable
    <T> JsonReader.BindObject<T> tryFindBinder(Class<T> cls);

    @Nullable
    <T> JsonReader.ReadObject<T> tryFindReader(Class<T> cls);
}
