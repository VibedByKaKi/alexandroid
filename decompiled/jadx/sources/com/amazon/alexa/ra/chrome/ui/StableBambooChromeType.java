package com.amazon.alexa.ra.chrome.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/StableBambooChromeType;", "Lcom/amazon/alexa/ra/chrome/ui/BambooChromeType;", "<init>", "()V", "Listening", "Processing", "Idle", "Lcom/amazon/alexa/ra/chrome/ui/StableBambooChromeType$Idle;", "Lcom/amazon/alexa/ra/chrome/ui/StableBambooChromeType$Listening;", "Lcom/amazon/alexa/ra/chrome/ui/StableBambooChromeType$Processing;", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class StableBambooChromeType implements BambooChromeType {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/StableBambooChromeType$Idle;", "Lcom/amazon/alexa/ra/chrome/ui/StableBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Idle extends StableBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Idle INSTANCE = new Idle();

        private Idle() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/StableBambooChromeType$Listening;", "Lcom/amazon/alexa/ra/chrome/ui/StableBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Listening extends StableBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Listening INSTANCE = new Listening();

        private Listening() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/StableBambooChromeType$Processing;", "Lcom/amazon/alexa/ra/chrome/ui/StableBambooChromeType;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Processing extends StableBambooChromeType {
        public static final int $stable = 0;

        @NotNull
        public static final Processing INSTANCE = new Processing();

        private Processing() {
            super(null);
        }
    }

    public /* synthetic */ StableBambooChromeType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private StableBambooChromeType() {
    }
}
