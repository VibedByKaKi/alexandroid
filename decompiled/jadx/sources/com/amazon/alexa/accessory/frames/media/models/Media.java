package com.amazon.alexa.accessory.frames.media.models;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.core.view.ViewCompat;
import androidx.room.Entity;
import androidx.room.Index;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.smarthomecameras.routing.CamerasRouteParameter;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Entity(indices = {@Index(unique = true, value = {"accessoryId", "sourceAssetId"})}, primaryKeys = {"accessoryId", VoiceBridgePayloadUtil.PayloadKey.PLAYER_INFO_ID})
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002@AB\u0097\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0016HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0016HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00105J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00105J\t\u00108\u001a\u00020\u0016HÆ\u0003J\u009e\u0002\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u0016HÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u00162\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u001fR\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u001fR\u0012\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/models/Media;", "", "accessoryId", "", VoiceBridgePayloadUtil.PayloadKey.PLAYER_INFO_ID, "", CamerasRouteParameter.DISPLAY_NAME, "sourceAssetId", "deviceReceiptState", "pendingMediaStoreUri", "mediaType", "containerFormat", "fileLocationType", "fileLocation", "fileWriteStatus", "size", "createdAt", "importedAt", "md5Hash", "amazonPhotosUploadStatus", "amazonPhotosNodeId", "isAutoCapture", "", "importType", "isEnhanced", "unenhancedMediaId", "snapshotPath", "snapshotCreatedAt", "isShowingEnhanced", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Z)V", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "()Ljava/lang/Long;", "component22", "component23", "component24", "copy", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Z)Lcom/amazon/alexa/accessory/frames/media/models/Media;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Builder", "Companion", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Media {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public String accessoryId;

    @JvmField
    @Nullable
    public String amazonPhotosNodeId;

    @JvmField
    @Nullable
    public String amazonPhotosUploadStatus;

    @JvmField
    @Nullable
    public String containerFormat;

    @JvmField
    @Nullable
    public String createdAt;

    @JvmField
    @Nullable
    public String deviceReceiptState;

    @JvmField
    @Nullable
    public String displayName;

    @JvmField
    @Nullable
    public String fileLocation;

    @JvmField
    @Nullable
    public String fileLocationType;

    @JvmField
    @Nullable
    public String fileWriteStatus;

    @JvmField
    @NotNull
    public String importType;

    @JvmField
    public long importedAt;

    @JvmField
    public boolean isAutoCapture;

    @JvmField
    public boolean isEnhanced;

    @JvmField
    public boolean isShowingEnhanced;

    @JvmField
    @Nullable
    public String md5Hash;

    @JvmField
    public long mediaId;

    @JvmField
    @Nullable
    public String mediaType;

    @JvmField
    @Nullable
    public String pendingMediaStoreUri;

    @JvmField
    public long size;

    @JvmField
    @Nullable
    public Long snapshotCreatedAt;

    @JvmField
    @Nullable
    public String snapshotPath;

    @JvmField
    @Nullable
    public String sourceAssetId;

    @JvmField
    @Nullable
    public Long unenhancedMediaId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0005J\u0010\u0010\t\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0005J\u0010\u0010\n\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0005J\u0010\u0010\f\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0005J\u0010\u0010\r\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0007J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0007J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0018J\u0015\u0010\u001b\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010!J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0005J\u0015\u0010\u001e\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010!J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0018J\u0006\u0010\"\u001a\u00020#R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001cR\u000e\u0010\u001f\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/models/Media$Builder;", "", "<init>", "()V", "accessoryId", "", VoiceBridgePayloadUtil.PayloadKey.PLAYER_INFO_ID, "", CamerasRouteParameter.DISPLAY_NAME, "sourceAssetId", "deviceReceiptState", "pendingMediaStoreUri", "mediaType", "containerFormat", "fileLocationType", "fileLocation", "fileWriteStatus", "size", "createdAt", "importedAt", "md5Hash", "amazonPhotosUploadStatus", "amazonPhotosNodeId", "isAutoCapture", "", "importType", "isEnhanced", "unenhancedMediaId", "Ljava/lang/Long;", "snapshotPath", "snapshotCreatedAt", "isShowingEnhanced", "value", "(Ljava/lang/Long;)Lcom/amazon/alexa/accessory/frames/media/models/Media$Builder;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/accessory/frames/media/models/Media;", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMedia.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Media.kt\ncom/amazon/alexa/accessory/frames/media/models/Media$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n1#2:180\n*E\n"})
    public static final class Builder {

        @Nullable
        private String amazonPhotosNodeId;

        @Nullable
        private String amazonPhotosUploadStatus;

        @Nullable
        private String containerFormat;

        @Nullable
        private String createdAt;

        @Nullable
        private String deviceReceiptState;

        @Nullable
        private String displayName;

        @Nullable
        private String fileLocation;

        @Nullable
        private String fileLocationType;

        @Nullable
        private String fileWriteStatus;
        private long importedAt;
        private boolean isAutoCapture;
        private boolean isEnhanced;

        @Nullable
        private String md5Hash;
        private long mediaId;

        @Nullable
        private String mediaType;

        @Nullable
        private String pendingMediaStoreUri;
        private long size;

        @Nullable
        private Long snapshotCreatedAt;

        @Nullable
        private String snapshotPath;

        @Nullable
        private String sourceAssetId;

        @Nullable
        private Long unenhancedMediaId;

        @NotNull
        private String accessoryId = "";

        @NotNull
        private String importType = "UNKNOWN";
        private boolean isShowingEnhanced = true;

        @NotNull
        public final Builder accessoryId(@NotNull String value) {
            value.getClass();
            this.accessoryId = value;
            return this;
        }

        @NotNull
        public final Builder amazonPhotosNodeId(@Nullable String value) {
            this.amazonPhotosNodeId = value;
            return this;
        }

        @NotNull
        public final Builder amazonPhotosUploadStatus(@Nullable String value) {
            this.amazonPhotosUploadStatus = value;
            return this;
        }

        @NotNull
        public final Media build() {
            return new Media(this.accessoryId, this.mediaId, this.displayName, this.sourceAssetId, this.deviceReceiptState, this.pendingMediaStoreUri, this.mediaType, this.containerFormat, this.fileLocationType, this.fileLocation, this.fileWriteStatus, this.size, this.createdAt, this.importedAt, this.md5Hash, this.amazonPhotosUploadStatus, this.amazonPhotosNodeId, this.isAutoCapture, this.importType, this.isEnhanced, this.unenhancedMediaId, this.snapshotPath, this.snapshotCreatedAt, this.isShowingEnhanced);
        }

        @NotNull
        public final Builder containerFormat(@Nullable String value) {
            this.containerFormat = value;
            return this;
        }

        @NotNull
        public final Builder createdAt(@Nullable String value) {
            this.createdAt = value;
            return this;
        }

        @NotNull
        public final Builder deviceReceiptState(@Nullable String value) {
            this.deviceReceiptState = value;
            return this;
        }

        @NotNull
        public final Builder displayName(@Nullable String value) {
            this.displayName = value;
            return this;
        }

        @NotNull
        public final Builder fileLocation(@Nullable String value) {
            this.fileLocation = value;
            return this;
        }

        @NotNull
        public final Builder fileLocationType(@Nullable String value) {
            this.fileLocationType = value;
            return this;
        }

        @NotNull
        public final Builder fileWriteStatus(@Nullable String value) {
            this.fileWriteStatus = value;
            return this;
        }

        @NotNull
        public final Builder importType(@NotNull String value) {
            value.getClass();
            this.importType = value;
            return this;
        }

        @NotNull
        public final Builder importedAt(long value) {
            this.importedAt = value;
            return this;
        }

        @NotNull
        public final Builder isAutoCapture(boolean value) {
            this.isAutoCapture = value;
            return this;
        }

        @NotNull
        public final Builder isEnhanced(boolean value) {
            this.isEnhanced = value;
            return this;
        }

        @NotNull
        public final Builder isShowingEnhanced(boolean value) {
            this.isShowingEnhanced = value;
            return this;
        }

        @NotNull
        public final Builder md5Hash(@Nullable String value) {
            this.md5Hash = value;
            return this;
        }

        @NotNull
        public final Builder mediaId(long value) {
            this.mediaId = value;
            return this;
        }

        @NotNull
        public final Builder mediaType(@Nullable String value) {
            this.mediaType = value;
            return this;
        }

        @NotNull
        public final Builder pendingMediaStoreUri(@Nullable String value) {
            this.pendingMediaStoreUri = value;
            return this;
        }

        @NotNull
        public final Builder size(long value) {
            this.size = value;
            return this;
        }

        @NotNull
        public final Builder snapshotCreatedAt(@Nullable Long value) {
            this.snapshotCreatedAt = value;
            return this;
        }

        @NotNull
        public final Builder snapshotPath(@Nullable String value) {
            this.snapshotPath = value;
            return this;
        }

        @NotNull
        public final Builder sourceAssetId(@Nullable String value) {
            this.sourceAssetId = value;
            return this;
        }

        @NotNull
        public final Builder unenhancedMediaId(@Nullable Long value) {
            this.unenhancedMediaId = value;
            return this;
        }
    }

    public /* synthetic */ Media(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j2, String str11, long j3, String str12, String str13, String str14, boolean z, String str15, boolean z2, Long l, String str16, Long l2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? 0L : j2, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? 0L : j3, (i & 16384) != 0 ? null : str12, (i & 32768) != 0 ? null : str13, (i & 65536) != 0 ? null : str14, (i & 131072) != 0 ? false : z, (i & 262144) != 0 ? "UNKNOWN" : str15, (i & 524288) == 0 ? z2 : false, (i & 1048576) != 0 ? null : l, (i & 2097152) != 0 ? null : str16, (i & 4194304) != 0 ? null : l2, (i & 8388608) != 0 ? true : z3);
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    public static /* synthetic */ Media copy$default(Media media, String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j2, String str11, long j3, String str12, String str13, String str14, boolean z, String str15, boolean z2, Long l, String str16, Long l2, boolean z3, int i, Object obj) {
        boolean z4;
        Long l3;
        String str17 = (i & 1) != 0 ? media.accessoryId : str;
        long j4 = (i & 2) != 0 ? media.mediaId : j;
        String str18 = (i & 4) != 0 ? media.displayName : str2;
        String str19 = (i & 8) != 0 ? media.sourceAssetId : str3;
        String str20 = (i & 16) != 0 ? media.deviceReceiptState : str4;
        String str21 = (i & 32) != 0 ? media.pendingMediaStoreUri : str5;
        String str22 = (i & 64) != 0 ? media.mediaType : str6;
        String str23 = (i & 128) != 0 ? media.containerFormat : str7;
        String str24 = (i & 256) != 0 ? media.fileLocationType : str8;
        String str25 = (i & 512) != 0 ? media.fileLocation : str9;
        String str26 = (i & 1024) != 0 ? media.fileWriteStatus : str10;
        long j5 = (i & 2048) != 0 ? media.size : j2;
        String str27 = str17;
        String str28 = (i & 4096) != 0 ? media.createdAt : str11;
        long j6 = j4;
        long j7 = (i & 8192) != 0 ? media.importedAt : j3;
        String str29 = (i & 16384) != 0 ? media.md5Hash : str12;
        String str30 = (i & 32768) != 0 ? media.amazonPhotosUploadStatus : str13;
        String str31 = (i & 65536) != 0 ? media.amazonPhotosNodeId : str14;
        boolean z5 = (i & 131072) != 0 ? media.isAutoCapture : z;
        String str32 = (i & 262144) != 0 ? media.importType : str15;
        boolean z6 = (i & 524288) != 0 ? media.isEnhanced : z2;
        Long l4 = (i & 1048576) != 0 ? media.unenhancedMediaId : l;
        String str33 = (i & 2097152) != 0 ? media.snapshotPath : str16;
        Long l5 = (i & 4194304) != 0 ? media.snapshotCreatedAt : l2;
        if ((i & 8388608) != 0) {
            l3 = l5;
            z4 = media.isShowingEnhanced;
        } else {
            z4 = z3;
            l3 = l5;
        }
        return media.copy(str27, j6, str18, str19, str20, str21, str22, str23, str24, str25, str26, j5, str28, j7, str29, str30, str31, z5, str32, z6, l4, str33, l3, z4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAccessoryId() {
        return this.accessoryId;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getFileLocation() {
        return this.fileLocation;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getFileWriteStatus() {
        return this.fileWriteStatus;
    }

    /* renamed from: component12, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component14, reason: from getter */
    public final long getImportedAt() {
        return this.importedAt;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getMd5Hash() {
        return this.md5Hash;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final String getAmazonPhotosUploadStatus() {
        return this.amazonPhotosUploadStatus;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final String getAmazonPhotosNodeId() {
        return this.amazonPhotosNodeId;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsAutoCapture() {
        return this.isAutoCapture;
    }

    @NotNull
    /* renamed from: component19, reason: from getter */
    public final String getImportType() {
        return this.importType;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMediaId() {
        return this.mediaId;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getIsEnhanced() {
        return this.isEnhanced;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Long getUnenhancedMediaId() {
        return this.unenhancedMediaId;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final String getSnapshotPath() {
        return this.snapshotPath;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Long getSnapshotCreatedAt() {
        return this.snapshotCreatedAt;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getIsShowingEnhanced() {
        return this.isShowingEnhanced;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getSourceAssetId() {
        return this.sourceAssetId;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getDeviceReceiptState() {
        return this.deviceReceiptState;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getPendingMediaStoreUri() {
        return this.pendingMediaStoreUri;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getMediaType() {
        return this.mediaType;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getContainerFormat() {
        return this.containerFormat;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getFileLocationType() {
        return this.fileLocationType;
    }

    @NotNull
    public final Media copy(@NotNull String accessoryId, long mediaId, @Nullable String displayName, @Nullable String sourceAssetId, @Nullable String deviceReceiptState, @Nullable String pendingMediaStoreUri, @Nullable String mediaType, @Nullable String containerFormat, @Nullable String fileLocationType, @Nullable String fileLocation, @Nullable String fileWriteStatus, long size, @Nullable String createdAt, long importedAt, @Nullable String md5Hash, @Nullable String amazonPhotosUploadStatus, @Nullable String amazonPhotosNodeId, boolean isAutoCapture, @NotNull String importType, boolean isEnhanced, @Nullable Long unenhancedMediaId, @Nullable String snapshotPath, @Nullable Long snapshotCreatedAt, boolean isShowingEnhanced) {
        accessoryId.getClass();
        importType.getClass();
        return new Media(accessoryId, mediaId, displayName, sourceAssetId, deviceReceiptState, pendingMediaStoreUri, mediaType, containerFormat, fileLocationType, fileLocation, fileWriteStatus, size, createdAt, importedAt, md5Hash, amazonPhotosUploadStatus, amazonPhotosNodeId, isAutoCapture, importType, isEnhanced, unenhancedMediaId, snapshotPath, snapshotCreatedAt, isShowingEnhanced);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Media)) {
            return false;
        }
        Media media = (Media) other;
        return Intrinsics.areEqual(this.accessoryId, media.accessoryId) && this.mediaId == media.mediaId && Intrinsics.areEqual(this.displayName, media.displayName) && Intrinsics.areEqual(this.sourceAssetId, media.sourceAssetId) && Intrinsics.areEqual(this.deviceReceiptState, media.deviceReceiptState) && Intrinsics.areEqual(this.pendingMediaStoreUri, media.pendingMediaStoreUri) && Intrinsics.areEqual(this.mediaType, media.mediaType) && Intrinsics.areEqual(this.containerFormat, media.containerFormat) && Intrinsics.areEqual(this.fileLocationType, media.fileLocationType) && Intrinsics.areEqual(this.fileLocation, media.fileLocation) && Intrinsics.areEqual(this.fileWriteStatus, media.fileWriteStatus) && this.size == media.size && Intrinsics.areEqual(this.createdAt, media.createdAt) && this.importedAt == media.importedAt && Intrinsics.areEqual(this.md5Hash, media.md5Hash) && Intrinsics.areEqual(this.amazonPhotosUploadStatus, media.amazonPhotosUploadStatus) && Intrinsics.areEqual(this.amazonPhotosNodeId, media.amazonPhotosNodeId) && this.isAutoCapture == media.isAutoCapture && Intrinsics.areEqual(this.importType, media.importType) && this.isEnhanced == media.isEnhanced && Intrinsics.areEqual(this.unenhancedMediaId, media.unenhancedMediaId) && Intrinsics.areEqual(this.snapshotPath, media.snapshotPath) && Intrinsics.areEqual(this.snapshotCreatedAt, media.snapshotCreatedAt) && this.isShowingEnhanced == media.isShowingEnhanced;
    }

    public int hashCode() {
        int m = BitVector$$ExternalSyntheticOutline0.m(this.mediaId, this.accessoryId.hashCode() * 31, 31);
        String str = this.displayName;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sourceAssetId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceReceiptState;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pendingMediaStoreUri;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mediaType;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.containerFormat;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.fileLocationType;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.fileLocation;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.fileWriteStatus;
        int m2 = BitVector$$ExternalSyntheticOutline0.m(this.size, (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31, 31);
        String str10 = this.createdAt;
        int m3 = BitVector$$ExternalSyntheticOutline0.m(this.importedAt, (m2 + (str10 == null ? 0 : str10.hashCode())) * 31, 31);
        String str11 = this.md5Hash;
        int hashCode9 = (m3 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.amazonPhotosUploadStatus;
        int hashCode10 = (hashCode9 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.amazonPhotosNodeId;
        int m4 = DoubleList$$ExternalSyntheticOutline0.m(this.isEnhanced, ArcMode$$ExternalSyntheticOutline0.m(DoubleList$$ExternalSyntheticOutline0.m(this.isAutoCapture, (hashCode10 + (str13 == null ? 0 : str13.hashCode())) * 31, 31), 31, this.importType), 31);
        Long l = this.unenhancedMediaId;
        int hashCode11 = (m4 + (l == null ? 0 : l.hashCode())) * 31;
        String str14 = this.snapshotPath;
        int hashCode12 = (hashCode11 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Long l2 = this.snapshotCreatedAt;
        return Boolean.hashCode(this.isShowingEnhanced) + ((hashCode12 + (l2 != null ? l2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.accessoryId;
        long j = this.mediaId;
        String str2 = this.displayName;
        String str3 = this.sourceAssetId;
        String str4 = this.deviceReceiptState;
        String str5 = this.pendingMediaStoreUri;
        String str6 = this.mediaType;
        String str7 = this.containerFormat;
        String str8 = this.fileLocationType;
        String str9 = this.fileLocation;
        String str10 = this.fileWriteStatus;
        long j2 = this.size;
        String str11 = this.createdAt;
        long j3 = this.importedAt;
        String str12 = this.md5Hash;
        String str13 = this.amazonPhotosUploadStatus;
        String str14 = this.amazonPhotosNodeId;
        boolean z = this.isAutoCapture;
        String str15 = this.importType;
        boolean z2 = this.isEnhanced;
        Long l = this.unenhancedMediaId;
        String str16 = this.snapshotPath;
        Long l2 = this.snapshotCreatedAt;
        boolean z3 = this.isShowingEnhanced;
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("Media(accessoryId=", str, ", mediaId=", j);
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, ", displayName=", str2, ", sourceAssetId=", str3);
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, ", deviceReceiptState=", str4, ", pendingMediaStoreUri=", str5);
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, ", mediaType=", str6, ", containerFormat=", str7);
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, ", fileLocationType=", str8, ", fileLocation=", str9);
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, ", fileWriteStatus=", str10, ", size=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(j2, ", createdAt=", str11, m);
        ArcMode$$ExternalSyntheticOutline0.m(j3, ", importedAt=", ", md5Hash=", m);
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str12, ", amazonPhotosUploadStatus=", str13, ", amazonPhotosNodeId=");
        Automotive$$ExternalSyntheticOutline0.m(m, str14, ", isAutoCapture=", z, ", importType=");
        Automotive$$ExternalSyntheticOutline0.m(m, str15, ", isEnhanced=", z2, ", unenhancedMediaId=");
        m.append(l);
        m.append(", snapshotPath=");
        m.append(str16);
        m.append(", snapshotCreatedAt=");
        m.append(l2);
        m.append(", isShowingEnhanced=");
        m.append(z3);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/models/Media$Companion;", "", "<init>", "()V", "builder", "Lcom/amazon/alexa/accessory/frames/media/models/Media$Builder;", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Builder builder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    public Media(@NotNull String str, long j, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, long j2, @Nullable String str11, long j3, @Nullable String str12, @Nullable String str13, @Nullable String str14, boolean z, @NotNull String str15, boolean z2, @Nullable Long l, @Nullable String str16, @Nullable Long l2, boolean z3) {
        str.getClass();
        str15.getClass();
        this.accessoryId = str;
        this.mediaId = j;
        this.displayName = str2;
        this.sourceAssetId = str3;
        this.deviceReceiptState = str4;
        this.pendingMediaStoreUri = str5;
        this.mediaType = str6;
        this.containerFormat = str7;
        this.fileLocationType = str8;
        this.fileLocation = str9;
        this.fileWriteStatus = str10;
        this.size = j2;
        this.createdAt = str11;
        this.importedAt = j3;
        this.md5Hash = str12;
        this.amazonPhotosUploadStatus = str13;
        this.amazonPhotosNodeId = str14;
        this.isAutoCapture = z;
        this.importType = str15;
        this.isEnhanced = z2;
        this.unenhancedMediaId = l;
        this.snapshotPath = str16;
        this.snapshotCreatedAt = l2;
        this.isShowingEnhanced = z3;
    }

    public Media() {
        this(null, 0L, null, null, null, null, null, null, null, null, null, 0L, null, 0L, null, null, null, false, null, false, null, null, null, false, ViewCompat.MEASURED_SIZE_MASK, null);
    }
}
