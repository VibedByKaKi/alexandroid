package com.amazon.alexa.sharing.repo.models;

import androidx.annotation.NonNull;
import com.amazon.alexa.enrollment.dialogs.DialogConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public enum SortOrder {
    ASCENDING("asc"),
    DESCENDING(DialogConstants.DESC);


    @NonNull
    private final String sortOrder;

    SortOrder(@NonNull String str) {
        this.sortOrder = str;
    }
}
