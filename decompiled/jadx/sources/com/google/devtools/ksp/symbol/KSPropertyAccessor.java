package com.google.devtools.ksp.symbol;

import com.amazon.alexa.hho.navigation.constants.DeeplinkConstants;
import com.amazon.deecomms.common.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/google/devtools/ksp/symbol/KSPropertyAccessor;", "Lcom/google/devtools/ksp/symbol/KSAnnotated;", "Lcom/google/devtools/ksp/symbol/KSModifierListOwner;", Constants.BUNDLE_RECEIVER_TAG, "Lcom/google/devtools/ksp/symbol/KSPropertyDeclaration;", "getReceiver", "()Lcom/google/devtools/ksp/symbol/KSPropertyDeclaration;", DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.API_QUERY_PARAM_KEY}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public interface KSPropertyAccessor extends KSAnnotated, KSModifierListOwner {
    @NotNull
    KSPropertyDeclaration getReceiver();
}
