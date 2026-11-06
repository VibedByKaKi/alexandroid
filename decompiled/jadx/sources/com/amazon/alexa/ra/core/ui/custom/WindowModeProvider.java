package com.amazon.alexa.ra.core.ui.custom;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/WindowModeProvider;", "", "isInSplitScreen", "", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface WindowModeProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/WindowModeProvider$Companion;", "", "<init>", "()V", "NoOp", "Lcom/amazon/alexa/ra/core/ui/custom/WindowModeProvider;", "getNoOp", "()Lcom/amazon/alexa/ra/core/ui/custom/WindowModeProvider;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final WindowModeProvider NoOp = new WindowModeProvider() { // from class: com.amazon.alexa.ra.core.ui.custom.WindowModeProvider$Companion$NoOp$1
            @Override // com.amazon.alexa.ra.core.ui.custom.WindowModeProvider
            public boolean isInSplitScreen() {
                return false;
            }
        };

        private Companion() {
        }

        @NotNull
        public final WindowModeProvider getNoOp() {
            return NoOp;
        }
    }

    boolean isInSplitScreen();
}
