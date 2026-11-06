package com.amazon.alexa.accessory.engagement;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.engagement.LongRepository;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
final class SharedPreferencesLongRepository implements LongRepository {
    private final SharedPreferences sharedPreferences;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Factory implements LongRepository.Factory {
        private final Context context;

        public Factory(Context context) {
            this.context = context;
        }

        @Override // com.amazon.alexa.accessory.engagement.LongRepository.Factory
        public LongRepository create(String str) {
            return new SharedPreferencesLongRepository(this.context, str);
        }
    }

    @VisibleForTesting
    public SharedPreferencesLongRepository(SharedPreferences sharedPreferences) {
        Objects.requireNonNull(sharedPreferences);
        this.sharedPreferences = sharedPreferences;
    }

    @Override // com.amazon.alexa.accessory.engagement.LongRepository
    public boolean contains(@NonNull String str) {
        Preconditions.notNull(str, "key");
        return this.sharedPreferences.contains(str);
    }

    @Override // com.amazon.alexa.accessory.engagement.LongRepository
    public long get(@NonNull String str) {
        Preconditions.notNull(str, "key");
        if (contains(str)) {
            return this.sharedPreferences.getLong(str, 0L);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("No value associated to ", str));
        return 0L;
    }

    @Override // com.amazon.alexa.accessory.engagement.LongRepository
    @SuppressLint({"ApplySharedPref"})
    public void put(@NonNull String str, long j) {
        Objects.requireNonNull(str, "key must be non-null.");
        this.sharedPreferences.edit().putLong(str, j).commit();
    }

    public SharedPreferencesLongRepository(Context context, String str) {
        this(context.getSharedPreferences(str, 0));
    }
}
