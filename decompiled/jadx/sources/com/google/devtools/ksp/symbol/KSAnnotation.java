package com.google.devtools.ksp.symbol;

import com.amazon.alexa.hho.navigation.constants.DeeplinkConstants;
import com.amazon.tarazed.type.annotations.AnnotationEvent;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/google/devtools/ksp/symbol/KSAnnotation;", "Lcom/google/devtools/ksp/symbol/KSNode;", AnnotationEvent.KEY_ANNOTATION_TYPE, "Lcom/google/devtools/ksp/symbol/KSTypeReference;", "getAnnotationType", "()Lcom/google/devtools/ksp/symbol/KSTypeReference;", "arguments", "", "Lcom/google/devtools/ksp/symbol/KSValueArgument;", "getArguments", "()Ljava/util/List;", "defaultArguments", "getDefaultArguments", "shortName", "Lcom/google/devtools/ksp/symbol/KSName;", "getShortName", "()Lcom/google/devtools/ksp/symbol/KSName;", "useSiteTarget", "Lcom/google/devtools/ksp/symbol/AnnotationUseSiteTarget;", "getUseSiteTarget", "()Lcom/google/devtools/ksp/symbol/AnnotationUseSiteTarget;", DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.API_QUERY_PARAM_KEY}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public interface KSAnnotation extends KSNode {
    @NotNull
    KSTypeReference getAnnotationType();

    @NotNull
    List<KSValueArgument> getArguments();

    @NotNull
    List<KSValueArgument> getDefaultArguments();

    @NotNull
    KSName getShortName();

    @Nullable
    AnnotationUseSiteTarget getUseSiteTarget();
}
