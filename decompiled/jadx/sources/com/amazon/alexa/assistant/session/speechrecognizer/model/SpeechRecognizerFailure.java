package com.amazon.alexa.assistant.session.speechrecognizer.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure;", "", "<init>", "()V", "Cancelled", "NoConnection", "AuthenticationError", "ServerIsDown", "RequestFailure", "UnexpectedResponse", "RecorderFailure", "Unhandled", "Unknown", "StartCaptureRejectedOnAppBackground", "TurnTimeout", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure$AuthenticationError;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure$Cancelled;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure$NoConnection;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure$RecorderFailure;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure$RequestFailure;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure$ServerIsDown;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure$StartCaptureRejectedOnAppBackground;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure$TurnTimeout;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure$UnexpectedResponse;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure$Unhandled;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure$Unknown;", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class SpeechRecognizerFailure {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure$AuthenticationError;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AuthenticationError extends SpeechRecognizerFailure {

        @NotNull
        public static final AuthenticationError INSTANCE = new AuthenticationError();

        private AuthenticationError() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof AuthenticationError);
        }

        public int hashCode() {
            return 1368388617;
        }

        @NotNull
        public String toString() {
            return "AuthenticationError";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure$Cancelled;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cancelled extends SpeechRecognizerFailure {

        @NotNull
        public static final Cancelled INSTANCE = new Cancelled();

        private Cancelled() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Cancelled);
        }

        public int hashCode() {
            return 668782122;
        }

        @NotNull
        public String toString() {
            return "Cancelled";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure$NoConnection;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NoConnection extends SpeechRecognizerFailure {

        @NotNull
        public static final NoConnection INSTANCE = new NoConnection();

        private NoConnection() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof NoConnection);
        }

        public int hashCode() {
            return 1091595270;
        }

        @NotNull
        public String toString() {
            return "NoConnection";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure$RecorderFailure;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RecorderFailure extends SpeechRecognizerFailure {

        @NotNull
        public static final RecorderFailure INSTANCE = new RecorderFailure();

        private RecorderFailure() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof RecorderFailure);
        }

        public int hashCode() {
            return 1253854469;
        }

        @NotNull
        public String toString() {
            return "RecorderFailure";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure$RequestFailure;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RequestFailure extends SpeechRecognizerFailure {

        @NotNull
        public static final RequestFailure INSTANCE = new RequestFailure();

        private RequestFailure() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof RequestFailure);
        }

        public int hashCode() {
            return -1699274046;
        }

        @NotNull
        public String toString() {
            return "RequestFailure";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure$ServerIsDown;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ServerIsDown extends SpeechRecognizerFailure {

        @NotNull
        public static final ServerIsDown INSTANCE = new ServerIsDown();

        private ServerIsDown() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof ServerIsDown);
        }

        public int hashCode() {
            return 2074533526;
        }

        @NotNull
        public String toString() {
            return "ServerIsDown";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure$StartCaptureRejectedOnAppBackground;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StartCaptureRejectedOnAppBackground extends SpeechRecognizerFailure {

        @NotNull
        public static final StartCaptureRejectedOnAppBackground INSTANCE = new StartCaptureRejectedOnAppBackground();

        private StartCaptureRejectedOnAppBackground() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof StartCaptureRejectedOnAppBackground);
        }

        public int hashCode() {
            return 1640072359;
        }

        @NotNull
        public String toString() {
            return "StartCaptureRejectedOnAppBackground";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure$TurnTimeout;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TurnTimeout extends SpeechRecognizerFailure {

        @NotNull
        public static final TurnTimeout INSTANCE = new TurnTimeout();

        private TurnTimeout() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof TurnTimeout);
        }

        public int hashCode() {
            return -600629059;
        }

        @NotNull
        public String toString() {
            return "TurnTimeout";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure$UnexpectedResponse;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure;", "responseCode", "", "<init>", "(I)V", "getResponseCode", "()I", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnexpectedResponse extends SpeechRecognizerFailure {
        private final int responseCode;

        public UnexpectedResponse(int i) {
            super(null);
            this.responseCode = i;
        }

        public static /* synthetic */ UnexpectedResponse copy$default(UnexpectedResponse unexpectedResponse, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = unexpectedResponse.responseCode;
            }
            return unexpectedResponse.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getResponseCode() {
            return this.responseCode;
        }

        @NotNull
        public final UnexpectedResponse copy(int responseCode) {
            return new UnexpectedResponse(responseCode);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnexpectedResponse) && this.responseCode == ((UnexpectedResponse) other).responseCode;
        }

        public final int getResponseCode() {
            return this.responseCode;
        }

        public int hashCode() {
            return Integer.hashCode(this.responseCode);
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m(this.responseCode, "UnexpectedResponse(responseCode=", MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure$Unhandled;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unhandled extends SpeechRecognizerFailure {

        @NotNull
        public static final Unhandled INSTANCE = new Unhandled();

        private Unhandled() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Unhandled);
        }

        public int hashCode() {
            return -1698168996;
        }

        @NotNull
        public String toString() {
            return "Unhandled";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure$Unknown;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerFailure;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unknown extends SpeechRecognizerFailure {

        @NotNull
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Unknown);
        }

        public int hashCode() {
            return 148878179;
        }

        @NotNull
        public String toString() {
            return "Unknown";
        }
    }

    public /* synthetic */ SpeechRecognizerFailure(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SpeechRecognizerFailure() {
    }
}
