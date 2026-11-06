package com.amazon.alexa.ra.chrome.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/chrome/model/ChromeTarget;", "", "None", "Standard", "Live", "Mute", "Lcom/amazon/alexa/ra/chrome/model/ChromeTarget$Live;", "Lcom/amazon/alexa/ra/chrome/model/ChromeTarget$Mute;", "Lcom/amazon/alexa/ra/chrome/model/ChromeTarget$None;", "Lcom/amazon/alexa/ra/chrome/model/ChromeTarget$Standard;", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface ChromeTarget {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/model/ChromeTarget$Live;", "Lcom/amazon/alexa/ra/chrome/model/ChromeTarget;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Live implements ChromeTarget {
        public static final int $stable = 0;

        @NotNull
        public static final Live INSTANCE = new Live();

        private Live() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/model/ChromeTarget$Mute;", "Lcom/amazon/alexa/ra/chrome/model/ChromeTarget;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Mute implements ChromeTarget {
        public static final int $stable = 0;

        @NotNull
        public static final Mute INSTANCE = new Mute();

        private Mute() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/model/ChromeTarget$None;", "Lcom/amazon/alexa/ra/chrome/model/ChromeTarget;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class None implements ChromeTarget {
        public static final int $stable = 0;

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/chrome/model/ChromeTarget$Standard;", "Lcom/amazon/alexa/ra/chrome/model/ChromeTarget;", "<init>", "()V", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Standard implements ChromeTarget {
        public static final int $stable = 0;

        @NotNull
        public static final Standard INSTANCE = new Standard();

        private Standard() {
        }
    }
}
