package com.amazon.deecomms.calling.api;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ResolvableTarget extends CallTarget {

    @NonNull
    private final String usecase;

    public ResolvableTarget(@NonNull @JsonProperty("usecase") String str) {
        this.usecase = (String) Preconditions.checkNotNull(str, "Usecase must not be null");
    }

    @NonNull
    public String getUsecase() {
        return this.usecase;
    }
}
