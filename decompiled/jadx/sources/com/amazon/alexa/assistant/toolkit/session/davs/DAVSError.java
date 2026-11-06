package com.amazon.alexa.assistant.toolkit.session.davs;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0006\t\n\u000b\f\r\u000eB!\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0006\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/session/davs/DAVSError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "LocationInvalidURL", "LocationEmptyData", "ArtifactLocationDecodeError", "ArtifactEmptyData", "ArtifactMissingChecksum", "ArtifactBadChecksum", "Lcom/amazon/alexa/assistant/toolkit/session/davs/DAVSError$ArtifactBadChecksum;", "Lcom/amazon/alexa/assistant/toolkit/session/davs/DAVSError$ArtifactEmptyData;", "Lcom/amazon/alexa/assistant/toolkit/session/davs/DAVSError$ArtifactLocationDecodeError;", "Lcom/amazon/alexa/assistant/toolkit/session/davs/DAVSError$ArtifactMissingChecksum;", "Lcom/amazon/alexa/assistant/toolkit/session/davs/DAVSError$LocationEmptyData;", "Lcom/amazon/alexa/assistant/toolkit/session/davs/DAVSError$LocationInvalidURL;", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class DAVSError extends Exception {
    public /* synthetic */ DAVSError(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th, null);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/session/davs/DAVSError$ArtifactBadChecksum;", "Lcom/amazon/alexa/assistant/toolkit/session/davs/DAVSError;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ArtifactBadChecksum extends DAVSError {
        public /* synthetic */ ArtifactBadChecksum(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ArtifactBadChecksum() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public ArtifactBadChecksum(@Nullable String str, @Nullable Throwable th) {
            super(str, th, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/session/davs/DAVSError$ArtifactEmptyData;", "Lcom/amazon/alexa/assistant/toolkit/session/davs/DAVSError;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ArtifactEmptyData extends DAVSError {
        public /* synthetic */ ArtifactEmptyData(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ArtifactEmptyData() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public ArtifactEmptyData(@Nullable String str, @Nullable Throwable th) {
            super(str, th, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/session/davs/DAVSError$ArtifactLocationDecodeError;", "Lcom/amazon/alexa/assistant/toolkit/session/davs/DAVSError;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ArtifactLocationDecodeError extends DAVSError {
        public /* synthetic */ ArtifactLocationDecodeError(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ArtifactLocationDecodeError() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public ArtifactLocationDecodeError(@Nullable String str, @Nullable Throwable th) {
            super(str, th, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/session/davs/DAVSError$ArtifactMissingChecksum;", "Lcom/amazon/alexa/assistant/toolkit/session/davs/DAVSError;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ArtifactMissingChecksum extends DAVSError {
        public /* synthetic */ ArtifactMissingChecksum(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ArtifactMissingChecksum() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public ArtifactMissingChecksum(@Nullable String str, @Nullable Throwable th) {
            super(str, th, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/session/davs/DAVSError$LocationEmptyData;", "Lcom/amazon/alexa/assistant/toolkit/session/davs/DAVSError;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LocationEmptyData extends DAVSError {
        public /* synthetic */ LocationEmptyData(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LocationEmptyData() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public LocationEmptyData(@Nullable String str, @Nullable Throwable th) {
            super(str, th, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/session/davs/DAVSError$LocationInvalidURL;", "Lcom/amazon/alexa/assistant/toolkit/session/davs/DAVSError;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LocationInvalidURL extends DAVSError {
        public /* synthetic */ LocationInvalidURL(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LocationInvalidURL() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public LocationInvalidURL(@Nullable String str, @Nullable Throwable th) {
            super(str, th, null);
        }
    }

    public /* synthetic */ DAVSError(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th);
    }

    private DAVSError(String str, Throwable th) {
        super(str, th);
    }
}
