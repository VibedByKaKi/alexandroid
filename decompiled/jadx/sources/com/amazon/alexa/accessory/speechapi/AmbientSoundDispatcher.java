package com.amazon.alexa.accessory.speechapi;

import com.amazon.alexa.auth.BuildConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/AmbientSoundDispatcher;", "", "dispatch", "", "algorithm", "Lcom/amazon/alexa/accessory/speechapi/AmbientSoundDispatcher$Algorithm;", "Algorithm", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AmbientSoundDispatcher {
    boolean dispatch(@NotNull Algorithm algorithm);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/AmbientSoundDispatcher$Algorithm;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PASSTHROUGH", "ANC", "NONE", "Companion", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAmbientSoundDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbientSoundDispatcher.kt\ncom/amazon/alexa/accessory/speechapi/AmbientSoundDispatcher$Algorithm\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,35:1\n8811#2,2:36\n9071#2,4:38\n*S KotlinDebug\n*F\n+ 1 AmbientSoundDispatcher.kt\ncom/amazon/alexa/accessory/speechapi/AmbientSoundDispatcher$Algorithm\n*L\n30#1:36,2\n30#1:38,4\n*E\n"})
    public enum Algorithm {
        PASSTHROUGH("PASSTHROUGH"),
        ANC("ACTIVE_NOISE_CONTROL"),
        NONE("NONE");


        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final Map<String, Algorithm> map;

        @NotNull
        private final String value;

        static {
            Algorithm[] values = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(values.length), 16));
            for (Algorithm algorithm : values) {
                linkedHashMap.put(algorithm.value, algorithm);
            }
            map = linkedHashMap;
        }

        Algorithm(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/AmbientSoundDispatcher$Algorithm$Companion;", "", "()V", BuildConfig.FLAVOR_authType, "", "", "Lcom/amazon/alexa/accessory/speechapi/AmbientSoundDispatcher$Algorithm;", "fromString", "value", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final Algorithm fromString(@NotNull String value) {
                value.getClass();
                return (Algorithm) Algorithm.map.get(value);
            }

            private Companion() {
            }
        }
    }
}
