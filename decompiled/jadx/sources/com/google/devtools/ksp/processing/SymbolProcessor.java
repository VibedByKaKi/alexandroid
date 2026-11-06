package com.google.devtools.ksp.processing;

import com.amazon.alexa.hho.navigation.constants.DeeplinkConstants;
import com.google.devtools.ksp.symbol.KSAnnotated;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH&¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/google/devtools/ksp/processing/SymbolProcessor;", "", "finish", "", "onError", "process", "", "Lcom/google/devtools/ksp/symbol/KSAnnotated;", "resolver", "Lcom/google/devtools/ksp/processing/Resolver;", DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.API_QUERY_PARAM_KEY}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public interface SymbolProcessor {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void finish(@NotNull SymbolProcessor symbolProcessor) {
            SymbolProcessor.super.finish();
        }

        @Deprecated
        public static void onError(@NotNull SymbolProcessor symbolProcessor) {
            SymbolProcessor.super.onError();
        }
    }

    @NotNull
    List<KSAnnotated> process(@NotNull Resolver resolver);

    default void finish() {
    }

    default void onError() {
    }
}
