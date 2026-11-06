package com.mapbox.maps.plugin.annotation.generated;

import android.graphics.Bitmap;
import androidx.annotation.ColorInt;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.android.tools.r8.RecordTag;
import com.dee.app.contacts.common.constants.Constants;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mapbox.android.gestures.MoveDistancesObject;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.extension.style.layers.properties.generated.IconAnchor;
import com.mapbox.maps.extension.style.layers.properties.generated.IconTextFit;
import com.mapbox.maps.extension.style.layers.properties.generated.TextAnchor;
import com.mapbox.maps.extension.style.layers.properties.generated.TextJustify;
import com.mapbox.maps.extension.style.layers.properties.generated.TextTransform;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.plugin.annotation.Annotation;
import com.mapbox.maps.plugin.annotation.AnnotationManager;
import com.mapbox.maps.plugin.annotation.AnnotationType;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 À\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002À\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0002\u0010\nJ\u001f\u0010·\u0001\u001a\u0004\u0018\u00010\u00022\b\u0010¸\u0001\u001a\u00030¹\u00012\b\u0010º\u0001\u001a\u00030»\u0001H\u0016J\n\u0010¼\u0001\u001a\u00030½\u0001H\u0016J\n\u0010¾\u0001\u001a\u00030¿\u0001H\u0016R.\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00128G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR(\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u000b\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R(\u0010&\u001a\u0004\u0018\u00010 2\b\u0010\u000b\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R*\u0010)\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00128G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R(\u0010,\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR(\u0010/\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010\u001cR(\u00102\u001a\u0004\u0018\u00010 2\b\u0010\u000b\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010#\"\u0004\b4\u0010%R(\u00105\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010\u001a\"\u0004\b7\u0010\u001cR(\u00109\u001a\u0004\u0018\u0001082\b\u0010\u000b\u001a\u0004\u0018\u000108@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R.\u0010>\u001a\u0004\u0018\u00010 2\b\u0010\u000b\u001a\u0004\u0018\u00010 8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b?\u0010@\u001a\u0004\bA\u0010#\"\u0004\bB\u0010%R(\u0010C\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bD\u0010\u001a\"\u0004\bE\u0010\u001cR(\u0010F\u001a\u0004\u0018\u00010 2\b\u0010\u000b\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010#\"\u0004\bH\u0010%R4\u0010J\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010I2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010I8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR(\u0010O\u001a\u0004\u0018\u00010 2\b\u0010\u000b\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010#\"\u0004\bQ\u0010%R(\u0010R\u001a\u0004\u0018\u00010 2\b\u0010\u000b\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010#\"\u0004\bT\u0010%R(\u0010U\u001a\u0004\u0018\u00010 2\b\u0010\u000b\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010#\"\u0004\bW\u0010%R(\u0010Y\u001a\u0004\u0018\u00010X2\b\u0010\u000b\u001a\u0004\u0018\u00010X8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R4\u0010^\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010I2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010I8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010L\"\u0004\b`\u0010NR$\u0010a\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR(\u0010f\u001a\u0004\u0018\u00010 2\b\u0010\u000b\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bg\u0010#\"\u0004\bh\u0010%R(\u0010i\u001a\u0004\u0018\u00010 2\b\u0010\u000b\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bj\u0010#\"\u0004\bk\u0010%R(\u0010m\u001a\u0004\u0018\u00010l2\b\u0010\u000b\u001a\u0004\u0018\u00010l8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR*\u0010r\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00128G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bs\u0010\u0015\"\u0004\bt\u0010\u0017R(\u0010u\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bv\u0010\u001a\"\u0004\bw\u0010\u001cR(\u0010x\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\by\u0010\u001a\"\u0004\bz\u0010\u001cR(\u0010{\u001a\u0004\u0018\u00010 2\b\u0010\u000b\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b|\u0010#\"\u0004\b}\u0010%R)\u0010~\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\r\u001a\u0004\b\u007f\u0010\u001a\"\u0005\b\u0080\u0001\u0010\u001cR+\u0010\u0081\u0001\u001a\u0004\u0018\u00010 2\b\u0010\u000b\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0082\u0001\u0010#\"\u0005\b\u0083\u0001\u0010%R-\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00128G@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0085\u0001\u0010\u0015\"\u0005\b\u0086\u0001\u0010\u0017R+\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0088\u0001\u0010\u001a\"\u0005\b\u0089\u0001\u0010\u001cR+\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008b\u0001\u0010\u001a\"\u0005\b\u008c\u0001\u0010\u001cR+\u0010\u008d\u0001\u001a\u0004\u0018\u00010 2\b\u0010\u000b\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008e\u0001\u0010#\"\u0005\b\u008f\u0001\u0010%R/\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u00012\t\u0010\u000b\u001a\u0005\u0018\u00010\u0090\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R+\u0010\u0096\u0001\u001a\u0004\u0018\u00010 2\b\u0010\u000b\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0097\u0001\u0010#\"\u0005\b\u0098\u0001\u0010%R+\u0010\u0099\u0001\u001a\u0004\u0018\u00010 2\b\u0010\u000b\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u009a\u0001\u0010#\"\u0005\b\u009b\u0001\u0010%R+\u0010\u009c\u0001\u001a\u0004\u0018\u00010 2\b\u0010\u000b\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u009d\u0001\u0010#\"\u0005\b\u009e\u0001\u0010%R+\u0010\u009f\u0001\u001a\u0004\u0018\u00010 2\b\u0010\u000b\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b \u0001\u0010#\"\u0005\b¡\u0001\u0010%R7\u0010¢\u0001\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010I2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010I8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b£\u0001\u0010L\"\u0005\b¤\u0001\u0010NR+\u0010¥\u0001\u001a\u0004\u0018\u00010 2\b\u0010\u000b\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¦\u0001\u0010#\"\u0005\b§\u0001\u0010%R+\u0010¨\u0001\u001a\u0004\u0018\u00010 2\b\u0010\u000b\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b©\u0001\u0010#\"\u0005\bª\u0001\u0010%R+\u0010«\u0001\u001a\u0004\u0018\u00010 2\b\u0010\u000b\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¬\u0001\u0010#\"\u0005\b\u00ad\u0001\u0010%R+\u0010®\u0001\u001a\u0004\u0018\u00010 2\b\u0010\u000b\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¯\u0001\u0010#\"\u0005\b°\u0001\u0010%R/\u0010²\u0001\u001a\u0005\u0018\u00010±\u00012\t\u0010\u000b\u001a\u0005\u0018\u00010±\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001¨\u0006Á\u0001"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/generated/PointAnnotation;", "Lcom/mapbox/maps/plugin/annotation/Annotation;", "Lcom/mapbox/geojson/Point;", "id", "", "annotationManager", "Lcom/mapbox/maps/plugin/annotation/AnnotationManager;", "jsonObject", "Lcom/google/gson/JsonObject;", "geometry", "(Ljava/lang/String;Lcom/mapbox/maps/plugin/annotation/AnnotationManager;Lcom/google/gson/JsonObject;Lcom/mapbox/geojson/Point;)V", "value", "Lcom/mapbox/maps/extension/style/layers/properties/generated/IconAnchor;", "iconAnchor", "getIconAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/IconAnchor;", "setIconAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/IconAnchor;)V", "", "iconColorInt", "getIconColorInt", "()Ljava/lang/Integer;", "setIconColorInt", "(Ljava/lang/Integer;)V", "iconColorString", "getIconColorString", "()Ljava/lang/String;", "setIconColorString", "(Ljava/lang/String;)V", "iconColorUseTheme", "getIconColorUseTheme", "setIconColorUseTheme", "", "iconEmissiveStrength", "getIconEmissiveStrength", "()Ljava/lang/Double;", "setIconEmissiveStrength", "(Ljava/lang/Double;)V", "iconHaloBlur", "getIconHaloBlur", "setIconHaloBlur", "iconHaloColorInt", "getIconHaloColorInt", "setIconHaloColorInt", "iconHaloColorString", "getIconHaloColorString", "setIconHaloColorString", "iconHaloColorUseTheme", "getIconHaloColorUseTheme", "setIconHaloColorUseTheme", "iconHaloWidth", "getIconHaloWidth", "setIconHaloWidth", "iconImage", "getIconImage", "setIconImage", "Landroid/graphics/Bitmap;", "iconImageBitmap", "getIconImageBitmap", "()Landroid/graphics/Bitmap;", "setIconImageBitmap", "(Landroid/graphics/Bitmap;)V", "iconImageCrossFade", "getIconImageCrossFade$annotations", "()V", "getIconImageCrossFade", "setIconImageCrossFade", "iconImageInternal", "getIconImageInternal$plugin_annotation_release", "setIconImageInternal$plugin_annotation_release", "iconOcclusionOpacity", "getIconOcclusionOpacity", "setIconOcclusionOpacity", "", "iconOffset", "getIconOffset", "()Ljava/util/List;", "setIconOffset", "(Ljava/util/List;)V", "iconOpacity", "getIconOpacity", "setIconOpacity", "iconRotate", "getIconRotate", "setIconRotate", "iconSize", "getIconSize", "setIconSize", "Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTextFit;", "iconTextFit", "getIconTextFit", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTextFit;", "setIconTextFit", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/IconTextFit;)V", "iconTextFitPadding", "getIconTextFitPadding", "setIconTextFitPadding", "point", "getPoint", "()Lcom/mapbox/geojson/Point;", "setPoint", "(Lcom/mapbox/geojson/Point;)V", "symbolSortKey", "getSymbolSortKey", "setSymbolSortKey", "symbolZOffset", "getSymbolZOffset", "setSymbolZOffset", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextAnchor;", "textAnchor", "getTextAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/TextAnchor;", "setTextAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextAnchor;)V", "textColorInt", "getTextColorInt", "setTextColorInt", "textColorString", "getTextColorString", "setTextColorString", "textColorUseTheme", "getTextColorUseTheme", "setTextColorUseTheme", "textEmissiveStrength", "getTextEmissiveStrength", "setTextEmissiveStrength", "textField", "getTextField", "setTextField", "textHaloBlur", "getTextHaloBlur", "setTextHaloBlur", "textHaloColorInt", "getTextHaloColorInt", "setTextHaloColorInt", "textHaloColorString", "getTextHaloColorString", "setTextHaloColorString", "textHaloColorUseTheme", "getTextHaloColorUseTheme", "setTextHaloColorUseTheme", "textHaloWidth", "getTextHaloWidth", "setTextHaloWidth", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextJustify;", "textJustify", "getTextJustify", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/TextJustify;", "setTextJustify", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextJustify;)V", "textLetterSpacing", "getTextLetterSpacing", "setTextLetterSpacing", "textLineHeight", "getTextLineHeight", "setTextLineHeight", "textMaxWidth", "getTextMaxWidth", "setTextMaxWidth", "textOcclusionOpacity", "getTextOcclusionOpacity", "setTextOcclusionOpacity", "textOffset", "getTextOffset", "setTextOffset", "textOpacity", "getTextOpacity", "setTextOpacity", "textRadialOffset", "getTextRadialOffset", "setTextRadialOffset", "textRotate", "getTextRotate", "setTextRotate", "textSize", "getTextSize", "setTextSize", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTransform;", ReactBaseTextShadowNode.PROP_TEXT_TRANSFORM, "getTextTransform", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTransform;", "setTextTransform", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/TextTransform;)V", "getOffsetGeometry", "mapCameraManagerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "moveDistancesObject", "Lcom/mapbox/android/gestures/MoveDistancesObject;", "getType", "Lcom/mapbox/maps/plugin/annotation/AnnotationType;", "setUsedDataDrivenProperties", "", "Companion", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class PointAnnotation extends Annotation<Point> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ICON_DEFAULT_NAME_PREFIX = "icon_default_name_";

    @NotNull
    public static final String ID_KEY = "PointAnnotation";

    @NotNull
    private static final String TAG = "PointAnnotation";

    @NotNull
    private final AnnotationManager<Point, PointAnnotation, ?, ?, ?, ?, ?> annotationManager;

    @Nullable
    private Bitmap iconImageBitmap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointAnnotation(@NotNull String str, @NotNull AnnotationManager<Point, PointAnnotation, ?, ?, ?, ?, ?> annotationManager, @NotNull JsonObject jsonObject, @NotNull Point point) {
        super(str, jsonObject, point);
        str.getClass();
        annotationManager.getClass();
        jsonObject.getClass();
        point.getClass();
        this.annotationManager = annotationManager;
        jsonObject.addProperty("PointAnnotation", str);
    }

    @Nullable
    public final IconAnchor getIconAnchor() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_ANCHOR);
        if (jsonElement == null) {
            return null;
        }
        IconAnchor.Companion companion = IconAnchor.INSTANCE;
        String asString = jsonElement.getAsString();
        asString.getClass();
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, asString, locale, '-', '_'));
    }

    @ColorInt
    @Nullable
    public final Integer getIconColorInt() {
        Integer m;
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_COLOR);
        if (jsonElement == null || (m = RecordTag.m(jsonElement, ColorUtils.INSTANCE)) == null) {
            return null;
        }
        return Integer.valueOf(m.intValue());
    }

    @Nullable
    public final String getIconColorString() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_COLOR);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final String getIconColorUseTheme() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_COLOR_USE_THEME);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final Double getIconEmissiveStrength() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_EMISSIVE_STRENGTH);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final Double getIconHaloBlur() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_HALO_BLUR);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getIconHaloColorInt() {
        Integer m;
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR);
        if (jsonElement == null || (m = RecordTag.m(jsonElement, ColorUtils.INSTANCE)) == null) {
            return null;
        }
        return Integer.valueOf(m.intValue());
    }

    @Nullable
    public final String getIconHaloColorString() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final String getIconHaloColorUseTheme() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR_USE_THEME);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final Double getIconHaloWidth() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_HALO_WIDTH);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Reading iconImage potentially exposes an internally generated image ID. Consider saving the image id argument for PointAnnotationOptions.withIconImage(String), or PointAnnotation.setIconImage(String) APIs This getter will be removed in future releases.")
    @Nullable
    public final String getIconImage() {
        boolean startsWith$default;
        String iconImageInternal$plugin_annotation_release = getIconImageInternal$plugin_annotation_release();
        if (iconImageInternal$plugin_annotation_release != null) {
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(iconImageInternal$plugin_annotation_release, ICON_DEFAULT_NAME_PREFIX, false, 2, null);
            if (startsWith$default) {
                MapboxLogger.logE("PointAnnotation", "Reading iconImage returned an internally generated image ID ('" + getIconImageInternal$plugin_annotation_release() + "'). This is a misuse, save the argument passed to PointAnnotationOptions.withIconImage(String) or PointAnnotation.setIconImage(String) instead. Caching and reusing this value for other annotation creation may result in unexpected behaviour, as the image associated with the internal image ID can be removed by the internal system at runtime.");
            }
        }
        return getIconImageInternal$plugin_annotation_release();
    }

    @Nullable
    public final Bitmap getIconImageBitmap() {
        return this.iconImageBitmap;
    }

    @Nullable
    public final Double getIconImageCrossFade() {
        return null;
    }

    @Nullable
    public final String getIconImageInternal$plugin_annotation_release() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_IMAGE);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final Double getIconOcclusionOpacity() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_OCCLUSION_OPACITY);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final List<Double> getIconOffset() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_OFFSET);
        JsonArray jsonArray = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
        if (jsonArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(jsonArray, 10));
        Iterator<JsonElement> it2 = jsonArray.iterator();
        while (it2.hasNext()) {
            String jsonElement2 = it2.next().toString();
            jsonElement2.getClass();
            arrayList.add(Double.valueOf(Double.parseDouble(jsonElement2)));
        }
        return arrayList;
    }

    @Nullable
    public final Double getIconOpacity() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_OPACITY);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final Double getIconRotate() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_ROTATE);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final Double getIconSize() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_SIZE);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final IconTextFit getIconTextFit() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT);
        if (jsonElement == null) {
            return null;
        }
        IconTextFit.Companion companion = IconTextFit.INSTANCE;
        String asString = jsonElement.getAsString();
        asString.getClass();
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, asString, locale, '-', '_'));
    }

    @Nullable
    public final List<Double> getIconTextFitPadding() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT_PADDING);
        JsonArray jsonArray = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
        if (jsonArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(jsonArray, 10));
        Iterator<JsonElement> it2 = jsonArray.iterator();
        while (it2.hasNext()) {
            String jsonElement2 = it2.next().toString();
            jsonElement2.getClass();
            arrayList.add(Double.valueOf(Double.parseDouble(jsonElement2)));
        }
        return arrayList;
    }

    @Override // com.mapbox.maps.plugin.annotation.Annotation
    @Nullable
    public Point getOffsetGeometry(@NotNull MapCameraManagerDelegate mapCameraManagerDelegate, @NotNull MoveDistancesObject moveDistancesObject) {
        mapCameraManagerDelegate.getClass();
        moveDistancesObject.getClass();
        Point coordinateForPixel = mapCameraManagerDelegate.coordinateForPixel(new ScreenCoordinate(moveDistancesObject.getCurrentX(), moveDistancesObject.getCurrentY()));
        if (coordinateForPixel.latitude() > 85.05112877980659d || coordinateForPixel.latitude() < -85.05112877980659d) {
            return null;
        }
        return coordinateForPixel;
    }

    @NotNull
    public final Point getPoint() {
        return getGeometry();
    }

    @Nullable
    public final Double getSymbolSortKey() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_SYMBOL_SORT_KEY);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final Double getSymbolZOffset() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_SYMBOL_Z_OFFSET);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final TextAnchor getTextAnchor() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_ANCHOR);
        if (jsonElement == null) {
            return null;
        }
        TextAnchor.Companion companion = TextAnchor.INSTANCE;
        String asString = jsonElement.getAsString();
        asString.getClass();
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, asString, locale, '-', '_'));
    }

    @ColorInt
    @Nullable
    public final Integer getTextColorInt() {
        Integer m;
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_COLOR);
        if (jsonElement == null || (m = RecordTag.m(jsonElement, ColorUtils.INSTANCE)) == null) {
            return null;
        }
        return Integer.valueOf(m.intValue());
    }

    @Nullable
    public final String getTextColorString() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_COLOR);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final String getTextColorUseTheme() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_COLOR_USE_THEME);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final Double getTextEmissiveStrength() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_EMISSIVE_STRENGTH);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final String getTextField() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_FIELD);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final Double getTextHaloBlur() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_HALO_BLUR);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getTextHaloColorInt() {
        Integer m;
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR);
        if (jsonElement == null || (m = RecordTag.m(jsonElement, ColorUtils.INSTANCE)) == null) {
            return null;
        }
        return Integer.valueOf(m.intValue());
    }

    @Nullable
    public final String getTextHaloColorString() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final String getTextHaloColorUseTheme() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR_USE_THEME);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final Double getTextHaloWidth() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_HALO_WIDTH);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final TextJustify getTextJustify() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_JUSTIFY);
        if (jsonElement == null) {
            return null;
        }
        TextJustify.Companion companion = TextJustify.INSTANCE;
        String asString = jsonElement.getAsString();
        asString.getClass();
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, asString, locale, '-', '_'));
    }

    @Nullable
    public final Double getTextLetterSpacing() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_LETTER_SPACING);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final Double getTextLineHeight() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_LINE_HEIGHT);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final Double getTextMaxWidth() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_MAX_WIDTH);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final Double getTextOcclusionOpacity() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_OCCLUSION_OPACITY);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final List<Double> getTextOffset() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_OFFSET);
        JsonArray jsonArray = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
        if (jsonArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(jsonArray, 10));
        Iterator<JsonElement> it2 = jsonArray.iterator();
        while (it2.hasNext()) {
            String jsonElement2 = it2.next().toString();
            jsonElement2.getClass();
            arrayList.add(Double.valueOf(Double.parseDouble(jsonElement2)));
        }
        return arrayList;
    }

    @Nullable
    public final Double getTextOpacity() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_OPACITY);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final Double getTextRadialOffset() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_RADIAL_OFFSET);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final Double getTextRotate() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_ROTATE);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final Double getTextSize() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_SIZE);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final TextTransform getTextTransform() {
        JsonElement jsonElement = getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_TRANSFORM);
        if (jsonElement == null) {
            return null;
        }
        TextTransform.Companion companion = TextTransform.INSTANCE;
        String asString = jsonElement.getAsString();
        asString.getClass();
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, asString, locale, '-', '_'));
    }

    @Override // com.mapbox.maps.plugin.annotation.Annotation
    @NotNull
    public AnnotationType getType() {
        return AnnotationType.PointAnnotation;
    }

    public final void setIconAnchor(@Nullable IconAnchor iconAnchor) {
        if (iconAnchor != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_ICON_ANCHOR, iconAnchor.getValue());
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_ICON_ANCHOR);
        }
    }

    public final void setIconColorInt(@ColorInt @Nullable Integer num) {
        if (num == null) {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_ICON_COLOR);
        } else {
            RecordTag.m(num, ColorUtils.INSTANCE, getJsonObject(), PointAnnotationOptions.PROPERTY_ICON_COLOR);
        }
    }

    public final void setIconColorString(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_ICON_COLOR, str);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_ICON_COLOR);
        }
    }

    public final void setIconColorUseTheme(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_ICON_COLOR_USE_THEME, str);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_ICON_COLOR_USE_THEME);
        }
    }

    public final void setIconEmissiveStrength(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_ICON_EMISSIVE_STRENGTH, d);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_ICON_EMISSIVE_STRENGTH);
        }
    }

    public final void setIconHaloBlur(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_ICON_HALO_BLUR, d);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_ICON_HALO_BLUR);
        }
    }

    public final void setIconHaloColorInt(@ColorInt @Nullable Integer num) {
        if (num == null) {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR);
        } else {
            RecordTag.m(num, ColorUtils.INSTANCE, getJsonObject(), PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR);
        }
    }

    public final void setIconHaloColorString(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR, str);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR);
        }
    }

    public final void setIconHaloColorUseTheme(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR_USE_THEME, str);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR_USE_THEME);
        }
    }

    public final void setIconHaloWidth(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_ICON_HALO_WIDTH, d);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_ICON_HALO_WIDTH);
        }
    }

    public final void setIconImage(@Nullable String str) {
        setIconImageInternal$plugin_annotation_release(str);
    }

    public final void setIconImageBitmap(@Nullable Bitmap bitmap) {
        boolean startsWith$default;
        if (bitmap == null) {
            this.iconImageBitmap = null;
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_ICON_IMAGE);
        } else {
            if (Intrinsics.areEqual(this.iconImageBitmap, bitmap)) {
                return;
            }
            this.iconImageBitmap = bitmap;
            if (getIconImageInternal$plugin_annotation_release() != null) {
                String iconImageInternal$plugin_annotation_release = getIconImageInternal$plugin_annotation_release();
                iconImageInternal$plugin_annotation_release.getClass();
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default(iconImageInternal$plugin_annotation_release, ICON_DEFAULT_NAME_PREFIX, false, 2, null);
                if (!startsWith$default) {
                    return;
                }
            }
            setIconImageInternal$plugin_annotation_release(INSTANCE.iconImageId$plugin_annotation_release(this.annotationManager, bitmap));
        }
    }

    public final void setIconImageInternal$plugin_annotation_release(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_ICON_IMAGE, str);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_ICON_IMAGE);
        }
    }

    public final void setIconOcclusionOpacity(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_ICON_OCCLUSION_OPACITY, d);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_ICON_OCCLUSION_OPACITY);
        }
    }

    public final void setIconOffset(@Nullable List<Double> list) {
        List<Double> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_ICON_OFFSET);
            return;
        }
        JsonArray jsonArray = new JsonArray(list.size());
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            jsonArray.add(Double.valueOf(((Number) it2.next()).doubleValue()));
        }
        getJsonObject().add(PointAnnotationOptions.PROPERTY_ICON_OFFSET, jsonArray);
    }

    public final void setIconOpacity(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_ICON_OPACITY, d);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_ICON_OPACITY);
        }
    }

    public final void setIconRotate(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_ICON_ROTATE, d);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_ICON_ROTATE);
        }
    }

    public final void setIconSize(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_ICON_SIZE, d);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_ICON_SIZE);
        }
    }

    public final void setIconTextFit(@Nullable IconTextFit iconTextFit) {
        if (iconTextFit != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT, iconTextFit.getValue());
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT);
        }
    }

    public final void setIconTextFitPadding(@Nullable List<Double> list) {
        List<Double> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT_PADDING);
            return;
        }
        JsonArray jsonArray = new JsonArray(list.size());
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            jsonArray.add(Double.valueOf(((Number) it2.next()).doubleValue()));
        }
        getJsonObject().add(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT_PADDING, jsonArray);
    }

    public final void setPoint(@NotNull Point point) {
        point.getClass();
        setGeometry(point);
    }

    public final void setSymbolSortKey(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_SYMBOL_SORT_KEY, d);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_SYMBOL_SORT_KEY);
        }
    }

    public final void setSymbolZOffset(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_SYMBOL_Z_OFFSET, d);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_SYMBOL_Z_OFFSET);
        }
    }

    public final void setTextAnchor(@Nullable TextAnchor textAnchor) {
        if (textAnchor != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_TEXT_ANCHOR, textAnchor.getValue());
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_TEXT_ANCHOR);
        }
    }

    public final void setTextColorInt(@ColorInt @Nullable Integer num) {
        if (num == null) {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_TEXT_COLOR);
        } else {
            RecordTag.m(num, ColorUtils.INSTANCE, getJsonObject(), PointAnnotationOptions.PROPERTY_TEXT_COLOR);
        }
    }

    public final void setTextColorString(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_TEXT_COLOR, str);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_TEXT_COLOR);
        }
    }

    public final void setTextColorUseTheme(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_TEXT_COLOR_USE_THEME, str);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_TEXT_COLOR_USE_THEME);
        }
    }

    public final void setTextEmissiveStrength(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_TEXT_EMISSIVE_STRENGTH, d);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_TEXT_EMISSIVE_STRENGTH);
        }
    }

    public final void setTextField(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_TEXT_FIELD, str);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_TEXT_FIELD);
        }
    }

    public final void setTextHaloBlur(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_TEXT_HALO_BLUR, d);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_TEXT_HALO_BLUR);
        }
    }

    public final void setTextHaloColorInt(@ColorInt @Nullable Integer num) {
        if (num == null) {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR);
        } else {
            RecordTag.m(num, ColorUtils.INSTANCE, getJsonObject(), PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR);
        }
    }

    public final void setTextHaloColorString(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR, str);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR);
        }
    }

    public final void setTextHaloColorUseTheme(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR_USE_THEME, str);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR_USE_THEME);
        }
    }

    public final void setTextHaloWidth(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_TEXT_HALO_WIDTH, d);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_TEXT_HALO_WIDTH);
        }
    }

    public final void setTextJustify(@Nullable TextJustify textJustify) {
        if (textJustify != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_TEXT_JUSTIFY, textJustify.getValue());
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_TEXT_JUSTIFY);
        }
    }

    public final void setTextLetterSpacing(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_TEXT_LETTER_SPACING, d);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_TEXT_LETTER_SPACING);
        }
    }

    public final void setTextLineHeight(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_TEXT_LINE_HEIGHT, d);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_TEXT_LINE_HEIGHT);
        }
    }

    public final void setTextMaxWidth(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_TEXT_MAX_WIDTH, d);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_TEXT_MAX_WIDTH);
        }
    }

    public final void setTextOcclusionOpacity(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_TEXT_OCCLUSION_OPACITY, d);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_TEXT_OCCLUSION_OPACITY);
        }
    }

    public final void setTextOffset(@Nullable List<Double> list) {
        List<Double> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_TEXT_OFFSET);
            return;
        }
        JsonArray jsonArray = new JsonArray(list.size());
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            jsonArray.add(Double.valueOf(((Number) it2.next()).doubleValue()));
        }
        getJsonObject().add(PointAnnotationOptions.PROPERTY_TEXT_OFFSET, jsonArray);
    }

    public final void setTextOpacity(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_TEXT_OPACITY, d);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_TEXT_OPACITY);
        }
    }

    public final void setTextRadialOffset(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_TEXT_RADIAL_OFFSET, d);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_TEXT_RADIAL_OFFSET);
        }
    }

    public final void setTextRotate(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_TEXT_ROTATE, d);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_TEXT_ROTATE);
        }
    }

    public final void setTextSize(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_TEXT_SIZE, d);
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_TEXT_SIZE);
        }
    }

    public final void setTextTransform(@Nullable TextTransform textTransform) {
        if (textTransform != null) {
            getJsonObject().addProperty(PointAnnotationOptions.PROPERTY_TEXT_TRANSFORM, textTransform.getValue());
        } else {
            getJsonObject().remove(PointAnnotationOptions.PROPERTY_TEXT_TRANSFORM);
        }
    }

    @Override // com.mapbox.maps.plugin.annotation.Annotation
    public void setUsedDataDrivenProperties() {
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_ANCHOR) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_ANCHOR);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_IMAGE) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_IMAGE);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_OFFSET) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_OFFSET);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_ROTATE) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_ROTATE);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_SIZE) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_SIZE);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT_PADDING) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_TEXT_FIT_PADDING);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_SYMBOL_SORT_KEY) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_SYMBOL_SORT_KEY);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_ANCHOR) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_ANCHOR);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_FIELD) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_FIELD);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_JUSTIFY) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_JUSTIFY);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_LETTER_SPACING) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_LETTER_SPACING);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_LINE_HEIGHT) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_LINE_HEIGHT);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_MAX_WIDTH) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_MAX_WIDTH);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_OFFSET) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_OFFSET);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_RADIAL_OFFSET) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_RADIAL_OFFSET);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_ROTATE) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_ROTATE);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_SIZE) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_SIZE);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_TRANSFORM) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_TRANSFORM);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_COLOR) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_COLOR);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_EMISSIVE_STRENGTH) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_EMISSIVE_STRENGTH);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_HALO_BLUR) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_HALO_BLUR);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_HALO_WIDTH) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_HALO_WIDTH);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_OCCLUSION_OPACITY) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_OCCLUSION_OPACITY);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_OPACITY) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_OPACITY);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_SYMBOL_Z_OFFSET) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_SYMBOL_Z_OFFSET);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_COLOR) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_COLOR);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_EMISSIVE_STRENGTH) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_EMISSIVE_STRENGTH);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_HALO_BLUR) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_HALO_BLUR);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_HALO_WIDTH) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_HALO_WIDTH);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_OCCLUSION_OPACITY) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_OCCLUSION_OPACITY);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_OPACITY) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_OPACITY);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_COLOR_USE_THEME) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_COLOR_USE_THEME);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR_USE_THEME) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_ICON_HALO_COLOR_USE_THEME);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_COLOR_USE_THEME) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_COLOR_USE_THEME);
        }
        if (getJsonObject().get(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR_USE_THEME) != null) {
            this.annotationManager.enableDataDrivenProperty(PointAnnotationOptions.PROPERTY_TEXT_HALO_COLOR_USE_THEME);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J9\u0010\u0007\u001a\u00020\u00042\"\u0010\b\u001a\u001e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/generated/PointAnnotation$Companion;", "", "()V", "ICON_DEFAULT_NAME_PREFIX", "", "ID_KEY", Constants.LOG_TAG, "iconImageId", "manager", "Lcom/mapbox/maps/plugin/annotation/AnnotationManager;", "bitmap", "Landroid/graphics/Bitmap;", "iconImageId$plugin_annotation_release", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String iconImageId$plugin_annotation_release(@NotNull AnnotationManager<?, ?, ?, ?, ?, ?, ?> manager, @NotNull Bitmap bitmap) {
            manager.getClass();
            bitmap.getClass();
            StringBuilder sb = new StringBuilder(PointAnnotation.ICON_DEFAULT_NAME_PREFIX);
            String num = Integer.toString(manager.hashCode(), CharsKt.checkRadix(16));
            num.getClass();
            sb.append(num);
            sb.append('_');
            sb.append(bitmap.hashCode());
            return sb.toString();
        }

        private Companion() {
        }
    }

    @Deprecated(message = "This property has been deprecated and will do no operations. Use PointAnnotationManager.iconImageCrossFade instead")
    public static /* synthetic */ void getIconImageCrossFade$annotations() {
    }

    public final void setIconImageCrossFade(@Nullable Double d) {
    }
}
