package com.amazon.alexa.api;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import com.amazon.alexa.api.Bundles;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.utils.validation.Preconditions;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class BaseMessagePayload {
    private static final String EMPTY_INPUT_ERROR = "empty input for key ";
    private static final String EMPTY_KEY_ERROR = "empty key";
    private final Bundle bundle;

    public BaseMessagePayload(ExtendedClient extendedClient, @Nullable Bundle bundle) {
        this.bundle = new Bundle();
        add((Bundles.Key) AudioProviderManagerArgumentKey.EXTENDED_CLIENT, extendedClient.getBundle());
        if (bundle != null) {
            add((Bundles.Key) AlexaServicesArgumentKey.API_CALLBACK, bundle);
        }
    }

    private void validate(Bundles.Key key, Object obj) {
        Preconditions.notNull(key, EMPTY_KEY_ERROR);
        Preconditions.notNull(obj, EMPTY_INPUT_ERROR + key);
    }

    public void add(Bundles.Key key, List<String> list) {
        validate(key, list);
        this.bundle.putStringArrayList(key.name(), new ArrayList<>(list));
    }

    public void addParcelable(Bundles.Key key, Parcelable parcelable) {
        add(key, parcelable);
    }

    public void addParcelableArray(Bundles.Key key, List<? extends Parcelable> list) {
        validate(key, list);
        this.bundle.putParcelableArrayList(key.name(), new ArrayList<>(list));
    }

    public void addSerializable(Bundles.Key key, Serializable serializable) {
        validate(key, serializable);
        this.bundle.putSerializable(key.name(), serializable);
    }

    public Bundle getBundle() {
        return this.bundle;
    }

    public void add(Bundles.Key key, int i) {
        this.bundle.putInt(key.name(), i);
    }

    public void add(Bundles.Key key, long j) {
        this.bundle.putLong(key.name(), j);
    }

    public void add(Bundles.Key key, float f) {
        this.bundle.putFloat(key.name(), f);
    }

    public void add(Bundles.Key key, IBinder iBinder) {
        validate(key, iBinder);
        this.bundle.putBinder(key.name(), iBinder);
    }

    public void add(Bundles.Key key, Bundle bundle) {
        validate(key, bundle);
        this.bundle.putBundle(key.name(), bundle);
    }

    public void add(Bundles.Key key, String str) {
        validate(key, str);
        this.bundle.putString(key.name(), str);
    }

    public BaseMessagePayload(ExtendedClient extendedClient) {
        this(extendedClient, null);
    }

    public void add(Bundles.Key key, java.util.Locale locale) {
        validate(key, locale);
        this.bundle.putString(key.name(), locale.toLanguageTag());
    }

    public void add(Bundles.Key key, String[] strArr) {
        validate(key, strArr);
        this.bundle.putStringArray(key.name(), strArr);
    }

    public void add(Bundles.Key key, long[] jArr) {
        validate(key, jArr);
        this.bundle.putLongArray(key.name(), jArr);
    }

    public void add(Bundles.Key key, boolean z) {
        Preconditions.notNull(key, EMPTY_KEY_ERROR);
        this.bundle.putBoolean(key.name(), z);
    }

    public void add(Bundles.Key key, Parcelable parcelable) {
        validate(key, parcelable);
        this.bundle.putParcelable(key.name(), parcelable);
    }
}
