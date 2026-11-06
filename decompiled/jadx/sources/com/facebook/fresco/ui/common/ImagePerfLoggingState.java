package com.facebook.fresco.ui.common;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0011\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010O\u001a\u00020PH\u0000¢\u0006\u0002\bQR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R#\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R$\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010'X\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010-\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010 \"\u0004\b/\u0010\"R\u001c\u00100\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010 \"\u0004\b2\u0010\"R\u001c\u00103\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010 \"\u0004\b5\u0010\"R\u001c\u00106\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010 \"\u0004\b8\u0010\"R\u001e\u00109\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b:\u0010\u0017\"\u0004\b;\u0010\u0019R\u001c\u0010<\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010 \"\u0004\b>\u0010\"R\u001c\u0010?\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010 \"\u0004\bA\u0010\"R\u001c\u0010B\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010 \"\u0004\bD\u0010\"R\u001e\u0010E\u001a\u0004\u0018\u00010FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010K\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001e\u0010L\u001a\u0004\u0018\u00010FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010K\u001a\u0004\bM\u0010H\"\u0004\bN\u0010J¨\u0006R"}, d2 = {"Lcom/facebook/fresco/ui/common/ImagePerfLoggingState;", "", "infra", "Lcom/facebook/fresco/ui/common/ImageRenderingInfra;", "<init>", "(Lcom/facebook/fresco/ui/common/ImageRenderingInfra;)V", "getInfra", "()Lcom/facebook/fresco/ui/common/ImageRenderingInfra;", "intermediateImageSetTimes", "", "Lkotlin/Pair;", "", "", "getIntermediateImageSetTimes", "()Ljava/util/List;", "newIntermediateImageSetPointAvailable", "", "getNewIntermediateImageSetPointAvailable", "()Z", "setNewIntermediateImageSetPointAvailable", "(Z)V", "emptyEventTimestampNs", "getEmptyEventTimestampNs", "()Ljava/lang/Long;", "setEmptyEventTimestampNs", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "releasedEventTimestampNs", "getReleasedEventTimestampNs", "setReleasedEventTimestampNs", "callingClassNameOnVisible", "getCallingClassNameOnVisible", "()Ljava/lang/String;", "setCallingClassNameOnVisible", "(Ljava/lang/String;)V", "rootContextNameOnVisible", "getRootContextNameOnVisible", "setRootContextNameOnVisible", "contextChainArrayOnVisible", "", "getContextChainArrayOnVisible", "()[Ljava/lang/String;", "setContextChainArrayOnVisible", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "contextChainExtrasOnVisible", "getContextChainExtrasOnVisible", "setContextChainExtrasOnVisible", "contentIdOnVisible", "getContentIdOnVisible", "setContentIdOnVisible", "surfaceOnVisible", "getSurfaceOnVisible", "setSurfaceOnVisible", "subSurfaceOnVisible", "getSubSurfaceOnVisible", "setSubSurfaceOnVisible", "msSinceLastNavigationOnVisible", "getMsSinceLastNavigationOnVisible", "setMsSinceLastNavigationOnVisible", "startupStatusOnVisible", "getStartupStatusOnVisible", "setStartupStatusOnVisible", "errorMessageOnFailure", "getErrorMessageOnFailure", "setErrorMessageOnFailure", "errorStacktraceStringOnFailure", "getErrorStacktraceStringOnFailure", "setErrorStacktraceStringOnFailure", "errorCodeOnFailure", "", "getErrorCodeOnFailure", "()Ljava/lang/Integer;", "setErrorCodeOnFailure", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "densityDpiOnSuccess", "getDensityDpiOnSuccess", "setDensityDpiOnSuccess", "resetLoggingState", "", "resetLoggingState$ui_common_release", "ui-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class ImagePerfLoggingState {

    @Nullable
    private String callingClassNameOnVisible;

    @Nullable
    private String contentIdOnVisible;

    @Nullable
    private String[] contextChainArrayOnVisible;

    @Nullable
    private String contextChainExtrasOnVisible;

    @Nullable
    private Integer densityDpiOnSuccess;

    @Nullable
    private Long emptyEventTimestampNs;

    @Nullable
    private Integer errorCodeOnFailure;

    @Nullable
    private String errorMessageOnFailure;

    @Nullable
    private String errorStacktraceStringOnFailure;

    @NotNull
    private final ImageRenderingInfra infra;

    @NotNull
    private final List<Pair<String, Long>> intermediateImageSetTimes;

    @Nullable
    private Long msSinceLastNavigationOnVisible;
    private boolean newIntermediateImageSetPointAvailable;

    @Nullable
    private Long releasedEventTimestampNs;

    @Nullable
    private String rootContextNameOnVisible;

    @Nullable
    private String startupStatusOnVisible;

    @Nullable
    private String subSurfaceOnVisible;

    @Nullable
    private String surfaceOnVisible;

    public ImagePerfLoggingState(@NotNull ImageRenderingInfra imageRenderingInfra) {
        imageRenderingInfra.getClass();
        this.infra = imageRenderingInfra;
        this.intermediateImageSetTimes = new ArrayList();
    }

    @Nullable
    public final String getCallingClassNameOnVisible() {
        return this.callingClassNameOnVisible;
    }

    @Nullable
    public final String getContentIdOnVisible() {
        return this.contentIdOnVisible;
    }

    @Nullable
    public final String[] getContextChainArrayOnVisible() {
        return this.contextChainArrayOnVisible;
    }

    @Nullable
    public final String getContextChainExtrasOnVisible() {
        return this.contextChainExtrasOnVisible;
    }

    @Nullable
    public final Integer getDensityDpiOnSuccess() {
        return this.densityDpiOnSuccess;
    }

    @Nullable
    public final Long getEmptyEventTimestampNs() {
        return this.emptyEventTimestampNs;
    }

    @Nullable
    public final Integer getErrorCodeOnFailure() {
        return this.errorCodeOnFailure;
    }

    @Nullable
    public final String getErrorMessageOnFailure() {
        return this.errorMessageOnFailure;
    }

    @Nullable
    public final String getErrorStacktraceStringOnFailure() {
        return this.errorStacktraceStringOnFailure;
    }

    @NotNull
    public final ImageRenderingInfra getInfra() {
        return this.infra;
    }

    @NotNull
    public final List<Pair<String, Long>> getIntermediateImageSetTimes() {
        return this.intermediateImageSetTimes;
    }

    @Nullable
    public final Long getMsSinceLastNavigationOnVisible() {
        return this.msSinceLastNavigationOnVisible;
    }

    public final boolean getNewIntermediateImageSetPointAvailable() {
        return this.newIntermediateImageSetPointAvailable;
    }

    @Nullable
    public final Long getReleasedEventTimestampNs() {
        return this.releasedEventTimestampNs;
    }

    @Nullable
    public final String getRootContextNameOnVisible() {
        return this.rootContextNameOnVisible;
    }

    @Nullable
    public final String getStartupStatusOnVisible() {
        return this.startupStatusOnVisible;
    }

    @Nullable
    public final String getSubSurfaceOnVisible() {
        return this.subSurfaceOnVisible;
    }

    @Nullable
    public final String getSurfaceOnVisible() {
        return this.surfaceOnVisible;
    }

    public final void resetLoggingState$ui_common_release() {
        this.intermediateImageSetTimes.clear();
        this.newIntermediateImageSetPointAvailable = false;
        this.emptyEventTimestampNs = null;
        this.releasedEventTimestampNs = null;
        this.callingClassNameOnVisible = null;
        this.rootContextNameOnVisible = null;
        this.contextChainArrayOnVisible = null;
        this.contextChainExtrasOnVisible = null;
        this.contentIdOnVisible = null;
        this.surfaceOnVisible = null;
        this.subSurfaceOnVisible = null;
        this.msSinceLastNavigationOnVisible = null;
        this.startupStatusOnVisible = null;
        this.errorMessageOnFailure = null;
        this.errorStacktraceStringOnFailure = null;
        this.errorCodeOnFailure = null;
        this.densityDpiOnSuccess = null;
    }

    public final void setCallingClassNameOnVisible(@Nullable String str) {
        this.callingClassNameOnVisible = str;
    }

    public final void setContentIdOnVisible(@Nullable String str) {
        this.contentIdOnVisible = str;
    }

    public final void setContextChainArrayOnVisible(@Nullable String[] strArr) {
        this.contextChainArrayOnVisible = strArr;
    }

    public final void setContextChainExtrasOnVisible(@Nullable String str) {
        this.contextChainExtrasOnVisible = str;
    }

    public final void setDensityDpiOnSuccess(@Nullable Integer num) {
        this.densityDpiOnSuccess = num;
    }

    public final void setEmptyEventTimestampNs(@Nullable Long l) {
        this.emptyEventTimestampNs = l;
    }

    public final void setErrorCodeOnFailure(@Nullable Integer num) {
        this.errorCodeOnFailure = num;
    }

    public final void setErrorMessageOnFailure(@Nullable String str) {
        this.errorMessageOnFailure = str;
    }

    public final void setErrorStacktraceStringOnFailure(@Nullable String str) {
        this.errorStacktraceStringOnFailure = str;
    }

    public final void setMsSinceLastNavigationOnVisible(@Nullable Long l) {
        this.msSinceLastNavigationOnVisible = l;
    }

    public final void setNewIntermediateImageSetPointAvailable(boolean z) {
        this.newIntermediateImageSetPointAvailable = z;
    }

    public final void setReleasedEventTimestampNs(@Nullable Long l) {
        this.releasedEventTimestampNs = l;
    }

    public final void setRootContextNameOnVisible(@Nullable String str) {
        this.rootContextNameOnVisible = str;
    }

    public final void setStartupStatusOnVisible(@Nullable String str) {
        this.startupStatusOnVisible = str;
    }

    public final void setSubSurfaceOnVisible(@Nullable String str) {
        this.subSurfaceOnVisible = str;
    }

    public final void setSurfaceOnVisible(@Nullable String str) {
        this.surfaceOnVisible = str;
    }
}
