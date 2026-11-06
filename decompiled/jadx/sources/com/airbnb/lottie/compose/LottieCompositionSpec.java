package com.airbnb.lottie.compose;

import android.net.Uri;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.assetManagementService.model.constants.AssetUrlMappingTableConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "", "Asset", "ContentProvider", "File", "JsonString", "RawRes", AssetUrlMappingTableConstants.URL_COLUMN_NAME, "Lcom/airbnb/lottie/compose/LottieCompositionSpec$Asset;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$ContentProvider;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$File;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$JsonString;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$RawRes;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$Url;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface LottieCompositionSpec {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$Asset;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "assetName", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getAssetName", "()Ljava/lang/String;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class Asset implements LottieCompositionSpec {

        @NotNull
        private final String assetName;

        private /* synthetic */ Asset(String str) {
            this.assetName = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Asset m8346boximpl(String str) {
            return new Asset(str);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m8347constructorimpl(@NotNull String str) {
            str.getClass();
            return str;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m8348equalsimpl(String str, Object obj) {
            return (obj instanceof Asset) && Intrinsics.areEqual(str, ((Asset) obj).m8352unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m8349equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m8350hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m8351toStringimpl(String str) {
            return a$$ExternalSyntheticOutline0.m("Asset(assetName=", str, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public boolean equals(Object obj) {
            return m8348equalsimpl(this.assetName, obj);
        }

        @NotNull
        public final String getAssetName() {
            return this.assetName;
        }

        public int hashCode() {
            return m8350hashCodeimpl(this.assetName);
        }

        public String toString() {
            return m8351toStringimpl(this.assetName);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m8352unboximpl() {
            return this.assetName;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$ContentProvider;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "uri", "Landroid/net/Uri;", "constructor-impl", "(Landroid/net/Uri;)Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "equals-impl", "(Landroid/net/Uri;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Landroid/net/Uri;)I", "toString", "", "toString-impl", "(Landroid/net/Uri;)Ljava/lang/String;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class ContentProvider implements LottieCompositionSpec {

        @NotNull
        private final Uri uri;

        private /* synthetic */ ContentProvider(Uri uri) {
            this.uri = uri;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ ContentProvider m8353boximpl(Uri uri) {
            return new ContentProvider(uri);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static Uri m8354constructorimpl(@NotNull Uri uri) {
            uri.getClass();
            return uri;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m8355equalsimpl(Uri uri, Object obj) {
            return (obj instanceof ContentProvider) && Intrinsics.areEqual(uri, ((ContentProvider) obj).m8359unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m8356equalsimpl0(Uri uri, Uri uri2) {
            return Intrinsics.areEqual(uri, uri2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m8357hashCodeimpl(Uri uri) {
            return uri.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m8358toStringimpl(Uri uri) {
            return Automotive$$ExternalSyntheticOutline0.m(uri, "ContentProvider(uri=", MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public boolean equals(Object obj) {
            return m8355equalsimpl(this.uri, obj);
        }

        @NotNull
        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            return m8357hashCodeimpl(this.uri);
        }

        public String toString() {
            return m8358toStringimpl(this.uri);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Uri m8359unboximpl() {
            return this.uri;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$File;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "fileName", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getFileName", "()Ljava/lang/String;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class File implements LottieCompositionSpec {

        @NotNull
        private final String fileName;

        private /* synthetic */ File(String str) {
            this.fileName = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ File m8360boximpl(String str) {
            return new File(str);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m8361constructorimpl(@NotNull String str) {
            str.getClass();
            return str;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m8362equalsimpl(String str, Object obj) {
            return (obj instanceof File) && Intrinsics.areEqual(str, ((File) obj).m8366unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m8363equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m8364hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m8365toStringimpl(String str) {
            return a$$ExternalSyntheticOutline0.m("File(fileName=", str, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public boolean equals(Object obj) {
            return m8362equalsimpl(this.fileName, obj);
        }

        @NotNull
        public final String getFileName() {
            return this.fileName;
        }

        public int hashCode() {
            return m8364hashCodeimpl(this.fileName);
        }

        public String toString() {
            return m8365toStringimpl(this.fileName);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m8366unboximpl() {
            return this.fileName;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$JsonString;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "jsonString", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getJsonString", "()Ljava/lang/String;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class JsonString implements LottieCompositionSpec {

        @NotNull
        private final String jsonString;

        private /* synthetic */ JsonString(String str) {
            this.jsonString = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ JsonString m8367boximpl(String str) {
            return new JsonString(str);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m8368constructorimpl(@NotNull String str) {
            str.getClass();
            return str;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m8369equalsimpl(String str, Object obj) {
            return (obj instanceof JsonString) && Intrinsics.areEqual(str, ((JsonString) obj).m8373unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m8370equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m8371hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m8372toStringimpl(String str) {
            return a$$ExternalSyntheticOutline0.m("JsonString(jsonString=", str, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public boolean equals(Object obj) {
            return m8369equalsimpl(this.jsonString, obj);
        }

        @NotNull
        public final String getJsonString() {
            return this.jsonString;
        }

        public int hashCode() {
            return m8371hashCodeimpl(this.jsonString);
        }

        public String toString() {
            return m8372toStringimpl(this.jsonString);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m8373unboximpl() {
            return this.jsonString;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$Url;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "url", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class Url implements LottieCompositionSpec {

        @NotNull
        private final String url;

        private /* synthetic */ Url(String str) {
            this.url = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Url m8381boximpl(String str) {
            return new Url(str);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m8382constructorimpl(@NotNull String str) {
            str.getClass();
            return str;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m8383equalsimpl(String str, Object obj) {
            return (obj instanceof Url) && Intrinsics.areEqual(str, ((Url) obj).m8387unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m8384equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m8385hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m8386toStringimpl(String str) {
            return a$$ExternalSyntheticOutline0.m("Url(url=", str, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public boolean equals(Object obj) {
            return m8383equalsimpl(this.url, obj);
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return m8385hashCodeimpl(this.url);
        }

        public String toString() {
            return m8386toStringimpl(this.url);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m8387unboximpl() {
            return this.url;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$RawRes;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "resId", "", "constructor-impl", "(I)I", "getResId", "()I", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class RawRes implements LottieCompositionSpec {
        private final int resId;

        private /* synthetic */ RawRes(@androidx.annotation.RawRes int i) {
            this.resId = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ RawRes m8374boximpl(int i) {
            return new RawRes(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m8376equalsimpl(int i, Object obj) {
            return (obj instanceof RawRes) && i == ((RawRes) obj).m8380unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m8377equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m8378hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m8379toStringimpl(int i) {
            return a$$ExternalSyntheticOutline0.m(i, "RawRes(resId=", MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public boolean equals(Object obj) {
            return m8376equalsimpl(this.resId, obj);
        }

        public final int getResId() {
            return this.resId;
        }

        public int hashCode() {
            return m8378hashCodeimpl(this.resId);
        }

        public String toString() {
            return m8379toStringimpl(this.resId);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m8380unboximpl() {
            return this.resId;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m8375constructorimpl(@androidx.annotation.RawRes int i) {
            return i;
        }
    }
}
