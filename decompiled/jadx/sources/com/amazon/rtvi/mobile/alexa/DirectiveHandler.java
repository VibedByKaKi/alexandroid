package com.amazon.rtvi.mobile.alexa;

import com.amazon.rtvi.alexa.model.directives.RTVIDirective;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lcom/amazon/rtvi/mobile/alexa/DirectiveHandler;", "", "processDirective", "", "directive", "Lcom/amazon/rtvi/alexa/model/directives/RTVIDirective;", "dialogRequestId", "", "onDirectiveError", "directiveName", "error", "Orchestrator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface DirectiveHandler {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onDirectiveError(@NotNull DirectiveHandler directiveHandler, @NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
        }

        public static void processDirective(@NotNull DirectiveHandler directiveHandler, @NotNull RTVIDirective rTVIDirective, @Nullable String str) {
            rTVIDirective.getClass();
            directiveHandler.processDirective(rTVIDirective);
        }
    }

    void onDirectiveError(@NotNull String directiveName, @NotNull String error);

    void processDirective(@NotNull RTVIDirective directive);

    void processDirective(@NotNull RTVIDirective directive, @Nullable String dialogRequestId);
}
