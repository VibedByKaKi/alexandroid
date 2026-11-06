package com.google.devtools.ksp.symbol;

import com.amazon.alexa.hho.navigation.constants.DeeplinkConstants;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/google/devtools/ksp/symbol/KSTypeParameter;", "Lcom/google/devtools/ksp/symbol/KSDeclaration;", "bounds", "Lkotlin/sequences/Sequence;", "Lcom/google/devtools/ksp/symbol/KSTypeReference;", "getBounds", "()Lkotlin/sequences/Sequence;", "isReified", "", "()Z", "name", "Lcom/google/devtools/ksp/symbol/KSName;", "getName", "()Lcom/google/devtools/ksp/symbol/KSName;", "variance", "Lcom/google/devtools/ksp/symbol/Variance;", "getVariance", "()Lcom/google/devtools/ksp/symbol/Variance;", DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.API_QUERY_PARAM_KEY}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public interface KSTypeParameter extends KSDeclaration {
    @NotNull
    Sequence<KSTypeReference> getBounds();

    @NotNull
    KSName getName();

    @NotNull
    Variance getVariance();

    boolean isReified();
}
