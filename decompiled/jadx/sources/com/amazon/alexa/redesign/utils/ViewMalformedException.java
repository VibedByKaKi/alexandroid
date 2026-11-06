package com.amazon.alexa.redesign.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/redesign/utils/ViewMalformedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "viewType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getViewType", "()Ljava/lang/String;", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ViewMalformedException extends Exception {
    public static final int $stable = 0;

    @Nullable
    private final String viewType;

    public ViewMalformedException(@Nullable String str, @Nullable String str2) {
        super(str);
        this.viewType = str2;
    }

    @Nullable
    public final String getViewType() {
        return this.viewType;
    }
}
